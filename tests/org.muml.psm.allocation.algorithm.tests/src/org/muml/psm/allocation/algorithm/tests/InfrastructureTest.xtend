package org.muml.psm.allocation.algorithm.tests

import org.junit.runners.Parameterized.Parameters
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class InfrastructureTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/infrastructure/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[(uriPrefix as String) + ("My.ecore" as String), (uriPrefix as String) + ("test.qvto" as String), (uriPrefix as String) + ("My.ecore" as String)],
				// test fragment uris
				#[uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0",
				  uriPrefix + "test.qvto",
				  uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0"])
	}
	
}