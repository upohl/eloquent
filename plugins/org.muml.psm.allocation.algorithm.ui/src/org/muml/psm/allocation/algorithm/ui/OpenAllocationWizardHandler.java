package org.muml.psm.allocation.algorithm.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;
import org.muml.psm.allocation.algorithm.ui.wizard.AbstractAllocationWizard;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationComputationWizard;
import org.muml.psm.allocation.algorithm.ui.wizard.PageContext;

public class OpenAllocationWizardHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event)
				.getWorkbench();
		Shell shell = HandlerUtil.getActiveShell(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
				: null;
		//IWorkbenchWizard allocationWizard = new AllocationWizard();
		AbstractAllocationWizard allocationWizard = new AllocationComputationWizard(PageContext.AllocationComputation);
		allocationWizard.init(workbench, structuredSelection);
		WizardDialog wizardDialog = new WizardDialog(shell, allocationWizard);
		wizardDialog.open();
		return null;
	}

}
