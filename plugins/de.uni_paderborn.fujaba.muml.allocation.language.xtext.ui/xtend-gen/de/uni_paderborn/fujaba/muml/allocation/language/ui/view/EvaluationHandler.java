package de.uni_paderborn.fujaba.muml.allocation.language.ui.view;

import de.uni_paderborn.fujaba.muml.allocation.language.ui.view.AllocationSpecificationLanguageEvaluationView;
import de.uni_paderborn.fujaba.muml.allocation.language.ui.view.BaseHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class EvaluationHandler extends BaseHandler {
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    try {
      Object _xblockexpression = null;
      {
        IWorkbenchWindow _activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
        IWorkbenchPage _activePage = _activeWorkbenchWindow.getActivePage();
        IViewPart _showView = _activePage.showView(BaseHandler.viewID);
        final AllocationSpecificationLanguageEvaluationView view = ((AllocationSpecificationLanguageEvaluationView) _showView);
        view.evaluate();
        _xblockexpression = null;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
