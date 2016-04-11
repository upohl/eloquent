package org.muml.psm.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class MeasureFunction2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/measureFunction/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "measureFunctionSimple.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleQoS.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleQoS.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleServices.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleServices.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleHeterogeneousQoS.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleHeterogeneousQoS.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionOrder.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionOrder.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleServices.lp",
				  "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionOmitService.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}