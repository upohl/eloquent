package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.GeneralConstraint2ILPTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class ResourceConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/resourceConstraint/";
  
  public ResourceConstraint2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimple.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintEncodeSAT.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintEncodeSAT.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder2.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintTestOrder2.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptors.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (ResourceConstraint2ILPTest.uriPrefix + "resourceConstraintMultipleConstraintsAndDescriptorsOrder.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
