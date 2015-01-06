package de.uni_paderborn.fujaba.muml.allocation.algorithm.main;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Provides a method to compute an allocation. The
 * <code>computeAllocation</code> returns an <code>IComputationResult</code>,
 * which contains the <code>SystemAllocation</code> and computation details
 *
 */
public interface IAllocationComputationStrategy {
	
	/**
	 * Computes an allocation using the specified parameters. It returns
	 * a <code>IComputationResult</code> that provides access to the
	 * <code>SystemAllocation</code> and the computation details.
	 * 
	 * @param allocationSpecification 	the allocation specification model element
	 * @param cic						the component instance configuration model element
	 * @param hpic						the hardware platform instance configuration model element
	 * @param progressMonitor			progress monitor or <code>null</code>
	 * @return							the iComputationResult
	 */
	@NonNull
	public IComputationResult computeAllocation(
			@NonNull EObject allocationSpecification,
			@NonNull EObject cic, @NonNull EObject hpic,
			@Nullable IProgressMonitor progressMonitor);
}
