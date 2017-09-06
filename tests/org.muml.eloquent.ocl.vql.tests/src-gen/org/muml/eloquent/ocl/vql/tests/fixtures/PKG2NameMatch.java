/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.PKG2NameQuerySpecification;

/**
 * Pattern-specific match representation of the org.muml.eloquent.ocl.vql.tests.fixtures.PKG2Name pattern,
 * to be used in conjunction with {@link PKG2NameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PKG2NameMatcher
 * @see PKG2NameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PKG2NameMatch extends BasePatternMatch {
  private EPackage fPkg;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("pkg", "name");
  
  private PKG2NameMatch(final EPackage pPkg, final String pName) {
    this.fPkg = pPkg;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("pkg".equals(parameterName)) return this.fPkg;
    if ("name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public EPackage getPkg() {
    return this.fPkg;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("pkg".equals(parameterName) ) {
        this.fPkg = (EPackage) newValue;
        return true;
    }
    if ("name".equals(parameterName) ) {
        this.fName = (String) newValue;
        return true;
    }
    return false;
  }
  
  public void setPkg(final EPackage pPkg) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPkg = pPkg;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "org.muml.eloquent.ocl.vql.tests.fixtures.PKG2Name";
  }
  
  @Override
  public List<String> parameterNames() {
    return PKG2NameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPkg, fName};
  }
  
  @Override
  public PKG2NameMatch toImmutable() {
    return isMutable() ? newMatch(fPkg, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"pkg\"=" + prettyPrintValue(fPkg) + ", ");
    
    result.append("\"name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPkg == null) ? 0 : fPkg.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof PKG2NameMatch)) { // this should be infrequent
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
    PKG2NameMatch other = (PKG2NameMatch) obj;
    if (fPkg == null) {if (other.fPkg != null) return false;}
    else if (!fPkg.equals(other.fPkg)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public PKG2NameQuerySpecification specification() {
    try {
        return PKG2NameQuerySpecification.instance();
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
  public static PKG2NameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPkg the fixed value of pattern parameter pkg, or null if not bound.
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PKG2NameMatch newMutableMatch(final EPackage pPkg, final String pName) {
    return new Mutable(pPkg, pName);
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
  public static PKG2NameMatch newMatch(final EPackage pPkg, final String pName) {
    return new Immutable(pPkg, pName);
  }
  
  private static final class Mutable extends PKG2NameMatch {
    Mutable(final EPackage pPkg, final String pName) {
      super(pPkg, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PKG2NameMatch {
    Immutable(final EPackage pPkg, final String pName) {
      super(pPkg, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
