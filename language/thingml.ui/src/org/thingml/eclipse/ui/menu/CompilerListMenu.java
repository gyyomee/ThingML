/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.eclipse.ui.menu;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;
import org.thingml.eclipse.ui.launch.ThingMLLauncher;
import org.thingml.eclipse.ui.launch.ThingMLLauncher.CompilerInfo;

public abstract class CompilerListMenu extends CompoundContributionItem implements IWorkbenchContribution {
	
	private String command;

	public CompilerListMenu(String command) {
		this.command = command;
	}

	public CompilerListMenu(String id, String command) {
		super(id);
		this.command = command;
	}
	
	private IServiceLocator serviceLocator;
	
	@Override
	public void initialize(IServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}

	@Override
	protected IContributionItem[] getContributionItems() {
		List<IContributionItem> items = new LinkedList<IContributionItem>();
		
		for (CompilerInfo compiler : ThingMLLauncher.compilers) {
			Map<String, String> commandParams = new HashMap<String, String>();
			commandParams.put(command+".popup", "true");
			commandParams.put(command+".compiler", compiler.getId());
			
			CommandContributionItemParameter parameters = new CommandContributionItemParameter(serviceLocator, null, command, CommandContributionItem.STYLE_PUSH);
			parameters.label = compiler.getName();
			parameters.parameters = commandParams;
			
			CommandContributionItem item = new CommandContributionItem(parameters);
			items.add(item);
		}
		
		return items.toArray(new IContributionItem[0]);
	}

	

}
