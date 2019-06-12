/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Negation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends Relational {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Relational)
	 * @see hlvl.HlvlPackage#getNegation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Relational getExpression();

	/**
	 * Sets the value of the '{@link hlvl.Negation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Relational value);

} // Negation