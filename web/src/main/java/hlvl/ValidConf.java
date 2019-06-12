/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.ValidConf#getValuations <em>Valuations</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getValidConf()
 * @model
 * @generated
 */
public interface ValidConf extends Operation {
	/**
	 * Returns the value of the '<em><b>Valuations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuations</em>' containment reference.
	 * @see #setValuations(ListOfValuation)
	 * @see hlvl.HlvlPackage#getValidConf_Valuations()
	 * @model containment="true"
	 * @generated
	 */
	ListOfValuation getValuations();

	/**
	 * Sets the value of the '{@link hlvl.ValidConf#getValuations <em>Valuations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuations</em>' containment reference.
	 * @see #getValuations()
	 * @generated
	 */
	void setValuations(ListOfValuation value);

} // ValidConf