/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file1.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllClassesMatcher;
import org_muml_eloquent_ocl_vql_tests_fixtures.util.AllClassesQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in file1.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file file1.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org_muml_eloquent_ocl_vql_tests_fixtures, the group contains the definition of the following patterns: <ul>
 * <li>allClasses</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class File1 extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static File1 instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new File1();
    }
    return INSTANCE;
  }
  
  private static File1 INSTANCE;
  
  private File1() throws ViatraQueryException {
    querySpecifications.add(AllClassesQuerySpecification.instance());
  }
  
  public AllClassesQuerySpecification getAllClasses() throws ViatraQueryException {
    return AllClassesQuerySpecification.instance();
  }
  
  public AllClassesMatcher getAllClasses(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllClassesMatcher.on(engine);
  }
}
