/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.muml.eloquent.ocl.vql.tests.fixtures.AllClassesMatch;

/**
 * A match processor tailored for the org.muml.eloquent.ocl.vql.tests.fixtures.allClasses pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AllClassesProcessor implements IMatchProcessor<AllClassesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCls the value of pattern parameter cls in the currently processed match
   * 
   */
  public abstract void process(final EClass pCls);
  
  @Override
  public void process(final AllClassesMatch match) {
    process(match.getCls());
  }
}
