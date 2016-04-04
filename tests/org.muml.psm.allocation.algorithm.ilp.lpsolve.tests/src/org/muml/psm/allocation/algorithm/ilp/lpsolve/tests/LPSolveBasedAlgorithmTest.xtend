package org.muml.psm.allocation.algorithm.ilp.lpsolve.tests

import org.muml.psm.allocation.algorithm.tests.qvto.QVToBasedAlgorithmTest
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class LPSolveBasedAlgorithmTest extends QVToBasedAlgorithmTest {

	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		getTestData(
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.lpsolve/transforms/LPSolveBasedAlgorithm.qvto"
		)
	}

}