package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import org.junit.runners.Parameterized.Parameters
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = typeof(Parameterized))
class InfrastructureTest extends QVToTransformationSingleOutExtentTest {
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#["platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/infrastructure/My.ecore",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/infrastructure/test.qvto",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/infrastructure/My.ecore"])
	}
	
}