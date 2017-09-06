/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.util;

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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.muml.eloquent.ocl.vql.tests.fixtures.ClassesWithDataMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.ClassesWithDataMatcher;

/**
 * A pattern-specific query specification that can instantiate ClassesWithDataMatcher in a type-safe way.
 * 
 * @see ClassesWithDataMatcher
 * @see ClassesWithDataMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesWithDataQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassesWithDataMatcher> {
  private ClassesWithDataQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesWithDataQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassesWithDataMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ClassesWithDataMatcher.on(engine);
  }
  
  @Override
  public ClassesWithDataMatcher instantiate() throws ViatraQueryException {
    return ClassesWithDataMatcher.create();
  }
  
  @Override
  public ClassesWithDataMatch newEmptyMatch() {
    return ClassesWithDataMatch.newEmptyMatch();
  }
  
  @Override
  public ClassesWithDataMatch newMatch(final Object... parameters) {
    return ClassesWithDataMatch.newMatch((java.lang.String) parameters[0], (java.lang.Boolean) parameters[1], (org.eclipse.emf.ecore.EClass) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ClassesWithDataQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ClassesWithDataQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ClassesWithDataQuerySpecification INSTANCE = new ClassesWithDataQuerySpecification();
    
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
    private final static ClassesWithDataQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pIsAbstract = new PParameter("isAbstract", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCls = new PParameter("cls", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pName, parameter_pIsAbstract, parameter_pCls);
    
    @Override
    public String getFullyQualifiedName() {
      return "org.muml.eloquent.ocl.vql.tests.fixtures.classesWithData";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("name","isAbstract","cls");
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
              PVariable var_name = body.getOrCreateVariableByName("name");
              PVariable var_isAbstract = body.getOrCreateVariableByName("isAbstract");
              PVariable var_cls = body.getOrCreateVariableByName("cls");
              new TypeFilterConstraint(body, new FlatTuple(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
              new TypeFilterConstraint(body, new FlatTuple(var_isAbstract), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_name, parameter_pName),
                 new ExportedParameter(body, var_isAbstract, parameter_pIsAbstract),
                 new ExportedParameter(body, var_cls, parameter_pCls)
              ));
              // 	EClass.name(cls, name)
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "ENamedElement", "name")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
              new Equality(body, var__virtual_0_, var_name);
              // 	EClass.abstract(cls, isAbstract)
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, Tuples.flatTupleOf(var_cls, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "abstract")));
              new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
              new Equality(body, var__virtual_1_, var_isAbstract);
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
