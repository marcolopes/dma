/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.io.File;

import org.dma.utils.eclipse.Debug;
import org.dma.utils.java.ArrayUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileImport {

	private final String[] extensions;
	private final String defaultPath;


	public FileImport(String extensions) {
		this.extensions = new String[]{extensions};
		this.defaultPath = null;
	}


	public FileImport(String extensions, String defaultPath) {
		this.extensions = new String[]{extensions};
		this.defaultPath = defaultPath;
	}


	public FileImport(String[] extensions, String defaultPath) {
		this.extensions = extensions;
		this.defaultPath = defaultPath;
	}


	public File openFile(Shell parent) {

		File file=null;

		try {
			Debug.info("extensions", ArrayUtils.toList(extensions));
			Debug.info("defaultPath", defaultPath);

			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			if(this.defaultPath != null)
				fd.setFilterPath(defaultPath);
			fd.setFilterExtensions(extensions);

			String selected = fd.open();
			if(selected!=null){
				file = new File(selected);
			}

		} catch (Exception e){
			e.printStackTrace();
		}

		return file;

	}


	public String readText(Shell parent, String charset) {

		String text="";

		try {
			FileDialog fd = new FileDialog(parent,SWT.OPEN);
			fd.setFilterExtensions(extensions);

			String filename = fd.open();
			if(filename!=null) {
				text=FileUtils.readTextStream(filename,charset);
			}

		} catch (Exception e) {}

		return text;

	}


}
