package org.muml.psm.allocation.language.xtext.ui.view;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.muml.core.export.operation.IFujabaExportOperation;
import org.muml.core.export.pages.AbstractFujabaExportSourcePage;
import org.muml.core.export.pages.ElementSelectionMode;
import org.muml.core.export.wizard.AbstractFujabaExportWizard;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;

@SuppressWarnings("all")
public class EvaluationContextWizard extends AbstractFujabaExportWizard {
  private AbstractFujabaExportSourcePage cicSourcePage;
  
  private AbstractFujabaExportSourcePage hpicSourcePage;
  
  private ComponentInstanceConfiguration cic;
  
  private HWPlatformInstanceConfiguration hpic;
  
  @Override
  public IFujabaExportOperation wizardCreateExportOperation() {
    IFujabaExportOperation _xblockexpression = null;
    {
      EObject[] _sourceElements = this.cicSourcePage.getSourceElements();
      EObject _get = _sourceElements[0];
      this.cic = ((ComponentInstanceConfiguration) _get);
      EObject[] _sourceElements_1 = this.hpicSourcePage.getSourceElements();
      EObject _get_1 = _sourceElements_1[0];
      this.hpic = ((HWPlatformInstanceConfiguration) _get_1);
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
    this.cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", this.toolkit, _resourceSet, this.initialSelection) {
      /**
       * {
       * setTitle("Select Component Instance Configuration");
       * setDescription("Select Component Instance Configuration, whose component instances should be allocated");
       * }
       */
      @Override
      public String wizardPageGetSourceFileExtension() {
        return "muml";
      }
      
      @Override
      public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
        return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
      }
      
      @Override
      public boolean wizardPageSupportsSourceModelElement(final EObject element) {
        return (element instanceof ComponentInstanceConfiguration);
      }
    };
    this.addPage(this.cicSourcePage);
    ResourceSet _resourceSet_1 = this.getResourceSet();
    this.hpicSourcePage = new AbstractFujabaExportSourcePage("HpicSP", this.toolkit, _resourceSet_1, this.initialSelection) {
      /**
       * {
       * setTitle("Select HW Platform Instance Configuration");
       * setDescription("The HW Platform Instance Configuration provides the ECUs");
       * }
       */
      @Override
      public String wizardPageGetSourceFileExtension() {
        return "muml";
      }
      
      @Override
      public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
        return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
      }
      
      @Override
      public boolean wizardPageSupportsSourceModelElement(final EObject element) {
        return (element instanceof HWPlatformInstanceConfiguration);
      }
    };
    this.addPage(this.hpicSourcePage);
  }
  
  @Override
  public String wizardGetId() {
    return "org.muml.psm.allocation.language.ui.view.EvaluationContextWizard";
  }
  
  public ComponentInstanceConfiguration getComponentInstanceConfiguration() {
    return this.cic;
  }
  
  public HWPlatformInstanceConfiguration getHWPlatformInstanceConfiguration() {
    return this.hpic;
  }
}
