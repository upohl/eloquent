package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;

public interface IAllocationWizardExtensionProvider extends IOCLContextSelectionProvider {
	@NonNull
	public IFujabaExportOperation createOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS specification,
			@NonNull EObject oclContext,
			@NonNull IAllocationComputationStrategy<?, ?> strategy,
			/* XXX: this belongs to the configuration... */ boolean storeILPModel);

}
