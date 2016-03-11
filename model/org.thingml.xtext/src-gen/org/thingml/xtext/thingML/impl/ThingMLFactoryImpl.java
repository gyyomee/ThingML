/**
 * generated by Xtext 2.9.1
 */
package org.thingml.xtext.thingML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.thingml.xtext.thingML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingMLFactoryImpl extends EFactoryImpl implements ThingMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ThingMLFactory init()
  {
    try
    {
      ThingMLFactory theThingMLFactory = (ThingMLFactory)EPackage.Registry.INSTANCE.getEFactory(ThingMLPackage.eNS_URI);
      if (theThingMLFactory != null)
      {
        return theThingMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ThingMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ThingMLPackage.THING_ML_MODEL: return createThingMLModel();
      case ThingMLPackage.PLATFORM_ANNOTATION: return createPlatformAnnotation();
      case ThingMLPackage.TYPE: return createType();
      case ThingMLPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case ThingMLPackage.OBJECT_TYPE: return createObjectType();
      case ThingMLPackage.ENUMERATION: return createEnumeration();
      case ThingMLPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case ThingMLPackage.THING: return createThing();
      case ThingMLPackage.PROPERTY_ASSIGN: return createPropertyAssign();
      case ThingMLPackage.PROTOCOL: return createProtocol();
      case ThingMLPackage.FUNCTION: return createFunction();
      case ThingMLPackage.PROPERTY: return createProperty();
      case ThingMLPackage.MESSAGE: return createMessage();
      case ThingMLPackage.PARAMETER: return createParameter();
      case ThingMLPackage.PORT: return createPort();
      case ThingMLPackage.REQUIRED_PORT: return createRequiredPort();
      case ThingMLPackage.PROVIDED_PORT: return createProvidedPort();
      case ThingMLPackage.INTERNAL_PORT: return createInternalPort();
      case ThingMLPackage.STREAM: return createStream();
      case ThingMLPackage.SOURCE: return createSource();
      case ThingMLPackage.VIEW_SOURCE: return createViewSource();
      case ThingMLPackage.REFERENCED_ELMT: return createReferencedElmt();
      case ThingMLPackage.ELMT_PROPERTY: return createElmtProperty();
      case ThingMLPackage.JOIN_SOURCES: return createJoinSources();
      case ThingMLPackage.MERGE_SOURCES: return createMergeSources();
      case ThingMLPackage.SIMPLE_SOURCE: return createSimpleSource();
      case ThingMLPackage.FILTER: return createFilter();
      case ThingMLPackage.LENGTH_WINDOW: return createLengthWindow();
      case ThingMLPackage.TIME_WINDOW: return createTimeWindow();
      case ThingMLPackage.MESSAGE_PARAMETER: return createMessageParameter();
      case ThingMLPackage.SIMPLE_PARAM_REF: return createSimpleParamRef();
      case ThingMLPackage.ARRAY_PARAM_REF: return createArrayParamRef();
      case ThingMLPackage.LENGTH_ARRAY: return createLengthArray();
      case ThingMLPackage.STATE_MACHINE: return createStateMachine();
      case ThingMLPackage.STATE: return createState();
      case ThingMLPackage.REGION: return createRegion();
      case ThingMLPackage.FINAL_STATE: return createFinalState();
      case ThingMLPackage.COMPOSITE_STATE: return createCompositeState();
      case ThingMLPackage.SESSION: return createSession();
      case ThingMLPackage.PARALLEL_REGION: return createParallelRegion();
      case ThingMLPackage.TRANSITION: return createTransition();
      case ThingMLPackage.INTERNAL_TRANSITION: return createInternalTransition();
      case ThingMLPackage.EVENT: return createEvent();
      case ThingMLPackage.RECEIVE_MESSAGE: return createReceiveMessage();
      case ThingMLPackage.ACTION: return createAction();
      case ThingMLPackage.VARIABLE: return createVariable();
      case ThingMLPackage.ACTION_BLOCK: return createActionBlock();
      case ThingMLPackage.EXTERN_STATEMENT: return createExternStatement();
      case ThingMLPackage.LOCAL_VARIABLE: return createLocalVariable();
      case ThingMLPackage.SEND_ACTION: return createSendAction();
      case ThingMLPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case ThingMLPackage.INCREMENT: return createIncrement();
      case ThingMLPackage.DECREMENT: return createDecrement();
      case ThingMLPackage.LOOP_ACTION: return createLoopAction();
      case ThingMLPackage.CONDITIONAL_ACTION: return createConditionalAction();
      case ThingMLPackage.RETURN_ACTION: return createReturnAction();
      case ThingMLPackage.PRINT_ACTION: return createPrintAction();
      case ThingMLPackage.ERROR_ACTION: return createErrorAction();
      case ThingMLPackage.START_SESSION: return createStartSession();
      case ThingMLPackage.FUNCTION_CALL_STATEMENT: return createFunctionCallStatement();
      case ThingMLPackage.EXPRESSION: return createExpression();
      case ThingMLPackage.EXTERN_EXPRESSION: return createExternExpression();
      case ThingMLPackage.CONFIGURATION: return createConfiguration();
      case ThingMLPackage.INSTANCE: return createInstance();
      case ThingMLPackage.CONFIG_PROPERTY_ASSIGN: return createConfigPropertyAssign();
      case ThingMLPackage.ABSTRACT_CONNECTOR: return createAbstractConnector();
      case ThingMLPackage.CONNECTOR: return createConnector();
      case ThingMLPackage.EXTERNAL_CONNECTOR: return createExternalConnector();
      case ThingMLPackage.INSTANCE_REF: return createInstanceRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingMLModel createThingMLModel()
  {
    ThingMLModelImpl thingMLModel = new ThingMLModelImpl();
    return thingMLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlatformAnnotation createPlatformAnnotation()
  {
    PlatformAnnotationImpl platformAnnotation = new PlatformAnnotationImpl();
    return platformAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectType createObjectType()
  {
    ObjectTypeImpl objectType = new ObjectTypeImpl();
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Thing createThing()
  {
    ThingImpl thing = new ThingImpl();
    return thing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssign createPropertyAssign()
  {
    PropertyAssignImpl propertyAssign = new PropertyAssignImpl();
    return propertyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredPort createRequiredPort()
  {
    RequiredPortImpl requiredPort = new RequiredPortImpl();
    return requiredPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedPort createProvidedPort()
  {
    ProvidedPortImpl providedPort = new ProvidedPortImpl();
    return providedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalPort createInternalPort()
  {
    InternalPortImpl internalPort = new InternalPortImpl();
    return internalPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewSource createViewSource()
  {
    ViewSourceImpl viewSource = new ViewSourceImpl();
    return viewSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedElmt createReferencedElmt()
  {
    ReferencedElmtImpl referencedElmt = new ReferencedElmtImpl();
    return referencedElmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmtProperty createElmtProperty()
  {
    ElmtPropertyImpl elmtProperty = new ElmtPropertyImpl();
    return elmtProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSources createJoinSources()
  {
    JoinSourcesImpl joinSources = new JoinSourcesImpl();
    return joinSources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MergeSources createMergeSources()
  {
    MergeSourcesImpl mergeSources = new MergeSourcesImpl();
    return mergeSources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSource createSimpleSource()
  {
    SimpleSourceImpl simpleSource = new SimpleSourceImpl();
    return simpleSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthWindow createLengthWindow()
  {
    LengthWindowImpl lengthWindow = new LengthWindowImpl();
    return lengthWindow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeWindow createTimeWindow()
  {
    TimeWindowImpl timeWindow = new TimeWindowImpl();
    return timeWindow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageParameter createMessageParameter()
  {
    MessageParameterImpl messageParameter = new MessageParameterImpl();
    return messageParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleParamRef createSimpleParamRef()
  {
    SimpleParamRefImpl simpleParamRef = new SimpleParamRefImpl();
    return simpleParamRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayParamRef createArrayParamRef()
  {
    ArrayParamRefImpl arrayParamRef = new ArrayParamRefImpl();
    return arrayParamRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthArray createLengthArray()
  {
    LengthArrayImpl lengthArray = new LengthArrayImpl();
    return lengthArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinalState createFinalState()
  {
    FinalStateImpl finalState = new FinalStateImpl();
    return finalState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeState createCompositeState()
  {
    CompositeStateImpl compositeState = new CompositeStateImpl();
    return compositeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Session createSession()
  {
    SessionImpl session = new SessionImpl();
    return session;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParallelRegion createParallelRegion()
  {
    ParallelRegionImpl parallelRegion = new ParallelRegionImpl();
    return parallelRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InternalTransition createInternalTransition()
  {
    InternalTransitionImpl internalTransition = new InternalTransitionImpl();
    return internalTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiveMessage createReceiveMessage()
  {
    ReceiveMessageImpl receiveMessage = new ReceiveMessageImpl();
    return receiveMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionBlock createActionBlock()
  {
    ActionBlockImpl actionBlock = new ActionBlockImpl();
    return actionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternStatement createExternStatement()
  {
    ExternStatementImpl externStatement = new ExternStatementImpl();
    return externStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SendAction createSendAction()
  {
    SendActionImpl sendAction = new SendActionImpl();
    return sendAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignment createVariableAssignment()
  {
    VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
    return variableAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Increment createIncrement()
  {
    IncrementImpl increment = new IncrementImpl();
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decrement createDecrement()
  {
    DecrementImpl decrement = new DecrementImpl();
    return decrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopAction createLoopAction()
  {
    LoopActionImpl loopAction = new LoopActionImpl();
    return loopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalAction createConditionalAction()
  {
    ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
    return conditionalAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnAction createReturnAction()
  {
    ReturnActionImpl returnAction = new ReturnActionImpl();
    return returnAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrintAction createPrintAction()
  {
    PrintActionImpl printAction = new PrintActionImpl();
    return printAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorAction createErrorAction()
  {
    ErrorActionImpl errorAction = new ErrorActionImpl();
    return errorAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartSession createStartSession()
  {
    StartSessionImpl startSession = new StartSessionImpl();
    return startSession;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCallStatement createFunctionCallStatement()
  {
    FunctionCallStatementImpl functionCallStatement = new FunctionCallStatementImpl();
    return functionCallStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternExpression createExternExpression()
  {
    ExternExpressionImpl externExpression = new ExternExpressionImpl();
    return externExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigPropertyAssign createConfigPropertyAssign()
  {
    ConfigPropertyAssignImpl configPropertyAssign = new ConfigPropertyAssignImpl();
    return configPropertyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractConnector createAbstractConnector()
  {
    AbstractConnectorImpl abstractConnector = new AbstractConnectorImpl();
    return abstractConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalConnector createExternalConnector()
  {
    ExternalConnectorImpl externalConnector = new ExternalConnectorImpl();
    return externalConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceRef createInstanceRef()
  {
    InstanceRefImpl instanceRef = new InstanceRefImpl();
    return instanceRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingMLPackage getThingMLPackage()
  {
    return (ThingMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ThingMLPackage getPackage()
  {
    return ThingMLPackage.eINSTANCE;
  }

} //ThingMLFactoryImpl
