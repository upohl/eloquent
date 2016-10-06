/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a "resource" constraint, which can be used
 * to specify resource limits (like the maximum amount of available memory)
 * for a hardware resource instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.ResourceConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getResourceConstraint()
 * @model
 * @generated
 */
public interface ResourceConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the tuple descriptor for the right-hand side of the inequality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(BoundWeightTupleDescriptor)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getResourceConstraint_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoundWeightTupleDescriptor getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.ResourceConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(BoundWeightTupleDescriptor value);

} // ResourceConstraint
