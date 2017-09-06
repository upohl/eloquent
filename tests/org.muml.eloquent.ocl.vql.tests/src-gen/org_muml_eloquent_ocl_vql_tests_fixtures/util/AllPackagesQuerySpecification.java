/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file2.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllPackagesMatch;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllPackagesMatcher;

/**
 * A pattern-specific query specification that can instantiate AllPackagesMatcher in a type-safe way.
 * 
 * @see AllPackagesMatcher
 * @see AllPackagesMatch
 * 
 */
@SuppressWarnings("all")
public final class AllPackagesQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllPackagesMatcher> {
  private AllPackagesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllPackagesQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllPackagesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllPackagesMatcher.on(engine);
  }
  
  @Override
  public AllPackagesMatcher instantiate() throws ViatraQueryException {
    return AllPackagesMatcher.create();
  }
  
  @Override
  public AllPackagesMatch newEmptyMatch() {
    return AllPackagesMatch.newEmptyMatch();
  }
  
  @Override
  public AllPackagesMatch newMatch(final Object... parameters) {
    return AllPackagesMatch.newMatch((org.eclipse.emf.ecore.EPackage) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AllPackagesQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllPackagesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AllPackagesQuerySpecification INSTANCE = new AllPackagesQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllPackagesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPkg = new PParameter("pkg", "org.eclipse.emf.ecore.EPackage", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EPackage")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPkg);
    
    @Override
    public String getFullyQualifiedName() {
      return "org_muml_eloquent_ocl_vql_tests_fixtures.allPackages";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("pkg");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_pkg = body.getOrCreateVariableByName("pkg");
              new TypeConstraint(body, Tuples.flatTupleOf(var_pkg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_pkg, parameter_pPkg)
              ));
              // 	EPackage(pkg)
              new TypeConstraint(body, Tuples.flatTupleOf(var_pkg), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
              bodies.add(body);
          }
          // to silence compiler error
          if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
