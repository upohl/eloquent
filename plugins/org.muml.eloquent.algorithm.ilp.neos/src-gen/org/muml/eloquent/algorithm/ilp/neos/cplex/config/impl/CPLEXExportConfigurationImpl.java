/**
 */
package org.muml.eloquent.algorithm.ilp.neos.cplex.config.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXExportConfiguration;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigPackage;
import org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPLEX Export Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CPLEXExportConfigurationImpl extends ILPExportConfigurationImpl<CPLEXConfiguration> implements CPLEXExportConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPLEXExportConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CPLEX_EXPORT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetIlpConfiguration(CPLEXConfiguration newIlpConfiguration, NotificationChain msgs) {
		return super.basicSetIlpConfiguration(newIlpConfiguration, msgs);
	}

} //CPLEXExportConfigurationImpl
