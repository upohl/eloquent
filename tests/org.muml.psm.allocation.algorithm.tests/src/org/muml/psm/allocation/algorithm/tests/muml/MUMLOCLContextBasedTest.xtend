package org.muml.psm.allocation.algorithm.tests.muml

import org.muml.pim.instance.ComponentInstanceConfiguration
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util
import org.muml.psm.allocation.algorithm.tests.qvto.QVToTransformationSingleOutExtentTest
import org.muml.psm.allocation.language.oclcontext.OCLContext
import org.muml.psm.allocation.language.oclcontext.OclcontextFactory

/**
 * Base class for MUML specific tests.
 */
class MUMLOCLContextBasedTest extends QVToTransformationSingleOutExtentTest {
	
	new(String expectedURI, String transformationURI, String aslURI, String cicURI, String hwpicURI) {
		super(expectedURI, transformationURI,
			createInParameters(aslURI, cicURI, hwpicURI)
		)
	}
	
	protected static def Object[] createInParameters(String aslURI, String cicURI, String hwpicURI) { 
		val OCLContext oclContext = OclcontextFactory.eINSTANCE.createOCLContext
		oclContext.componentInstanceConfiguration = Util.loadURI(
			cicURI
		) as ComponentInstanceConfiguration
		oclContext.hardwarePlatformInstanceConfiguration = Util.loadURI(
			hwpicURI
		) as HWPlatformInstanceConfiguration
		#[aslURI, oclContext]
	}
}