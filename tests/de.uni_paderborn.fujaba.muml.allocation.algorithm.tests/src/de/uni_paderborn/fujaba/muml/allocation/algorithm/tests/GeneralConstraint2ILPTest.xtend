package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class GeneralConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/generalConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				// atomic component instances only
				#[uriPrefix + "simple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "simple.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// simple structured component instances
				#[uriPrefix + "simpleStructured.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "simple.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.1",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// nested structured component instances
				#[uriPrefix + "simpleNestedStructured.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "simple.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.2",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// atomic component instances only and two platform instances
				#[uriPrefix + "simpleMultiplePlatformInstances.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "simple.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0"])
	}	
}