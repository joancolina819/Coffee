/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.impl;

import com.coffee.hlvl.And;
import com.coffee.hlvl.AttributeRef;
import com.coffee.hlvl.BoolConstant;
import com.coffee.hlvl.BoolVal;
import com.coffee.hlvl.Comparison;
import com.coffee.hlvl.ComplexImplies;
import com.coffee.hlvl.ConstantDecl;
import com.coffee.hlvl.Core;
import com.coffee.hlvl.Declaration;
import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Enumeration;
import com.coffee.hlvl.Equality;
import com.coffee.hlvl.Expression;
import com.coffee.hlvl.Function;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Hierarchy;
import com.coffee.hlvl.HlvlFactory;
import com.coffee.hlvl.HlvlPackage;
import com.coffee.hlvl.Iff;
import com.coffee.hlvl.Implies;
import com.coffee.hlvl.IntConstant;
import com.coffee.hlvl.Interval;
import com.coffee.hlvl.ListOfIDs;
import com.coffee.hlvl.ListOfListValues;
import com.coffee.hlvl.ListOfRelRefs;
import com.coffee.hlvl.ListOfValuation;
import com.coffee.hlvl.ListOfValues;
import com.coffee.hlvl.Minus;
import com.coffee.hlvl.Model;
import com.coffee.hlvl.MulOrDiv;
import com.coffee.hlvl.MultInstantiation;
import com.coffee.hlvl.Names;
import com.coffee.hlvl.Negation;
import com.coffee.hlvl.Operation;
import com.coffee.hlvl.Operations;
import com.coffee.hlvl.OptionsDeclaration;
import com.coffee.hlvl.Or;
import com.coffee.hlvl.Order;
import com.coffee.hlvl.Pair;
import com.coffee.hlvl.Plus;
import com.coffee.hlvl.QImplies;
import com.coffee.hlvl.Range;
import com.coffee.hlvl.RelDeclaration;
import com.coffee.hlvl.Relation;
import com.coffee.hlvl.Relational;
import com.coffee.hlvl.SingleInstruction;
import com.coffee.hlvl.StringConstant;
import com.coffee.hlvl.Symbol;
import com.coffee.hlvl.Unary;
import com.coffee.hlvl.ValidConf;
import com.coffee.hlvl.Valuation;
import com.coffee.hlvl.Value;
import com.coffee.hlvl.VarList;
import com.coffee.hlvl.VariableDecl;
import com.coffee.hlvl.VariableRef;
import com.coffee.hlvl.Visibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlvlFactoryImpl extends EFactoryImpl implements HlvlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HlvlFactory init()
  {
    try
    {
      HlvlFactory theHlvlFactory = (HlvlFactory)EPackage.Registry.INSTANCE.getEFactory(HlvlPackage.eNS_URI);
      if (theHlvlFactory != null)
      {
        return theHlvlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HlvlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HlvlFactoryImpl()
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
      case HlvlPackage.MODEL: return createModel();
      case HlvlPackage.ELM_DECLARATION: return createElmDeclaration();
      case HlvlPackage.DECLARATION: return createDeclaration();
      case HlvlPackage.CONSTANT_DECL: return createConstantDecl();
      case HlvlPackage.VARIABLE_DECL: return createVariableDecl();
      case HlvlPackage.OPTIONS_DECLARATION: return createOptionsDeclaration();
      case HlvlPackage.INTERVAL: return createInterval();
      case HlvlPackage.ENUMERATION: return createEnumeration();
      case HlvlPackage.REL_DECLARATION: return createRelDeclaration();
      case HlvlPackage.RELATION: return createRelation();
      case HlvlPackage.CORE: return createCore();
      case HlvlPackage.MULT_INSTANTIATION: return createMultInstantiation();
      case HlvlPackage.PAIR: return createPair();
      case HlvlPackage.COMPLEX_IMPLIES: return createComplexImplies();
      case HlvlPackage.QIMPLIES: return createQImplies();
      case HlvlPackage.VAR_LIST: return createVarList();
      case HlvlPackage.HIERARCHY: return createHierarchy();
      case HlvlPackage.DECOMPOSITION: return createDecomposition();
      case HlvlPackage.GROUP: return createGroup();
      case HlvlPackage.RANGE: return createRange();
      case HlvlPackage.VISIBILITY: return createVisibility();
      case HlvlPackage.ORDER: return createOrder();
      case HlvlPackage.EXPRESSION: return createExpression();
      case HlvlPackage.RELATIONAL: return createRelational();
      case HlvlPackage.OPERATIONS: return createOperations();
      case HlvlPackage.OPERATION: return createOperation();
      case HlvlPackage.BOOL_VAL: return createBoolVal();
      case HlvlPackage.NUMBER: return createNumber();
      case HlvlPackage.SYMBOL: return createSymbol();
      case HlvlPackage.VALUE: return createValue();
      case HlvlPackage.LIST_OF_VALUES: return createListOfValues();
      case HlvlPackage.LIST_OF_IDS: return createListOfIDs();
      case HlvlPackage.LIST_OF_REL_REFS: return createListOfRelRefs();
      case HlvlPackage.NAMES: return createNames();
      case HlvlPackage.VALUATION: return createValuation();
      case HlvlPackage.LIST_OF_VALUATION: return createListOfValuation();
      case HlvlPackage.LIST_OF_LIST_VALUES: return createListOfListValues();
      case HlvlPackage.IFF: return createIff();
      case HlvlPackage.IMPLIES: return createImplies();
      case HlvlPackage.OR: return createOr();
      case HlvlPackage.AND: return createAnd();
      case HlvlPackage.EQUALITY: return createEquality();
      case HlvlPackage.COMPARISON: return createComparison();
      case HlvlPackage.PLUS: return createPlus();
      case HlvlPackage.MINUS: return createMinus();
      case HlvlPackage.MUL_OR_DIV: return createMulOrDiv();
      case HlvlPackage.NEGATION: return createNegation();
      case HlvlPackage.UNARY: return createUnary();
      case HlvlPackage.FUNCTION: return createFunction();
      case HlvlPackage.BOOL_CONSTANT: return createBoolConstant();
      case HlvlPackage.VARIABLE_REF: return createVariableRef();
      case HlvlPackage.ATTRIBUTE_REF: return createAttributeRef();
      case HlvlPackage.STRING_CONSTANT: return createStringConstant();
      case HlvlPackage.INT_CONSTANT: return createIntConstant();
      case HlvlPackage.SINGLE_INSTRUCTION: return createSingleInstruction();
      case HlvlPackage.VALID_CONF: return createValidConf();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration createElmDeclaration()
  {
    ElmDeclarationImpl elmDeclaration = new ElmDeclarationImpl();
    return elmDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDecl createConstantDecl()
  {
    ConstantDeclImpl constantDecl = new ConstantDeclImpl();
    return constantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionsDeclaration createOptionsDeclaration()
  {
    OptionsDeclarationImpl optionsDeclaration = new OptionsDeclarationImpl();
    return optionsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
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
  public RelDeclaration createRelDeclaration()
  {
    RelDeclarationImpl relDeclaration = new RelDeclarationImpl();
    return relDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Core createCore()
  {
    CoreImpl core = new CoreImpl();
    return core;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultInstantiation createMultInstantiation()
  {
    MultInstantiationImpl multInstantiation = new MultInstantiationImpl();
    return multInstantiation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexImplies createComplexImplies()
  {
    ComplexImpliesImpl complexImplies = new ComplexImpliesImpl();
    return complexImplies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QImplies createQImplies()
  {
    QImpliesImpl qImplies = new QImpliesImpl();
    return qImplies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarList createVarList()
  {
    VarListImpl varList = new VarListImpl();
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hierarchy createHierarchy()
  {
    HierarchyImpl hierarchy = new HierarchyImpl();
    return hierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decomposition createDecomposition()
  {
    DecompositionImpl decomposition = new DecompositionImpl();
    return decomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibility()
  {
    VisibilityImpl visibility = new VisibilityImpl();
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order createOrder()
  {
    OrderImpl order = new OrderImpl();
    return order;
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
  public Relational createRelational()
  {
    RelationalImpl relational = new RelationalImpl();
    return relational;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operations createOperations()
  {
    OperationsImpl operations = new OperationsImpl();
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolVal createBoolVal()
  {
    BoolValImpl boolVal = new BoolValImpl();
    return boolVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.coffee.hlvl.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValues createListOfValues()
  {
    ListOfValuesImpl listOfValues = new ListOfValuesImpl();
    return listOfValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs createListOfIDs()
  {
    ListOfIDsImpl listOfIDs = new ListOfIDsImpl();
    return listOfIDs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfRelRefs createListOfRelRefs()
  {
    ListOfRelRefsImpl listOfRelRefs = new ListOfRelRefsImpl();
    return listOfRelRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Names createNames()
  {
    NamesImpl names = new NamesImpl();
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Valuation createValuation()
  {
    ValuationImpl valuation = new ValuationImpl();
    return valuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValuation createListOfValuation()
  {
    ListOfValuationImpl listOfValuation = new ListOfValuationImpl();
    return listOfValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfListValues createListOfListValues()
  {
    ListOfListValuesImpl listOfListValues = new ListOfListValuesImpl();
    return listOfListValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iff createIff()
  {
    IffImpl iff = new IffImpl();
    return iff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implies createImplies()
  {
    ImpliesImpl implies = new ImpliesImpl();
    return implies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unary createUnary()
  {
    UnaryImpl unary = new UnaryImpl();
    return unary;
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
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRef createAttributeRef()
  {
    AttributeRefImpl attributeRef = new AttributeRefImpl();
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleInstruction createSingleInstruction()
  {
    SingleInstructionImpl singleInstruction = new SingleInstructionImpl();
    return singleInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidConf createValidConf()
  {
    ValidConfImpl validConf = new ValidConfImpl();
    return validConf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HlvlPackage getHlvlPackage()
  {
    return (HlvlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HlvlPackage getPackage()
  {
    return HlvlPackage.eINSTANCE;
  }

} //HlvlFactoryImpl
