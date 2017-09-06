/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

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
import org.muml.eloquent.ocl.vql.tests.fixtures.ClassesWithDataMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.ClassesWithDataQuerySpecification;

/**
 * Generated pattern matcher API of the org.muml.eloquent.ocl.vql.tests.fixtures.classesWithData pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassesWithDataMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classesWithData(name : java String, isAbstract : java Boolean, cls : EClass) {
 * 	EClass.name(cls, name);
 * 	EClass.abstract(cls, isAbstract);
 * }
 * </pre></code>
 * 
 * @see ClassesWithDataMatch
 * @see ClassesWithDataProcessor
 * @see ClassesWithDataQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ClassesWithDataMatcher extends BaseMatcher<ClassesWithDataMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassesWithDataMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ClassesWithDataMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ClassesWithDataMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ClassesWithDataMatcher create() throws ViatraQueryException {
    return new ClassesWithDataMatcher();
  }
  
  private final static int POSITION_NAME = 0;
  
  private final static int POSITION_ISABSTRACT = 1;
  
  private final static int POSITION_CLS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ClassesWithDataMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ClassesWithDataMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return matches represented as a ClassesWithDataMatch object.
   * 
   */
  public Collection<ClassesWithDataMatch> getAllMatches(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return rawGetAllMatches(new Object[]{pName, pIsAbstract, pCls});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return a match represented as a ClassesWithDataMatch object, or null if no match is found.
   * 
   */
  public ClassesWithDataMatch getOneArbitraryMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return rawGetOneArbitraryMatch(new Object[]{pName, pIsAbstract, pCls});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return rawHasMatch(new Object[]{pName, pIsAbstract, pCls});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return rawCountMatches(new Object[]{pName, pIsAbstract, pCls});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pName, final Boolean pIsAbstract, final EClass pCls, final IMatchProcessor<? super ClassesWithDataMatch> processor) {
    rawForEachMatch(new Object[]{pName, pIsAbstract, pCls}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pName, final Boolean pIsAbstract, final EClass pCls, final IMatchProcessor<? super ClassesWithDataMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pName, pIsAbstract, pCls}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesWithDataMatch newMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return ClassesWithDataMatch.newMatch(pName, pIsAbstract, pCls);
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname() {
    return rawAccumulateAllValuesOfname(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final ClassesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final Boolean pIsAbstract, final EClass pCls) {
    return rawAccumulateAllValuesOfname(new Object[]{
    null, 
    pIsAbstract, 
    pCls
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for isAbstract.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Boolean> rawAccumulateAllValuesOfisAbstract(final Object[] parameters) {
    Set<Boolean> results = new HashSet<Boolean>();
    rawAccumulateAllValues(POSITION_ISABSTRACT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for isAbstract.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfisAbstract() {
    return rawAccumulateAllValuesOfisAbstract(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for isAbstract.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfisAbstract(final ClassesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfisAbstract(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for isAbstract.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Boolean> getAllValuesOfisAbstract(final String pName, final EClass pCls) {
    return rawAccumulateAllValuesOfisAbstract(new Object[]{
    pName, 
    null, 
    pCls
    });
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
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfcls(final ClassesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfcls(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfcls(final String pName, final Boolean pIsAbstract) {
    return rawAccumulateAllValuesOfcls(new Object[]{
    pName, 
    pIsAbstract, 
    null
    });
  }
  
  @Override
  protected ClassesWithDataMatch tupleToMatch(final Tuple t) {
    try {
        return ClassesWithDataMatch.newMatch((String) t.get(POSITION_NAME), (Boolean) t.get(POSITION_ISABSTRACT), (EClass) t.get(POSITION_CLS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ClassesWithDataMatch arrayToMatch(final Object[] match) {
    try {
        return ClassesWithDataMatch.newMatch((String) match[POSITION_NAME], (Boolean) match[POSITION_ISABSTRACT], (EClass) match[POSITION_CLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ClassesWithDataMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ClassesWithDataMatch.newMutableMatch((String) match[POSITION_NAME], (Boolean) match[POSITION_ISABSTRACT], (EClass) match[POSITION_CLS]);
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
  public static IQuerySpecification<ClassesWithDataMatcher> querySpecification() throws ViatraQueryException {
    return ClassesWithDataQuerySpecification.instance();
  }
}
