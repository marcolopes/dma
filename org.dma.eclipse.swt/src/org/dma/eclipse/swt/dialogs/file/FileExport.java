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

public class FileExport extends FileDialog {

	//subclassing
	protected void checkSubclass() {}

	public FileExport(String...extensions) {
		this(new Shell(), extensions);
	}

	public FileExport(Shell parent, String...extensions) {
		super(parent, SWT.SAVE);
		setFilterExtensions(extensions);
		System.out.println("extensions: "+Arrays.asList(extensions));
	}


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
		return filePicker(null,filename);
	}


	public File filePicker() {
		return filePicker(null);
	}


	public void writeText(String text, String defaultFile, String charset) {
		setFileName(defaultFile);
		if(open()!=null){
			String filename=getFilterPath()+File.separator+getFileName();
			FileUtils.writeTextStream(text, filename, charset);
		}
	}


	public void writeXml(Object obj, String defaultFile) {
		setFileName(defaultFile);
		if(open()!=null){
			String filename=getFilterPath()+File.separator+getFileName();
			FileUtils.writeXmlStream(obj, filename);
		}
	}


}
