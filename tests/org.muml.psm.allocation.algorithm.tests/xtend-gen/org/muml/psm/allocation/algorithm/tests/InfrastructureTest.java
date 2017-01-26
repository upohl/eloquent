package org.muml.psm.allocation.algorithm.tests;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;

@RunWith(value = Parameterized.class)
@SuppressWarnings("all")
public class InfrastructureTest extends QVToTransformationSingleOutExtentTest {
  public final static String uriPrefix = "platform:/plugin/org.muml.psm.allocation.algorithm.tests/fixtures/infrastructure/";
  
  public InfrastructureTest(final String expectedURI, final String transformationURI, final String inputURI) {
    super(expectedURI, transformationURI, inputURI);
  }
  
  @Parameterized.Parameters
  public static Collection<Object[]> getTestData() {
    return Collections.<Object[]>unmodifiableList(CollectionLiterals.<Object[]>newArrayList(new Object[] { (InfrastructureTest.uriPrefix + "My.ecore"), (InfrastructureTest.uriPrefix + "test.qvto"), (InfrastructureTest.uriPrefix + "My.ecore") }, new Object[] { (InfrastructureTest.uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0"), (InfrastructureTest.uriPrefix + "test.qvto"), (InfrastructureTest.uriPrefix + "NestedEPackage.ecore#//@eSubpackages.0") }));
  }
}
