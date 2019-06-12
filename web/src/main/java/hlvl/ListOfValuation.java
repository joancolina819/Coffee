/**
 */
package hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ListOfValuation#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getListOfValuation()
 * @model
 * @generated
 */
public interface ListOfValuation extends EObject {
	/**
	 * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link hlvl.Valuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pairs</em>' containment reference list.
	 * @see hlvl.HlvlPackage#getListOfValuation_Pairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Valuation> getPairs();

} // ListOfValuation