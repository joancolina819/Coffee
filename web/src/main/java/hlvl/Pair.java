/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Pair#getOperator <em>Operator</em>}</li>
 *   <li>{@link hlvl.Pair#getVar1 <em>Var1</em>}</li>
 *   <li>{@link hlvl.Pair#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends Relation {
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
	 * @see hlvl.HlvlPackage#getPair_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link hlvl.Pair#getOperator <em>Operator</em>}' attribute.
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
	 * @see hlvl.HlvlPackage#getPair_Var1()
	 * @model
	 * @generated
	 */
	ElmDeclaration getVar1();

	/**
	 * Sets the value of the '{@link hlvl.Pair#getVar1 <em>Var1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var1</em>' reference.
	 * @see #getVar1()
	 * @generated
	 */
	void setVar1(ElmDeclaration value);

	/**
	 * Returns the value of the '<em><b>Var2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var2</em>' reference.
	 * @see #setVar2(ElmDeclaration)
	 * @see hlvl.HlvlPackage#getPair_Var2()
	 * @model
	 * @generated
	 */
	ElmDeclaration getVar2();

	/**
	 * Sets the value of the '{@link hlvl.Pair#getVar2 <em>Var2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var2</em>' reference.
	 * @see #getVar2()
	 * @generated
	 */
	void setVar2(ElmDeclaration value);

} // Pair