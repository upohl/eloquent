package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.GeneralConstraint2ILPTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class AlgorithmMainTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/algorithmMain/";
  
  public AlgorithmMainTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (AlgorithmMainTest.uriPrefix + "simpleAllocation.allocation"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/AlgorithmMain.qvto", (AlgorithmMainTest.uriPrefix + "simpleAllocation.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (AlgorithmMainTest.uriPrefix + "nonexistentAllocation.allocation"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/AlgorithmMain.qvto", (AlgorithmMainTest.uriPrefix + "nonexistentAllocation.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (AlgorithmMainTest.uriPrefix + "sameLocationM3MeetingBug.allocation"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm/transforms/AlgorithmMain.qvto", (AlgorithmMainTest.uriPrefix + "sameLocationM3MeetingBug.allocation_specification"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.uriPrefix + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}