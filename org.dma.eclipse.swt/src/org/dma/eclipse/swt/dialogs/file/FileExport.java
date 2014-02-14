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

public class FileExport {

	private final Shell parent;
	private final String[] extensions;

	public FileExport(Shell parent, String...extensions) {
		this.parent = parent;
		this.extensions = extensions;
		System.out.println("extensions: "+Arrays.toString(extensions));
	}

	public FileExport(String...extensions) {
		this(new Shell(), extensions);
	}


	public File filePicker(String filename){

		try{
			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename);

			return new File(fd.open());

		}catch(Exception e){}

		return null;

	}


	public File filePicker(){

		return filePicker(null);

	}


	public void writeText(String text, String filename, String charset){
		try{
			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename);

			if(fd.open() != null){
				FileUtils.writeTextStream(text, fd.getFilterPath()+File.separator+fd.getFileName(), charset);
			}

		} catch (Exception e){
			e.printStackTrace();
		}
	}


}
