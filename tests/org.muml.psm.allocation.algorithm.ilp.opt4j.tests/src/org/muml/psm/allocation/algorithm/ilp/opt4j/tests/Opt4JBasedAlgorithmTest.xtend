package org.muml.psm.allocation.algorithm.ilp.opt4j.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToBasedAlgorithmTest

@RunWith(value = typeof(Parameterized))
class Opt4JBasedAlgorithmTest extends QVToBasedAlgorithmTest {
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		getTestData(
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto"
		)
	}
	
}