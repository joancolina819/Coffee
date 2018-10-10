/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.Temporal#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.pLEC.Temporal#getCons <em>Cons</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getTemporal()
 * @model
 * @generated
 */
public interface Temporal extends ConsExpression
{
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
   * @see com.coffee.pLEC.PLECPackage#getTemporal_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Temporal#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cons</em>' containment reference.
   * @see #setCons(Expression)
   * @see com.coffee.pLEC.PLECPackage#getTemporal_Cons()
   * @model containment="true"
   * @generated
   */
  Expression getCons();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.Temporal#getCons <em>Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cons</em>' containment reference.
   * @see #getCons()
   * @generated
   */
  void setCons(Expression value);

} // Temporal
