package de.uni_paderborn.fujaba.muml.allocation.algorithm.main;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.util.QVToSingleOutExtentTransformationRunner;
import de.uni_paderborn.fujaba.muml.psm.allocation.SystemAllocation;

/** 
 * Main entry point for computing an allocation. In order to
 * compute an allocation, just instantiate this class and call
 * its computeAllocation method. Afterwards, the allocation can
 * be accessed by calling getSystemAllocation.
 *
 */
public class AllocationAlgorithm {
	private static final String runnerNull = "runner is null: computeAllocation has to be called before getSystemAlloction";
	private static final String unexpectedResult = "Expected type SystemAllocation but got: %s";
	private static final String unexpectedResultSize = "Expected exactly one transformation result";
	private static final String transformationURI = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/LPSolveBasedAlgorithm.qvto";
	
	private String allocationSpecificationURI;
	private String cicURI;
	private String hpicURI;
	private QVToSingleOutExtentTransformationRunner runner;
	
	public AllocationAlgorithm(String allocationSpecificationURI,
			String cicURI, String hpicURI) {
		this.allocationSpecificationURI = allocationSpecificationURI;
		this.cicURI = cicURI;
		this.hpicURI = hpicURI;
		this.runner = null;
	}

	public ExecutionDiagnostic computeAllocation(@Nullable IProgressMonitor progressMonitor) {
		runner = new QVToSingleOutExtentTransformationRunner(transformationURI,
				allocationSpecificationURI, cicURI, hpicURI);
		ExecutionDiagnostic diagnostic = runner.runTransformation(progressMonitor);
		// error handling is up to the caller
		return diagnostic;
	}
	
	public SystemAllocation getSystemAllocation() {
		if (runner == null) {
			throw new IllegalStateException(runnerNull);
		}
		// some sanity checks
		checkResult(runner);
		return (SystemAllocation) runner.getOutExtent().getContents().get(0);
	}
	
	private static void checkResult(QVToSingleOutExtentTransformationRunner runner) {
		if (runner.getOutExtent().getContents().size() != 1) {
			throw new IllegalStateException(unexpectedResultSize);
		}
		EObject object = runner.getOutExtent().getContents().get(0);
		if (!(object instanceof SystemAllocation)) {
			throw new IllegalStateException(String.format(unexpectedResult, object.getClass().getName()));
		}
	}
	
}
