package org.muml.psm.allocation.algorithm.ui.wizard

import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.BasicDiagnostic
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.IWizardPage
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.IExportWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.xtend.lib.annotations.Accessors

class AbstractAllocationWizard extends Wizard implements IExportWizard {
	@Accessors(PROTECTED_GETTER)
	private IAllocationWizardPageProvider wizardPageProvider
	@Accessors(PROTECTED_GETTER)
	private PageContext pageContext
	
	new(PageContext pageContext) {
		this.pageContext = pageContext
	}
	
	override performFinish() {
		true
	}
	
	override void init(IWorkbench workbench, IStructuredSelection selection) {
		wizardPageProvider = ExtensionUtil.getWizardPageProvider(selection)
			?: new DefaultAllocationWizardPageProvider()
		for (IWizardPage wizardPage : wizardPageProvider.providePages(pageContext, workbench, selection)) {
			addPage(wizardPage)
		}
	}
	
	public abstract static class AbstractAllocationWizardPageProvider implements IAllocationWizardPageProvider {
		def abstract protected IAllocationComputationOperation<?> createAllocationComputationOperation()
			
		override createJobFunction() {
			val IAllocationComputationOperation<?> operation = createAllocationComputationOperation
			return [IProgressMonitor monitor |
				val Diagnostic diagnostic = operation.execute(monitor)
				if (diagnostic.severity != Diagnostic.OK) {
					return BasicDiagnostic.toIStatus(diagnostic)
				}
				Thread.sleep(5000)
				if (monitor.isCanceled) {
					return Status.CANCEL_STATUS
				}
				Status.OK_STATUS
			]
		}
	}
	
	public static class DefaultAllocationWizardPageProvider extends AbstractAllocationWizardPageProvider {
		private static final String illegalPageContext = "illegal page context: %s"
		
		private AllocationComputationSourceWizardPage sourcePage
		private AllocationComputationStrategyWizardPage strategyPage
		
		override protected AllocationComputationOperation<Object> createAllocationComputationOperation() {
			new AllocationComputationOperation<Object>(sourcePage.specificationCS,
				sourcePage.oclContext,
				strategyPage.allocationComputationStrategy
			)
		}
		
		override getOCLContext() {
			sourcePage.oclContext
		}
		
		override isProviderFor(IStructuredSelection selection) {
			true
		}
		
		override providePages(PageContext pageContext, IWorkbench workbench, IStructuredSelection selection) {
			sourcePage = new AllocationComputationSourceWizardPage(pageContext)
			val AllocationComputationStrategyConfigurationWizardPage configPage = new AllocationComputationStrategyConfigurationWizardPage()
			strategyPage = new AllocationComputationStrategyWizardPage(configPage)
			switch (pageContext) {
				case PageContext.AllocationComputation: #[sourcePage, strategyPage, configPage]
				case PageContext.AllocationView: #[sourcePage]
				default: throw new IllegalArgumentException(
					String.format(illegalPageContext, pageContext)
				)
			}
		}
		
	}
	
}