package org.muml.psm.allocation.algorithm.tests.muml;

import org.eclipse.emf.ecore.EObject;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest;
import org.muml.psm.allocation.language.oclcontext.OCLContext;
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory;

/**
 * Base class for MUML specific tests.
 */
@SuppressWarnings("all")
public class MUMLOCLContextBasedTest extends QVToTransformationSingleOutExtentTest {
  public MUMLOCLContextBasedTest(final String expectedURI, final String transformationURI, final String aslURI, final String cicURI, final String hwpicURI) {
    super(expectedURI, transformationURI, 
      MUMLOCLContextBasedTest.createInParameters(aslURI, cicURI, hwpicURI));
  }
  
  protected static Object[] createInParameters(final String aslURI, final String cicURI, final String hwpicURI) {
    Object[] _xblockexpression = null;
    {
      final OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext();
      EObject _loadURI = QVToTransformationRunner.Util.loadURI(cicURI);
      oclContext.setComponentInstanceConfiguration(((ComponentInstanceConfiguration) _loadURI));
      EObject _loadURI_1 = QVToTransformationRunner.Util.loadURI(hwpicURI);
      oclContext.setHardwarePlatformInstanceConfiguration(((HWPlatformInstanceConfiguration) _loadURI_1));
      _xblockexpression = new Object[] { aslURI, oclContext };
    }
    return _xblockexpression;
  }
}
