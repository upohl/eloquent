/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.eloquent.ocl.vql.tests.fixtures.AllClassesMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.AllPackagesMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.ClassesWithDataMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.PKG2NameMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.PackagesWithDataMatcher;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.AllClassesQuerySpecification;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.AllPackagesQuerySpecification;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.ClassesWithDataQuerySpecification;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PKG2NameQuerySpecification;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PackagesWithDataQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in test.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file test.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.muml.eloquent.ocl.vql.tests.fixtures, the group contains the definition of the following patterns: <ul>
 * <li>allPackages</li>
 * <li>PKG2Name</li>
 * <li>allClasses</li>
 * <li>classesWithData</li>
 * <li>packagesWithData</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Test extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Test instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Test();
    }
    return INSTANCE;
  }
  
  private static Test INSTANCE;
  
  private Test() throws ViatraQueryException {
    querySpecifications.add(AllPackagesQuerySpecification.instance());
    querySpecifications.add(PKG2NameQuerySpecification.instance());
    querySpecifications.add(AllClassesQuerySpecification.instance());
    querySpecifications.add(ClassesWithDataQuerySpecification.instance());
    querySpecifications.add(PackagesWithDataQuerySpecification.instance());
  }
  
  public AllPackagesQuerySpecification getAllPackages() throws ViatraQueryException {
    return AllPackagesQuerySpecification.instance();
  }
  
  public AllPackagesMatcher getAllPackages(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllPackagesMatcher.on(engine);
  }
  
  public PKG2NameQuerySpecification getPKG2Name() throws ViatraQueryException {
    return PKG2NameQuerySpecification.instance();
  }
  
  public PKG2NameMatcher getPKG2Name(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PKG2NameMatcher.on(engine);
  }
  
  public AllClassesQuerySpecification getAllClasses() throws ViatraQueryException {
    return AllClassesQuerySpecification.instance();
  }
  
  public AllClassesMatcher getAllClasses(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllClassesMatcher.on(engine);
  }
  
  public ClassesWithDataQuerySpecification getClassesWithData() throws ViatraQueryException {
    return ClassesWithDataQuerySpecification.instance();
  }
  
  public ClassesWithDataMatcher getClassesWithData(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ClassesWithDataMatcher.on(engine);
  }
  
  public PackagesWithDataQuerySpecification getPackagesWithData() throws ViatraQueryException {
    return PackagesWithDataQuerySpecification.instance();
  }
  
  public PackagesWithDataMatcher getPackagesWithData(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PackagesWithDataMatcher.on(engine);
  }
}
