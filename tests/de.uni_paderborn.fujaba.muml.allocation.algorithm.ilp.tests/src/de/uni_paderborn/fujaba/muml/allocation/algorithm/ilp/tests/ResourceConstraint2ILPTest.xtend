package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests

import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.util.TestDataUtil

@RunWith(value = typeof(Parameterized))
class ResourceConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests/fixtures/resourceConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "resourceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// requiredResource keyword
				#[uriPrefix + "resourceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredResourceConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintEncodeSAT.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintEncodeSAT.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintTestOrder.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintTestOrder.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintTestOrder2.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintTestOrder2.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "resourceConstraintSimpleDouble.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "resourceConstraintSimpleDouble.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}