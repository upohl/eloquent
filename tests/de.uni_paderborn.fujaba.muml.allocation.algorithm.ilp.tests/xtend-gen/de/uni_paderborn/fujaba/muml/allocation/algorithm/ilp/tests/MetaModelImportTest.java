package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.util.TestDataUtil;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class MetaModelImportTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.tests/fixtures/metamodelImport/";
  
  public MetaModelImportTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (MetaModelImportTest.uriPrefix + "metamodelImport.lp"), "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (MetaModelImportTest.uriPrefix + "metamodelImport.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.3"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
