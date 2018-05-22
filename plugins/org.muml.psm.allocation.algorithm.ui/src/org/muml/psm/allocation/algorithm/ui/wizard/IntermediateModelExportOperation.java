package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.muml.psm.allocation.algorithm.main.IIntermediateModelExportStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;

public class IntermediateModelExportOperation implements IAllocationOperation {
	private SpecificationCS allocationSpecification;
	private EObject oclContext;
	private IIntermediateModelExportStrategy<?> strategy;
	
	public IntermediateModelExportOperation(@NonNull SpecificationCS allocationSpecification,
			@NonNull EObject oclContext,
			@NonNull IIntermediateModelExportStrategy<?> strategy) {
		this.allocationSpecification = allocationSpecification;
		this.oclContext = oclContext;
		this.strategy = strategy;
	}

	@Override
	public Diagnostic execute(IProgressMonitor progressMonitor) {
		return strategy.exportIntermediateModels(allocationSpecification,
				oclContext, progressMonitor);
	}

}
