/**
 */
package com.coffee.hlvl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.coffee.hlvl.HlvlPackage
 * @generated
 */
public class HlvlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HlvlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HlvlSwitch() {
		if (modelPackage == null) {
			modelPackage = HlvlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case HlvlPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.ELM_DECLARATION: {
			ElmDeclaration elmDeclaration = (ElmDeclaration) theEObject;
			T result = caseElmDeclaration(elmDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.DECLARATION: {
			Declaration declaration = (Declaration) theEObject;
			T result = caseDeclaration(declaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.CONSTANT_DECL: {
			ConstantDecl constantDecl = (ConstantDecl) theEObject;
			T result = caseConstantDecl(constantDecl);
			if (result == null)
				result = caseDeclaration(constantDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VARIABLE_DECL: {
			VariableDecl variableDecl = (VariableDecl) theEObject;
			T result = caseVariableDecl(variableDecl);
			if (result == null)
				result = caseDeclaration(variableDecl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.OPTIONS_DECLARATION: {
			OptionsDeclaration optionsDeclaration = (OptionsDeclaration) theEObject;
			T result = caseOptionsDeclaration(optionsDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.INTERVAL: {
			Interval interval = (Interval) theEObject;
			T result = caseInterval(interval);
			if (result == null)
				result = caseOptionsDeclaration(interval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.ENUMERATION: {
			Enumeration enumeration = (Enumeration) theEObject;
			T result = caseEnumeration(enumeration);
			if (result == null)
				result = caseOptionsDeclaration(enumeration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.REL_DECLARATION: {
			RelDeclaration relDeclaration = (RelDeclaration) theEObject;
			T result = caseRelDeclaration(relDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.CORE: {
			Core core = (Core) theEObject;
			T result = caseCore(core);
			if (result == null)
				result = caseRelation(core);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.MULT_INSTANTIATION: {
			MultInstantiation multInstantiation = (MultInstantiation) theEObject;
			T result = caseMultInstantiation(multInstantiation);
			if (result == null)
				result = caseRelation(multInstantiation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.PAIR: {
			Pair pair = (Pair) theEObject;
			T result = casePair(pair);
			if (result == null)
				result = caseRelation(pair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.COMPLEX_IMPLIES: {
			ComplexImplies complexImplies = (ComplexImplies) theEObject;
			T result = caseComplexImplies(complexImplies);
			if (result == null)
				result = caseRelation(complexImplies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.QIMPLIES: {
			QImplies qImplies = (QImplies) theEObject;
			T result = caseQImplies(qImplies);
			if (result == null)
				result = caseRelation(qImplies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VAR_LIST: {
			VarList varList = (VarList) theEObject;
			T result = caseVarList(varList);
			if (result == null)
				result = caseRelation(varList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.HIERARCHY: {
			Hierarchy hierarchy = (Hierarchy) theEObject;
			T result = caseHierarchy(hierarchy);
			if (result == null)
				result = caseRelation(hierarchy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.DECOMPOSITION: {
			Decomposition decomposition = (Decomposition) theEObject;
			T result = caseDecomposition(decomposition);
			if (result == null)
				result = caseHierarchy(decomposition);
			if (result == null)
				result = caseRelation(decomposition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = caseHierarchy(group);
			if (result == null)
				result = caseRelation(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.RANGE: {
			Range range = (Range) theEObject;
			T result = caseRange(range);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VISIBILITY: {
			Visibility visibility = (Visibility) theEObject;
			T result = caseVisibility(visibility);
			if (result == null)
				result = caseRelation(visibility);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.ORDER: {
			Order order = (Order) theEObject;
			T result = caseOrder(order);
			if (result == null)
				result = caseRelation(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseRelation(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.RELATIONAL: {
			Relational relational = (Relational) theEObject;
			T result = caseRelational(relational);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.OPERATIONS: {
			Operations operations = (Operations) theEObject;
			T result = caseOperations(operations);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.BOOL_VAL: {
			BoolVal boolVal = (BoolVal) theEObject;
			T result = caseBoolVal(boolVal);
			if (result == null)
				result = caseValue(boolVal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.NUMBER: {
			com.coffee.hlvl.Number number = (com.coffee.hlvl.Number) theEObject;
			T result = caseNumber(number);
			if (result == null)
				result = caseValue(number);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.SYMBOL: {
			Symbol symbol = (Symbol) theEObject;
			T result = caseSymbol(symbol);
			if (result == null)
				result = caseValue(symbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.LIST_OF_VALUES: {
			ListOfValues listOfValues = (ListOfValues) theEObject;
			T result = caseListOfValues(listOfValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.LIST_OF_IDS: {
			ListOfIDs listOfIDs = (ListOfIDs) theEObject;
			T result = caseListOfIDs(listOfIDs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.LIST_OF_REL_REFS: {
			ListOfRelRefs listOfRelRefs = (ListOfRelRefs) theEObject;
			T result = caseListOfRelRefs(listOfRelRefs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.NAMES: {
			Names names = (Names) theEObject;
			T result = caseNames(names);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VALUATION: {
			Valuation valuation = (Valuation) theEObject;
			T result = caseValuation(valuation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.LIST_OF_VALUATION: {
			ListOfValuation listOfValuation = (ListOfValuation) theEObject;
			T result = caseListOfValuation(listOfValuation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.LIST_OF_LIST_VALUES: {
			ListOfListValues listOfListValues = (ListOfListValues) theEObject;
			T result = caseListOfListValues(listOfListValues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.IFF: {
			Iff iff = (Iff) theEObject;
			T result = caseIff(iff);
			if (result == null)
				result = caseRelational(iff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.IMPLIES: {
			Implies implies = (Implies) theEObject;
			T result = caseImplies(implies);
			if (result == null)
				result = caseRelational(implies);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseRelational(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseRelational(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.EQUALITY: {
			Equality equality = (Equality) theEObject;
			T result = caseEquality(equality);
			if (result == null)
				result = caseRelational(equality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.COMPARISON: {
			Comparison comparison = (Comparison) theEObject;
			T result = caseComparison(comparison);
			if (result == null)
				result = caseRelational(comparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseRelational(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseRelational(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.MUL_OR_DIV: {
			MulOrDiv mulOrDiv = (MulOrDiv) theEObject;
			T result = caseMulOrDiv(mulOrDiv);
			if (result == null)
				result = caseRelational(mulOrDiv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.NEGATION: {
			Negation negation = (Negation) theEObject;
			T result = caseNegation(negation);
			if (result == null)
				result = caseRelational(negation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.UNARY: {
			Unary unary = (Unary) theEObject;
			T result = caseUnary(unary);
			if (result == null)
				result = caseRelational(unary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseRelational(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.BOOL_CONSTANT: {
			BoolConstant boolConstant = (BoolConstant) theEObject;
			T result = caseBoolConstant(boolConstant);
			if (result == null)
				result = caseRelational(boolConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VARIABLE_REF: {
			VariableRef variableRef = (VariableRef) theEObject;
			T result = caseVariableRef(variableRef);
			if (result == null)
				result = caseRelational(variableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.ATTRIBUTE_REF: {
			AttributeRef attributeRef = (AttributeRef) theEObject;
			T result = caseAttributeRef(attributeRef);
			if (result == null)
				result = caseRelational(attributeRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.STRING_CONSTANT: {
			StringConstant stringConstant = (StringConstant) theEObject;
			T result = caseStringConstant(stringConstant);
			if (result == null)
				result = caseRelational(stringConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.INT_CONSTANT: {
			IntConstant intConstant = (IntConstant) theEObject;
			T result = caseIntConstant(intConstant);
			if (result == null)
				result = caseRelational(intConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.SINGLE_INSTRUCTION: {
			SingleInstruction singleInstruction = (SingleInstruction) theEObject;
			T result = caseSingleInstruction(singleInstruction);
			if (result == null)
				result = caseOperation(singleInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HlvlPackage.VALID_CONF: {
			ValidConf validConf = (ValidConf) theEObject;
			T result = caseValidConf(validConf);
			if (result == null)
				result = caseOperation(validConf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elm Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elm Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElmDeclaration(ElmDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDecl(ConstantDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDecl(VariableDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionsDeclaration(OptionsDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelDeclaration(RelDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultInstantiation(MultInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePair(Pair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Implies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Implies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexImplies(ComplexImplies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QImplies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QImplies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQImplies(QImplies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarList(VarList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHierarchy(Hierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRange(Range object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibility(Visibility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelational(Relational object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperations(Operations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolVal(BoolVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(com.coffee.hlvl.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfValues(ListOfValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of IDs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of IDs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfIDs(ListOfIDs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Rel Refs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Rel Refs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfRelRefs(ListOfRelRefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNames(Names object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuation(Valuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Valuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Valuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfValuation(ListOfValuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of List Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of List Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfListValues(ListOfListValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIff(Iff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplies(Implies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquality(Equality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulOrDiv(MulOrDiv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnary(Unary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolConstant(BoolConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRef(AttributeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstant(IntConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleInstruction(SingleInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Conf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Conf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidConf(ValidConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HlvlSwitch
