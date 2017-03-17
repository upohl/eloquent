/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * XXX: no adjusted semantics definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationConstraint()
 * @model
 * @generated
 */
public interface LocationConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(TupleDescriptor)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationConstraint_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptor getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(TupleDescriptor value);

} // LocationConstraint
