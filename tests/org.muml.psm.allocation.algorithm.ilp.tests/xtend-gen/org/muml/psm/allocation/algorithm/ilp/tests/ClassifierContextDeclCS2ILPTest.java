package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.ilp.tests.GeneralConstraint2ILPTest;
import org.muml.psm.allocation.algorithm.ilp.tests.MUMLOCLContextBasedTest;
import org.muml.psm.allocation.algorithm.ilp.tests.RequiredHardwareResourceInstance2ILPTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class ClassifierContextDeclCS2ILPTest extends MUMLOCLContextBasedTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/classifierContextDeclCS/";
  
  public ClassifierContextDeclCS2ILPTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, aslURI, cicURI, hwpicURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ClassifierContextDeclCS2ILPTest.uriPrefix + "simple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (RequiredHardwareResourceInstance2ILPTest.uriPrefix + "requiredHardwareResourceInstanceConstraintSimple.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ClassifierContextDeclCS2ILPTest.uriPrefix + "oclcontextSimple.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }, new Object[] { (ClassifierContextDeclCS2ILPTest.uriPrefix + "oclcontextDifferentLocation.lp"), "platform:/plugin/org.muml.psm.allocation.algorithm.ilp/transforms/Specification2ILP.qvto", (ClassifierContextDeclCS2ILPTest.uriPrefix + "oclcontextDifferentLocation.allocation_specification"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.1/@modelElements.0"), (GeneralConstraint2ILPTest.modelsDirectory + "simple.fujaba#//@categories.8/@modelElements.0/@hwplatformInstances.0/@embeddedHPIC") }));
  }
}
