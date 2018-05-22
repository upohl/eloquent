package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;

/**
 * A generic operation interface that can be used by wizards.
 * 
 */
public interface IAllocationOperation {
	public Diagnostic execute(IProgressMonitor progressMonitor);
}
