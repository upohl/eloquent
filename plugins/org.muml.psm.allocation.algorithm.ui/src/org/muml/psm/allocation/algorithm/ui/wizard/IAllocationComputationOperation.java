package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.muml.psm.allocation.algorithm.main.AllocationAlgorithm;

/**
 * Just for convenience (for now) 
 */
public interface IAllocationComputationOperation<T> {
	public Diagnostic execute(IProgressMonitor progressMonitor);
	public void postProcess(AllocationAlgorithm<T> algorithm, Diagnostic diagnostic);
}
