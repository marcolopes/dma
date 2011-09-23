/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.file;

import java.io.File;

import org.dma.utils.java.Debug;
import org.dma.utils.java.array.ArrayUtils;
import org.dma.utils.java.file.FileUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileImport {

	private final String[] extensions;
	private final String defaultPath;

	public FileImport(String[] extensions, String defaultPath) {
		this.extensions = extensions;
		this.defaultPath = defaultPath;
	}

	public FileImport(String extensions, String defaultPath) {
		this(new String[]{extensions}, defaultPath);
	}

	public FileImport(String extensions) {
		this(extensions, null);
	}


	public File filePicker(Shell parent) {

		Debug.info("extensions", ArrayUtils.toList(extensions));
		Debug.info("defaultPath", defaultPath);

		try{
			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			if(defaultPath!=null)
				fd.setFilterPath(defaultPath);
			fd.setFilterExtensions(extensions);

			File file=new File(fd.open());
			/*
			 * The name could be entered manually in the dialog
			 * so we must check if the file really exists
			 */
			return file.exists() ? file : null;

		}catch(Exception e){}

		return null;

	}


	public String readText(Shell parent, String charset) {

		String text="";

		try{
			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			fd.setFilterExtensions(extensions);

			String filename = fd.open();
			if(filename!=null) {
				text=FileUtils.readTextStream(filename,charset);
			}

		} catch (Exception e){}

		return text;

	}


}
