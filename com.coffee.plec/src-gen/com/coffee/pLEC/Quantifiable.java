/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getMinV1 <em>Min V1</em>}</li>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getMaxV1 <em>Max V1</em>}</li>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getVar1 <em>Var1</em>}</li>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getMinV2 <em>Min V2</em>}</li>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getMaxV2 <em>Max V2</em>}</li>
 *   <li>{@link com.coffee.pLEC.Quantifiable#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getQuantifiable()
 * @model
 * @generated
 */
public interface Quantifiable extends ConsExpression
{
  /**
   * Returns the value of the '<em><b>Min V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min V1</em>' containment reference.
   * @see #setMinV1(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_MinV1()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMinV1();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getMinV1 <em>Min V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min V1</em>' containment reference.
   * @see #getMinV1()
   * @generated
   */
  void setMinV1(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Max V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max V1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max V1</em>' containment reference.
   * @see #setMaxV1(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_MaxV1()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMaxV1();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getMaxV1 <em>Max V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max V1</em>' containment reference.
   * @see #getMaxV1()
   * @generated
   */
  void setMaxV1(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Var1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' reference.
   * @see #setVar1(VarDeclaration)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_Var1()
   * @model
   * @generated
   */
  VarDeclaration getVar1();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getVar1 <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(VarDeclaration value);

  /**
   * Returns the value of the '<em><b>Min V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min V2</em>' containment reference.
   * @see #setMinV2(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_MinV2()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMinV2();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getMinV2 <em>Min V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min V2</em>' containment reference.
   * @see #getMinV2()
   * @generated
   */
  void setMinV2(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Max V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max V2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max V2</em>' containment reference.
   * @see #setMaxV2(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_MaxV2()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMaxV2();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getMaxV2 <em>Max V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max V2</em>' containment reference.
   * @see #getMaxV2()
   * @generated
   */
  void setMaxV2(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' reference.
   * @see #setVar2(VarDeclaration)
   * @see com.coffee.pLEC.PLECPackage#getQuantifiable_Var2()
   * @model
   * @generated
   */
  VarDeclaration getVar2();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Quantifiable#getVar2 <em>Var2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(VarDeclaration value);

} // Quantifiable
