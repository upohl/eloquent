package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest
import java.util.Collection
import org.junit.After
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class MeasureFunction2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/measureFunction/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "measureFunctionSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionSimple.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleQoS.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleQoS.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleServices.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleServices.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleHeterogeneousQoS.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionMultipleHeterogeneousQoS.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionOrder.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionOrder.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "measureFunctionMultipleServices.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "measureFunctionOmitService.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
	
	// just for debugging purposes
	@After
	def saveOutExtent() {
		System.out.println("calledX!")
		val ResourceSet resourceSet = new ResourceSetImpl()
		val String uriFSPrefix = "file:/home/marcus/pg-cybertron/trunk/02_implementation/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/measureFunction/"
		val Resource resource = resourceSet.createResource(URI.createURI(uriFSPrefix + "out.ecore"))
		resource.contents.add(outExtent.contents.get(0))
		resource.save(null)
		System.out.println("save succeeded")
	}
}