package de.uni_paderborn.fujaba.muml.allocation.language.ui.view;

import de.uni_paderborn.fujaba.muml.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

@SuppressWarnings("all")
public class EvaluationContextWizard /* implements AbstractFujabaExportWizard  */{
  private /* AbstractFujabaExportSourcePage */Object cicSourcePage;
  
  private /* AbstractFujabaExportSourcePage */Object hpicSourcePage;
  
  private ComponentInstanceConfiguration cic;
  
  private HWPlatformInstanceConfiguration hpic;
  
  @Override
  public Object wizardCreateExportOperation() {
    throw new Error("Unresolved compilation problems:"
      + "\nIFujabaExportOperation cannot be resolved."
      + "\nThe method getStatus() of type new Object(){} must override a superclass method."
      + "\nThe method run(IProgressMonitor) of type new Object(){} must override a superclass method."
      + "\nsourceElements cannot be resolved"
      + "\nget cannot be resolved"
      + "\nsourceElements cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Override
  public Object addPages() {
    throw new Error("Unresolved compilation problems:"
      + "\nAbstractFujabaExportSourcePage cannot be resolved."
      + "\nThe method or field toolkit is undefined"
      + "\nThe method getResourceSet() is undefined"
      + "\nThe method or field initialSelection is undefined"
      + "\nThe method addPage(AbstractFujabaExportSourcePage) is undefined"
      + "\nAbstractFujabaExportSourcePage cannot be resolved."
      + "\nThe method or field toolkit is undefined"
      + "\nThe method getResourceSet() is undefined"
      + "\nThe method or field initialSelection is undefined"
      + "\nThe method addPage(AbstractFujabaExportSourcePage) is undefined"
      + "\nThe method or field ElementSelectionMode is undefined"
      + "\nThe method or field ElementSelectionMode is undefined"
      + "\nThe method wizardPageGetSourceFileExtension() of type new Object(){} must override a superclass method."
      + "\nThe method wizardPageGetSupportedSelectionMode() of type new Object(){} must override a superclass method."
      + "\nThe method wizardPageSupportsSourceModelElement(EObject) of type new Object(){} must override a superclass method."
      + "\nThe method wizardPageGetSourceFileExtension() of type new Object(){} must override a superclass method."
      + "\nThe method wizardPageGetSupportedSelectionMode() of type new Object(){} must override a superclass method."
      + "\nThe method wizardPageSupportsSourceModelElement(EObject) of type new Object(){} must override a superclass method."
      + "\nELEMENT_SELECTION_MODE_SINGLE cannot be resolved"
      + "\nELEMENT_SELECTION_MODE_SINGLE cannot be resolved");
  }
  
  @Override
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
