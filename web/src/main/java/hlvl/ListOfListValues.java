/**
 */
package hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of List Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ListOfListValues#getList <em>List</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getListOfListValues()
 * @model
 * @generated
 */
public interface ListOfListValues extends EObject {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link hlvl.ListOfValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see hlvl.HlvlPackage#getListOfListValues_List()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListOfValues> getList();

} // ListOfListValues