/**
 */
package org.muml.psm.allocation.language.as;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the two named parts of a tuple of a SAME_LOCATION or
 * DIFFERENT_LOCATION constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.LocationTupleDescriptor#getSecondInstance <em>Second Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationTupleDescriptor()
 * @model
 * @generated
 */
public interface LocationTupleDescriptor extends InstanceTupleDescriptor {
	/**
	 * Returns the value of the '<em><b>Second Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the named part, which represents the other component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Instance</em>' attribute.
	 * @see #setSecondInstance(String)
	 * @see org.muml.psm.allocation.language.as.AsPackage#getLocationTupleDescriptor_SecondInstance()
	 * @model
	 * @generated
	 */
	String getSecondInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.as.LocationTupleDescriptor#getSecondInstance <em>Second Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Instance</em>' attribute.
	 * @see #getSecondInstance()
	 * @generated
	 */
	void setSecondInstance(String value);

} // LocationTupleDescriptor
