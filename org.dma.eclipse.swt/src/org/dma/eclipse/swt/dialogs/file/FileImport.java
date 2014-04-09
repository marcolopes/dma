/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.file;

import java.io.File;
import java.util.Arrays;

import org.dma.java.utils.file.FileUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileImport extends FileDialog {

	//subclassing
	protected void checkSubclass() {}

	public FileImport(String...extensions) {
		this(new Shell(), extensions);
	}

	public FileImport(Shell parent, String...extensions) {
		super(parent, SWT.OPEN);
		setFilterExtensions(extensions);
		System.out.println("extensions: "+Arrays.toString(extensions));
	}


	public File filePicker(String defaultPath, String filename) {

		try{
			// FileDialog SWT 3.7 BUG
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			// OSX 10.9 workaround
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			setFilterPath(defaultPath==null ? "." : defaultPath);
			setFileName(filename);

			File file=new File(open());
			// The name could be entered manually in the dialog
			// so we must check if the file really exists
			return file.exists() ? file : null;

		}catch(Exception e){}

		return null;

	}


	public File filePicker(String filename){
		return filePicker(null,filename);
	}


	public File filePicker(){
		return filePicker(null);
	}


	public String readText(String charset) {
		String filename=open();
		return filename==null ?
				"" : FileUtils.readTextStream(filename,charset);
	}


	public byte[] readBytes() {
		String filename=open();
		return filename==null ?
				null : FileUtils.readBytesStream(filename);
	}


}
