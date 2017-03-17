package org.muml.psm.allocation.algorithm.ui;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractCreateASLFileHandler extends AbstractHandler {
	private static final String fileExtension = "allocation_specification";
	private static final String illegalTemplate =
			"template does not conform to the grammar";
	
	protected abstract String getTemplate(String name);
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = selection instanceof IStructuredSelection ? (IStructuredSelection) selection
				: null;
		if (structuredSelection != null) {
			Object elm = structuredSelection.getFirstElement();
			if (elm instanceof IFile) {
				createASLFile((IFile) elm);
			}
		}
		return null;
	}
	
	protected void createASLFile(IFile file) {
		ResourceSet resSet = new ResourceSetImpl();
		IPath path = getNonexistentPath(file.getFullPath(), fileExtension);
		// hrm what about illegal names?
		String name = path.removeFileExtension().lastSegment();
		// XXX: hrm is path.toString already encoded?
		Resource resource = resSet.createResource(
				URI.createPlatformResourceURI(path.toString(), true));
		try {
			InputStream in = new URIConverter.ReadableInputStream(
					getTemplate(name), "UTF-8");
			resource.load(in, null);
			// check for errors (e.g. if we changed the grammar...)
			if (!resource.getErrors().isEmpty()) {
				throw new IllegalStateException(illegalTemplate);
			}
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
		
	}
	
	private static IPath getNonexistentPath(IPath path, String extension) {
		// XXX: of course this _IS_ racy...
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		path = path.removeFileExtension();
		IPath base = path.removeLastSegments(1);
		String name = path.lastSegment();
		int i = 0;
		do {
			path = base.append(name + (i == 0 ? "" : i))
					.addFileExtension(extension);
			i++;
		} while (root.exists(path));
		return path;
	}
}
