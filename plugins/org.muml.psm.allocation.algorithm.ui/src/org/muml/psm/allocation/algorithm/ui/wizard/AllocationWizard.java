package org.muml.psm.allocation.algorithm.ui.wizard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Adapters;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.ape.runtime.editors.ObjectPropertyEditor;
import org.muml.ape.runtime.wizard.PropertyEditorWizardPage;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension;
import org.muml.psm.allocation.algorithm.main.AllocationComputationStrategyExtension.AllocationComputationStrategyDescription;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.ui.wizard.IOCLContextSelectionProvider.PageContext;
import org.muml.psm.allocation.language.cs.SpecificationCS;

public class AllocationWizard extends AbstractFujabaExportWizard {
	private static final String title = "Plan Allocation Wizard";
	private AbstractFujabaExportSourcePage allocationSpecificationSourcePage;
	private AllocationComputationStrategySelectionPage strategyPage;
	private IOCLContextSelectionProvider oclContextSelectionProvider;


	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle(title);
		oclContextSelectionProvider = ExtensionUtil.getOCLContextSelectionProvider(currentSelection);
		if (oclContextSelectionProvider == null) {
			oclContextSelectionProvider = new DefaultOCLContextSelectionProvider();
		}
	}

	@Override
	public String wizardGetId() {
		return "org.muml.core.export.ExampleWizard";
	}

	@Override
	public void addPages() {
		for (IWizardPage page : oclContextSelectionProvider.getWizardPages(PageContext.AllocationComputation, toolkit, getResourceSet(), initialSelection)) {
			addPage(page);
		}
		// allocation specification source page
		allocationSpecificationSourcePage = new AbstractFujabaExportSourcePage("AllocSpecSP", toolkit, getResourceSet(), initialSelection) {

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
		AllocationComputationStrategyConfigurationPage configPage = new AllocationComputationStrategyConfigurationPage();
		// allocation computation strategy page
		strategyPage = new AllocationComputationStrategySelectionPage("strategy", configPage);
		strategyPage.setPageComplete(false);
		addPage(strategyPage);
		addPage(configPage);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		SpecificationCS specification = (SpecificationCS) allocationSpecificationSourcePage
				.getSourceElements()[0];
		EObject oclContext = oclContextSelectionProvider.getOCLContext();
		IAllocationComputationStrategy<?, ?> strategy = strategyPage
				.getAllocationComputationStrategy();
		boolean storeILPModel = strategyPage.isStoreILPModel();
		if (oclContextSelectionProvider instanceof IAllocationWizardExtensionProvider) {
			return ((IAllocationWizardExtensionProvider) oclContextSelectionProvider).createOperation(editingDomain,
					specification, oclContext, strategy, storeILPModel);
		}
		return new CreateAllocationOperation<Object>(editingDomain,
				specification, oclContext, strategy, storeILPModel);
	}

	public static class AllocationComputationStrategySelectionPage extends WizardPage {
		private static final String title = "Select an allocation computation strategy";
		private static final String description = "The selected strategy is used to compute an allocation";
		private static final String invalidSelection = "Please select an allocation computation strategy";
		private ListViewer listViewer;
		private IStructuredSelection structuredSelection;
		private Map<String, IAllocationComputationStrategy<?, ?>> strategyCache;
		private AllocationComputationStrategyConfigurationPage configPage;


		private boolean storeILPModel = false; 


		public AllocationComputationStrategySelectionPage(String pageName, AllocationComputationStrategyConfigurationPage configPage) {
			super(pageName);
			setTitle(title);
			setDescription(description);
			strategyCache = new HashMap<String, IAllocationComputationStrategy<?, ?>>();
			this.configPage = configPage;
		}

		public boolean isStoreILPModel() {
			return storeILPModel;
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			composite.setLayout(layout);
			setControl(composite);
			listViewer = new ListViewer(composite);
			listViewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			listViewer.setContentProvider(new ArrayContentProvider());
			listViewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object object) {
					if (object instanceof AllocationComputationStrategyDescription) {
						return ((AllocationComputationStrategyDescription) object).getName();
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
							String text = ((AllocationComputationStrategyDescription) ssel.getFirstElement()).getDescription();
							label.setText(text);
						}
						validatePage();
					}
				}

			};
			listViewer.addSelectionChangedListener(strategyListener);

			final Button checkboxStoreILPModel = new Button(composite, SWT.CHECK);
			checkboxStoreILPModel.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 0, 10));
			checkboxStoreILPModel.setText("Store ILP Model");
			checkboxStoreILPModel.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					checkboxStoreILPModel.getSelection();
					storeILPModel = checkboxStoreILPModel.getSelection();
				}
			});

		}



		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				AllocationComputationStrategyDescription[] descriptions = AllocationComputationStrategyExtension.getDescriptions();
				listViewer.setInput(descriptions);
				if (descriptions.length > 0 && structuredSelection == null) {
					structuredSelection = new StructuredSelection(descriptions[0]);
				}
				listViewer.setSelection(structuredSelection, true);
			}
		}

		@Override
		public IWizardPage getNextPage() {
			if (isValid()) {
				IAllocationComputationStrategy<?, ?> strategy = getAllocationComputationStrategy();
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
		public IAllocationComputationStrategy<?, ?> getAllocationComputationStrategy() {
			// the wildcard return type is OK, because usually the caller does not
			// need fiddle with config object, because setting up the config object
			// is the job of this wizard
			if (structuredSelection == null) {
				throw new IllegalStateException("structuredSelection is null (should not happen");
			}
			// assumption: two different strategies have different names
			// (IMHO, a reasonable assumption...)
			AllocationComputationStrategyDescription description = (AllocationComputationStrategyDescription) structuredSelection.getFirstElement();
			String key = description.getName();
			IAllocationComputationStrategy<?, ?> strategy = strategyCache.get(key);
			if (strategy == null) {
				try {
					strategy = ((AllocationComputationStrategyDescription) structuredSelection.getFirstElement()).getAllocationComputationStrategy();
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
				Resource resource = resSet.createResource(URI.createURI("dummy://dummy.ecore"));
				resource.getContents().add(configuration);
				// just to make APE happy (otherwise APE will not modify the object
				// (see org.muml.ape.runtime.editors.AbstractStructuralFeaturePropertyEditor.setValue))
				TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resSet);
			}
			setInput(configuration);
		}
	}

	public static class DefaultOCLContextSelectionProvider implements IOCLContextSelectionProvider {
		private AbstractFujabaExportSourcePage sourcePage;

		private static final String sourcePageTitle = "Select an ocl context element";
		private static final String sourcePageDescription =
				"The ocl context element acts as the context for all ocl expression";

		@Override
		public boolean isProviderFor(@NonNull IStructuredSelection ssel) {
			return ssel.size() == 1 &&
					Adapters.adapt(ssel.getFirstElement(), IFile.class) != null;
		}

		@Override
		public @NonNull List<@NonNull IWizardPage> getWizardPages(@NonNull PageContext pageContext,
				@NonNull FormToolkit toolkit, @NonNull ResourceSet resSet,
				@NonNull IStructuredSelection initialSelection) {
			List<IWizardPage> wizardPageList = new ArrayList<IWizardPage>();
			sourcePage = new AbstractFujabaExportSourcePage("sourceSP",
					toolkit, resSet, initialSelection) {

				{
					setTitle(sourcePageTitle);
					setDescription(sourcePageDescription);
				}

				@Override
				public String wizardPageGetSourceFileExtension() {
					// XXX: fix export wizard code for this
					return "*";
				}

				@Override
				public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
					return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
				}

				@Override
				public boolean wizardPageSupportsSourceModelElement(EObject element) {
					// we take any EObject...
					return true;
				}

			};
			wizardPageList.add(sourcePage);
			return wizardPageList;
		}

		@Override
		public @NonNull EObject getOCLContext() {
			return sourcePage.getSourceElements()[0];
		}

	}

}
