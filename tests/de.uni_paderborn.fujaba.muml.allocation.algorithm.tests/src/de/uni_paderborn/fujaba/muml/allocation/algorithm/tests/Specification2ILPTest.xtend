package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest
import org.junit.runners.Parameterized
import org.junit.runner.RunWith
import org.junit.runners.Parameterized.Parameters
import java.util.Collection
import org.junit.After
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource

@RunWith(value = typeof(Parameterized))
class Specification2ILPTest extends QVToTransformationSingleOutExtentTest {
	private static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/allocationSimple/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				// atomic component instances only
				#[uriPrefix + "simple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "ocltest.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				// simple structured component instances
				#[uriPrefix + "simpleStructured.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "ocltest.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.1",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				// nested structured component instances
				#[uriPrefix + "simpleNestedStructured.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "ocltest.allocation_specification",
				  uriPrefix + "simple.fujaba#//@categories.1/@modelElements.2",
				  uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"])
	}
	
	// just for debugging purposes
	@After
	def saveOutExtent() {
		System.out.println("called!")
		val ResourceSet resourceSet = new ResourceSetImpl()
		val String uriFSPrefix = "file:/home/marcus/pg-cybertron/trunk/02_implementation/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/allocationSimple/"
		val Resource resource = resourceSet.createResource(URI.createURI(uriFSPrefix + "out.ecore"))
		resource.contents.add(outExtent.contents.get(0))
		resource.save(null)
		System.out.println("save succeeded")
	}
	
}