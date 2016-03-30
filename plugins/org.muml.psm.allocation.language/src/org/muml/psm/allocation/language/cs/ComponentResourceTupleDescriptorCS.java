/**
 */
package org.muml.psm.allocation.language.cs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Resource Tuple Descriptor CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes two of the potentially multiple named parts of a tuple of a
 * RESOURCE or REQUIRED_HWRESINSTANCE constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS#getHwresinstance <em>Hwresinstance</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.cs.CsPackage#getComponentResourceTupleDescriptorCS()
 * @model
 * @generated
 */
public interface ComponentResourceTupleDescriptorCS extends InstanceTupleDescriptorCS {
	/**
	 * Returns the value of the '<em><b>Hwresinstance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the named part which represents hardware resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwresinstance</em>' attribute.
	 * @see #setHwresinstance(String)
	 * @see org.muml.psm.allocation.language.cs.CsPackage#getComponentResourceTupleDescriptorCS_Hwresinstance()
	 * @model required="true"
	 * @generated
	 */
	String getHwresinstance();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS#getHwresinstance <em>Hwresinstance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwresinstance</em>' attribute.
	 * @see #getHwresinstance()
	 * @generated
	 */
	void setHwresinstance(String value);

} // ComponentResourceTupleDescriptorCS
