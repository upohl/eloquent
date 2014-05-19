/**
 */
package de.uni_paderborn.fujaba.muml.allocation.language.context.impl;

import de.uni_paderborn.fujaba.muml.allocation.language.context.ContextPackage;
import de.uni_paderborn.fujaba.muml.allocation.language.context.OCLContext;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCL Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.context.impl.OCLContextImpl#getComponentInstanceConfiguration <em>Component Instance Configuration</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.allocation.language.context.impl.OCLContextImpl#getHardwarePlatformInstanceConfiguration <em>Hardware Platform Instance Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLContextImpl extends MinimalEObjectImpl.Container implements OCLContext {
	/**
	 * The cached value of the '{@link #getComponentInstanceConfiguration() <em>Component Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstanceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration componentInstanceConfiguration;

	/**
	 * The cached value of the '{@link #getHardwarePlatformInstanceConfiguration() <em>Hardware Platform Instance Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwarePlatformInstanceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected HWPlatformInstanceConfiguration hardwarePlatformInstanceConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.OCL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getComponentInstanceConfiguration() {
		if (componentInstanceConfiguration != null && componentInstanceConfiguration.eIsProxy()) {
			InternalEObject oldComponentInstanceConfiguration = (InternalEObject)componentInstanceConfiguration;
			componentInstanceConfiguration = (ComponentInstanceConfiguration)eResolveProxy(oldComponentInstanceConfiguration);
			if (componentInstanceConfiguration != oldComponentInstanceConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION, oldComponentInstanceConfiguration, componentInstanceConfiguration));
			}
		}
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration basicGetComponentInstanceConfiguration() {
		return componentInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstanceConfiguration(ComponentInstanceConfiguration newComponentInstanceConfiguration) {
		ComponentInstanceConfiguration oldComponentInstanceConfiguration = componentInstanceConfiguration;
		componentInstanceConfiguration = newComponentInstanceConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION, oldComponentInstanceConfiguration, componentInstanceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration getHardwarePlatformInstanceConfiguration() {
		if (hardwarePlatformInstanceConfiguration != null && hardwarePlatformInstanceConfiguration.eIsProxy()) {
			InternalEObject oldHardwarePlatformInstanceConfiguration = (InternalEObject)hardwarePlatformInstanceConfiguration;
			hardwarePlatformInstanceConfiguration = (HWPlatformInstanceConfiguration)eResolveProxy(oldHardwarePlatformInstanceConfiguration);
			if (hardwarePlatformInstanceConfiguration != oldHardwarePlatformInstanceConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION, oldHardwarePlatformInstanceConfiguration, hardwarePlatformInstanceConfiguration));
			}
		}
		return hardwarePlatformInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformInstanceConfiguration basicGetHardwarePlatformInstanceConfiguration() {
		return hardwarePlatformInstanceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwarePlatformInstanceConfiguration(HWPlatformInstanceConfiguration newHardwarePlatformInstanceConfiguration) {
		HWPlatformInstanceConfiguration oldHardwarePlatformInstanceConfiguration = hardwarePlatformInstanceConfiguration;
		hardwarePlatformInstanceConfiguration = newHardwarePlatformInstanceConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION, oldHardwarePlatformInstanceConfiguration, hardwarePlatformInstanceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION:
				if (resolve) return getComponentInstanceConfiguration();
				return basicGetComponentInstanceConfiguration();
			case ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION:
				if (resolve) return getHardwarePlatformInstanceConfiguration();
				return basicGetHardwarePlatformInstanceConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)newValue);
				return;
			case ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION:
				setHardwarePlatformInstanceConfiguration((HWPlatformInstanceConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION:
				setComponentInstanceConfiguration((ComponentInstanceConfiguration)null);
				return;
			case ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION:
				setHardwarePlatformInstanceConfiguration((HWPlatformInstanceConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContextPackage.OCL_CONTEXT__COMPONENT_INSTANCE_CONFIGURATION:
				return componentInstanceConfiguration != null;
			case ContextPackage.OCL_CONTEXT__HARDWARE_PLATFORM_INSTANCE_CONFIGURATION:
				return hardwarePlatformInstanceConfiguration != null;
		}
		return super.eIsSet(featureID);
	}


} //OCLContextImpl
