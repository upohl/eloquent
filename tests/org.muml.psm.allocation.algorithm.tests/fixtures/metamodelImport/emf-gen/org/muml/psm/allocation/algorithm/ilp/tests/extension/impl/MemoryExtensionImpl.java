/**
 */
package org.muml.psm.allocation.algorithm.ilp.tests.extension.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.core.impl.ExtensionImpl;

import org.muml.psm.allocation.algorithm.ilp.tests.extension.ExtensionPackage;
import org.muml.psm.allocation.algorithm.ilp.tests.extension.MemoryExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.tests.extension.impl.MemoryExtensionImpl#getAmountNeeded <em>Amount Needed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryExtensionImpl extends ExtensionImpl implements MemoryExtension {
	/**
	 * The default value of the '{@link #getAmountNeeded() <em>Amount Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_NEEDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountNeeded() <em>Amount Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountNeeded()
	 * @generated
	 * @ordered
	 */
	protected int amountNeeded = AMOUNT_NEEDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.MEMORY_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountNeeded() {
		return amountNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountNeeded(int newAmountNeeded) {
		int oldAmountNeeded = amountNeeded;
		amountNeeded = newAmountNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MEMORY_EXTENSION__AMOUNT_NEEDED, oldAmountNeeded, amountNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.MEMORY_EXTENSION__AMOUNT_NEEDED:
				return getAmountNeeded();
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
			case ExtensionPackage.MEMORY_EXTENSION__AMOUNT_NEEDED:
				setAmountNeeded((Integer)newValue);
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
			case ExtensionPackage.MEMORY_EXTENSION__AMOUNT_NEEDED:
				setAmountNeeded(AMOUNT_NEEDED_EDEFAULT);
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
			case ExtensionPackage.MEMORY_EXTENSION__AMOUNT_NEEDED:
				return amountNeeded != AMOUNT_NEEDED_EDEFAULT;
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
		result.append(" (amountNeeded: ");
		result.append(amountNeeded);
		result.append(')');
		return result.toString();
	}

} //MemoryExtensionImpl
