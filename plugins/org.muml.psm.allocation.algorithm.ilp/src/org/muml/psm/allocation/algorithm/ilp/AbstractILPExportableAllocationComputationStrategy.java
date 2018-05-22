package org.muml.psm.allocation.algorithm.ilp;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IComputationResult;
import org.muml.psm.allocation.algorithm.main.IIntermediateModelExportStrategy;
import org.muml.psm.allocation.algorithm.main.MultiStrategyConfiguration;
import org.muml.psm.allocation.algorithm.qvto.AbstractQVToBasedMultiConfigurationStrategy;
import org.muml.psm.allocation.algorithm.qvto.QVToBasedStrategyTransformationRunner;
import org.muml.psm.allocation.algorithm.qvto.QVToBasedStrategyTransformationRunner.ExecutionResult;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.language.cs.SpecificationCS;

/**
 * Abstract class that can be specialized by a strategy that is implemented
 * by a qvto transformation and is based on an <code>IntegerLinearProgram</code>
 * intermediate model, which can be exported.
 *
 */
public abstract class AbstractILPExportableAllocationComputationStrategy
		extends AbstractQVToBasedMultiConfigurationStrategy
		implements
		IAllocationComputationStrategy<EObject, MultiStrategyConfiguration>,
		IIntermediateModelExportStrategy<MultiStrategyConfiguration> {

	@Override
	public Diagnostic exportIntermediateModels(@NonNull SpecificationCS allocationSpecification,
			@NonNull EObject oclContext, IProgressMonitor progressMonitor) {
		ExecutionResult executionResult = QVToBasedStrategyTransformationRunner.runTransformation(
				getTransformationURIFor(IIntermediateModelExportStrategy.class),
				allocationSpecification, oclContext,
				getConfigurationPropertyMapFor(IIntermediateModelExportStrategy.class),				
				progressMonitor);
		if (executionResult.getDiagnostic().getCode() != Diagnostic.OK) {
			return executionResult.getDiagnostic();
		}
		if (executionResult.getOutObjects().size() == 1) {
			return exportILP((IntegerLinearProgram)
					executionResult.getOutObjects().get(0));
		}
		// XXX: we should return an error instance here...
		return Diagnostic.CANCEL_INSTANCE;
	}
	
	public abstract Diagnostic exportILP(@NonNull IntegerLinearProgram ilp);

	@Override
	@NonNull
	public IComputationResult<EObject> computeAllocation(
			@NonNull EObject allocationSpecification,
			@NonNull EObject oclContext,
			@Nullable IProgressMonitor progressMonitor) {
		ExecutionResult executionResult = QVToBasedStrategyTransformationRunner.runTransformation(
				getTransformationURIFor(IAllocationComputationStrategy.class),
				allocationSpecification, oclContext,
				getConfigurationPropertyMapFor(IAllocationComputationStrategy.class),				
				progressMonitor);
		BasicDiagnostic rootDiagnostic = createDiagnostic(executionResult.getDiagnostic());
		EObject result = null;
		if (executionResult.getOutObjects().size() == 1) {
			result = executionResult.getOutObjects().get(0);
		}
		return new IComputationResult.DefaultComputationResult<EObject>(
				rootDiagnostic, result);
	}
	
	@NonNull
	protected abstract String getTransformationURIFor(Class<?> strategy);
	
	private static BasicDiagnostic createDiagnostic(ExecutionDiagnostic executionDiagnostic) {
		BasicDiagnostic rootDiagnostic = createDiagnostic(
				Diagnostic.OK, null);
		rootDiagnostic.add(executionDiagnostic);
		return rootDiagnostic;
	}
	
	private static BasicDiagnostic createDiagnostic(int severity, @Nullable String message) {
		return new BasicDiagnostic(severity, null, 0, null, null);
	}

}
