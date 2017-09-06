/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.muml.eloquent.ocl.vql.tests.fixtures.util.ClassesWithDataQuerySpecification;

/**
 * Pattern-specific match representation of the org.muml.eloquent.ocl.vql.tests.fixtures.classesWithData pattern,
 * to be used in conjunction with {@link ClassesWithDataMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesWithDataMatcher
 * @see ClassesWithDataProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesWithDataMatch extends BasePatternMatch {
  private String fName;
  
  private Boolean fIsAbstract;
  
  private EClass fCls;
  
  private static List<String> parameterNames = makeImmutableList("name", "isAbstract", "cls");
  
  private ClassesWithDataMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    this.fName = pName;
    this.fIsAbstract = pIsAbstract;
    this.fCls = pCls;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("name".equals(parameterName)) return this.fName;
    if ("isAbstract".equals(parameterName)) return this.fIsAbstract;
    if ("cls".equals(parameterName)) return this.fCls;
    return null;
  }
  
  public String getName() {
    return this.fName;
  }
  
  public Boolean getIsAbstract() {
    return this.fIsAbstract;
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
    if ("isAbstract".equals(parameterName) ) {
        this.fIsAbstract = (Boolean) newValue;
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
  
  public void setIsAbstract(final Boolean pIsAbstract) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fIsAbstract = pIsAbstract;
  }
  
  public void setCls(final EClass pCls) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCls = pCls;
  }
  
  @Override
  public String patternName() {
    return "org.muml.eloquent.ocl.vql.tests.fixtures.classesWithData";
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassesWithDataMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fName, fIsAbstract, fCls};
  }
  
  @Override
  public ClassesWithDataMatch toImmutable() {
    return isMutable() ? newMatch(fName, fIsAbstract, fCls) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
    
    result.append("\"isAbstract\"=" + prettyPrintValue(fIsAbstract) + ", ");
    
    result.append("\"cls\"=" + prettyPrintValue(fCls)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    result = prime * result + ((fIsAbstract == null) ? 0 : fIsAbstract.hashCode());
    result = prime * result + ((fCls == null) ? 0 : fCls.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof ClassesWithDataMatch)) { // this should be infrequent
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
    ClassesWithDataMatch other = (ClassesWithDataMatch) obj;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    if (fIsAbstract == null) {if (other.fIsAbstract != null) return false;}
    else if (!fIsAbstract.equals(other.fIsAbstract)) return false;
    if (fCls == null) {if (other.fCls != null) return false;}
    else if (!fCls.equals(other.fCls)) return false;
    return true;
  }
  
  @Override
  public ClassesWithDataQuerySpecification specification() {
    try {
        return ClassesWithDataQuerySpecification.instance();
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
  public static ClassesWithDataMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pName the fixed value of pattern parameter name, or null if not bound.
   * @param pIsAbstract the fixed value of pattern parameter isAbstract, or null if not bound.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClassesWithDataMatch newMutableMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return new Mutable(pName, pIsAbstract, pCls);
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
  public static ClassesWithDataMatch newMatch(final String pName, final Boolean pIsAbstract, final EClass pCls) {
    return new Immutable(pName, pIsAbstract, pCls);
  }
  
  private static final class Mutable extends ClassesWithDataMatch {
    Mutable(final String pName, final Boolean pIsAbstract, final EClass pCls) {
      super(pName, pIsAbstract, pCls);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClassesWithDataMatch {
    Immutable(final String pName, final Boolean pIsAbstract, final EClass pCls) {
      super(pName, pIsAbstract, pCls);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
