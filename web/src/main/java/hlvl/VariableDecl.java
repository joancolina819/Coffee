/**
 */
package hlvl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hlvl.VariableDecl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see hlvl.HlvlPackage#getVariableDecl()
 * @model
 * @generated
 */
public interface VariableDecl extends Declaration {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference.
	 * @see #setVariants(OptionsDeclaration)
	 * @see hlvl.HlvlPackage#getVariableDecl_Variants()
	 * @model containment="true"
	 * @generated
	 */
	OptionsDeclaration getVariants();

	/**
	 * Sets the value of the '{@link hlvl.VariableDecl#getVariants <em>Variants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variants</em>' containment reference.
	 * @see #getVariants()
	 * @generated
	 */
	void setVariants(OptionsDeclaration value);

} // VariableDecl