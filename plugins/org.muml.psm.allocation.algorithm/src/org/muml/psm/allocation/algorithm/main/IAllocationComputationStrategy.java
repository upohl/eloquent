package org.muml.psm.allocation.algorithm.main;

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
public interface IAllocationComputationStrategy<T, V> {
	
	/**
	 * Computes an allocation using the specified parameters. It returns
	 * a <code>IComputationResult<T></code> that provides access to the
	 * storage object and the computation details.
	 * 
	 * @param allocationSpecification 	the allocation specification model element
	 * @param oclContext				the oclContext object
	 * @param storeILPModel				if true, store ilp model for debugging purposes
	 * @param progressMonitor			progress monitor or <code>null</code>
	 * @return							the IComputationResult<T>
	 */
	@NonNull
	public IComputationResult<T> computeAllocation(
			@NonNull EObject allocationSpecification,
			@NonNull EObject oclContext, boolean storeILPModel,
			@Nullable IProgressMonitor progressMonitor);
	
	/**
	 * Returns a configuration object of type V, which can be used to
	 * configure this <code>IAllocationComputationStrategy</code>,
	 * or <code>null</code> (if this IAllocationComputationStrategy is not
	 * configurable).
	 * 
	 * @return	a configuration object or <code>null</code>
	 */
	@Nullable
	public V getConfiguration();
}
