/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file2.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllPackagesMatcher;
import org_muml_eloquent_ocl_vql_tests_fixtures.util.AllPackagesQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in file2.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file file2.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org_muml_eloquent_ocl_vql_tests_fixtures, the group contains the definition of the following patterns: <ul>
 * <li>allPackages</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class File2 extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static File2 instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new File2();
    }
    return INSTANCE;
  }
  
  private static File2 INSTANCE;
  
  private File2() throws ViatraQueryException {
    querySpecifications.add(AllPackagesQuerySpecification.instance());
  }
  
  public AllPackagesQuerySpecification getAllPackages() throws ViatraQueryException {
    return AllPackagesQuerySpecification.instance();
  }
  
  public AllPackagesMatcher getAllPackages(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllPackagesMatcher.on(engine);
  }
}
