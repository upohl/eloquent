package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class ResourceConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/resourceConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		
		TestDataUtil.createTestData(2,
				#[uriPrefix + "resourceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintEncodeSAT.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintEncodeSAT.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintTestOrder.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintTestOrder.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintTestOrder2.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintTestOrder2.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.allocation_specification",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}