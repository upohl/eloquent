package org.muml.psm.allocation.algorithm.ui.wizard

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.ecore.EObject
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy
import org.muml.psm.allocation.language.cs.SpecificationCS

class AllocationComputationOperation<T> implements IAllocationComputationOperation<T> {
	private static final String postProcessTaskName = "Post process task";
	
	private SpecificationCS allocationSpecification
	private EObject oclContext
	private IAllocationComputationStrategy<?, ?> allocationComputationStrategy
	
	new(SpecificationCS allocationSpecification, EObject oclContext,
		IAllocationComputationStrategy<?, ?> allocationComputationStrategy
	) {
		this.allocationSpecification = allocationSpecification
		this.oclContext = oclContext
		this.allocationComputationStrategy = allocationComputationStrategy
	}
	
	def private AllocationAlgorithm<T> createAllocationAlgorithm() {
		new AllocationAlgorithm<T>(
			allocationSpecification,
			oclContext, 
			false // XXX
		)
	}
	
	override Diagnostic execute(IProgressMonitor progressMonitor) {
		val SubMonitor monitor = SubMonitor.convert(progressMonitor, 100)
		val AllocationAlgorithm<T> algorithm = createAllocationAlgorithm()
		val Diagnostic diagnostic = algorithm.computeAllocation(
				allocationComputationStrategy as IAllocationComputationStrategy<T, ?>, // this hurts to much...
				monitor.newChild(90))
		if (diagnostic.severity != Diagnostic.OK) {
			return diagnostic
		}
		Thread.sleep(5000)
		if (!monitor.isCanceled()) {
			monitor.subTask(postProcessTaskName);
			postProcess(algorithm, diagnostic);
			monitor.worked(10);
		}
		diagnostic
	}
	
	override void postProcess(AllocationAlgorithm<T> algorithm, Diagnostic diagnostic) {
		
	}
	
}