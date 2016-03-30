/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class either represents a SAME_LOCATION or DIFFERENT_LOCATION
 * constraint. A constraint of the type SAME_LOCATION specifies that a set of
 * component instances have to be allocated to the same hardware resource
 * instance. The DIFFERENT_LOCATION type constraint is the opposite
 * of the SAME_LOCATION type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.as.LocationConstraint#getType <em>Type</em>}</li>
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
	 * A set of location tuple descriptors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #setTupleDescriptor(LocationTupleDescriptor)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationConstraint_TupleDescriptor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocationTupleDescriptor getTupleDescriptor();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.LocationConstraint#getTupleDescriptor <em>Tuple Descriptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Descriptor</em>' containment reference.
	 * @see #getTupleDescriptor()
	 * @generated
	 */
	void setTupleDescriptor(LocationTupleDescriptor value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.language.as.LocationConstraintTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the type of the location constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
	 * @see #setType(LocationConstraintTypes)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationConstraint_Type()
	 * @model
	 * @generated
	 */
	LocationConstraintTypes getType();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.LocationConstraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.psm.allocation.language.as.LocationConstraintTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(LocationConstraintTypes value);

} // LocationConstraint
