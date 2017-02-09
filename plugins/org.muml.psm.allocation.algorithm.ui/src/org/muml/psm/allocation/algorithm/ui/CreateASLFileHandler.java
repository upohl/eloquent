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

public class CreateASLFileHandler extends AbstractHandler {
	private static final String illegal_template =
			"template does not conform to the grammar";
	private static final String file_extension = "allocation_specification";
	// what a mess...
	private static final String template =
			new StringBuilder()
				.append("%s {\n")
				.append("\timport 'http://www.muml.org/psm/allocation/language/oclcontext/1.0.0'\n")
				.append("\tinclude 'platform:/plugin/org.muml.psm.allocation.language.xtext/operations/OCLContext.ocl'\n")
				.append("\n")
				.append("\toclContext oclcontext::OCLContext;\n")
				.append("\n")
				.append("\tnameProvider 'org.muml.psm.allocation.language.xtext.provider.MUMLNameProvider';\n")
				.append("\tstorageProvider 'org.muml.psm.allocation.language.xtext.provider.MUMLStorageProvider';\n")
				.append("\n")
				.append("\trelation allocate {\n")
				.append("\t\tdescriptors (first : pim::instance::ComponentInstance, second : hardware::hwresourceinstance::ResourceInstance);\n")
				.append("\t\tlower 1;\n")
				.append("\t\tupper 1;\n")
				.append("\t\tocl self.componentInstanceConfiguration.componentInstances->product(\n")
				.append("\t\t\tself.hardwarePlatformInstanceConfiguration.resources\n")
				.append("\t\t);\n")
				.append("\t}\n")
				.append("}").toString();

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
	
	private static void createASLFile(IFile file) {
		ResourceSet resSet = new ResourceSetImpl();
		IPath path = getNonexistentPath(file.getFullPath(), file_extension);
		// hrm what about illegal names?
		String name = path.removeFileExtension().lastSegment();
		// XXX: hrm is path.toString already encoded?
		Resource resource = resSet.createResource(
				URI.createPlatformResourceURI(path.toString(), true));
		try {
			InputStream in = new URIConverter.ReadableInputStream(
					String.format(template, name), "UTF-8");
			resource.load(in, null);
			// check for errors (e.g. if we changed the grammar...)
			if (!resource.getErrors().isEmpty()) {
				throw new IllegalStateException(illegal_template);
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
