/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.util;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.muml.eloquent.ocl.vql.tests.fixtures.PKG2NameMatch;

/**
 * A match processor tailored for the org.muml.eloquent.ocl.vql.tests.fixtures.PKG2Name pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PKG2NameProcessor implements IMatchProcessor<PKG2NameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPkg the value of pattern parameter pkg in the currently processed match
   * @param pName the value of pattern parameter name in the currently processed match
   * 
   */
  public abstract void process(final EPackage pPkg, final String pName);
  
  @Override
  public void process(final PKG2NameMatch match) {
    process(match.getPkg(), match.getName());
  }
}
