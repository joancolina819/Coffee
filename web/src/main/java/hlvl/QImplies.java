/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QImplies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.QImplies#getMina <em>Mina</em>}</li>
 *   <li>{@link hlvl.QImplies#getMaxa <em>Maxa</em>}</li>
 *   <li>{@link hlvl.QImplies#getVar1 <em>Var1</em>}</li>
 *   <li>{@link hlvl.QImplies#getMinb <em>Minb</em>}</li>
 *   <li>{@link hlvl.QImplies#getMaxb <em>Maxb</em>}</li>
 *   <li>{@link hlvl.QImplies#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getQImplies()
 * @model
 * @generated
 */
public interface QImplies extends Relation {
	/**
	 * Returns the value of the '<em><b>Mina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mina</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mina</em>' attribute.
	 * @see #setMina(int)
	 * @see hlvl.HlvlPackage#getQImplies_Mina()
	 * @model
	 * @generated
	 */
	int getMina();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getMina <em>Mina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mina</em>' attribute.
	 * @see #getMina()
	 * @generated
	 */
	void setMina(int value);

	/**
	 * Returns the value of the '<em><b>Maxa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxa</em>' attribute.
	 * @see #setMaxa(int)
	 * @see hlvl.HlvlPackage#getQImplies_Maxa()
	 * @model
	 * @generated
	 */
	int getMaxa();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getMaxa <em>Maxa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxa</em>' attribute.
	 * @see #getMaxa()
	 * @generated
	 */
	void setMaxa(int value);

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
	 * @see hlvl.HlvlPackage#getQImplies_Var1()
	 * @model
	 * @generated
	 */
	ElmDeclaration getVar1();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getVar1 <em>Var1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var1</em>' reference.
	 * @see #getVar1()
	 * @generated
	 */
	void setVar1(ElmDeclaration value);

	/**
	 * Returns the value of the '<em><b>Minb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minb</em>' attribute.
	 * @see #setMinb(int)
	 * @see hlvl.HlvlPackage#getQImplies_Minb()
	 * @model
	 * @generated
	 */
	int getMinb();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getMinb <em>Minb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minb</em>' attribute.
	 * @see #getMinb()
	 * @generated
	 */
	void setMinb(int value);

	/**
	 * Returns the value of the '<em><b>Maxb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxb</em>' attribute.
	 * @see #setMaxb(int)
	 * @see hlvl.HlvlPackage#getQImplies_Maxb()
	 * @model
	 * @generated
	 */
	int getMaxb();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getMaxb <em>Maxb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxb</em>' attribute.
	 * @see #getMaxb()
	 * @generated
	 */
	void setMaxb(int value);

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
	 * @see hlvl.HlvlPackage#getQImplies_Var2()
	 * @model
	 * @generated
	 */
	ElmDeclaration getVar2();

	/**
	 * Sets the value of the '{@link hlvl.QImplies#getVar2 <em>Var2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var2</em>' reference.
	 * @see #getVar2()
	 * @generated
	 */
	void setVar2(ElmDeclaration value);

} // QImplies