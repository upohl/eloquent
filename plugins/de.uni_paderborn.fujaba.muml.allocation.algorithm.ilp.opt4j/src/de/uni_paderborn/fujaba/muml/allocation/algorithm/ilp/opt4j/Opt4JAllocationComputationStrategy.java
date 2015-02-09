package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

public class Opt4JAllocationComputationStrategy extends
		QVToBasedAllocationComputationStrategy {
	
	private static final String transformationURI =
			"platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto";
	
	public Opt4JAllocationComputationStrategy() {
		super(transformationURI);
	}
	
}
