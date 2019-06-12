/**
 */
package hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of IDs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ListOfIDs#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getListOfIDs()
 * @model
 * @generated
 */
public interface ListOfIDs extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link hlvl.ElmDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see hlvl.HlvlPackage#getListOfIDs_Values()
	 * @model
	 * @generated
	 */
	EList<ElmDeclaration> getValues();

} // ListOfIDs