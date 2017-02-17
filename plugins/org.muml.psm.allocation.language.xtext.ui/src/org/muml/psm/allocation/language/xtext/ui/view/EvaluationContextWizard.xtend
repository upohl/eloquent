package org.muml.psm.allocation.language.xtext.ui.view

import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IWorkbench
import org.muml.core.export.operation.IFujabaExportOperation
import org.muml.core.export.wizard.AbstractFujabaExportWizard
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationWizard.DefaultOCLContextSelectionProvider
import org.muml.psm.allocation.algorithm.ui.wizard.ExtensionUtil
import org.muml.psm.allocation.algorithm.ui.wizard.IOCLContextSelectionProvider
import org.muml.psm.allocation.algorithm.ui.wizard.IOCLContextSelectionProvider.PageContext

class EvaluationContextWizard extends AbstractFujabaExportWizard {
	
	private EObject oclContext
	private IOCLContextSelectionProvider oclContextSelectionProvider
	
	override init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection)
		oclContextSelectionProvider = ExtensionUtil.getOCLContextSelectionProvider(
			currentSelection
		) ?: new DefaultOCLContextSelectionProvider()
	}
	
	override wizardCreateExportOperation() {
		oclContext = oclContextSelectionProvider.OCLContext		
		new IFujabaExportOperation() {
			
			override getStatus() {
				Status.OK_STATUS
			}
			
			override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
			}
			
		}
	}
	
	override addPages() {
		oclContextSelectionProvider.getWizardPages(
			PageContext.AllocationView, toolkit,
			getResourceSet(), initialSelection
		).forEach[page |
			addPage(page)
		]
	}
	
	override wizardGetId() {
		"org.muml.psm.allocation.language.ui.view.EvaluationContextWizard"
	}
	
	def getOclContext() {
		oclContext
	}
	
}