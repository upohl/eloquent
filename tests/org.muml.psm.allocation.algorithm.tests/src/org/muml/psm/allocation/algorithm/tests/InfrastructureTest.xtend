package org.muml.psm.allocation.algorithm.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class InfrastructureTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/infrastructure/"
	
	new(String expectedURI, String transformationURI, String inputURI) {
		super(expectedURI, transformationURI, inputURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			#[uriPrefix + "My.ecore", uriPrefix + "test.qvto", uriPrefix + "My.ecore"],
			  // test fragment uris
			#[uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0",
			  uriPrefix + "test.qvto",
			  uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0"]
		]
	}
	
}