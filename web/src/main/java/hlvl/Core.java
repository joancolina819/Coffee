/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.Core#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends Relation {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(ListOfIDs)
	 * @see hlvl.HlvlPackage#getCore_Elements()
	 * @model containment="true"
	 * @generated
	 */
	ListOfIDs getElements();

	/**
	 * Sets the value of the '{@link hlvl.Core#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(ListOfIDs value);

} // Core