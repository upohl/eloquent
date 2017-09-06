/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.muml.eloquent.ocl.vql.tests.fixtures.PKG2NameMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PKG2NameQuerySpecification;

/**
 * Generated pattern matcher API of the org.muml.eloquent.ocl.vql.tests.fixtures.PKG2Name pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PKG2NameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern PKG2Name(pkg : EPackage, name : java String) {
 * 	EPackage.name(pkg, name);
 * }
 * </pre></code>
 * 
 * @see PKG2NameMatch
 * @see PKG2NameProcessor
 * @see PKG2NameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PKG2NameMatcher extends BaseMatcher<PKG2NameMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PKG2NameMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PKG2NameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (PKG2NameMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static PKG2NameMatcher create() throws ViatraQueryException {
    return new PKG2NameMatcher();
  }
  
  private final static int POSITION_PKG = 0;
  
  private final static int POSITION_NAME = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PKG2NameMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PKG2NameMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return matches represented as a PKG2NameMatch object.
   * 
   */
  public Collection<PKG2NameMatch> getAllMatches(final EPackage pPkg, final String pName) {
    return rawGetAllMatches(new Object[]{pPkg, pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return a match represented as a PKG2NameMatch object, or null if no match is found.
   * 
   */
  public PKG2NameMatch getOneArbitraryMatch(final EPackage pPkg, final String pName) {
    return rawGetOneArbitraryMatch(new Object[]{pPkg, pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EPackage pPkg, final String pName) {
    return rawHasMatch(new Object[]{pPkg, pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EPackage pPkg, final String pName) {
    return rawCountMatches(new Object[]{pPkg, pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EPackage pPkg, final String pName, final IMatchProcessor<? super PKG2NameMatch> processor) {
    rawForEachMatch(new Object[]{pPkg, pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EPackage pPkg, final String pName, final IMatchProcessor<? super PKG2NameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPkg, pName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PKG2NameMatch newMatch(final EPackage pPkg, final String pName) {
    return PKG2NameMatch.newMatch(pPkg, pName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for pkg.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<EPackage> rawAccumulateAllValuesOfpkg(final Object[] parameters) {
    Set<EPackage> results = new HashSet<EPackage>();
    rawAccumulateAllValues(POSITION_PKG, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for pkg.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPackage> getAllValuesOfpkg() {
    return rawAccumulateAllValuesOfpkg(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pkg.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPackage> getAllValuesOfpkg(final PKG2NameMatch partialMatch) {
    return rawAccumulateAllValuesOfpkg(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pkg.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPackage> getAllValuesOfpkg(final String pName) {
    return rawAccumulateAllValuesOfpkg(new Object[]{
    null, 
    pName
    });
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
  public Set<String> getAllValuesOfname(final PKG2NameMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final EPackage pPkg) {
    return rawAccumulateAllValuesOfname(new Object[]{
    pPkg, 
    null
    });
  }
  
  @Override
  protected PKG2NameMatch tupleToMatch(final Tuple t) {
    try {
        return PKG2NameMatch.newMatch((EPackage) t.get(POSITION_PKG), (String) t.get(POSITION_NAME));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PKG2NameMatch arrayToMatch(final Object[] match) {
    try {
        return PKG2NameMatch.newMatch((EPackage) match[POSITION_PKG], (String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PKG2NameMatch arrayToMatchMutable(final Object[] match) {
    try {
        return PKG2NameMatch.newMutableMatch((EPackage) match[POSITION_PKG], (String) match[POSITION_NAME]);
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
  public static IQuerySpecification<PKG2NameMatcher> querySpecification() throws ViatraQueryException {
    return PKG2NameQuerySpecification.instance();
  }
}
