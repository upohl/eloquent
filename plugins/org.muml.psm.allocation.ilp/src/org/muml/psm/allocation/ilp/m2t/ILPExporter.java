package org.muml.psm.allocation.ilp.m2t;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

/**
 * Its sole purpose is to provide the <code>exportToWorkspaceFile</code>
 * method that serializes an <code>IntegerLinearProgram</code> into a
 * workspace file.
 *
 */
public class ILPExporter {
	
	// hmm maybe we should introduce an interface instead of using
	// AbstractILPM2T
	public static Diagnostic exportToWorkspaceFile(@NonNull IntegerLinearProgram ilp,
			@NonNull AbstractILPM2T serializer,
			@NonNull String workspaceFilename,
			@Nullable IProgressMonitor progressMonitor) {
		IFile file = ResourcesPlugin.getWorkspace()
				.getRoot().getFile(new Path(workspaceFilename));
		PipedOutputStream os = new PipedOutputStream();
		Thread serializerThread = createSerializerThread(ilp, serializer, os);
		Thread fileWriterThread = createFileWriterThread(file, os,
				progressMonitor);
		serializerThread.start();
		fileWriterThread.start();
		try {
			serializerThread.join();
			fileWriterThread.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return Diagnostic.OK_INSTANCE;
	}
	
	public static Thread createSerializerThread(@NonNull IntegerLinearProgram ilp,
			@NonNull AbstractILPM2T serializer, @NonNull PipedOutputStream os) {
		return new Thread(() -> {
			serializer.serialize(ilp, os);
			try {
				os.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}
	
	public static Thread createFileWriterThread(@NonNull IFile file,
			@NonNull PipedOutputStream os,
			@Nullable IProgressMonitor progressMonitor) {
		PipedInputStream is;
		try {
			is = new PipedInputStream(os);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return new Thread(() -> {
			try {
				file.create(is, true, progressMonitor);
			} catch (CoreException e) {
				throw new RuntimeException(e);
			}			
		});
	}
}
