package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class RequiredHardwareResourceInstance2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/requiredHardwareResourceInstanceConstraint/";
  
  public RequiredHardwareResourceInstance2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredLocationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintMixedResult.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintMixedResult.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptors.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintTwoDescriptorsMixedResult.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintMultipleConstraints.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintThreeDescriptors.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintResultSizeGT3Bug.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintResultSizeGT3Bug.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
