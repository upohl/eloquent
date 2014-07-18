/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.oclcontext;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.ecore.EObject;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage#getOCLContext()
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
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage#getOCLContext_ComponentInstanceConfiguration()
	 * @model
	 * @generated
	 */
	ComponentInstanceConfiguration getComponentInstanceConfiguration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}' reference.
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
	 * @see de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OclcontextPackage#getOCLContext_HardwarePlatformInstanceConfiguration()
	 * @model
	 * @generated
	 */
	HWPlatformInstanceConfiguration getHardwarePlatformInstanceConfiguration();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.allocation.language.oclcontext.OCLContext#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Platform Instance Configuration</em>' reference.
	 * @see #getHardwarePlatformInstanceConfiguration()
	 * @generated
	 */
	void setHardwarePlatformInstanceConfiguration(HWPlatformInstanceConfiguration value);

} // OCLContext
