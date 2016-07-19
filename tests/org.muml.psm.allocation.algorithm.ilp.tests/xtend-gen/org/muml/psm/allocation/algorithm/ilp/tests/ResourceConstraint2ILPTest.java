package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class ResourceConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/resourceConstraint/";
  
  public ResourceConstraint2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "requiredResourceConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintEncodeSAT.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintEncodeSAT.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder2.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder2.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimpleDouble.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimpleDouble.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
