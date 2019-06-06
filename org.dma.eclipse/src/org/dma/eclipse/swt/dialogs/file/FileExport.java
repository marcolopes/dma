/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.file;

import java.io.File;
import java.util.Arrays;

import org.dma.java.io.TextFileHandler;
import org.dma.java.io.XMLFileHandler;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExport extends FileDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public FileExport(String...extensions) {
		this(Display.getDefault().getActiveShell(), extensions);
	}

	/** @see FileDialog#setFilterExtensions(String[]) */
	public FileExport(Shell parent, String...extensions) {
		super(parent, SWT.SAVE);
		setFilterExtensions(extensions);
		System.out.println("extensions: "+Arrays.asList(extensions));
	}


	/** @see FileDialog#setFilterPath(String) */
	public File filePicker(String defaultPath, String filename) {

		try{
			// FileDialog SWT 3.7 BUG
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			// OSX 10.9 workaround
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			setFilterPath(defaultPath==null ? "." : defaultPath);
			setFileName(filename);

			return new File(open());

		}catch(Exception e){}

		return null;

	}


	public File filePicker(String filename) {
		return filePicker(null, filename);
	}


	public File filePicker() {
		return filePicker(null);
	}


	public void writeText(String text, String defaultFile, String charsetName) {
		setFileName(defaultFile);
		if(open()!=null){
			String filename=getFilterPath()+File.separator+getFileName();
			new TextFileHandler(filename, charsetName).write(text);
		}
	}


	public void writeXML(Object obj, String defaultFile) {
		setFileName(defaultFile);
		if(open()!=null){
			String filename=getFilterPath()+File.separator+getFileName();
			new XMLFileHandler(filename).write(obj);
		}
	}


}
