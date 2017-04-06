package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.export.operation.AbstractFujabaExportOperation;
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;

public class CreateAllocationOperation<T> extends AbstractFujabaExportOperation {
	private static final String nullProgressMonitor = "progressMonitor must not be null";
	private static final String postProcessTaskName = "Post process task";
	
	@NonNull protected EditingDomain editingDomain;
	@NonNull private SpecificationCS allocationSpecification;
	@NonNull private EObject oclContext;
	@NonNull private IAllocationComputationStrategy<?, ?> allocationComputationStrategy;
	@NonNull private boolean storeILPModel;
	
	public CreateAllocationOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS allocationSpecification,
			@NonNull EObject oclContext,
			@NonNull IAllocationComputationStrategy<?, ?> allocationComputationStrategy,
			@NonNull boolean storeILPModel) {
		this.editingDomain = editingDomain;
		this.allocationSpecification = allocationSpecification;
		this.oclContext = oclContext;
		this.allocationComputationStrategy = allocationComputationStrategy;
		this.storeILPModel = storeILPModel;
	}
	
	private AllocationAlgorithm<T> createAllocationAlgorithm() {
		return new AllocationAlgorithm<T>(
				allocationSpecification,
				oclContext,
				storeILPModel);
	}
	
	@Override
	protected IStatus doExecute(IProgressMonitor progressMonitor) {
		// hmm the docs do not state if the progressMonitor can be null
		// assumption: it is not null
		if (progressMonitor == null) {
			throw new IllegalArgumentException(nullProgressMonitor);
		}
		SubMonitor progress = SubMonitor.convert(progressMonitor, 100);
		AllocationAlgorithm<T> algorithm = createAllocationAlgorithm();
		Diagnostic diagnostic = algorithm.computeAllocation(
				(IAllocationComputationStrategy<T, ?>) allocationComputationStrategy, // this hurts to much...
				progress.newChild(90));
		if (diagnostic.getSeverity() != Status.OK) {
			return BasicDiagnostic.toIStatus(diagnostic);
		}
		if (!progress.isCanceled()) {
			progress.subTask(postProcessTaskName);
			postProcess(algorithm, diagnostic);
			progress.worked(10);
		}
		return progress.isCanceled() ? Status.CANCEL_STATUS : Status.OK_STATUS;
	}
	
	protected void postProcess(@NonNull AllocationAlgorithm<T> algorithm,
			@NonNull Diagnostic diagnostic) {
		// can be overridden in a subclass
	}

}
