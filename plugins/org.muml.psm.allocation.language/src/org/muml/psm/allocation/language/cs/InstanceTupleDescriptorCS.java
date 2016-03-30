/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be subclassed by tuple descriptor classes where one named part
 * describes a component instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getInstanceTupleDescriptorCS()
 * @model abstract="true"
 * @generated
 */
public interface InstanceTupleDescriptorCS extends TupleDescriptorCS {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the named part which represents the component instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(String)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getInstanceTupleDescriptorCS_Instance()
	 * @model required="true"
	 * @generated
	 */
	String getInstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.InstanceTupleDescriptorCS#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(String value);

} // InstanceTupleDescriptorCS
