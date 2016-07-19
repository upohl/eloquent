package org.muml.psm.allocation.algorithm.ilp.opt4j.tests;

import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToBasedAlgorithmTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class Opt4JBasedAlgorithmTest extends QVToBasedAlgorithmTest {
  public Opt4JBasedAlgorithmTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return QVToBasedAlgorithmTest.getTestData(
      "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto");
  }
}
