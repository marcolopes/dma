/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.file;

import java.io.File;
import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FolderDialog extends DirectoryDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public FolderDialog(String...extensions) {
		this(Display.getDefault().getActiveShell(), extensions);
	}

	public FolderDialog(Shell parent, String...extensions) {
		super(parent, SWT.SAVE);
		System.out.println("extensions: "+Arrays.asList(extensions));
	}


	/** @see DirectoryDialog#setFilterPath(String) */
	public File folderPicker(String defaultPath) {

		try{
			// FileDialog SWT 3.7 BUG
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			// OSX 10.9 workaround
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			setFilterPath(defaultPath==null ? "." : defaultPath);

			return new File(open());

		}catch(Exception e){}

		return null;

	}


	public File folderPicker() {
		return folderPicker(null);
	}


}