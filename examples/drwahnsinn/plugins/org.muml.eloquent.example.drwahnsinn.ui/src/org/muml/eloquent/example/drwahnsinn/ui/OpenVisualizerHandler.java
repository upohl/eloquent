package org.muml.eloquent.example.drwahnsinn.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

public class OpenVisualizerHandler extends AbstractHandler {
	private static final String TITLE = "Dr. Wahnsinn Visualizer";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// what about == null checks?
		Shell shell = new Shell(HandlerUtil.getActiveShell(event));
		Display display = shell.getDisplay();
		shell.setLayout(new FillLayout());
		shell.setText(TITLE);
		FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
		Scene scene = Visualizer.createScene(getModelURI(event));
		canvas.setScene(scene);
		shell.open();
		while (!shell.isDisposed()) {
			if (display.readAndDispatch()) {
				display.sleep();
			}
        }
		if (!display.isDisposed()) {
			display.update();
		}
		return null;
	}
	
	private static URI getModelURI(ExecutionEvent event) {
		IStructuredSelection ssel = HandlerUtil.getCurrentStructuredSelection(event);
		IFile file = Adapters.adapt(ssel.getFirstElement(), IFile.class);
		if (file == null) {
			return null;
		}
		return URI.createPlatformResourceURI(file.getFullPath().toString(),
				true);
	}

}
