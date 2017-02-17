package org.muml.psm.allocation.algorithm.ui.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.annotation.NonNull;
import org.muml.core.modelinstance.ModelElementCategory;
import org.muml.core.modelinstance.RootNode;
import org.muml.core.modelinstance.categories.ModelElementCategoryRegistry;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.language.cs.SpecificationCS;

public class MUMLCreateAllocationOperation extends CreateAllocationOperation<SystemAllocation> {
	private static final String allocationModelElementCategoryKey = "org.muml.psm.allocation.category";
	private static final String allocationModelElementCategoryName = "allocation";
	private static final String inconsistentContainmentHierarchy = "Containment hierarchy of %s is inconsistent (expected RootNode (at top))";
	
	private EObject target;

	public MUMLCreateAllocationOperation(@NonNull EditingDomain editingDomain,
			@NonNull SpecificationCS allocationSpecification, @NonNull EObject oclContext,
			@NonNull EObject target,
			@NonNull IAllocationComputationStrategy<?, ?> allocationComputationStrategy,
			@NonNull boolean storeILPModel) {
		super(editingDomain, allocationSpecification, oclContext,
				allocationComputationStrategy, storeILPModel);
		this.target = target;
	}
	
	@Override
	protected void postProcess(@NonNull AllocationAlgorithm<SystemAllocation> algorithm) {
		addSystemAllocationToTarget(algorithm.getStorageObject());
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
			throw new IllegalArgumentException(String.format(inconsistentContainmentHierarchy, orig));
		}
		return (RootNode) eObject;
	}

}
