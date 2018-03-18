/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forbidden Location Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForbiddenLocationConstraintCS is used to specify that certain location
 * combinations are not allowed. For instance, it can be used to express that
 * 
 * "A cannot be related to B while C is related to D and vice-versa. Moreover,
 * A cannot be related to X while F is related to D and vice-versa."
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.ForbiddenLocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getForbiddenLocationConstraint()
 * @model
 * @generated
 */
public interface ForbiddenLocationConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tuple descriptor that describes the forbidden location constraint's tuple
	 * type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(TupleDescriptor)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getForbiddenLocationConstraint_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptor getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.ForbiddenLocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(TupleDescriptor value);

} // ForbiddenLocationConstraint
