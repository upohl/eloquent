package org.muml.psm.allocation.algorithm.main;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.psm.allocation.SystemAllocation;

/**
 * Provides access to computation details and the <code>SystemAllocation</code>.
 * The <code>getDiagnostic</code> method returns a Diagnostic, which provides
 * details about the allocation computation (for example, in case of a failure).
 * The<code>SystemAllocation</code> can be accessed using the
 * <code>getSystemAlloction</code> method.
 *
 */
public interface IComputationResult {
	
	/**
	 * Provides information about the allocation computation.
	 * If the diagnostic's <code>getCode</code> method returns
	 * <code>Diagnostic.OK</code>, the allocation computation
	 * was successful.
	 * 
	 * @return diagnostic that provides information about the allocation computation
	 */
	@NonNull
	public Diagnostic getDiagnostic();
	
	/**
	 * Returns the computed <code>SystemAllocation</code>. If the
	 * computation was not successful, <code>null</code> is returned.
	 * 
	 * @return the systemAllocation or <code>null</code>
	 */
	@Nullable
	public SystemAllocation getSystemAllocation();
	
	
	/**
	 * Default implementation of the <code>IComputationResult</code> interface.
	 *
	 */
	public static class DefaultComputationResult implements IComputationResult {
		private Diagnostic diagnostic;
		private SystemAllocation systemAllocation;
		
		public DefaultComputationResult(@NonNull Diagnostic diagnostic,
				@Nullable SystemAllocation systemAllocation) {
			this.diagnostic = diagnostic;
			this.systemAllocation = systemAllocation;
		}

		@Override
		@NonNull
		public Diagnostic getDiagnostic() {
			return diagnostic;
		}

		@Override
		@Nullable
		public SystemAllocation getSystemAllocation() {
			return systemAllocation;
		}

	}
	
}
