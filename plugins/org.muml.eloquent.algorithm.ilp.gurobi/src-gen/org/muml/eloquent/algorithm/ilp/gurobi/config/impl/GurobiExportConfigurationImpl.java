/**
 */
package org.muml.eloquent.algorithm.ilp.gurobi.config.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.muml.eloquent.algorithm.ilp.gurobi.config.ConfigPackage;
import org.muml.eloquent.algorithm.ilp.gurobi.config.GurobiExportConfiguration;
import org.muml.psm.allocation.algorithm.ilp.configuration.ILPConfiguration;
import org.muml.psm.allocation.algorithm.ilp.configuration.impl.ILPExportConfigurationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gurobi Export Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GurobiExportConfigurationImpl extends ILPExportConfigurationImpl<ILPConfiguration> implements GurobiExportConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GurobiExportConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.GUROBI_EXPORT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetIlpConfiguration(ILPConfiguration newIlpConfiguration, NotificationChain msgs) {
		return super.basicSetIlpConfiguration(newIlpConfiguration, msgs);
	}

} //GurobiExportConfigurationImpl
