/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.VarList#getOperator <em>Operator</em>}</li>
 *   <li>{@link hlvl.VarList#getVar1 <em>Var1</em>}</li>
 *   <li>{@link hlvl.VarList#getList <em>List</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getVarList()
 * @model
 * @generated
 */
public interface VarList extends Relation {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see hlvl.HlvlPackage#getVarList_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link hlvl.VarList#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Var1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var1</em>' reference.
	 * @see #setVar1(ElmDeclaration)
	 * @see hlvl.HlvlPackage#getVarList_Var1()
	 * @model
	 * @generated
	 */
	ElmDeclaration getVar1();

	/**
	 * Sets the value of the '{@link hlvl.VarList#getVar1 <em>Var1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var1</em>' reference.
	 * @see #getVar1()
	 * @generated
	 */
	void setVar1(ElmDeclaration value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(ListOfIDs)
	 * @see hlvl.HlvlPackage#getVarList_List()
	 * @model containment="true"
	 * @generated
	 */
	ListOfIDs getList();

	/**
	 * Sets the value of the '{@link hlvl.VarList#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(ListOfIDs value);

} // VarList