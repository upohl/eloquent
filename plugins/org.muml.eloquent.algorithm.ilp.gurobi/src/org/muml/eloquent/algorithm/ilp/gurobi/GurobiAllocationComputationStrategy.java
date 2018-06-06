package org.muml.eloquent.algorithm.ilp.gurobi;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.eloquent.algorithm.ilp.gurobi.config.ConfigFactory;
import org.muml.eloquent.algorithm.ilp.gurobi.config.GurobiExportConfiguration;
import org.muml.psm.allocation.algorithm.ilp.AbstractILPExportableAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.ilp.configuration.ConfigurationFactory;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IIntermediateModelExportStrategy;
import org.muml.psm.allocation.algorithm.main.MultiStrategyConfiguration;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.m2t.ILPExporter;

/**
 * An allocation computation strategy that uses the gurobi solver.
 * More precisely, it uses the gurobi_cl binary.
 *
 */
public class GurobiAllocationComputationStrategy extends AbstractILPExportableAllocationComputationStrategy {
	
	private static final String transformationURI =
			"platform:/plugin/org.muml.eloquent.algorithm.ilp.gurobi/transforms/GurobiBasedAlgorithm.qvto";
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
					ConfigurationFactory.eINSTANCE.createILPConfiguration());
			GurobiExportConfiguration exportConfiguration =
					ConfigFactory.eINSTANCE.createGurobiExportConfiguration();
			exportConfiguration.setIlpConfiguration(
					ConfigurationFactory.eINSTANCE.createILPConfiguration());
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
		GurobiExportConfiguration exportConfiguration = getConfiguration()
				.getConfigurationFor(IIntermediateModelExportStrategy.class,
						GurobiExportConfiguration.class);
		String filename = exportConfiguration.getExportFilename();
		if (filename == null) {
			// wrong (see also CPLEXAllocationComputationStrategy)
			return Diagnostic.CANCEL_INSTANCE;
		}
		return ILPExporter.exportToWorkspaceFile(ilp,
				new LPM2T(), filename, progressMonitor);
	}
}
