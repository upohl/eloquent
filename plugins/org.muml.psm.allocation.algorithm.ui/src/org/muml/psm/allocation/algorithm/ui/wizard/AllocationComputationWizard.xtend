package org.muml.psm.allocation.algorithm.ui.wizard

import org.eclipse.core.runtime.jobs.Job

class AllocationComputationWizard extends AbstractAllocationWizard {
	private static final String jobName = "Allocation Computation"
	
	new() {
		// for instance, the export dialog indirectly "calls" this constructor
		this(PageContext.AllocationComputation)
	}
	
	new(PageContext pageContext) {
		super(pageContext)
	}
	
	override performFinish() {
		Job.create(jobName, wizardPageProvider.createJobFunction).schedule
		true
	}
	
}