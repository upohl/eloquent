package org.muml.eloquent.ocl.vql.tests;

import static org.junit.Assert.assertTrue;

import java.net.URL;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(XtextRunner.class)
@InjectWith(InjectorProvider.class)
public class VQLEvaluationTestBase {
		
	protected URI getFixtureFile(String filename) {
		// inspired by org.eclipse.ocl.examples.pivot.tests.PivotTestCase.getProjectName()
		String path = getClass().getPackage().getName().replace(".", "/");
		String resourcePath = path + "/fixtures/" + filename;
		URL url = getClass().getClassLoader().getResource(resourcePath);
		if (url == null) {
			throw new IllegalArgumentException("unable to get file: " + filename);
		}
		return URI.createURI(url.toString());
	}
	
	@BeforeClass
	public static void initTestPackage() {
		// hmm here or in the InjectorProvider?
		CompleteOCLStandaloneSetup.init();
		EcorePackage.eINSTANCE.getClass();
	}
	
	protected void checkOCLFile(String oclFilename) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(getFixtureFile(oclFilename),
				true);
		assertTrue("resource has warnings", resource.getWarnings().isEmpty());
		assertTrue("resource has errors", resource.getErrors().isEmpty());
	}
	
	protected void check(String oclFilename, String modelFilename) {
		checkOCLFile(oclFilename);
		OCL ocl = OCL.newInstance();
		URI modelURI = getFixtureFile(modelFilename);
		Resource resource = ocl.getResourceSet().getResource(modelURI, true);
		EPackage pkg = (EPackage) resource.getContents().get(0);
		URI oclURI = getFixtureFile(oclFilename);
		CompleteOCLEObjectValidator validator = new CompleteOCLEObjectValidator(pkg,
				oclURI, ocl.getEnvironmentFactory());
		BasicDiagnostic diagnostic = Diagnostician.INSTANCE
				.createDefaultDiagnostic(pkg);
		validator.validate(pkg, diagnostic, null);
		assertTrue("no validation errors", diagnostic.getChildren().isEmpty());
	}
	
}
