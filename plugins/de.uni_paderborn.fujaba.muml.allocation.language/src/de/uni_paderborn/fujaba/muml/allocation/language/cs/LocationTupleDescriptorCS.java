/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the two named parts of a tuple of a SAME_LOCATION or
 * DIFFERENT_LOCATION constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getLocationTupleDescriptorCS()
 * @model
 * @generated
 */
public interface LocationTupleDescriptorCS extends InstanceTupleDescriptorCS {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the named part which represents the set of component instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(String)
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.cs.CsPackage#getLocationTupleDescriptorCS_Instances()
	 * @model required="true"
	 * @generated
	 */
	String getInstances();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(String value);

} // LocationTupleDescriptorCS
