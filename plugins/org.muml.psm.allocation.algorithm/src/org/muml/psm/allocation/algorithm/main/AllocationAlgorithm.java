package org.muml.psm.allocation.algorithm.main;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/** 
 * Main entry point for computing an allocation. The
 * <code>computeAllocation</code> method computes and allocation,
 * which can be accessed via the <code>getSystemAllocation</code>
 * method.
 *
 */
public class AllocationAlgorithm<T> {
	private static final String resultNull =
			"result is null: computeAllocation has to be called before getStorageObject";
	private EObject allocationSpecification;
	private EObject oclContext;
	private IComputationResult<T> result;
	private boolean storeILPModel;
	
	/**
	 * Constructs a new <code>AllocationAlgorithm</code> instance.
	 * 
	 * @param allocationSpecification	the allocation specification model element
	 * @param cic						the component instance configuration model element
	 * @param hpic						the hardware platform instance configuration model element
	 */
	public AllocationAlgorithm(EObject allocationSpecification,
		EObject oclContext, boolean storeILPModel) {
		this.allocationSpecification = allocationSpecification;
		this.oclContext = oclContext;
		this.storeILPModel = storeILPModel;
	}
	
	/**
	 * Computes an allocation. The returned <code>Diagnostic</code> provides
	 * computation details, for example if the computation was successful.
	 * 
	 * @param acs				the allocation computation strategy, which represents the main algorithm
	 * @param progressMonitor	the iProgressMonitor or <code>null</code>
	 * @return					the diagnostic, which provides details about the computation
	 */
	@NonNull
	public Diagnostic computeAllocation(@NonNull IAllocationComputationStrategy<T, ?> acs,
			@Nullable IProgressMonitor progressMonitor) {
		result = acs.computeAllocation(allocationSpecification, oclContext, storeILPModel, progressMonitor);
		return result.getDiagnostic();
	}
	
	@NonNull
	public Diagnostic computeAllocation(IAllocationComputationStrategy<T, ?> acs) {
		return computeAllocation(acs, null);
	}
	
	/**
	 * Returns the storage object (if available). Throws an
	 * <code>IllegalStateException</code>, if it was called before the
	 * <code>computeAllocation</code>
	 * method.
	 * 
	 * @return the storage object or <code>null</code>
	 */
	@Nullable
	public T getStorageObject() {
		if (result == null) {
			throw new IllegalStateException(resultNull);
		}
		return result.getStorageObject();
	}

}
