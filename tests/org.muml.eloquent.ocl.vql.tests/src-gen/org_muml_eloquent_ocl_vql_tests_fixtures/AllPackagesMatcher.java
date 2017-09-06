/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file2.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures;

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
import org_muml_eloquent_ocl_vql_tests_fixtures.AllPackagesMatch;
import org_muml_eloquent_ocl_vql_tests_fixtures.util.AllPackagesQuerySpecification;

/**
 * Generated pattern matcher API of the org_muml_eloquent_ocl_vql_tests_fixtures.allPackages pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllPackagesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allPackages(pkg : EPackage) {
 * 	EPackage(pkg);
 * }
 * </pre></code>
 * 
 * @see AllPackagesMatch
 * @see AllPackagesProcessor
 * @see AllPackagesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllPackagesMatcher extends BaseMatcher<AllPackagesMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllPackagesMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    AllPackagesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (AllPackagesMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static AllPackagesMatcher create() throws ViatraQueryException {
    return new AllPackagesMatcher();
  }
  
  private final static int POSITION_PKG = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllPackagesMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private AllPackagesMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return matches represented as a AllPackagesMatch object.
   * 
   */
  public Collection<AllPackagesMatch> getAllMatches(final EPackage pPkg) {
    return rawGetAllMatches(new Object[]{pPkg});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return a match represented as a AllPackagesMatch object, or null if no match is found.
   * 
   */
  public AllPackagesMatch getOneArbitraryMatch(final EPackage pPkg) {
    return rawGetOneArbitraryMatch(new Object[]{pPkg});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final EPackage pPkg) {
    return rawHasMatch(new Object[]{pPkg});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final EPackage pPkg) {
    return rawCountMatches(new Object[]{pPkg});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final EPackage pPkg, final IMatchProcessor<? super AllPackagesMatch> processor) {
    rawForEachMatch(new Object[]{pPkg}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final EPackage pPkg, final IMatchProcessor<? super AllPackagesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPkg}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllPackagesMatch newMatch(final EPackage pPkg) {
    return AllPackagesMatch.newMatch(pPkg);
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
  
  @Override
  protected AllPackagesMatch tupleToMatch(final Tuple t) {
    try {
        return AllPackagesMatch.newMatch((EPackage) t.get(POSITION_PKG));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllPackagesMatch arrayToMatch(final Object[] match) {
    try {
        return AllPackagesMatch.newMatch((EPackage) match[POSITION_PKG]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected AllPackagesMatch arrayToMatchMutable(final Object[] match) {
    try {
        return AllPackagesMatch.newMutableMatch((EPackage) match[POSITION_PKG]);
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
  public static IQuerySpecification<AllPackagesMatcher> querySpecification() throws ViatraQueryException {
    return AllPackagesQuerySpecification.instance();
  }
}
