package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class DifferentLocation2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/differentLocationConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				// atomic component instances only
				#[uriPrefix + "locationConstraintSimple.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// separateLocation keyword
				#[uriPrefix + "locationConstraintSimple.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "separateLocationConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// two differentLocation constraints (only one embedded component instance)
				#[uriPrefix + "locationConstraintStructuredTwoEmbedded.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintStructuredTwoEmbedded.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.4",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}