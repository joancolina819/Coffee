/**
 */
package hlvl.util;

import hlvl.And;
import hlvl.AttributeRef;
import hlvl.BoolConstant;
import hlvl.BoolVal;
import hlvl.Comparison;
import hlvl.ComplexImplies;
import hlvl.ConstantDecl;
import hlvl.Core;
import hlvl.Declaration;
import hlvl.Decomposition;
import hlvl.ElmDeclaration;
import hlvl.Enumeration;
import hlvl.Equality;
import hlvl.Expression;
import hlvl.Function;
import hlvl.Group;
import hlvl.Hierarchy;
import hlvl.HlvlPackage;
import hlvl.Iff;
import hlvl.Implies;
import hlvl.IntConstant;
import hlvl.Interval;
import hlvl.ListOfIDs;
import hlvl.ListOfListValues;
import hlvl.ListOfRelRefs;
import hlvl.ListOfValuation;
import hlvl.ListOfValues;
import hlvl.Minus;
import hlvl.Model;
import hlvl.MulOrDiv;
import hlvl.MultInstantiation;
import hlvl.Names;
import hlvl.Negation;
import hlvl.Operation;
import hlvl.Operations;
import hlvl.OptionsDeclaration;
import hlvl.Or;
import hlvl.Order;
import hlvl.Pair;
import hlvl.Plus;
import hlvl.QImplies;
import hlvl.Range;
import hlvl.RelDeclaration;
import hlvl.Relation;
import hlvl.Relational;
import hlvl.SingleInstruction;
import hlvl.StringConstant;
import hlvl.Symbol;
import hlvl.Unary;
import hlvl.ValidConf;
import hlvl.Valuation;
import hlvl.Value;
import hlvl.VarList;
import hlvl.VariableDecl;
import hlvl.VariableRef;
import hlvl.Visibility;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hlvl.HlvlPackage
 * @generated
 */
public class HlvlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HlvlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlvlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HlvlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HlvlSwitch<Adapter> modelSwitch = new HlvlSwitch<Adapter>() {
		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseElmDeclaration(ElmDeclaration object) {
			return createElmDeclarationAdapter();
		}

		@Override
		public Adapter caseDeclaration(Declaration object) {
			return createDeclarationAdapter();
		}

		@Override
		public Adapter caseConstantDecl(ConstantDecl object) {
			return createConstantDeclAdapter();
		}

		@Override
		public Adapter caseVariableDecl(VariableDecl object) {
			return createVariableDeclAdapter();
		}

		@Override
		public Adapter caseOptionsDeclaration(OptionsDeclaration object) {
			return createOptionsDeclarationAdapter();
		}

		@Override
		public Adapter caseInterval(Interval object) {
			return createIntervalAdapter();
		}

		@Override
		public Adapter caseEnumeration(Enumeration object) {
			return createEnumerationAdapter();
		}

		@Override
		public Adapter caseRelDeclaration(RelDeclaration object) {
			return createRelDeclarationAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseCore(Core object) {
			return createCoreAdapter();
		}

		@Override
		public Adapter caseMultInstantiation(MultInstantiation object) {
			return createMultInstantiationAdapter();
		}

		@Override
		public Adapter casePair(Pair object) {
			return createPairAdapter();
		}

		@Override
		public Adapter caseComplexImplies(ComplexImplies object) {
			return createComplexImpliesAdapter();
		}

		@Override
		public Adapter caseQImplies(QImplies object) {
			return createQImpliesAdapter();
		}

		@Override
		public Adapter caseVarList(VarList object) {
			return createVarListAdapter();
		}

		@Override
		public Adapter caseHierarchy(Hierarchy object) {
			return createHierarchyAdapter();
		}

		@Override
		public Adapter caseDecomposition(Decomposition object) {
			return createDecompositionAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseRange(Range object) {
			return createRangeAdapter();
		}

		@Override
		public Adapter caseVisibility(Visibility object) {
			return createVisibilityAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseRelational(Relational object) {
			return createRelationalAdapter();
		}

		@Override
		public Adapter caseOperations(Operations object) {
			return createOperationsAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseBoolVal(BoolVal object) {
			return createBoolValAdapter();
		}

		@Override
		public Adapter caseNumber(hlvl.Number object) {
			return createNumberAdapter();
		}

		@Override
		public Adapter caseSymbol(Symbol object) {
			return createSymbolAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseListOfValues(ListOfValues object) {
			return createListOfValuesAdapter();
		}

		@Override
		public Adapter caseListOfIDs(ListOfIDs object) {
			return createListOfIDsAdapter();
		}

		@Override
		public Adapter caseListOfRelRefs(ListOfRelRefs object) {
			return createListOfRelRefsAdapter();
		}

		@Override
		public Adapter caseNames(Names object) {
			return createNamesAdapter();
		}

		@Override
		public Adapter caseValuation(Valuation object) {
			return createValuationAdapter();
		}

		@Override
		public Adapter caseListOfValuation(ListOfValuation object) {
			return createListOfValuationAdapter();
		}

		@Override
		public Adapter caseListOfListValues(ListOfListValues object) {
			return createListOfListValuesAdapter();
		}

		@Override
		public Adapter caseIff(Iff object) {
			return createIffAdapter();
		}

		@Override
		public Adapter caseImplies(Implies object) {
			return createImpliesAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseEquality(Equality object) {
			return createEqualityAdapter();
		}

		@Override
		public Adapter caseComparison(Comparison object) {
			return createComparisonAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseMulOrDiv(MulOrDiv object) {
			return createMulOrDivAdapter();
		}

		@Override
		public Adapter caseNegation(Negation object) {
			return createNegationAdapter();
		}

		@Override
		public Adapter caseUnary(Unary object) {
			return createUnaryAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseBoolConstant(BoolConstant object) {
			return createBoolConstantAdapter();
		}

		@Override
		public Adapter caseVariableRef(VariableRef object) {
			return createVariableRefAdapter();
		}

		@Override
		public Adapter caseAttributeRef(AttributeRef object) {
			return createAttributeRefAdapter();
		}

		@Override
		public Adapter caseStringConstant(StringConstant object) {
			return createStringConstantAdapter();
		}

		@Override
		public Adapter caseIntConstant(IntConstant object) {
			return createIntConstantAdapter();
		}

		@Override
		public Adapter caseSingleInstruction(SingleInstruction object) {
			return createSingleInstructionAdapter();
		}

		@Override
		public Adapter caseValidConf(ValidConf object) {
			return createValidConfAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ElmDeclaration <em>Elm Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ElmDeclaration
	 * @generated
	 */
	public Adapter createElmDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ConstantDecl <em>Constant Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ConstantDecl
	 * @generated
	 */
	public Adapter createConstantDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.VariableDecl
	 * @generated
	 */
	public Adapter createVariableDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.OptionsDeclaration <em>Options Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.OptionsDeclaration
	 * @generated
	 */
	public Adapter createOptionsDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.RelDeclaration <em>Rel Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.RelDeclaration
	 * @generated
	 */
	public Adapter createRelDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.MultInstantiation <em>Mult Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.MultInstantiation
	 * @generated
	 */
	public Adapter createMultInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ComplexImplies <em>Complex Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ComplexImplies
	 * @generated
	 */
	public Adapter createComplexImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.QImplies <em>QImplies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.QImplies
	 * @generated
	 */
	public Adapter createQImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.VarList <em>Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.VarList
	 * @generated
	 */
	public Adapter createVarListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Hierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Hierarchy
	 * @generated
	 */
	public Adapter createHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Visibility
	 * @generated
	 */
	public Adapter createVisibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Relational <em>Relational</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Relational
	 * @generated
	 */
	public Adapter createRelationalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Operations
	 * @generated
	 */
	public Adapter createOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.BoolVal <em>Bool Val</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.BoolVal
	 * @generated
	 */
	public Adapter createBoolValAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ListOfValues <em>List Of Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ListOfValues
	 * @generated
	 */
	public Adapter createListOfValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ListOfIDs <em>List Of IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ListOfIDs
	 * @generated
	 */
	public Adapter createListOfIDsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ListOfRelRefs <em>List Of Rel Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ListOfRelRefs
	 * @generated
	 */
	public Adapter createListOfRelRefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Names <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Names
	 * @generated
	 */
	public Adapter createNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Valuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Valuation
	 * @generated
	 */
	public Adapter createValuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ListOfValuation <em>List Of Valuation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ListOfValuation
	 * @generated
	 */
	public Adapter createListOfValuationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ListOfListValues <em>List Of List Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ListOfListValues
	 * @generated
	 */
	public Adapter createListOfListValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Iff <em>Iff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Iff
	 * @generated
	 */
	public Adapter createIffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Implies
	 * @generated
	 */
	public Adapter createImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.MulOrDiv <em>Mul Or Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.MulOrDiv
	 * @generated
	 */
	public Adapter createMulOrDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Unary
	 * @generated
	 */
	public Adapter createUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.VariableRef
	 * @generated
	 */
	public Adapter createVariableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.AttributeRef <em>Attribute Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.AttributeRef
	 * @generated
	 */
	public Adapter createAttributeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.SingleInstruction <em>Single Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.SingleInstruction
	 * @generated
	 */
	public Adapter createSingleInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hlvl.ValidConf <em>Valid Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hlvl.ValidConf
	 * @generated
	 */
	public Adapter createValidConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HlvlAdapterFactory
