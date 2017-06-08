package org.muml.psm.allocation.language.xtext.ui.view

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.IWorkbench
import org.muml.psm.allocation.algorithm.ui.wizard.AbstractAllocationWizard.DefaultAllocationWizardPageProvider
import org.muml.psm.allocation.algorithm.ui.wizard.ExtensionUtil
import org.muml.psm.allocation.algorithm.ui.wizard.IAllocationWizardPageProvider
import org.muml.psm.allocation.algorithm.ui.wizard.PageContext

class EvaluationContextWizard extends Wizard {
	private static final String illegalOclContext = "oclContext must not be null"
	
	private EObject oclContext
	private IAllocationWizardPageProvider allocationWizardPageProvider
	
	new(IWorkbench workbench, IStructuredSelection selection) {
		allocationWizardPageProvider = ExtensionUtil.getWizardPageProvider(
			selection
		) ?: new DefaultAllocationWizardPageProvider()
		allocationWizardPageProvider.providePages(PageContext.AllocationView,
			workbench, selection
		).forEach[page |
			addPage(page)
		]
	}
		
	def getOclContext() {
		if (oclContext == null) {
			throw new IllegalStateException(illegalOclContext)
		}
		oclContext
	}
	
	override performFinish() {
		oclContext = allocationWizardPageProvider.OCLContext
		true
	}
	
}