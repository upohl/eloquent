/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage;
import org.muml.psm.allocation.algorithm.ilp.configuration.ILPConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ILP Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPConfigurationImpl#isReproducibleILP <em>Reproducible ILP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ILPConfigurationImpl extends MinimalEObjectImpl.Container implements ILPConfiguration {
	/**
	 * The default value of the '{@link #isReproducibleILP() <em>Reproducible ILP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReproducibleILP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRODUCIBLE_ILP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReproducibleILP() <em>Reproducible ILP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReproducibleILP()
	 * @generated
	 * @ordered
	 */
	protected boolean reproducibleILP = REPRODUCIBLE_ILP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ILPConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ILP_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReproducibleILP() {
		return reproducibleILP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReproducibleILP(boolean newReproducibleILP) {
		boolean oldReproducibleILP = reproducibleILP;
		reproducibleILP = newReproducibleILP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ILP_CONFIGURATION__REPRODUCIBLE_ILP, oldReproducibleILP, reproducibleILP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.ILP_CONFIGURATION__REPRODUCIBLE_ILP:
				return isReproducibleILP();
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
			case ConfigurationPackage.ILP_CONFIGURATION__REPRODUCIBLE_ILP:
				setReproducibleILP((Boolean)newValue);
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
			case ConfigurationPackage.ILP_CONFIGURATION__REPRODUCIBLE_ILP:
				setReproducibleILP(REPRODUCIBLE_ILP_EDEFAULT);
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
			case ConfigurationPackage.ILP_CONFIGURATION__REPRODUCIBLE_ILP:
				return reproducibleILP != REPRODUCIBLE_ILP_EDEFAULT;
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
		result.append(" (reproducibleILP: ");
		result.append(reproducibleILP);
		result.append(')');
		return result.toString();
	}

} //ILPConfigurationImpl
