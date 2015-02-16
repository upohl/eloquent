package de.uni_paderborn.fujaba.muml.allocation.language.ui.view;

import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.pages.AbstractFujabaExportSourcePage;
import de.uni_paderborn.fujaba.export.pages.ElementSelectionMode;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

@SuppressWarnings("all")
public class EvaluationContextWizard extends AbstractFujabaExportWizard {
  private AbstractFujabaExportSourcePage cicSourcePage;
  
  private AbstractFujabaExportSourcePage hpicSourcePage;
  
  private ComponentInstanceConfiguration cic;
  
  private HWPlatformInstanceConfiguration hpic;
  
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
        public IStatus getStatus() {
          return Status.OK_STATUS;
        }
        
        public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        }
      };
    }
    return _xblockexpression;
  }
  
  public void addPages() {
    ResourceSet _resourceSet = this.getResourceSet();
    this.cicSourcePage = new AbstractFujabaExportSourcePage("CicSP", this.toolkit, _resourceSet, this.initialSelection) {
      /**
       * {
       * setTitle("Select Component Instance Configuration");
       * setDescription("Select Component Instance Configuration, whose component instances should be allocated");
       * }
       */
      public String wizardPageGetSourceFileExtension() {
        return "fujaba";
      }
      
      public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
        return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
      }
      
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
      public String wizardPageGetSourceFileExtension() {
        return "fujaba";
      }
      
      public ElementSelectionMode wizardPageGetSupportedSelectionMode() {
        return ElementSelectionMode.ELEMENT_SELECTION_MODE_SINGLE;
      }
      
      public boolean wizardPageSupportsSourceModelElement(final EObject element) {
        return (element instanceof HWPlatformInstanceConfiguration);
      }
    };
    this.addPage(this.hpicSourcePage);
  }
  
  public String wizardGetId() {
    return "de.uni_paderborn.fujaba.muml.allocation.language.ui.view.EvaluationContextWizard";
  }
  
  public ComponentInstanceConfiguration getComponentInstanceConfiguration() {
    return this.cic;
  }
  
  public HWPlatformInstanceConfiguration getHWPlatformInstanceConfiguration() {
    return this.hpic;
  }
}
