/**
 * generated by Xtext 2.12.0
 */
package org.xtext.pLhlcl;

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
 *   <li>{@link org.xtext.pLhlcl.ListOfIDs#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see org.xtext.pLhlcl.PLhlclPackage#getListOfIDs()
 * @model
 * @generated
 */
public interface ListOfIDs extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' reference list.
   * The list contents are of type {@link org.xtext.pLhlcl.VarDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' reference list.
   * @see org.xtext.pLhlcl.PLhlclPackage#getListOfIDs_Ids()
   * @model
   * @generated
   */
  EList<VarDeclaration> getIds();

} // ListOfIDs