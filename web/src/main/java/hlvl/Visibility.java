/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Visibility#getCondition <em>Condition</em>}</li>
 *   <li>{@link hlvl.Visibility#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends Relation {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Relational)
	 * @see hlvl.HlvlPackage#getVisibility_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Relational getCondition();

	/**
	 * Sets the value of the '{@link hlvl.Visibility#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Relational value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference.
	 * @see #setChildren(ListOfRelRefs)
	 * @see hlvl.HlvlPackage#getVisibility_Children()
	 * @model containment="true"
	 * @generated
	 */
	ListOfRelRefs getChildren();

	/**
	 * Sets the value of the '{@link hlvl.Visibility#getChildren <em>Children</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' containment reference.
	 * @see #getChildren()
	 * @generated
	 */
	void setChildren(ListOfRelRefs value);

} // Visibility