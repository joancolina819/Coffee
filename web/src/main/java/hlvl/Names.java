/**
 */
package hlvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Names#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getNames()
 * @model
 * @generated
 */
public interface Names extends EObject {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute list.
	 * @see hlvl.HlvlPackage#getNames_Ids()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getIds();

} // Names