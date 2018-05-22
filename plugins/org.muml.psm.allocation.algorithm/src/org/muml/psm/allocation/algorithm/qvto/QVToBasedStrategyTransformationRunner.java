package org.muml.psm.allocation.algorithm.qvto;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

/**
 * Actually, just a simple wrapper around the
 * <code>QVToSingleOutExtentTransformationRunner</code>. Its
 * <code>runTransformation</code> method executes the passed transformation
 * and returns an <code>ExecutionResult</code> instance that encapsulates
 * an <code>ExecutionDiagnostic", which contains the details of the
 * transformation run (e.g., success or failure), and the out extent's
 * objects.
 *
 */
public class QVToBasedStrategyTransformationRunner {
	
	public static class ExecutionResult {
		private ExecutionDiagnostic diagnostic;
		private List<EObject> outObjectList;
		
		public ExecutionResult(ExecutionDiagnostic diagnostic,
				List<EObject> outObjectList) {
			this.diagnostic = diagnostic;
			this.outObjectList = outObjectList;
		}
		
		public ExecutionDiagnostic getDiagnostic() {
			return diagnostic;
		}
		
		public List<EObject> getOutObjects() {
			return outObjectList;
		}
	}
	
	@NonNull
	public static ExecutionResult runTransformation(@NonNull String transformationURI,
			@NonNull EObject allocationSpecification,
			@NonNull EObject oclContext,
			@NonNull Map<@NonNull String, @Nullable Object> configurationPropertyMap,
			@Nullable IProgressMonitor progressMonitor) {
		QVToSingleOutExtentTransformationRunner runner =
				new QVToSingleOutExtentTransformationRunner(
						transformationURI,
						configurationPropertyMap,
						allocationSpecification,
						oclContext);
		ExecutionDiagnostic executionDiagnostic =
				runner.runTransformation(progressMonitor);
		return new ExecutionResult(executionDiagnostic,
				runner.getOutExtent().getContents());
	}
	
}
