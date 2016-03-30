/**
 */
package org.muml.psm.allocation.language.as.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.psm.allocation.language.as.AsPackage;
import org.muml.psm.allocation.language.as.ComponentResourceTupleDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Resource Tuple Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.language.as.impl.ComponentResourceTupleDescriptorImpl#getHwresinstance <em>Hwresinstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentResourceTupleDescriptorImpl extends InstanceTupleDescriptorImpl implements ComponentResourceTupleDescriptor {
	/**
	 * The default value of the '{@link #getHwresinstance() <em>Hwresinstance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwresinstance()
	 * @generated
	 * @ordered
	 */
	protected static final String HWRESINSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHwresinstance() <em>Hwresinstance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwresinstance()
	 * @generated
	 * @ordered
	 */
	protected String hwresinstance = HWRESINSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResourceTupleDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsPackage.Literals.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHwresinstance() {
		return hwresinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwresinstance(String newHwresinstance) {
		String oldHwresinstance = hwresinstance;
		hwresinstance = newHwresinstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE, oldHwresinstance, hwresinstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE:
				return getHwresinstance();
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
			case AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE:
				setHwresinstance((String)newValue);
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
			case AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE:
				setHwresinstance(HWRESINSTANCE_EDEFAULT);
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
			case AsPackage.COMPONENT_RESOURCE_TUPLE_DESCRIPTOR__HWRESINSTANCE:
				return HWRESINSTANCE_EDEFAULT == null ? hwresinstance != null : !HWRESINSTANCE_EDEFAULT.equals(hwresinstance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hwresinstance: ");
		result.append(hwresinstance);
		result.append(')');
		return result.toString();
	}


} //ComponentResourceTupleDescriptorImpl
