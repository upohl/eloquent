package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest

@RunWith(value = typeof(Parameterized))
class SequencePart2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String fixturesDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/"
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/sequencePart/"
	private static final ExpectedTransformationStatus success = new ExpectedTransformationStatus();
	
	new(ExpectedTransformationStatus expectedTransformationStatus, String expectedURI,
		String transformationURI, String aslURI, String oclContextURI
	) {
		super(expectedTransformationStatus, expectedURI as Object, transformationURI,
			aslURI, oclContextURI
		)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			#[success,
			  fixturesDirectory + "oclContext/generalConstraint_allocation.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "relation.allocation_specification",
			  fixturesDirectory + "oclContext/model/simple.ecore"],
			#[success,
			  fixturesDirectory + "forbiddenLocationConstraint/multipleConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "forbiddenLocation.allocation_specification",
			  fixturesDirectory + "implicationConstraint/model/implicationConstraint.ecore"],
			#[success,
			  fixturesDirectory + "implicationConstraint/multipleConstraints.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "implicationConstraint.allocation_specification",
			  fixturesDirectory + "implicationConstraint/model/implicationConstraint.ecore"],
			#[success,
			  uriPrefix + "resourceConstraint.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "resourceConstraint.allocation_specification",
			  fixturesDirectory + "implicationConstraint/model/implicationConstraint.ecore"],
			#[success,
			  uriPrefix + "locationConstraint.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "locationConstraint.allocation_specification",
			  fixturesDirectory + "implicationConstraint/model/implicationConstraint.ecore"],
			#[success,
			  uriPrefix + "measureFunction.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "measureFunction.allocation_specification",
			  fixturesDirectory + "implicationConstraint/model/implicationConstraint.ecore"]
		]
	}
	
}