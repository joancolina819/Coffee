/**
 */
package hlvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elm Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ElmDeclaration#getAtt <em>Att</em>}</li>
 *   <li>{@link hlvl.ElmDeclaration#getInst <em>Inst</em>}</li>
 *   <li>{@link hlvl.ElmDeclaration#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hlvl.ElmDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link hlvl.ElmDeclaration#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hlvl.ElmDeclaration#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getElmDeclaration()
 * @model
 * @generated
 */
public interface ElmDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att</em>' attribute.
	 * @see #setAtt(String)
	 * @see hlvl.HlvlPackage#getElmDeclaration_Att()
	 * @model
	 * @generated
	 */
	String getAtt();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getAtt <em>Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att</em>' attribute.
	 * @see #getAtt()
	 * @generated
	 */
	void setAtt(String value);

	/**
	 * Returns the value of the '<em><b>Inst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst</em>' attribute.
	 * @see #setInst(String)
	 * @see hlvl.HlvlPackage#getElmDeclaration_Inst()
	 * @model
	 * @generated
	 */
	String getInst();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getInst <em>Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst</em>' attribute.
	 * @see #getInst()
	 * @generated
	 */
	void setInst(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see hlvl.HlvlPackage#getElmDeclaration_DataType()
	 * @model
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hlvl.HlvlPackage#getElmDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(Declaration)
	 * @see hlvl.HlvlPackage#getElmDeclaration_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	Declaration getDeclaration();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Declaration value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see hlvl.HlvlPackage#getElmDeclaration_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link hlvl.ElmDeclaration#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // ElmDeclaration