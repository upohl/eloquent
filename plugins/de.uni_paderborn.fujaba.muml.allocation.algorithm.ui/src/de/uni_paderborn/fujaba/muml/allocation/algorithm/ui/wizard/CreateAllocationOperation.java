package de.uni_paderborn.fujaba.muml.allocation.algorithm.ui.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.modelinstance.categories.ModelElementCategoryRegistry;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.AllocationAlgorithm;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.SpecificationCS;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

public class CreateAllocationOperation extends AbstractFujabaExportOperation {
	private static final String nullProgressMonitor = "progressMonitor must not be null";
	private static final String allocationModelElementCategoryKey = "de.uni_paderborn.fujaba.muml.psm.allocation.category";
	private static final String allocationModelElementCategoryName = "allocation";
	private static final String inconsistentContainmentHierarchy = "Containment hierarchy of %s is inconsistent (expected RootNode (at top))";
	private static final String saveSystemAllocationTaskName = "Save computed System Allocation";
	
	@NonNull private EditingDomain editingDomain;
	@NonNull private SpecificationCS allocationSpecification;
	@NonNull private ComponentInstanceConfiguration cic;
	@NonNull private HWPlatformInstanceConfiguration hpic;
	@NonNull private EObject target;
	
	public CreateAllocationOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS allocationSpecification,
			@NonNull ComponentInstanceConfiguration cic, @NonNull HWPlatformInstanceConfiguration hpic,
			@NonNull EObject target) {
		this.editingDomain = editingDomain;
		this.allocationSpecification = allocationSpecification;
		this.cic = cic;
		this.hpic = hpic;
		this.target = target;
	}
	
	private AllocationAlgorithm createAllocationAlgorithm() {
		return new AllocationAlgorithm(
				eObjectToURI(allocationSpecification),
				eObjectToURI(cic),
				eObjectToURI(hpic));
	}
	
	private static String eObjectToURI(EObject eObject) {
		return EcoreUtil.getURI(eObject).toString();
	}
	
	@Override
	protected IStatus doExecute(IProgressMonitor progressMonitor) {
		// hmm the docs do not state if the progressMonitor can be null
		// assumption: it is not null
		if (progressMonitor == null) {
			throw new IllegalArgumentException(nullProgressMonitor);
		}
		SubMonitor progress = SubMonitor.convert(progressMonitor, 100);
		AllocationAlgorithm algorithm = createAllocationAlgorithm();
		ExecutionDiagnostic diagnostic = algorithm.computeAllocation(progress.newChild(90));
		if (diagnostic.getCode() != Status.OK) {
			return BasicDiagnostic.toIStatus(diagnostic);
		}
		if (!progress.isCanceled()) {
			// save computed system allocation in the target's resource
			progress.subTask(saveSystemAllocationTaskName);
			addSystemAllocationToTarget(algorithm.getSystemAllocation());
			progress.worked(10);
		}
		return progress.isCanceled() ? Status.CANCEL_STATUS : Status.OK_STATUS;
	}
	
	private void addSystemAllocationToTarget(SystemAllocation systemAllocation) {
		if (target instanceof RootNode || target instanceof ModelElementCategory) {
			addToAllocationModelElementCategory(systemAllocation);
		} else if (target instanceof SystemAllocation) {
			replaceExistingSystemAllocation(systemAllocation);
		}
	}
	
	private void addToAllocationModelElementCategory(final SystemAllocation systemAllocation) {
		// passing the resource to the change command should record all
		// changes performed to directly or indirectly contained elements
		editingDomain.getCommandStack().execute(new ChangeCommand(target.eResource()) {

			@Override
			protected void doExecute() {
				ModelElementCategory category = getOrCreateAllocationModelElementCategory(target);
				category.getModelElements().add(systemAllocation);
				saveResource(systemAllocation.eResource());
			}
			
		});
	}
		
	private void replaceExistingSystemAllocation(final SystemAllocation systemAllocation) {
		// target is the old SystemAllocation
		editingDomain.getCommandStack().execute(new ChangeCommand(target.eResource()) {

			@Override
			protected void doExecute() {
				ModelElementCategory category = getOrCreateAllocationModelElementCategory(target);
				int idx = category.getModelElements().indexOf(target);
				category.getModelElements().remove(idx);
				category.getModelElements().add(idx, systemAllocation);
				saveResource(systemAllocation.eResource());
			}
			
		});
	}
	
	private void saveResource(@NonNull Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@NonNull
	private ModelElementCategory getOrCreateAllocationModelElementCategory(EObject eObject) {
		RootNode rootNode = getRootNode(eObject);
		ModelElementCategoryRegistry registry = new ModelElementCategoryRegistry(true);
		ModelElementCategory category = registry.getModelElementCategory(rootNode, allocationModelElementCategoryKey);
		if (category.getName() == null) {
			// this happens if the model element category is not properly
			// registered
			category.setName(allocationModelElementCategoryName);
		}
		return category;
	}
	
	@NonNull
	private RootNode getRootNode(EObject eObject) {
		EObject orig = eObject;
		while (eObject != null && !(eObject instanceof RootNode)) {
			eObject = eObject.eContainer();
		}
		if (eObject == null) {
			throw new IllegalArgumentException(String.format(
					inconsistentContainmentHierarchy, orig));
		}
		return (RootNode) eObject;
	}

}
