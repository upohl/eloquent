package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class GeneralConstraint2ILPTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/generalConstraint/";
  
  public GeneralConstraint2ILPTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simple.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleStructured.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.1"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleNestedStructured.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.2"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (GeneralConstraint2ILPTest.uriPrefix + "simpleMultiplePlatformInstances.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/Specification2ILP.qvto", (GeneralConstraint2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0") });
  }
}
