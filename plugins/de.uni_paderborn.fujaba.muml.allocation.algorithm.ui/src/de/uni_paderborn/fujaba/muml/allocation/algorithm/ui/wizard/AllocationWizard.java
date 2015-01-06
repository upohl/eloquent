package de.uni_paderborn.fujaba.muml.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.AllocationComputationStrategyExtension;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.AllocationComputationStrategyExtension.AllocationComputationStrategyDescription;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.IAllocationComputationStrategy;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

public class AllocationWizard extends AbstractFujabaExportWizard {
	private static final String title = "Create Allocation Wizard";
	private AbstractFujabaExportSourcePage cicSourcePage;
	private AbstractFujabaExportSourcePage hpicSourcePage;
	private AbstractFujabaExportSourcePage allocationSpecificationSourcePage;
	private AbstractFujabaExportSourcePage targetPage;
	private AllocationComputationStrategySelectionPage strategyPage;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(title);
	}

	@Override
	public String wizardGetId() {
		return "de.uni_paderborn.fujaba.export.ExampleWizard";
	}

	public void addPages() {
		// cic and hpic selection source page
		cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", toolkit,
				getResourceSet(), initialSelection) {
					
			{
				setTitle("Select Component Instance Configuration");
				setDescription("Select Component Instance Configuration, whose component instances should be allocated");
			}

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "fujaba";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof ComponentInstanceConfiguration;
			}
			
		};
		addPage(cicSourcePage);
		// hpic source page
		hpicSourcePage = new AbstractFujabaExportSourcePage("HpicSP", toolkit,
				getResourceSet(), initialSelection) {
			
			{
				setTitle("Select HW Platform Instance Configuration");
				setDescription("The HW Platform Instance Configuration provides the ECUs");
			}

			@Override
			public String wizardPageGetSourceFileExtension() {
				return "fujaba";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof HWPlatformInstanceConfiguration;
			}
			
		};
		addPage(hpicSourcePage);
		// allocation specification source page
		allocationSpecificationSourcePage = new AbstractFujabaExportSourcePage("AllocSpecSP", toolkit,
				getResourceSet(), initialSelection) {
			
			{
				setTitle("Select Allocation Specification");
				setDescription("The Allocation Specification specifies the constraints and objective function");
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "allocation_specification";
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof SpecificationCS;
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}	
		}; 
		addPage(allocationSpecificationSourcePage);
		// target page
		targetPage = new AbstractFujabaExportSourcePage("targetSP", toolkit,
				getResourceSet(), initialSelection) {
			
			{
				setTitle("Select the target System Allocation");
				setDescription("By default a new System Allocation is created");
			}
			
			@Override
			public String wizardPageGetSourceFileExtension() {
				return "fujaba";
			}

			@Override
			public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
				return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
			}

			@Override
			public boolean wizardPageSupportsSourceModelElement(EObject element) {
				return element instanceof ModelElementCategory
						|| element instanceof RootNode
						|| element instanceof SystemAllocation;
			}
		};
		addPage(targetPage);
		// allocation computation strategy page
		strategyPage = new AllocationComputationStrategySelectionPage("strategy");
		addPage(strategyPage);
	}
	
	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		return new CreateAllocationOperation(editingDomain,
				(SpecificationCS) allocationSpecificationSourcePage.getSourceElements()[0],
				(ComponentInstanceConfiguration) cicSourcePage.getSourceElements()[0],
				(HWPlatformInstanceConfiguration) hpicSourcePage.getSourceElements()[0],
				targetPage.getSourceElements()[0],
				strategyPage.getAllocationComputationStrategy());
	}
	
	public static class AllocationComputationStrategySelectionPage extends WizardPage {
		private static final String title =
				"Select an allocation computation strategy";
		private static final String description =
				"The selected strategy is used to compute an allocation";
		private static final String invalidSelection =
				"Please select an allocation computation strategy";
		private ListViewer listViewer;
		private IStructuredSelection structuredSelection;

		public AllocationComputationStrategySelectionPage(String pageName) {
			super(pageName);
			setTitle(title);
			setDescription(description);
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			composite.setLayout(layout);
			setControl(composite);
			listViewer = new ListViewer(composite);
			listViewer.getControl().setLayoutData(
					new GridData(GridData.FILL_HORIZONTAL));
			listViewer.setContentProvider(new ArrayContentProvider());
			listViewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object object) {
					if (object instanceof AllocationComputationStrategyDescription) {
						return ((AllocationComputationStrategyDescription) object)
								.getName();
					}
					return "";
				}
			});
			final Label label = new Label(composite, SWT.LEFT);
			label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			ISelectionChangedListener strategyListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection ssel = (IStructuredSelection) event.getSelection();
						structuredSelection = ssel;
						if (ssel.getFirstElement() instanceof AllocationComputationStrategyDescription) {
							String text = ((AllocationComputationStrategyDescription) ssel.getFirstElement())
									.getDescription();
							label.setText(text);
						}
						validatePage();
					}
				}
				
			};
			listViewer.addSelectionChangedListener(strategyListener);
		}
		
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				AllocationComputationStrategyDescription[] descriptions =
						AllocationComputationStrategyExtension.getDescriptions();
				listViewer.setInput(descriptions);
				if (descriptions.length > 0 && structuredSelection == null) {
					structuredSelection = new StructuredSelection(
							descriptions[0]);
				}
				listViewer.setSelection(structuredSelection, true);
			}
		}
		
		protected void validatePage() {
			boolean isValid = structuredSelection.getFirstElement() instanceof AllocationComputationStrategyDescription;
			setPageComplete(isValid);
			if (!isValid) {
				setErrorMessage(invalidSelection);
			}
		}
		
		@NonNull
		public IAllocationComputationStrategy getAllocationComputationStrategy() {
			if (structuredSelection == null) {
				throw new IllegalStateException("structuredSelection is null (should not happen");
			}
			try {
				return ((AllocationComputationStrategyDescription) structuredSelection
						.getFirstElement()).getAllocationComputationStrategy();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				throw new IllegalStateException("Failed to create strategy", e);
			}
		}
		
	}

}
