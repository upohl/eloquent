package org.muml.psm.allocation.algorithm.ui.wizard;

import java.util.List;

import org.eclipse.core.runtime.jobs.IJobFunction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;

public interface IAllocationWizardPageProvider {
	/**
	 * Returns true if we can provide <code>IWizardPage</code>s for
	 * the current selection.
	 * 
	 * @param  selection the current selection
	 * @return true, if we want to provide <code>IWizardPage</code>s
	 */
	public boolean isProviderFor(IStructuredSelection selection);
	
	/**
	 * Returns a list of <code>IWizardPage</code>s for the given page context.
	 * The workbench and selection parameters can be used to initialize
	 * the wizard pages. This method is called at most once per
	 * <code>IAllocationWizardPageProvider</code> instance.
	 * 
	 * @param pageContext the context in which the wizard pages will be used
	 * @param workbench   the current workbench
	 * @param selection	  the current selection
	 * @return			  a list of <code>IWizardPage</code>s
	 */
	public List<IWizardPage> providePages(PageContext pageContext, IWorkbench workbench, IStructuredSelection selection);
	
	/**
	 * Returns the OCL context object that was directly or indirectly
	 * selected via the returned wizard pages.
	 * @return the ocl context
	 */
	public @NonNull EObject getOCLContext();
	
	/**
	 * If the wizard pages were requested in the context of a
	 * {@link PageContext#AllocationComputation} it is supposed
	 * to return an implementation of an <code>IJobFunction</code>
	 * that computes an allocation (callers should check for null).
	 * In all other contexts, the result of this method is undefined
	 * (aka. arbitrary behavior is allowed).
	 * 
	 * @return an implementation of an <code>IJobFunction</code> or null
	 */
	public @Nullable IJobFunction createJobFunction();
}
