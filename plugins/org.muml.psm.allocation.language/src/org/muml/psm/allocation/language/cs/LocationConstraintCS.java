/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Constraint CS</b></em>'.
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
 *   <li>{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getLocationConstraintCS()
 * @model
 * @generated
 */
public interface LocationConstraintCS extends ConstraintCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of component resource tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(TupleDescriptorCS)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getLocationConstraintCS_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TupleDescriptorCS getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(TupleDescriptorCS value);

} // LocationConstraintCS
