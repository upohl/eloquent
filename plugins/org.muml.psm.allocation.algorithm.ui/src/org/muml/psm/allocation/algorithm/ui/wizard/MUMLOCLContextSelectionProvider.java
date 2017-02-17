package org.muml.psm.allocation.algorithm.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.oclcontext.OCLContext;
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory;

public class MUMLOCLContextSelectionProvider implements IAllocationWizardExtensionProvider {
	
	private static final String targetPageExpected = "Expected a target page";
	private static final String mumlFileExtension = "muml";
	
	private AbstractFujabaExportSourcePage cicSourcePage;
	private AbstractFujabaExportSourcePage hpicSourcePage;
	private AbstractFujabaExportSourcePage targetPage;

	@Override
	public boolean isProviderFor(IStructuredSelection ssel) {
		if (ssel.size() != 1) {
			return false;
		}
		IFile file = Adapters.adapt(ssel.getFirstElement(), IFile.class);
		return file != null && mumlFileExtension.equals(file.getFileExtension());
	}

	@Override
	public List<IWizardPage> getWizardPages(@NonNull PageContext pageContext,
			@NonNull FormToolkit toolkit, @NonNull ResourceSet resSet,
			@NonNull IStructuredSelection initialSelection) {
		List<IWizardPage> wizardPageList = new ArrayList<IWizardPage>();
		// cic source page
		cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", toolkit, resSet, initialSelection) {
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
		wizardPageList.add(cicSourcePage);	
		// hpic source page
		hpicSourcePage = new AbstractFujabaExportSourcePage("HpicSP", toolkit, resSet, initialSelection) {
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
		wizardPageList.add(hpicSourcePage);	
        // target page
		if (pageContext == PageContext.AllocationComputation) {
			targetPage = createTargetPage(toolkit, resSet, initialSelection);
        	wizardPageList.add(targetPage);
		}
        return wizardPageList;
	}
	
	protected AbstractFujabaExportSourcePage createTargetPage(@NonNull FormToolkit toolkit, @NonNull ResourceSet resSet,
			@NonNull IStructuredSelection initialSelection) {
		return new AbstractFujabaExportSourcePage("targetSP", toolkit, resSet, initialSelection) {

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
				return element instanceof ModelElementCategory || element instanceof RootNode || element instanceof SystemAllocation;
			}
		};

	}

	@Override
	public EObject getOCLContext() {
		OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext();
    	oclContext.setComponentInstanceConfiguration(
    			(ComponentInstanceConfiguration) cicSourcePage.getSourceElements()[0]);
    	oclContext.setHardwarePlatformInstanceConfiguration(
    			(HWPlatformInstanceConfiguration) hpicSourcePage.getSourceElements()[0]);
    	return oclContext;
	}

	@Override
	public @NonNull IFujabaExportOperation createOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS specification, @NonNull EObject oclContext,
			@NonNull IAllocationComputationStrategy<?, ?> strategy, boolean storeILPModel) {
		if (targetPage == null) {
			throw new IllegalStateException(targetPageExpected);
		}
		return new MUMLCreateAllocationOperation(editingDomain, specification,
				oclContext, targetPage.getSourceElements()[0], strategy,
				storeILPModel);
	}

}
