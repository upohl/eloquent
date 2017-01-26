package org.muml.psm.allocation.algorithm.ilp.opt4j.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.tests.muml.MUMLOCLContextBasedAlgorithmTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class Opt4JBasedAlgorithmTest extends MUMLOCLContextBasedAlgorithmTest {
  public Opt4JBasedAlgorithmTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return MUMLOCLContextBasedAlgorithmTest.getTestData(
      "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto");
  }
}
