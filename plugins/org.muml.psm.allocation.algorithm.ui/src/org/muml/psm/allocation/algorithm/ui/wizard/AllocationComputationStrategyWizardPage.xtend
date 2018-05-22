package org.muml.psm.allocation.algorithm.ui.wizard

import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.layout.GridLayoutFactory
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.ListViewer
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension.AllocationComputationStrategyDescription
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy
import org.muml.psm.allocation.algorithm.main.IIntermediateModelExportStrategy
import org.muml.psm.allocation.algorithm.main.MultiStrategyConfiguration

class AllocationComputationStrategyWizardPage extends WizardPage {
	private static final String pageName = "Strategy Selection"
	private static final String pageDescription = "Select a Allocation Computation Strategy"
	
	private static final String noStrategyDescription = "No strategy selected (No registered allocation strategies?)"
	private static final String illegalPageContext = "illegal page context: %s"
	
	private ListViewer listViewer
	private IStructuredSelection structuredSelection
	
	private AllocationComputationStrategyDescription strategyDescription
	private AllocationComputationStrategyDescription[] descriptions
	private AllocationComputationStrategyConfigurationWizardPage configPage
	private Map<AllocationComputationStrategyDescription, IAllocationComputationStrategy<?, ?>> strategyCache
	private PageContext pageContext
	
	new(PageContext pageContext, AllocationComputationStrategyConfigurationWizardPage configPage) {
		super(pageName)
		description = pageDescription
		this.configPage = configPage
		this.pageContext = pageContext
		descriptions = filterDescriptions(
			AllocationComputationStrategyExtension.getDescriptions()
		)
		strategyCache = newHashMap
	}
	
	def protected AllocationComputationStrategyDescription[] filterDescriptions(
		AllocationComputationStrategyDescription[] descriptions
	) {
		if (pageContext === PageContext.AllocationComputation) {
			return descriptions
		}
		// assumption: pageContext === PageContext.IntermediateModelExport
		// hrm each description is instantiated... *sigh*
		val List<AllocationComputationStrategyDescription> filteredDescriptions = newArrayList
		for (AllocationComputationStrategyDescription descr: descriptions) {
			if (descr.allocationComputationStrategy instanceof IIntermediateModelExportStrategy<?>) {
				filteredDescriptions.add(descr)
			}
		}
		filteredDescriptions
	}
	
	override createControl(Composite parent) {
		val Composite composite = new Composite(parent, SWT.NONE)
		setControl(composite)
		listViewer = new ListViewer(composite)
		listViewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL))
		listViewer.setContentProvider(new ArrayContentProvider())
		listViewer.setLabelProvider(new LabelProvider() {
			override String getText(Object object) {
				if (object instanceof AllocationComputationStrategyDescription) {
					return (object as AllocationComputationStrategyDescription).name
				}
				""
			}
		})
		val Label label = new Label(composite, SWT.LEFT)
		listViewer.addSelectionChangedListener([SelectionChangedEvent event |
			if (event.getSelection() instanceof IStructuredSelection) {
				val IStructuredSelection ssel = event.getSelection() as IStructuredSelection
				structuredSelection = ssel
				if (ssel.getFirstElement() instanceof AllocationComputationStrategyDescription) {
					strategyDescription = ssel.getFirstElement as AllocationComputationStrategyDescription
					label.text = strategyDescription.description
					label.requestLayout
					pageComplete = true
				}
			}
		])
		GridLayoutFactory.fillDefaults.applyTo(composite)
	}
	
	def IAllocationComputationStrategy<?, ?> getAllocationComputationStrategy() {
		if (strategyDescription === null) {
			// this should never happen (except there were no
			// strategies registered or they were filtered... (we should
			// handle the latter case more gracefully))
			throw new IllegalStateException(noStrategyDescription)
		}
		var IAllocationComputationStrategy<?, ?> strategy = strategyCache.get(strategyDescription)
		if (strategy === null) {
			strategy = strategyDescription.allocationComputationStrategy
			strategyCache.put(strategyDescription, strategy)
		}
		strategy
	}
	
	override getNextPage() {
		val IAllocationComputationStrategy<?, ?> strategy = getAllocationComputationStrategy()
		if (strategy.configuration instanceof EObject) {
			configPage.configuration = strategy.configuration as EObject
			return configPage
		} else if (strategy.configuration instanceof MultiStrategyConfiguration) {
			val Class<?> strategyCls = switch (pageContext) {
				case PageContext.AllocationComputation: typeof(IAllocationComputationStrategy)
				case PageContext.IntermediateModelExport: typeof(IIntermediateModelExportStrategy)
				default: throw new IllegalStateException(
					String.format(illegalPageContext, pageContext)
				)
			}
			val EObject configuration = (strategy.configuration
				as MultiStrategyConfiguration
			).getConfigurationFor(strategyCls, typeof(EObject))
			configPage.configuration = configuration
			return configPage
		}
	}
	
	override setVisible(boolean visible) {
		super.setVisible(visible)
		if (visible) {
			listViewer.setInput(descriptions)
			if (descriptions.length > 0 && structuredSelection === null) {
				structuredSelection = new StructuredSelection(descriptions.get(0))
			}
			listViewer.setSelection(structuredSelection, true)
		}
	}
	
}