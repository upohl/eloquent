/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PackagesWithDataQuerySpecification;

/**
 * Pattern-specific match representation of the org.muml.eloquent.ocl.vql.tests.fixtures.packagesWithData pattern,
 * to be used in conjunction with {@link PackagesWithDataMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PackagesWithDataMatcher
 * @see PackagesWithDataProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PackagesWithDataMatch extends BasePatternMatch {
  private String fName;
  
  private EPackage fPkg;
  
  private EClass fCls;
  
  private static List<String> parameterNames = makeImmutableList("name", "pkg", "cls");
  
  private PackagesWithDataMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    this.fName = pName;
    this.fPkg = pPkg;
    this.fCls = pCls;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("name".equals(parameterName)) return this.fName;
    if ("pkg".equals(parameterName)) return this.fPkg;
    if ("cls".equals(parameterName)) return this.fCls;
    return null;
  }
  
  public String getName() {
    return this.fName;
  }
  
  public EPackage getPkg() {
    return this.fPkg;
  }
  
  public EClass getCls() {
    return this.fCls;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("name".equals(parameterName) ) {
        this.fName = (String) newValue;
        return true;
    }
    if ("pkg".equals(parameterName) ) {
        this.fPkg = (EPackage) newValue;
        return true;
    }
    if ("cls".equals(parameterName) ) {
        this.fCls = (EClass) newValue;
        return true;
    }
    return false;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  public void setPkg(final EPackage pPkg) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPkg = pPkg;
  }
  
  public void setCls(final EClass pCls) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCls = pCls;
  }
  
  @Override
  public String patternName() {
    return "org.muml.eloquent.ocl.vql.tests.fixtures.packagesWithData";
  }
  
  @Override
  public List<String> parameterNames() {
    return PackagesWithDataMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fName, fPkg, fCls};
  }
  
  @Override
  public PackagesWithDataMatch toImmutable() {
    return isMutable() ? newMatch(fName, fPkg, fCls) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
    
    result.append("\"pkg\"=" + prettyPrintValue(fPkg) + ", ");
    
    result.append("\"cls\"=" + prettyPrintValue(fCls)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    result = prime * result + ((fPkg == null) ? 0 : fPkg.hashCode());
    result = prime * result + ((fCls == null) ? 0 : fCls.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof PackagesWithDataMatch)) { // this should be infrequent
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
    PackagesWithDataMatch other = (PackagesWithDataMatch) obj;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    if (fPkg == null) {if (other.fPkg != null) return false;}
    else if (!fPkg.equals(other.fPkg)) return false;
    if (fCls == null) {if (other.fCls != null) return false;}
    else if (!fCls.equals(other.fCls)) return false;
    return true;
  }
  
  @Override
  public PackagesWithDataQuerySpecification specification() {
    try {
        return PackagesWithDataQuerySpecification.instance();
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
  public static PackagesWithDataMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PackagesWithDataMatch newMutableMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    return new Mutable(pName, pPkg, pCls);
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
  public static PackagesWithDataMatch newMatch(final String pName, final EPackage pPkg, final EClass pCls) {
    return new Immutable(pName, pPkg, pCls);
  }
  
  private static final class Mutable extends PackagesWithDataMatch {
    Mutable(final String pName, final EPackage pPkg, final EClass pCls) {
      super(pName, pPkg, pCls);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PackagesWithDataMatch {
    Immutable(final String pName, final EPackage pPkg, final EClass pCls) {
      super(pName, pPkg, pCls);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
