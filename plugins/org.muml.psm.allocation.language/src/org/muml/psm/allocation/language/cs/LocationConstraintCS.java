/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Constraint CS</b></em>'.
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
 *   <li>{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getTupleDescriptor <em>Tuple Descriptor</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getLocationConstraintCS()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='exactlyOnePair'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot exactlyOnePair='self.tupleDescriptor.typedPairs->size() = 1'"
 * @generated
 */
public interface LocationConstraintCS extends ConstraintCS {
	/**
	 * Returns the value of the '<em><b>Tuple Descriptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of location tuple descriptors.
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

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.psm.allocation.language.cs.LocationConstraintTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the type of the location constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.muml.psm.allocation.language.cs.LocationConstraintTypes
	 * @see #setType(LocationConstraintTypes)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getLocationConstraintCS_Type()
	 * @model required="true"
	 * @generated
	 */
	LocationConstraintTypes getType();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.LocationConstraintCS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.muml.psm.allocation.language.cs.LocationConstraintTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(LocationConstraintTypes value);

} // LocationConstraintCS
