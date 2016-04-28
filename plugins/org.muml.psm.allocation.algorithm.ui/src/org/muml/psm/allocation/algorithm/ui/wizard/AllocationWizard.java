package org.muml.psm.allocation.algorithm.ui.wizard;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.muml.ape.runtime.editors.ObjectPropertyEditor;
import org.muml.ape.runtime.wizard.PropertyEditorWizardPage;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.PimPackage;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.HardwarePackage;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension;
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension.AllocationComputationStrategyDescription;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;

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
		// explicitly setup these packages otherwise the qvto compilation
		// fails (mars) - might be related to the qvto commit
		// de499dbfbd960a63f62c4938d9dc71172e075120
		// (actually, this belongs to the QVToTransformationRunner class,
		// but I want keep that class clean)
		PimPackage.eINSTANCE.eClass();
		HardwarePackage.eINSTANCE.eClass();
	}

	@Override
	public String wizardGetId() {
		return "org.muml.core.export.ExampleWizard";
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
				return "muml";
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
				return "muml";
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
				return "muml";
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
		AllocationComputationStrategyConfigurationPage configPage = new AllocationComputationStrategyConfigurationPage();
		// allocation computation strategy page
		strategyPage = new AllocationComputationStrategySelectionPage("strategy", configPage);
		addPage(strategyPage);
		addPage(configPage);
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
		private Map<String, IAllocationComputationStrategy<?>> strategyCache;
		private AllocationComputationStrategyConfigurationPage configPage;

		public AllocationComputationStrategySelectionPage(String pageName, AllocationComputationStrategyConfigurationPage configPage) {
			super(pageName);
			setTitle(title);
			setDescription(description);
			strategyCache = new HashMap<String, IAllocationComputationStrategy<?>>();
			this.configPage = configPage;
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
		
		@Override
		public IWizardPage getNextPage() {
			if (isValid()) {
				IAllocationComputationStrategy<?> strategy = getAllocationComputationStrategy();
				Object configuration = strategy.getConfiguration();
				if (!(configuration instanceof EObject)) {
					// cannot handle this => no configuration wizard page
					return null;
				}
				configPage.setConfiguration((EObject) configuration);
				return configPage;
			}
			return null;
		}
		
		private boolean isValid() {
			return structuredSelection.getFirstElement() instanceof AllocationComputationStrategyDescription;
		}
		
		protected boolean validatePage() {
			boolean isValid = isValid();
			setPageComplete(isValid);
			if (!isValid) {
				setErrorMessage(invalidSelection);
			}
			return isValid;
		}
		
		@NonNull
		public IAllocationComputationStrategy<?> getAllocationComputationStrategy() {
			// the wildcard return type is OK, because usually the caller does not
			// need fiddle with config object, because setting up the config object
			// is the job of this wizard
			if (structuredSelection == null) {
				throw new IllegalStateException("structuredSelection is null (should not happen");
			}
			// assumption: two different strategies have different names
			// (IMHO, a reasonable assumption...)
			AllocationComputationStrategyDescription description =
					((AllocationComputationStrategyDescription) structuredSelection.getFirstElement());
			String key = description.getName();
			IAllocationComputationStrategy<?> strategy = strategyCache
					.get(key);
			if (strategy == null) {
				try {
					strategy = ((AllocationComputationStrategyDescription) structuredSelection
							.getFirstElement()).getAllocationComputationStrategy();
					strategyCache.put(key, strategy); 
				} catch (CoreException e) {
					throw new IllegalStateException("Failed to create strategy", e);
				}
			}
			return strategy;
		}
		
	}
	
	public static class AllocationComputationStrategyConfigurationPage extends PropertyEditorWizardPage {
		// inspired by/stolen from org.muml.uppaal.adapter.ui.OptionsWizardPage
		
		private static final String tabId = "org.muml.psm.allocation.algorithm.ilp.opt4j.config";
		private static final String title = "Configuration options for the Opt4j EA";
		private static final String description = "Configure the Opt4j evolutionary algorithm";

		public AllocationComputationStrategyConfigurationPage() {
			super(new ObjectPropertyEditor(tabId, null, "Options", true));
			setTitle(title);
			setDescription(description);
		}
		
		public void setConfiguration(EObject configuration) {
			// create dummy resource unless the configuration object is already contained
			// in a resource
			if (configuration.eResource() == null) {
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.createResource(
						URI.createURI("dummy://dummy.ecore"));
				resource.getContents().add(configuration);
				// just to make APE happy (otherwise APE will not modify the object
				// (see org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor.setValue))
				TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resSet);
			}
			setInput(configuration);
		}
		
	}

}
