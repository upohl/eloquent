/**
 */
package org.muml.eloquent.algorithm.ilp.neos.cplex.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPLEX Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigPackage#getCPLEXConfiguration()
 * @model
 * @generated
 */
public interface CPLEXConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigPackage#getCPLEXConfiguration_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // CPLEXConfiguration
