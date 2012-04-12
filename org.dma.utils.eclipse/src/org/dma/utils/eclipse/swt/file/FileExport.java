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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExport {

	private final String[] extensions;

	public FileExport(String[] extensions) {
		this.extensions = extensions;
	}

	public FileExport(String extensions) {
		this(new String[]{extensions});
	}

	public FileExport() {
		this("");
	}



	public String directoryPicker(Shell parent){

		DirectoryDialog dd = new DirectoryDialog(parent, SWT.SAVE);
		return dd.open();

	}


	public File filePicker(Shell parent, String filename){

		Debug.out("extensions", ArrayUtils.toList(extensions));

		try{
			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename);

			return new File(fd.open());

		}catch(Exception e){}

		return null;

	}


	public File filePicker(Shell parent){

		return filePicker(parent, null);

	}


	public void writeText(Shell parent, String text, String filename, String charset){
		try{
			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename);

			if(fd.open() != null){
				FileUtils.writeTextStream(text, fd.getFilterPath()+File.separator+fd.getFileName(),charset);
			}

		} catch (Exception e){
			e.printStackTrace();
		}
	}


}
