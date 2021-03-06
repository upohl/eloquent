package org.muml.psm.allocation.language.xtext.ui.view

import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.jface.window.Window

class OpenEvaluationContextWizardHandler extends BaseHandler {
	
	override execute(ExecutionEvent event) throws ExecutionException {
		val IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindow(event)
				.workbench
		val Shell shell = HandlerUtil.getActiveShell(event)
		val selection = HandlerUtil.getCurrentSelection(event)
		val ssel = if (selection instanceof StructuredSelection) {
			selection as StructuredSelection
		} else {
			StructuredSelection.EMPTY
		}
		val wizard = new EvaluationContextWizard(workbench, ssel)
		val WizardDialog wizardDialog = new WizardDialog(shell, wizard)
		val int ret = wizardDialog.open
		if (ret != Window.CANCEL) {
			val view = HandlerUtil.getActiveWorkbenchWindow(event).activePage.showView(viewID)
				 as AllocationSpecificationLanguageEvaluationView
			view.oclContext = wizard.oclContext
		}
	}
	
}