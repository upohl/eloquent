package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class InfrastructureTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/infrastructure/";
  
  public InfrastructureTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (InfrastructureTest.uriPrefix + "My.ecore"), (InfrastructureTest.uriPrefix + "test.qvto"), (InfrastructureTest.uriPrefix + "My.ecore") }, 
      new Object[] { (InfrastructureTest.uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0"), (InfrastructureTest.uriPrefix + "test.qvto"), (InfrastructureTest.uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0") });
  }
}
