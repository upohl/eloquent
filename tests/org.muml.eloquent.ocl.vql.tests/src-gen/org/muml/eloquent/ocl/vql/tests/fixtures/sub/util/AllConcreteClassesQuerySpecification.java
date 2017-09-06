/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/sub/other.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.sub.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.AllConcreteClassesMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.AllConcreteClassesMatcher;

/**
 * A pattern-specific query specification that can instantiate AllConcreteClassesMatcher in a type-safe way.
 * 
 * @see AllConcreteClassesMatcher
 * @see AllConcreteClassesMatch
 * 
 */
@SuppressWarnings("all")
public final class AllConcreteClassesQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllConcreteClassesMatcher> {
  private AllConcreteClassesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllConcreteClassesQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllConcreteClassesMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return AllConcreteClassesMatcher.on(engine);
  }
  
  @Override
  public AllConcreteClassesMatcher instantiate() throws ViatraQueryException {
    return AllConcreteClassesMatcher.create();
  }
  
  @Override
  public AllConcreteClassesMatch newEmptyMatch() {
    return AllConcreteClassesMatch.newEmptyMatch();
  }
  
  @Override
  public AllConcreteClassesMatch newMatch(final Object... parameters) {
    return AllConcreteClassesMatch.newMatch((org.eclipse.emf.ecore.EClass) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link AllConcreteClassesQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AllConcreteClassesQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AllConcreteClassesQuerySpecification INSTANCE = new AllConcreteClassesQuerySpecification();
    
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
    private final static AllConcreteClassesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCls = new PParameter("cls", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCls);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.muml.eloquent.ocl.vql.tests.fixtures.sub.allConcreteClasses";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("cls");
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
              PVariable var_cls = body.getOrCreateVariableByName("cls");
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_cls, parameter_pCls)
              ));
              // 	EClass.abstract(cls, false)
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new ConstantValue(body, var__virtual_0_, false);
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "abstract")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
              new Equality(body, var__virtual_1_, var__virtual_0_);
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
  
  private static boolean evaluateExpression_1_1() {
    return false;
  }
}
