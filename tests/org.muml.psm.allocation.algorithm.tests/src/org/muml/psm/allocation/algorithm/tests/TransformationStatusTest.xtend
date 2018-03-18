package org.muml.psm.allocation.algorithm.tests

import java.util.Collection
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class TransformationStatusTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/infrastructure/"
	
	new(ExpectedTransformationStatus expTransformationStatus, String expectedURI,
		String transformationURI, String inputURI
	) {
		super(expTransformationStatus, expectedURI as Object, transformationURI, inputURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			#[new ExpectedTransformationStatus(),
			  uriPrefix + "My.ecore", uriPrefix + "test.qvto", uriPrefix + "My.ecore"],
			#[new ExpectedTransformationStatus(ExecutionDiagnostic.FATAL_ASSERTION),
			  null,
			  uriPrefix + "fatalAssertion.qvto",
			  uriPrefix + "My.ecore"],
			// same as above, but this time with a message
			#[new ExpectedTransformationStatus(ExecutionDiagnostic.FATAL_ASSERTION,
				"Oh my! Something went terribly wrong"),
			  null,
			  uriPrefix + "fatalAssertion.qvto",
			  uriPrefix + "My.ecore"],
			// same as above, but this time we match a regex
			#[new ExpectedTransformationStatus(ExecutionDiagnostic.FATAL_ASSERTION,
				"^Oh my! .* wrong$", true),
			  null,
			  uriPrefix + "fatalAssertion.qvto",
			  uriPrefix + "My.ecore"]
		]
	}
}