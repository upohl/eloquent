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
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.algorithm.main.IAllocationComputationStrategy;
import org.muml.psm.allocation.algorithm.main.IComputationResult;
import org.muml.psm.allocation.language.oclcontext.OCLContext;
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory;

public class QVToBasedAllocationComputationStrategy<T> implements
		IAllocationComputationStrategy<T> {
	
	private final String transformationURI;
	
	private static final String unexpectedResult =
			"Expected type SystemAllocation but got: %s";
	private static final String unexpectedResultSize =
			"Expected exactly one transformation result";
	private static final String unexpectedArgumentType =
			"Expected instance of %s (got: %s)";
	
	protected QVToBasedAllocationComputationStrategy(String transformationURI) {
		this.transformationURI = transformationURI;
	}
		
	private static void checkArgumentType(Class<?> clazz, EObject object) {
		if (!clazz.isInstance(object)) {
			throw new IllegalArgumentException(
					String.format(unexpectedArgumentType, clazz,  object));
		}
	}

	@Override
	@NonNull
	public IComputationResult computeAllocation(
			@NonNull EObject allocationSpecification, @NonNull EObject cic,
			@NonNull EObject hpic, boolean storeILPModel, @Nullable IProgressMonitor progressMonitor) {
		checkArgumentType(ComponentInstanceConfiguration.class, cic);
		checkArgumentType(HWPlatformInstanceConfiguration.class, hpic);
		OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext();
		oclContext.setComponentInstanceConfiguration(
				(ComponentInstanceConfiguration) cic);
		oclContext.setHardwarePlatformInstanceConfiguration(
				(HWPlatformInstanceConfiguration) hpic);
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
		checkResult(rootDiagnostic, runner);
		SystemAllocation systemAllocation = null;
		if (rootDiagnostic.getSeverity() == Diagnostic.OK) {
			systemAllocation = (SystemAllocation) runner.getOutExtent()
					.getContents().get(0);
		}
		return new IComputationResult.DefaultComputationResult(
				rootDiagnostic, systemAllocation);
	}
	
	protected Map<String, Object> getConfigurationPropertyMap() {
		return new HashMap<String, Object>();
	}
	
	@Override
	@Nullable
	public T getConfiguration() {
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
	
	/**
	 * Checks the result of the QVTo transformation. All problems are
	 * added to the passed rootDiagnostic.
	 * 
	 * @param rootDiagnostic	the root diagnostic
	 * @param runner			the qvto transformation runner
	 */
	private static void checkResult(@NonNull BasicDiagnostic rootDiagnostic,
			@NonNull QVToSingleOutExtentTransformationRunner runner) {
		if (runner.getOutExtent().getContents().size() != 1) {
			rootDiagnostic.add(
					createDiagnostic(Diagnostic.ERROR, unexpectedResultSize));
			return;
		}
		EObject object = runner.getOutExtent().getContents().get(0);
		if (!(object instanceof SystemAllocation)) {
			rootDiagnostic.add(
					createDiagnostic(Diagnostic.ERROR,
							String.format(unexpectedResult, object.getClass().getName())));
		}
	}

}
