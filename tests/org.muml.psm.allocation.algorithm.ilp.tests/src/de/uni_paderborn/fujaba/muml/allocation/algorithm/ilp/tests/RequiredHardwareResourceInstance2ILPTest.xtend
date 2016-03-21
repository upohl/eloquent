package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.util.TestDataUtil
import java.util.Collection
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = typeof(Parameterized))
class RequiredHardwareResourceInstance2ILPTest extends QVToTransformationSingleOutExtentTest {
	public static final String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests/fixtures/requiredHardwareResourceInstanceConstraint/"
	
	new(String expectedURI, String transformationURI, String... inputObjectURIs) {
		super(expectedURI, transformationURI, inputObjectURIs)
	}
	
	@Parameters
	def static Collection<Object[]> getTestData() {
		TestDataUtil.createTestData(2,
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				// requiredLocation keyword
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredLocationConstraintSimple.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintMixedResult.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintMixedResult.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptorsMixedResult.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"],
				#[uriPrefix + "requiredHardwareResourceInstanceConstraintResultSizeGT3Bug.lp",
				  "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto",
				  uriPrefix + "requiredHardwareResourceInstanceConstraintResultSizeGT3Bug.allocation_specification",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0",
				  GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC"])
	}
}