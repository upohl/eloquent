/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILP Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPConfiguration#isReproducibleILP <em>Reproducible ILP</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage#getILPConfiguration()
 * @model
 * @generated
 */
public interface ILPConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Reproducible ILP</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reproducible ILP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reproducible ILP</em>' attribute.
	 * @see #setReproducibleILP(boolean)
	 * @see org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage#getILPConfiguration_ReproducibleILP()
	 * @model default="false"
	 * @generated
	 */
	boolean isReproducibleILP();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.algorithm.ilp.configuration.ILPConfiguration#isReproducibleILP <em>Reproducible ILP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reproducible ILP</em>' attribute.
	 * @see #isReproducibleILP()
	 * @generated
	 */
	void setReproducibleILP(boolean value);

} // ILPConfiguration
