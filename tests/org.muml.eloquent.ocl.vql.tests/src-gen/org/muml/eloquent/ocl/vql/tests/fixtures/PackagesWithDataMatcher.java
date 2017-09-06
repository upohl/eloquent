/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.muml.eloquent.ocl.vql.tests.fixtures.PackagesWithDataMatch;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PackagesWithDataQuerySpecification;

/**
 * Generated pattern matcher API of the org.muml.eloquent.ocl.vql.tests.fixtures.packagesWithData pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PackagesWithDataMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern packagesWithData(name : EString, pkg : EPackage, cls : EClass) {
 * 	EPackage.name(pkg, name);
 * 	EPackage.eClassifiers(pkg, cls);
 * 	find allClasses(cls);
 * }
 * </pre></code>
 * 
 * @see PackagesWithDataMatch
 * @see PackagesWithDataProcessor
 * @see PackagesWithDataQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PackagesWithDataMatcher extends BaseMatcher<PackagesWithDataMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PackagesWithDataMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    PackagesWithDataMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (PackagesWithDataMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static PackagesWithDataMatcher create() throws ViatraQueryException {
    return new PackagesWithDataMatcher();
  }
  
  private final static int POSITION_NAME = 0;
  
  private final static int POSITION_PKG = 1;
  
  private final static int POSITION_CLS = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PackagesWithDataMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private PackagesWithDataMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return matches represented as a PackagesWithDataMatch object.
   * 
   */
  public Collection<PackagesWithDataMatch> getAllMatches(final String pName, final EPackage pPkg, final EClass pCls) {
    return rawGetAllMatches(new Object[]{pName, pPkg, pCls});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return a match represented as a PackagesWithDataMatch object, or null if no match is found.
   * 
   */
  public PackagesWithDataMatch getOneArbitraryMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    return rawGetOneArbitraryMatch(new Object[]{pName, pPkg, pCls});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    return rawHasMatch(new Object[]{pName, pPkg, pCls});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pName, final EPackage pPkg, final EClass pCls) {
    return rawCountMatches(new Object[]{pName, pPkg, pCls});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pName, final EPackage pPkg, final EClass pCls, final IMatchProcessor<? super PackagesWithDataMatch> processor) {
    rawForEachMatch(new Object[]{pName, pPkg, pCls}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pName, final EPackage pPkg, final EClass pCls, final IMatchProcessor<? super PackagesWithDataMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pName, pPkg, pCls}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PackagesWithDataMatch newMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    return PackagesWithDataMatch.newMatch(pName, pPkg, pCls);
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
  public Set<String> getAllValuesOfname(final PackagesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfname(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for name.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfname(final EPackage pPkg, final EClass pCls) {
    return rawAccumulateAllValuesOfname(new Object[]{
    null, 
    pPkg, 
    pCls
    });
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
  public Set<EPackage> getAllValuesOfpkg(final PackagesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfpkg(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pkg.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EPackage> getAllValuesOfpkg(final String pName, final EClass pCls) {
    return rawAccumulateAllValuesOfpkg(new Object[]{
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
  public Set<EClass> getAllValuesOfcls(final PackagesWithDataMatch partialMatch) {
    return rawAccumulateAllValuesOfcls(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cls.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<EClass> getAllValuesOfcls(final String pName, final EPackage pPkg) {
    return rawAccumulateAllValuesOfcls(new Object[]{
    pName, 
    pPkg, 
    null
    });
  }
  
  @Override
  protected PackagesWithDataMatch tupleToMatch(final Tuple t) {
    try {
        return PackagesWithDataMatch.newMatch((String) t.get(POSITION_NAME), (EPackage) t.get(POSITION_PKG), (EClass) t.get(POSITION_CLS));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PackagesWithDataMatch arrayToMatch(final Object[] match) {
    try {
        return PackagesWithDataMatch.newMatch((String) match[POSITION_NAME], (EPackage) match[POSITION_PKG], (EClass) match[POSITION_CLS]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected PackagesWithDataMatch arrayToMatchMutable(final Object[] match) {
    try {
        return PackagesWithDataMatch.newMutableMatch((String) match[POSITION_NAME], (EPackage) match[POSITION_PKG], (EClass) match[POSITION_CLS]);
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
  public static IQuerySpecification<PackagesWithDataMatcher> querySpecification() throws ViatraQueryException {
    return PackagesWithDataQuerySpecification.instance();
  }
}
