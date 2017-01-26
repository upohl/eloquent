package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class GeneralConstraint2ILPTest extends MUMLOCLContextBasedTest {
	public static final String modelsDirectory = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/models/"
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/generalConstraint/"
	
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		#[
			// atomic component instances only
			#[uriPrefix + "simple.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "simple.allocation_specification",
			  modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
			  modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
			// simple structured component instances
			#[uriPrefix + "simpleStructured.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "simpleStructured.allocation_specification",
			  modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.1",
			  modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
			// nested structured component instances
			#[uriPrefix + "simpleNestedStructured.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "simpleNestedStructured.allocation_specification",
			  modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.2",
			  modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
			// atomic component instances only and two platform instances
			#[uriPrefix + "simpleMultiplePlatformInstances.lp",
			  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
			  uriPrefix + "simpleMultiplePlatformInstances.allocation_specification",
			  modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
			  modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0"]
		]
	}	
}