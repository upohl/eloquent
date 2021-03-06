package org.muml.psm.allocation.algorithm.ilp.scip;

import org.muml.psm.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

/**
 * An ILP-based allocation computation strategy. The allocation problem
 * is transformed to an ILP, which is solved using the lpsolve binary.
 * The transformation and invocation of lpsolve is encapsulated by
 * an QVTo transformation.
 *
 */
public class SCIPAllocationComputationStrategy extends
		QVToBasedAllocationComputationStrategy<Object> {
	
	private static final String transformationURI =
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.scip/transforms/SCIPBasedAlgorithm.qvto";
	
	public SCIPAllocationComputationStrategy() {
		super(transformationURI);
	}

}
