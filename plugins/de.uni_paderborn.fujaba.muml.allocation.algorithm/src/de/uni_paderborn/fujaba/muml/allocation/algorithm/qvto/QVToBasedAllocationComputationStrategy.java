package de.uni_paderborn.fujaba.muml.allocation.algorithm.qvto;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.IAllocationComputationStrategy;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.main.IComputationResult;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

public class QVToBasedAllocationComputationStrategy implements
		IAllocationComputationStrategy {
	
	private final String transformationURI;
	
	private static final String unexpectedResult =
			"Expected type SystemAllocation but got: %s";
	private static final String unexpectedResultSize =
			"Expected exactly one transformation result";
	
	protected QVToBasedAllocationComputationStrategy(String transformationURI) {
		this.transformationURI = transformationURI;
	}
	
	private static String eObjectToURI(EObject eObject) {
		return EcoreUtil.getURI(eObject).toString();
	}

	@Override
	@NonNull
	public IComputationResult computeAllocation(
			@NonNull EObject allocationSpecification, @NonNull EObject cic,
			@NonNull EObject hpic, @Nullable IProgressMonitor progressMonitor) {
		QVToSingleOutExtentTransformationRunner runner =
				new QVToSingleOutExtentTransformationRunner(
						transformationURI,
						eObjectToURI(allocationSpecification),
						eObjectToURI(cic),
						eObjectToURI(hpic));
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
