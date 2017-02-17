package org.muml.psm.allocation.language.xtext.ui.view;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.psm.allocation.algorithm.ui.wizard.AllocationWizard;
import org.muml.psm.allocation.algorithm.ui.wizard.ExtensionUtil;
import org.muml.psm.allocation.algorithm.ui.wizard.IOCLContextSelectionProvider;

@SuppressWarnings("all")
public class EvaluationContextWizard extends AbstractFujabaExportWizard {
  private EObject oclContext;
  
  private IOCLContextSelectionProvider oclContextSelectionProvider;
  
  @Override
  public void init(final IWorkbench workbench, final IStructuredSelection currentSelection) {
    super.init(workbench, currentSelection);
    IOCLContextSelectionProvider _elvis = null;
    IOCLContextSelectionProvider _oCLContextSelectionProvider = ExtensionUtil.getOCLContextSelectionProvider(currentSelection);
    if (_oCLContextSelectionProvider != null) {
      _elvis = _oCLContextSelectionProvider;
    } else {
      AllocationWizard.DefaultOCLContextSelectionProvider _defaultOCLContextSelectionProvider = new AllocationWizard.DefaultOCLContextSelectionProvider();
      _elvis = _defaultOCLContextSelectionProvider;
    }
    this.oclContextSelectionProvider = _elvis;
  }
  
  @Override
  public IFujabaExportOperation wizardCreateExportOperation() {
    IFujabaExportOperation _xblockexpression = null;
    {
      EObject _oCLContext = this.oclContextSelectionProvider.getOCLContext();
      this.oclContext = _oCLContext;
      _xblockexpression = new IFujabaExportOperation() {
        @Override
        public IStatus getStatus() {
          return Status.OK_STATUS;
        }
        
        @Override
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        }
      };
    }
    return _xblockexpression;
  }
  
  @Override
  public void addPages() {
    ResourceSet _resourceSet = this.getResourceSet();
    List<IWizardPage> _wizardPages = this.oclContextSelectionProvider.getWizardPages(
      IOCLContextSelectionProvider.PageContext.AllocationView, this.toolkit, _resourceSet, this.initialSelection);
    final Consumer<IWizardPage> _function = new Consumer<IWizardPage>() {
      @Override
      public void accept(final IWizardPage page) {
        EvaluationContextWizard.this.addPage(page);
      }
    };
    _wizardPages.forEach(_function);
  }
  
  @Override
  public String wizardGetId() {
    return "org.muml.psm.allocation.language.ui.view.EvaluationContextWizard";
  }
  
  public EObject getOclContext() {
    return this.oclContext;
  }
}
