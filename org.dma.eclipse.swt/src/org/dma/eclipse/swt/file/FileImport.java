/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.file;

import java.io.File;
import java.util.Arrays;

import org.dma.java.utils.Debug;
import org.dma.java.utils.file.FileUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileImport {

	private final Shell parent;
	private final String[] extensions;

	public FileImport(Shell parent, String...extensions) {
		this.parent = parent;
		this.extensions = extensions;
	}


	public File filePicker(String defaultPath) {

		Debug.out("extensions", Arrays.toString(extensions));
		Debug.out("defaultPath", defaultPath);

		try{
			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			fd.setFilterExtensions(extensions);
			fd.setFilterPath(defaultPath);

			File file=new File(fd.open());
			/*
			 * The name could be entered manually in the dialog
			 * so we must check if the file really exists
			 */
			return file.exists() ? file : null;

		}catch(Exception e){}

		return null;

	}


	public File filePicker(){

		return filePicker(null);

	}


	public String readText(String charset) {

		String text="";

		try{
			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			fd.setFilterExtensions(extensions);

			text=FileUtils.readTextStream(fd.open(),charset);

		} catch (Exception e){}

		return text;

	}


}
