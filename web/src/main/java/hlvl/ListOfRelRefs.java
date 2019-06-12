/**
 */
package hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Rel Refs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ListOfRelRefs#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getListOfRelRefs()
 * @model
 * @generated
 */
public interface ListOfRelRefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' reference list.
	 * The list contents are of type {@link hlvl.RelDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' reference list.
	 * @see hlvl.HlvlPackage#getListOfRelRefs_Ids()
	 * @model
	 * @generated
	 */
	EList<RelDeclaration> getIds();

} // ListOfRelRefs