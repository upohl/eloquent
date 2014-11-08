package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.GeneralConstraint2ILPTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class DifferentLocation2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/differentLocationConstraint/";
  
  public DifferentLocation2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (DifferentLocation2ILPTest.uriPrefix + "locationConstraintSimple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}