/**
 */
package org.muml.psm.allocation.language.oclcontext;

import org.eclipse.emf.ecore.EObject;

import org.muml.pim.instance.ComponentInstanceConfiguration;

import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the OCL context object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link org.muml.psm.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.allocation.language.oclcontext.OclcontextPackage#getOCLContext()
 * @model
 * @generated
 */
public interface OCLContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a component instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Instance Configuration</em>' reference.
	 * @see #setComponentInstanceConfiguration(ComponentInstanceConfiguration)
	 * @see org.muml.psm.allocation.language.oclcontext.OclcontextPackage#getOCLContext_ComponentInstanceConfiguration()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getComponentInstanceConfiguration();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance Configuration</em>' reference.
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 */
	void setComponentInstanceConfiguration(ComponentInstanceConfiguration value);

	/**
	 * Returns the value of the '<em><b>Hardware Platform Instance Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a hardware platform instance configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Platform Instance Configuration</em>' reference.
	 * @see #setHardwarePlatformInstanceConfiguration(HWPlatformInstanceConfiguration)
	 * @see org.muml.psm.allocation.language.oclcontext.OclcontextPackage#getOCLContext_HardwarePlatformInstanceConfiguration()
	 * @model
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHardwarePlatformInstanceConfiguration();

	/**
	 * Sets the value of the '{@link org.muml.psm.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Platform Instance Configuration</em>' reference.
	 * @see #getHardwarePlatformInstanceConfiguration()
	 * @generated
	 */
	void setHardwarePlatformInstanceConfiguration(HWPlatformInstanceConfiguration value);

} // OCLContext
