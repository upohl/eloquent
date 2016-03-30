package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.tests;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.tests.qvto.QVToBasedAlgorithmTest;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class Opt4JBasedAlgorithmTest extends QVToBasedAlgorithmTest {
  public Opt4JBasedAlgorithmTest(final String expectedURI, final String transformationURI, final String... inputObjectURIs) {
    super(expectedURI, transformationURI, inputObjectURIs);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return QVToBasedAlgorithmTest.getTestData(
      "platform:/plugin/de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto");
  }
}
