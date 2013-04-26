/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.file;

import java.io.File;
import java.util.Arrays;

import org.dma.utils.java.Debug;
import org.dma.utils.java.file.FileUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExport {

	private final Shell parent;
	private final String[] extensions;

	public FileExport(Shell parent, String...extensions) {
		this.parent = parent;
		this.extensions = extensions;
	}


	public String folderPicker(){

		DirectoryDialog dd = new DirectoryDialog(parent,SWT.SAVE);
		return dd.open();

	}


	public File filePicker(String filename){

		Debug.out("extensions", Arrays.toString(extensions));

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
