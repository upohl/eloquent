package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.util.TestDataUtil
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class SameLocation2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests/fixtures/sameLocationConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				// atomic component instances only
				#[uriPrefix + "locationConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// collocation keyword
				#[uriPrefix + "locationConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "collocationConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// two sameLocation constraints (only one embedded component instance)
				#[uriPrefix + "locationConstraintStructured.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintStructured.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.1",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// two embedded component instances
				#[uriPrefix + "locationConstraintStructuredTwoEmbedded.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintStructured.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.4",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// same as above but the order of the cartesian product changed (results in the _same_ ilp)
				#[uriPrefix + "locationConstraintStructuredTwoEmbedded.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "locationConstraintStructuredTwoEmbeddedOrder.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.4",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}

}