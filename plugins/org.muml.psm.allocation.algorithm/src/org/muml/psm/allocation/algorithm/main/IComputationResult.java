package org.muml.psm.allocation.algorithm.main;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Provides access to computation details and the storage object (if available).
 * The <code>getDiagnostic</code> method returns a Diagnostic, which provides
 * details about the allocation computation (for example, in case of a failure).
 * The storage object can be accessed using the <code>getStorageObject</code>
 * method (if available).
 *
 */
public interface IComputationResult<T> {
	
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
	 * Returns the computed storage object, if available. If no
	 * storage object is available or the computation was not
	 * successful, <code>null</code> is returned.
	 * 
	 * @return the storage object or <code>null</code>
	 */
	@Nullable
	public T getStorageObject();
	
	
	/**
	 * Default implementation of the <code>IComputationResult</code> interface.
	 *
	 */
	public static class DefaultComputationResult<T> implements IComputationResult<T> {
		private Diagnostic diagnostic;
		private T storageObject;
		
		public DefaultComputationResult(@NonNull Diagnostic diagnostic,
				@Nullable T storageObject) {
			this.diagnostic = diagnostic;
			this.storageObject = storageObject;
		}

		@Override
		@NonNull
		public Diagnostic getDiagnostic() {
			return diagnostic;
		}

		@Override
		@Nullable
		public T getStorageObject() {
			return storageObject;
		}

	}
	
}
