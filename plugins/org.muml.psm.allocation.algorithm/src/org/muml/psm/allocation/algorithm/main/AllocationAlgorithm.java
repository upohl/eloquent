package org.muml.psm.allocation.algorithm.main;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.psm.allocation.SystemAllocation;

/** 
 * Main entry point for computing an allocation. The
 * <code>computeAllocation</code> method computes and allocation,
 * which can be accessed via the <code>getSystemAllocation</code>
 * method.
 *
 */
public class AllocationAlgorithm {
	private static final String resultNull =
			"result is null: computeAllocation has to be called before getSystemAlloction";
	private EObject allocationSpecification;
	private EObject cic;
	private EObject hpic;
	private IComputationResult result;
	private boolean storeILPModel;
	
	/**
	 * Constructs a new <code>AllocationAlgorithm</code> instance.
	 * 
	 * @param allocationSpecification	the allocation specification model element
	 * @param cic						the component instance configuration model element
	 * @param hpic						the hardware platform instance configuration model element
	 */
	public AllocationAlgorithm(EObject allocationSpecification,
		EObject cic, EObject hpic, boolean storeILPModel) {
		this.allocationSpecification = allocationSpecification;
		this.cic = cic;
		this.hpic = hpic;
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
	public Diagnostic computeAllocation(@NonNull IAllocationComputationStrategy<?> acs,
			@Nullable IProgressMonitor progressMonitor) {
		result = acs.computeAllocation(allocationSpecification, cic, hpic, storeILPModel, progressMonitor);
		return result.getDiagnostic();
	}
	
	@NonNull
	public Diagnostic computeAllocation(IAllocationComputationStrategy<?> acs) {
		return computeAllocation(acs, null);
	}
	
	/**
	 * Returns a previously computed <code>SystemAllocation</code>. Throws an
	 * <code>IllegalStateException</code>, if it was called before the
	 * <code>computeAllocation</code>
	 * method.
	 * 
	 * @return the systemAllocation or <code>null</code>
	 */
	@Nullable
	public SystemAllocation getSystemAllocation() {
		if (result == null) {
			throw new IllegalStateException(resultNull);
		}
		return result.getSystemAllocation();
	}

}
