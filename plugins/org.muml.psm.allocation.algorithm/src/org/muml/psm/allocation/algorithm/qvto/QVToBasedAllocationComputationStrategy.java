package org.muml.psm.allocation.algorithm.qvto;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IComputationResult;

public class QVToBasedAllocationComputationStrategy<V> implements
		IAllocationComputationStrategy<EObject, V> {
	
	private final String transformationURI;
	
	protected QVToBasedAllocationComputationStrategy(String transformationURI) {
		this.transformationURI = transformationURI;
	}

	@Override
	@NonNull
	public IComputationResult<EObject> computeAllocation(
			@NonNull EObject allocationSpecification,
			@NonNull EObject oclContext, boolean storeILPModel,
			@Nullable IProgressMonitor progressMonitor) {
		Map<String, Object> config = getConfigurationPropertyMap();
		config.put("STORE_ILP_MODEL", storeILPModel);
		QVToSingleOutExtentTransformationRunner runner =
				new QVToSingleOutExtentTransformationRunner(
						transformationURI,
						config,
						allocationSpecification,
						oclContext);
		ExecutionDiagnostic executionDiagnostic =
				runner.runTransformation(progressMonitor);
		BasicDiagnostic rootDiagnostic = createDiagnostic(executionDiagnostic);
		EObject result = null;
		if (runner.getOutExtent().getContents().size() == 1) {
			result = runner.getOutExtent()
					.getContents().get(0);
		}
		return new IComputationResult.DefaultComputationResult<EObject>(
				rootDiagnostic, result);
	}
	
	protected Map<String, Object> getConfigurationPropertyMap() {
		return new HashMap<String, Object>();
	}
	
	@Override
	@Nullable
	public V getConfiguration() {
		// by default our strategy cannot be configured
		return null;
	}
	
	private static BasicDiagnostic createDiagnostic(ExecutionDiagnostic executionDiagnostic) {
		BasicDiagnostic rootDiagnostic = createDiagnostic(
				Diagnostic.OK, null);
		rootDiagnostic.add(executionDiagnostic);
		return rootDiagnostic;
	}
	
	private static BasicDiagnostic createDiagnostic(int severity, @Nullable String message) {
		return new BasicDiagnostic(severity, null, 0, null, null);
	}

}
