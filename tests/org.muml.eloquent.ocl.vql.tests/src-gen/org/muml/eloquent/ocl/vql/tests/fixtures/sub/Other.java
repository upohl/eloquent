/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/sub/other.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.sub;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.AllConcreteClassesMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.util.AllConcreteClassesQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in other.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file other.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.muml.eloquent.ocl.vql.tests.fixtures.sub, the group contains the definition of the following patterns: <ul>
 * <li>allConcreteClasses</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Other extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Other instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Other();
    }
    return INSTANCE;
  }
  
  private static Other INSTANCE;
  
  private Other() throws ViatraQueryException {
    querySpecifications.add(AllConcreteClassesQuerySpecification.instance());
  }
  
  public AllConcreteClassesQuerySpecification getAllConcreteClasses() throws ViatraQueryException {
    return AllConcreteClassesQuerySpecification.instance();
  }
  
  public AllConcreteClassesMatcher getAllConcreteClasses(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllConcreteClassesMatcher.on(engine);
  }
}
