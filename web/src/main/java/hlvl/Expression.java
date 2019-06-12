/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Expression#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Relation {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Relational)
	 * @see hlvl.HlvlPackage#getExpression_Exp()
	 * @model containment="true"
	 * @generated
	 */
	Relational getExp();

	/**
	 * Sets the value of the '{@link hlvl.Expression#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Relational value);

} // Expression