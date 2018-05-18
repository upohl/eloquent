package org.muml.psm.allocation.algorithm.main;

import org.eclipse.jdt.annotation.Nullable;

/**
 * Represents a strategy for a specific task. In order to
 * fulfill the task, the strategy can be optionally configured.
 */
public interface IStrategy<T> {
	
	/**
	 * Returns a configuration object of type V, which can be used to
	 * configure this strategy or <code>null</code> (if this strategy
	 * is not configurable).
	 * 
	 * @return	a configuration object or <code>null</code>
	 */
	@Nullable
	public T getConfiguration();
}
