/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thingml.network.plugins.java;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.sintef.thingml.*;
import org.thingml.compilers.Context;
import org.thingml.compilers.spi.NetworkPlugin;
import org.thingml.compilers.spi.SerializationPlugin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sintef
 */
public class JavaSerialPlugin extends NetworkPlugin {

    public JavaSerialPlugin() {
        super();
    }

    public String getPluginID() {
        return "JavaSerialPlugin";
    }

    public List<String> getSupportedProtocols() {
        List<String> res = new ArrayList<>();
        res.add("Serial");
        res.add("Serial1");
        res.add("Serial2");
        res.add("Serial3");
        res.add("Serial4");
        res.add("Serial5");
        res.add("Serial6");
        res.add("Serial7");
        return res;
    }

    public String getTargetedLanguage() {
        return "java";
    }

    public void generateNetworkLibrary(Configuration cfg, Context ctx, Set<Protocol> protocols) {
        //TODO: to be improved (e.g. to avoid duplicating messages and ports, etc).
        //ports.clear();
        updatePOM(ctx, cfg);
        for(Protocol prot : protocols) {
            SerialProtocol sp = new SerialProtocol(ctx, prot, cfg);
            sp.generate();
        }
    }

    private void updatePOM(Context ctx, Configuration cfg) {
        //Update POM.xml with JSSC Maven dependency
        try {
            final InputStream input = new FileInputStream(ctx.getOutputDirectory() + "/POM.xml");
            final List<String> packLines = IOUtils.readLines(input);
            String pom = "";
            for (String line : packLines) {
                pom += line + "\n";
            }
            input.close();
            pom = pom.replace("<!--DEP-->", "<dependency>\n<groupId>org.scream3r</groupId>\n<artifactId>jssc</artifactId>\n<version>2.8.0</version>\n</dependency>\n<!--DEP-->");
            final File f = new File(ctx.getOutputDirectory() + "/POM.xml");
            final OutputStream output = new FileOutputStream(f);
            IOUtils.write(pom, output);
            IOUtils.closeQuietly(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class SerialProtocol {
        Context ctx;
        Protocol prot;
        Configuration cfg;

        private List<Port> ports = new ArrayList<Port>();

        private void addPort(Port p) {
            boolean contains = false;
            for(Port port : ports) {
                if (EcoreUtil.equals(port, p)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                ports.add(p);
            }
        }

        public SerialProtocol(Context ctx, Protocol prot, Configuration cfg) {
            this.ctx = ctx;
            this.prot = prot;
            this.cfg = cfg;
        }

        public void generate() {
            String template = loadTemplate();
            StringBuilder parseBuilder = new StringBuilder();
            parseBuilder.append("Event result = null;\n");

            for (ThingPortMessage tpm : getMessagesSent(cfg, prot)) {
                final Thing t = tpm.t;
                final Port p = tpm.p;
                final Message m = tpm.m;
                template = generateInitCode(ctx, tpm, template);
                parseBuilder.append("result = " + m.getName() + "Type.instantiate(payload, \"default\");\n");
                parseBuilder.append("if (result != null) {\n" + p.getName() + "_port.send(result);\nresult = null;\n}\n");
            }
            for (ThingPortMessage tpm : getMessagesReceived(cfg, prot)) {
                final Thing t = tpm.t;
                final Port p = tpm.p;
                final Message m = tpm.m;
                template = generateInitCode(ctx, tpm, template);
                parseBuilder.append("result = " + m.getName() + "Type.instantiate(payload, \"default\");\n");
                parseBuilder.append("if (result != null) {\n" + p.getName() + "_port.send(result);\nresult = null;\n}\n");
            }
            template = initPort(ctx, template);
            for(ExternalConnector conn : getExternalConnectors(cfg, prot)) {
                updateMain(ctx, cfg, conn);
            }
            template = template.replace("/*$PARSING CODE$*/", parseBuilder.toString());

            try {
                final File folder = new File(ctx.getOutputDirectory() + "/src/main/java/org/thingml/generated/network");
                folder.mkdir();
                final File f = new File(ctx.getOutputDirectory() + "/src/main/java/org/thingml/generated/network/SerialJava.java");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(template, output);
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private String generateInitCode(Context ctx, ThingPortMessage tpm, String template) {
            final Thing t = tpm.t;
            final Port p = tpm.p;
            final Message m = tpm.m;
            final String code = m.hasAnnotation("code")?m.annotation("code").get(0):"0";
            template = template.replace("/*$MESSAGE TYPES$*/", "/*$MESSAGE TYPES$*/\nprotected final " + ctx.firstToUpper(m.getName()) + "MessageType " + m.getName() + "Type = new " + ctx.firstToUpper(m.getName()) + "MessageType((short)" + code + ");\n");
            addPort(p);
            return template;
        }

        private String initPort(Context ctx, String template) {
            for(Port p : ports) {
                template = template.replace("/*$PORTS$*/", "/*$PORTS$*/\nprivate Port " + p.getName() + "_port;\npublic Port get" + ctx.firstToUpper(p.getName()) + "_port(){return " + p.getName() + "_port;}\n");
                String portType = "PortType.PROVIDED";
                if (p instanceof RequiredPort)
                    portType = "PortType.REQUIRED";

                template = template.replace("/*$INIT PORTS$*/", "/*$INIT PORTS$*/\n" + p.getName() + "_port = new Port(" + portType + ", \"" + p.getName() + "\", this);\n");
            }
            return template;
        }

        private void updateMain(Context ctx, Configuration cfg, ExternalConnector conn) {
            try {
                final InputStream input = new FileInputStream(ctx.getOutputDirectory() + "/src/main/java/org/thingml/generated/Main.java");
                final List<String> packLines = IOUtils.readLines(input);
                String main = "";
                for (String line : packLines) {
                    main += line + "\n";
                }
                input.close();
                final String speed = conn.getProtocol().hasAnnotation("baudrate") ? conn.getProtocol().annotation("baudrate").get(0) : "9600";
                final String port = conn.getProtocol().hasAnnotation("port") ? conn.getProtocol().annotation("port").get(0) : "/dev/ttyACM0";
                main = main.replace("/*$NETWORK$*/", "/*$NETWORK$*/\nSerialJava " + conn.getName() + "_" + conn.getProtocol().getName() + " = (SerialJava) new SerialJava(\"" + port + "\", " + speed + ").buildBehavior(null, null);\n");

                StringBuilder connBuilder = new StringBuilder();
                connBuilder.append(conn.getName() + "_" + conn.getProtocol().getName() + ".get" + ctx.firstToUpper(conn.getPort().getName()) + "_port().addListener(");
                connBuilder.append(ctx.getInstanceName(conn.getInst().getInstance()) + ".get" + ctx.firstToUpper(conn.getPort().getName()) + "_port());\n");
                connBuilder.append(ctx.getInstanceName(conn.getInst().getInstance()) + ".get" + ctx.firstToUpper(conn.getPort().getName()) + "_port().addListener(");
                connBuilder.append(conn.getName() + "_" + conn.getProtocol().getName() + ".get" + ctx.firstToUpper(conn.getPort().getName()) + "_port());\n");
                main = main.replace("/*$EXT CONNECTORS$*/", "/*$EXT CONNECTORS$*/\n" + connBuilder.toString());

                main = main.replace("/*$START$*/", "/*$START$*/\n" + conn.getName() + "_" + conn.getProtocol().getName() + ".init().start();\n");
                main = main.replace("/*$STOP$*/", "/*$STOP$*/\n" + conn.getName() + "_" + conn.getProtocol().getName() + ".stop();\n");

                final File f = new File(ctx.getOutputDirectory() + "/src/main/java/org/thingml/generated/Main.java");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(main, output);
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private String loadTemplate() {
            try {
                InputStream input = this.getClass().getClassLoader().getResourceAsStream("templates/JavaSerialPlugin.java");
                List<String> pomLines = IOUtils.readLines(input);
                String pom = "";
                for (String line : pomLines) {
                    pom += line + "\n";
                }
                input.close();
                return pom;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}