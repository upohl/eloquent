package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.emf.common.util.Diagnostic;
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm;

/**
 * Just for convenience (for now) 
 */
public interface IAllocationComputationOperation<T> extends IAllocationOperation {
	public void postProcess(AllocationAlgorithm<T> algorithm, Diagnostic diagnostic);
}
