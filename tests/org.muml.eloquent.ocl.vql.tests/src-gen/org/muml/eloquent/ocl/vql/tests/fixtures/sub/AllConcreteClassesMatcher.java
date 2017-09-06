/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/sub/other.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.sub;

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
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.AllConcreteClassesMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.sub.util.AllConcreteClassesQuerySpecification;

/**
 * Generated pattern matcher API of the org.muml.eloquent.ocl.vql.tests.fixtures.sub.allConcreteClasses pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllConcreteClassesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allConcreteClasses(cls : EClass) {
 * 	EClass.abstract(cls, false);
 * }
 * </pre></code>
 * 
 * @see AllConcreteClassesMatch
 * @see AllConcreteClassesProcessor
 * @see AllConcreteClassesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllConcreteClassesMatcher extends BaseMatcher<AllConcreteClassesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllConcreteClassesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AllConcreteClassesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AllConcreteClassesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AllConcreteClassesMatcher create() throws ViatraQueryException {
    return new AllConcreteClassesMatcher();
  }
  
  private final static int POSITION_CLS = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllConcreteClassesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AllConcreteClassesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return matches represented as a AllConcreteClassesMatch object.
   * 
   */
  public Collection<AllConcreteClassesMatch> getAllMatches(final EClass pCls) {
    return rawGetAllMatches(new Object[]{pCls});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return a match represented as a AllConcreteClassesMatch object, or null if no match is found.
   * 
   */
  public AllConcreteClassesMatch getOneArbitraryMatch(final EClass pCls) {
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
  public void forEachMatch(final EClass pCls, final IMatchProcessor<? super AllConcreteClassesMatch> processor) {
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
  public boolean forOneArbitraryMatch(final EClass pCls, final IMatchProcessor<? super AllConcreteClassesMatch> processor) {
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
  public AllConcreteClassesMatch newMatch(final EClass pCls) {
    return AllConcreteClassesMatch.newMatch(pCls);
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
  protected AllConcreteClassesMatch tupleToMatch(final Tuple t) {
    try {
        return AllConcreteClassesMatch.newMatch((EClass) t.get(POSITION_CLS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllConcreteClassesMatch arrayToMatch(final Object[] match) {
    try {
        return AllConcreteClassesMatch.newMatch((EClass) match[POSITION_CLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllConcreteClassesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AllConcreteClassesMatch.newMutableMatch((EClass) match[POSITION_CLS]);
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
  public static IQuerySpecification<AllConcreteClassesMatcher> querySpecification() throws ViatraQueryException {
    return AllConcreteClassesQuerySpecification.instance();
  }
}
