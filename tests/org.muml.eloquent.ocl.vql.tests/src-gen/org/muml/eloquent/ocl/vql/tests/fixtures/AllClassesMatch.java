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
import org.muml.eloquent.ocl.vql.tests.fixtures.util.AllClassesQuerySpecification;

/**
 * Pattern-specific match representation of the org.muml.eloquent.ocl.vql.tests.fixtures.allClasses pattern,
 * to be used in conjunction with {@link AllClassesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllClassesMatcher
 * @see AllClassesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllClassesMatch extends BasePatternMatch {
  private EClass fCls;
  
  private static List<String> parameterNames = makeImmutableList("cls");
  
  private AllClassesMatch(final EClass pCls) {
    this.fCls = pCls;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("cls".equals(parameterName)) return this.fCls;
    return null;
  }
  
  public EClass getCls() {
    return this.fCls;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("cls".equals(parameterName) ) {
        this.fCls = (EClass) newValue;
        return true;
    }
    return false;
  }
  
  public void setCls(final EClass pCls) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCls = pCls;
  }
  
  @Override
  public String patternName() {
    return "org.muml.eloquent.ocl.vql.tests.fixtures.allClasses";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllClassesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCls};
  }
  
  @Override
  public AllClassesMatch toImmutable() {
    return isMutable() ? newMatch(fCls) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"cls\"=" + prettyPrintValue(fCls)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCls == null) ? 0 : fCls.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof AllClassesMatch)) { // this should be infrequent
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
    AllClassesMatch other = (AllClassesMatch) obj;
    if (fCls == null) {if (other.fCls != null) return false;}
    else if (!fCls.equals(other.fCls)) return false;
    return true;
  }
  
  @Override
  public AllClassesQuerySpecification specification() {
    try {
        return AllClassesQuerySpecification.instance();
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
  public static AllClassesMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllClassesMatch newMutableMatch(final EClass pCls) {
    return new Mutable(pCls);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCls the fixed value of pattern parameter cls, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllClassesMatch newMatch(final EClass pCls) {
    return new Immutable(pCls);
  }
  
  private static final class Mutable extends AllClassesMatch {
    Mutable(final EClass pCls) {
      super(pCls);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllClassesMatch {
    Immutable(final EClass pCls) {
      super(pCls);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
