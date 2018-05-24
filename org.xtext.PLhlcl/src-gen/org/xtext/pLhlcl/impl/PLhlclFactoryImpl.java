/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.pLhlcl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PLhlclFactoryImpl extends EFactoryImpl implements PLhlclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PLhlclFactory init()
  {
    try
    {
      PLhlclFactory thePLhlclFactory = (PLhlclFactory)EPackage.Registry.INSTANCE.getEFactory(PLhlclPackage.eNS_URI);
      if (thePLhlclFactory != null)
      {
        return thePLhlclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PLhlclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PLhlclFactoryImpl()
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
      case PLhlclPackage.MODEL: return createModel();
      case PLhlclPackage.VAR_DECLARATION: return createVarDeclaration();
      case PLhlclPackage.VARIANT_DECLARATION: return createVariantDeclaration();
      case PLhlclPackage.VARIANTS_INTERVAL: return createVariantsInterval();
      case PLhlclPackage.VARIANTS_ENUMERATION: return createVariantsEnumeration();
      case PLhlclPackage.ENUMERATION: return createEnumeration();
      case PLhlclPackage.CONSTRAINT: return createConstraint();
      case PLhlclPackage.CONS_EXPRESSION: return createConsExpression();
      case PLhlclPackage.EXPRESSION: return createExpression();
      case PLhlclPackage.ID_CONS: return createIDCons();
      case PLhlclPackage.REFINEMENT: return createRefinement();
      case PLhlclPackage.ASSIGNMENT: return createAssignment();
      case PLhlclPackage.VAR_REFINEMENT: return createVarRefinement();
      case PLhlclPackage.SET_REFINEMENT: return createSetRefinement();
      case PLhlclPackage.RULE: return createRule();
      case PLhlclPackage.FODA_UN: return createFodaUN();
      case PLhlclPackage.FODA_BIN: return createFodaBin();
      case PLhlclPackage.FODA_NARY: return createFodaNary();
      case PLhlclPackage.LIST_OF_VALUES: return createListOfValues();
      case PLhlclPackage.LIST_OF_IDS: return createListOfIDs();
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
  public VarDeclaration createVarDeclaration()
  {
    VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
    return varDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantDeclaration createVariantDeclaration()
  {
    VariantDeclarationImpl variantDeclaration = new VariantDeclarationImpl();
    return variantDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantsInterval createVariantsInterval()
  {
    VariantsIntervalImpl variantsInterval = new VariantsIntervalImpl();
    return variantsInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantsEnumeration createVariantsEnumeration()
  {
    VariantsEnumerationImpl variantsEnumeration = new VariantsEnumerationImpl();
    return variantsEnumeration;
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
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConsExpression createConsExpression()
  {
    ConsExpressionImpl consExpression = new ConsExpressionImpl();
    return consExpression;
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
  public IDCons createIDCons()
  {
    IDConsImpl idCons = new IDConsImpl();
    return idCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refinement createRefinement()
  {
    RefinementImpl refinement = new RefinementImpl();
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRefinement createVarRefinement()
  {
    VarRefinementImpl varRefinement = new VarRefinementImpl();
    return varRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetRefinement createSetRefinement()
  {
    SetRefinementImpl setRefinement = new SetRefinementImpl();
    return setRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaUN createFodaUN()
  {
    FodaUNImpl fodaUN = new FodaUNImpl();
    return fodaUN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaBin createFodaBin()
  {
    FodaBinImpl fodaBin = new FodaBinImpl();
    return fodaBin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FodaNary createFodaNary()
  {
    FodaNaryImpl fodaNary = new FodaNaryImpl();
    return fodaNary;
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
  public PLhlclPackage getPLhlclPackage()
  {
    return (PLhlclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PLhlclPackage getPackage()
  {
    return PLhlclPackage.eINSTANCE;
  }

} //PLhlclFactoryImpl
