package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.util.TestDataUtil;
import java.util.Collection;

@SuppressWarnings("all")
public abstract class QVToBasedAlgorithmTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.tests/fixtures/";
  
  public QVToBasedAlgorithmTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  protected static Collection<Object[]> getTestData(final String transformationURI) {
    return TestDataUtil.<Object>createTestData(2, 
      new Object[] { (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/simpleAllocation.allocation"), transformationURI, (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/simpleAllocation.allocation_specification"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/nonexistentAllocation.allocation"), transformationURI, (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/nonexistentAllocation.allocation_specification"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, 
      new Object[] { (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/sameLocationM3MeetingBug.allocation"), transformationURI, (QVToBasedAlgorithmTest.uriPrefix + "algorithmMain/sameLocationM3MeetingBug.allocation_specification"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (QVToBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") });
  }
}
