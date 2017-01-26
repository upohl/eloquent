package org.muml.psm.allocation.algorithm.tests.muml;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.muml.psm.allocation.algorithm.tests.muml.MUMLOCLContextBasedTest;

@SuppressWarnings("all")
public abstract class MUMLOCLContextBasedAlgorithmTest extends MUMLOCLContextBasedTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/";
  
  public MUMLOCLContextBasedAlgorithmTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  protected static Collection<Object[]> getTestData(final String transformationURI) {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/simpleAllocation.allocation"), transformationURI, (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/simpleAllocation.allocation_specification"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/nonexistentAllocation.allocation"), transformationURI, (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/nonexistentAllocation.allocation_specification"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/sameLocationM3MeetingBug.allocation"), transformationURI, (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "algorithmMain/sameLocationM3MeetingBug.allocation_specification"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.1/@modelElements.0"), (MUMLOCLContextBasedAlgorithmTest.uriPrefix + "models/simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }));
  }
}
