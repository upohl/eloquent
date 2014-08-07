package de.uni_paderborn.fujaba.muml.allocation.algorithm.ui.wizard;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.forms.widgets.FormToolkit;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

public class AllocationWizard extends AbstractFujabaExportWizard {
	private static final String title = "Create Allocation Wizard";
	private CicAndHpicSelectionSourcePage cicAndhpicSelectionSourcePage;
	private AbstractFujabaExportSourcePage allocationSpecificationSourcePage;
	private AbstractFujabaExportSourcePage targetPage;

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
		cicAndhpicSelectionSourcePage = new CicAndHpicSelectionSourcePage("CicHpicSP", toolkit,
				getResourceSet(), initialSelection);
		addPage(cicAndhpicSelectionSourcePage);	
		// allocation specification source page
		allocationSpecificationSourcePage = new AbstractFujabaExportSourcePage("AllocSpecSP", toolkit,
				getResourceSet(), initialSelection) {
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
	}
	
	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		return new CreateAllocationOperation(editingDomain,
				(SpecificationCS) allocationSpecificationSourcePage.getSourceElements()[0],
				cicAndhpicSelectionSourcePage.getCIC(),
				cicAndhpicSelectionSourcePage.getHPIC(),
				targetPage.getSourceElements()[0]);
	}
	
	public class CicAndHpicSelectionSourcePage extends AbstractFujabaExportSourcePage {
		private static final String invalidSelection = "Select exactly one Component Instance Configuration"
				+ " and exactly one Hardware Platform Instance Configuration";
		
		public CicAndHpicSelectionSourcePage(String pageId,
				FormToolkit toolkit, ResourceSet resourceSet,
				ISelection selection) {
			super(pageId, toolkit, resourceSet, selection);
		}

		@Override
		public String wizardPageGetSourceFileExtension() {
			return "fujaba";
		}

		@Override
		public boolean wizardPageSupportsSourceModelElement(EObject element) {
			return element instanceof ComponentInstanceConfiguration
					|| element instanceof HWPlatformInstanceConfiguration;
		}
		
		private <T> T getClassBasedSelection(Class<T> cls) {
			for (EObject eObject : getSourceElements()) {
				if (cls.isAssignableFrom(eObject.getClass())) {
					return (T) eObject;
				}
			}
			return null;
		}
		
		public ComponentInstanceConfiguration getCIC() {
			return getClassBasedSelection(ComponentInstanceConfiguration.class);
		}
		
		public HWPlatformInstanceConfiguration getHPIC() {
			return getClassBasedSelection(HWPlatformInstanceConfiguration.class);
		}
		
		@Override
		public void validatePage() {
			super.validatePage();
			// in case of no errors, check if we have exactly one cic and hpic 
			if (isPageComplete()
					&& (getCIC() == null || getHPIC() == null)) {
				setErrorMessage(invalidSelection);
				setPageComplete(false);
			}
		}

		@Override
		public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
			return ElementSelectionMode.ELEMENT_SELECTION_MODE_MULTI;
		}
	}

}
