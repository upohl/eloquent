package org.muml.psm.allocation.algorithm.ui.wizard;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.forms.widgets.FormToolkit;

public interface IOCLContextSelectionProvider {
	enum PageContext {
		AllocationView, AllocationComputation
	}
	
	public boolean isProviderFor(@NonNull IStructuredSelection ssel);
	@NonNull
	public List<@NonNull IWizardPage> getWizardPages(@NonNull PageContext pageContext,
			@NonNull FormToolkit toolkit, @NonNull ResourceSet resSet,
			@NonNull IStructuredSelection initialSelection);
	@NonNull
	public EObject getOCLContext();
}
