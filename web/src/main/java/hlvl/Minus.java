/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Minus#getLeft <em>Left</em>}</li>
 *   <li>{@link hlvl.Minus#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getMinus()
 * @model
 * @generated
 */
public interface Minus extends Relational {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Relational)
	 * @see hlvl.HlvlPackage#getMinus_Left()
	 * @model containment="true"
	 * @generated
	 */
	Relational getLeft();

	/**
	 * Sets the value of the '{@link hlvl.Minus#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Relational value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Relational)
	 * @see hlvl.HlvlPackage#getMinus_Right()
	 * @model containment="true"
	 * @generated
	 */
	Relational getRight();

	/**
	 * Sets the value of the '{@link hlvl.Minus#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Relational value);

} // Minus