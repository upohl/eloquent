/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org_muml_eloquent_ocl_vql_tests_fixtures/file2.vql
 */
package org_muml_eloquent_ocl_vql_tests_fixtures;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org_muml_eloquent_ocl_vql_tests_fixtures.util.AllPackagesQuerySpecification;

/**
 * Pattern-specific match representation of the org_muml_eloquent_ocl_vql_tests_fixtures.allPackages pattern,
 * to be used in conjunction with {@link AllPackagesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllPackagesMatcher
 * @see AllPackagesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllPackagesMatch extends BasePatternMatch {
  private EPackage fPkg;
  
  private static List<String> parameterNames = makeImmutableList("pkg");
  
  private AllPackagesMatch(final EPackage pPkg) {
    this.fPkg = pPkg;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("pkg".equals(parameterName)) return this.fPkg;
    return null;
  }
  
  public EPackage getPkg() {
    return this.fPkg;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("pkg".equals(parameterName) ) {
        this.fPkg = (EPackage) newValue;
        return true;
    }
    return false;
  }
  
  public void setPkg(final EPackage pPkg) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPkg = pPkg;
  }
  
  @Override
  public String patternName() {
    return "org_muml_eloquent_ocl_vql_tests_fixtures.allPackages";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllPackagesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPkg};
  }
  
  @Override
  public AllPackagesMatch toImmutable() {
    return isMutable() ? newMatch(fPkg) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"pkg\"=" + prettyPrintValue(fPkg)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPkg == null) ? 0 : fPkg.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof AllPackagesMatch)) { // this should be infrequent
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        if (!specification().equals(otherSig.specification()))
            return false;
        return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    AllPackagesMatch other = (AllPackagesMatch) obj;
    if (fPkg == null) {if (other.fPkg != null) return false;}
    else if (!fPkg.equals(other.fPkg)) return false;
    return true;
  }
  
  @Override
  public AllPackagesQuerySpecification specification() {
    try {
        return AllPackagesQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static AllPackagesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllPackagesMatch newMutableMatch(final EPackage pPkg) {
    return new Mutable(pPkg);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllPackagesMatch newMatch(final EPackage pPkg) {
    return new Immutable(pPkg);
  }
  
  private static final class Mutable extends AllPackagesMatch {
    Mutable(final EPackage pPkg) {
      super(pPkg);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllPackagesMatch {
    Immutable(final EPackage pPkg) {
      super(pPkg);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
