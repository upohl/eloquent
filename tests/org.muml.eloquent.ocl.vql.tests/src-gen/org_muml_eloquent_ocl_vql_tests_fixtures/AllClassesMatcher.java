/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file1.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org_muml_eloquent_ocl_vql_tests_fixtures.AllClassesMatch;
import org_muml_eloquent_ocl_vql_tests_fixtures.util.AllClassesQuerySpecification;

/**
 * Generated pattern matcher API of the org_muml_eloquent_ocl_vql_tests_fixtures.allClasses pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllClassesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allClasses(cls : EClass) {
 * 	EClass(cls);
 * }
 * </pre></code>
 * 
 * @see AllClassesMatch
 * @see AllClassesProcessor
 * @see AllClassesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllClassesMatcher extends BaseMatcher<AllClassesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllClassesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AllClassesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AllClassesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AllClassesMatcher create() throws ViatraQueryException {
    return new AllClassesMatcher();
  }
  
  private final static int POSITION_CLS = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllClassesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AllClassesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return matches represented as a AllClassesMatch object.
   * 
   */
  public Collection<AllClassesMatch> getAllMatches(final EClass pCls) {
    return rawGetAllMatches(new Object[]{pCls});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return a match represented as a AllClassesMatch object, or null if no match is found.
   * 
   */
  public AllClassesMatch getOneArbitraryMatch(final EClass pCls) {
    return rawGetOneArbitraryMatch(new Object[]{pCls});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EClass pCls) {
    return rawHasMatch(new Object[]{pCls});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EClass pCls) {
    return rawCountMatches(new Object[]{pCls});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EClass pCls, final IMatchProcessor<? super AllClassesMatch> processor) {
    rawForEachMatch(new Object[]{pCls}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EClass pCls, final IMatchProcessor<? super AllClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCls}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllClassesMatch newMatch(final EClass pCls) {
    return AllClassesMatch.newMatch(pCls);
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EClass> rawAccumulateAllValuesOfcls(final Object[] parameters) {
    Set<EClass> results = new HashSet<EClass>();
    rawAccumulateAllValues(POSITION_CLS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfcls() {
    return rawAccumulateAllValuesOfcls(emptyArray());
  }
  
  @Override
  protected AllClassesMatch tupleToMatch(final Tuple t) {
    try {
        return AllClassesMatch.newMatch((EClass) t.get(POSITION_CLS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllClassesMatch arrayToMatch(final Object[] match) {
    try {
        return AllClassesMatch.newMatch((EClass) match[POSITION_CLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllClassesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AllClassesMatch.newMutableMatch((EClass) match[POSITION_CLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<AllClassesMatcher> querySpecification() throws ViatraQueryException {
    return AllClassesQuerySpecification.instance();
  }
}
