/**
 */
package org.muml.psm.allocation.algorithm.ilp.configuration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationPackage;
import org.muml.psm.allocation.algorithm.ilp.configuration.ILPExportConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ILP Export Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl#getExportFilename <em>Export Filename</em>}</li>
 *   <li>{@link org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl#getIlpConfiguration <em>Ilp Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ILPExportConfigurationImpl<T> extends MinimalEObjectImpl.Container implements ILPExportConfiguration<T> {
	/**
	 * The default value of the '{@link #getExportFilename() <em>Export Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportFilename() <em>Export Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportFilename()
	 * @generated
	 * @ordered
	 */
	protected String exportFilename = EXPORT_FILENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIlpConfiguration() <em>Ilp Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIlpConfiguration()
	 * @generated
	 * @ordered
	 */
	protected T ilpConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ILPExportConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.ILP_EXPORT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExportFilename() {
		return exportFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportFilename(String newExportFilename) {
		String oldExportFilename = exportFilename;
		exportFilename = newExportFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME, oldExportFilename, exportFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getIlpConfiguration() {
		return ilpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIlpConfiguration(T newIlpConfiguration, NotificationChain msgs) {
		T oldIlpConfiguration = ilpConfiguration;
		ilpConfiguration = newIlpConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION, oldIlpConfiguration, newIlpConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIlpConfiguration(T newIlpConfiguration) {
		if (newIlpConfiguration != ilpConfiguration) {
			NotificationChain msgs = null;
			if (ilpConfiguration != null)
				msgs = ((InternalEObject)ilpConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION, null, msgs);
			if (newIlpConfiguration != null)
				msgs = ((InternalEObject)newIlpConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION, null, msgs);
			msgs = basicSetIlpConfiguration(newIlpConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION, newIlpConfiguration, newIlpConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION:
				return basicSetIlpConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME:
				return getExportFilename();
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION:
				return getIlpConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME:
				setExportFilename((String)newValue);
				return;
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION:
				setIlpConfiguration((T)newValue);
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
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME:
				setExportFilename(EXPORT_FILENAME_EDEFAULT);
				return;
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION:
				setIlpConfiguration((T)null);
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
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__EXPORT_FILENAME:
				return EXPORT_FILENAME_EDEFAULT == null ? exportFilename != null : !EXPORT_FILENAME_EDEFAULT.equals(exportFilename);
			case ConfigurationPackage.ILP_EXPORT_CONFIGURATION__ILP_CONFIGURATION:
				return ilpConfiguration != null;
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
		result.append(" (exportFilename: ");
		result.append(exportFilename);
		result.append(')');
		return result.toString();
	}

} //ILPExportConfigurationImpl
