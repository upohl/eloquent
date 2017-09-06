/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file2.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures.util;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllPackagesMatch;

/**
 * A match processor tailored for the org_muml_eloquent_ocl_vql_tests_fixtures.allPackages pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllPackagesProcessor implements IMatchProcessor<AllPackagesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPkg the value of pattern parameter pkg in the currently processed match
   * 
   */
  public abstract void process(final EPackage pPkg);
  
  @Override
  public void process(final AllPackagesMatch match) {
    process(match.getPkg());
  }
}
