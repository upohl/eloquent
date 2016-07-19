package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.algorithm.tests.util.TestDataUtil;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class DifferentLocation2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/differentLocationConstraint/";
  
  public DifferentLocation2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "separateLocationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintStructuredTwoEmbedded.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "locationConstraintStructuredTwoEmbedded.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.4"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
