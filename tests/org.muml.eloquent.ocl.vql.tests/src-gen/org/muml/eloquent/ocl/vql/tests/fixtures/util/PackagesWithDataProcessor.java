/**
 * Generated from platform:/resource/org.muml.eloquent.ocl.vql.tests/src/org/muml/eloquent/ocl/vql/tests/fixtures/test.vql
 */
package org.muml.eloquent.ocl.vql.tests.fixtures.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.muml.eloquent.ocl.vql.tests.fixtures.PackagesWithDataMatch;

/**
 * A match processor tailored for the org.muml.eloquent.ocl.vql.tests.fixtures.packagesWithData pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PackagesWithDataProcessor implements IMatchProcessor<PackagesWithDataMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pName the value of pattern parameter name in the currently processed match
   * @param pPkg the value of pattern parameter pkg in the currently processed match
   * @param pCls the value of pattern parameter cls in the currently processed match
   * 
   */
  public abstract void process(final String pName, final EPackage pPkg, final EClass pCls);
  
  @Override
  public void process(final PackagesWithDataMatch match) {
    process(match.getName(), match.getPkg(), match.getCls());
  }
}
