package org.muml.eloquent.algorithm.ilp.neos.cplex;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXExportConfiguration;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigFactory;
import org.muml.psm.allocation.algorithm.ilp.AbstractILPExportableAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IIntermediateModelExportStrategy;
import org.muml.psm.allocation.algorithm.main.MultiStrategyConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.m2t.ILPExporter;

public class CPLEXAllocationComputationStrategy extends AbstractILPExportableAllocationComputationStrategy {
	private static final String transformationURI =
			"platform:/plugin/org.muml.eloquent.algorithm.ilp.neos/transforms/CPLEXBasedAlgorithm.qvto";
	private static final String specification2ILPTransformationURI =
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto";
	
	private static final String transformationConfigurationPropertyName =
			"config";
	private static final String unexpectedStrategy = "Cannot handle strategy: %s";
	
	private MultiStrategyConfiguration configuration;
	
	@Override
	public MultiStrategyConfiguration getConfiguration() {
		if (configuration == null) {
			configuration = new MultiStrategyConfiguration();
			configuration.addConfiguration(IAllocationComputationStrategy.class,
					ConfigFactory.eINSTANCE.createCPLEXConfiguration());
			CPLEXExportConfiguration exportConfiguration =
					ConfigFactory.eINSTANCE.createCPLEXExportConfiguration();
			exportConfiguration.setIlpConfiguration(
					ConfigFactory.eINSTANCE.createCPLEXConfiguration());
			configuration.addConfiguration(IIntermediateModelExportStrategy.class,
					exportConfiguration);
		}
		return configuration;
	}

	@Override
	protected @NonNull String getTransformationURIFor(Class<?> strategy) {
		if (strategy == IAllocationComputationStrategy.class) {
			return transformationURI;
		} else if (strategy == IIntermediateModelExportStrategy.class) {
			return specification2ILPTransformationURI;
		}
		throw new IllegalArgumentException(String.format(unexpectedStrategy,
				strategy));
	}

	@Override
	protected @NonNull String getConfigurationPropertyNameFor(Class<?> strategy) {
		if (strategy == IAllocationComputationStrategy.class
				|| strategy == IIntermediateModelExportStrategy.class) {
			return transformationConfigurationPropertyName;
		}
		throw new IllegalArgumentException(String.format(unexpectedStrategy,
				strategy));
	}

	@Override
	public Diagnostic exportILP(@NonNull IntegerLinearProgram ilp,
			@Nullable IProgressMonitor progressMonitor) {
		CPLEXExportConfiguration exportConfiguration = getConfiguration()
				.getConfigurationFor(IIntermediateModelExportStrategy.class,
						CPLEXExportConfiguration.class);
		String filename = exportConfiguration.getExportFilename();
		if (filename == null) {
			// hmm actually wrong
			return Diagnostic.CANCEL_INSTANCE;
		}
		return ILPExporter.exportToWorkspaceFile(ilp,
				new AMPLM2T(new ILPNameEnvironment()),
				filename, progressMonitor);
	}

}
