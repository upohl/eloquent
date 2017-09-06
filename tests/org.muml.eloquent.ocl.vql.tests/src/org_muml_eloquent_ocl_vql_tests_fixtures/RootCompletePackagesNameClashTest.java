package org_muml_eloquent_ocl_vql_tests_fixtures;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.muml.eloquent.ocl.vql.tests.VQLEvaluationTestBase;

public class RootCompletePackagesNameClashTest extends VQLEvaluationTestBase {
	
	private static final String projectName =
			"org.muml.eloquent.ocl.vql.tests";
	private static final String fixturesDir =
			"org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/";
	private static final String modelFile =
			"../org/muml/eloquent/ocl/vql/tests/fixtures/model.ecore";
	
	private boolean projectMapped = false;
	
	@Override
	protected URI getFixtureFile(String filename) {
		return URI.createPlatformResourceURI(fixturesDir + filename, true);
	}
	
	@Before
	public void mapProject() {
		/*
		 * Sigh... this is so hacky and not guaranteed to
		 * work - keep fingers crossed
		 */
		Map<String, URI> platformResourceMap = EcorePlugin
				.getPlatformResourceMap();
		if (!platformResourceMap.containsKey(projectName)) {
			String dir = System.getProperty("user.dir");
			if (dir != null) {
				platformResourceMap.put(projectName, URI.createFileURI(dir));
				projectMapped = true;
			}
		}
	}
	
	@After
	public void unmapProject() {
		if (projectMapped) {
			EcorePlugin.getPlatformResourceMap().remove(projectName);
		}
	}
	
	@Test
	public void rootCompletePackagesNameClash() {
		check("rootPkgNameClash.ocl", modelFile);
	}

}
