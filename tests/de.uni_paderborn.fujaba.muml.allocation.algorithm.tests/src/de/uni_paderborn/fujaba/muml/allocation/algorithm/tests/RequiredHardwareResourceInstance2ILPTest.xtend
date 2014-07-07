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
class RequiredHardwareResourceInstance2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/requiredHardwareResourceInstanceConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				// atomic component instances only
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptorsMixedResult.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0"])
	}
	
	// just for debugging purposes
	@After
	def saveOutExtent() {
		System.out.println("calledX!")
		val ResourceSet resourceSet = new ResourceSetImpl()
		val String uriFSPrefix = "file:/home/marcus/pg-cybertron/trunk/02_implementation/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/requiredHardwareResourceInstanceConstraint/"
		val Resource resource = resourceSet.createResource(URI.createURI(uriFSPrefix + "out.ecore"))
		resource.contents.add(outExtent.contents.get(0))
		resource.save(null)
		System.out.println("save succeeded")
	}
}