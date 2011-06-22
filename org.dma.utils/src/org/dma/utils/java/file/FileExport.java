/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.io.File;

import org.dma.utils.eclipse.Debug;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExport {

	private final String[] extensions;

	public FileExport() {
		this.extensions = new String[]{""};
	}

	public FileExport(String extensions) {
		this.extensions = new String[]{extensions};
	}

	public FileExport(String[] extensions) {
		this.extensions = extensions;
	}



	public String directoryPicker(Shell parent){

		DirectoryDialog dd = new DirectoryDialog(parent, SWT.SAVE);

		return dd.open();

	}


	public String filePicker(Shell parent){

		FileDialog fd = new FileDialog(parent, SWT.SAVE);
		fd.setFilterExtensions(extensions);

		return fd.open();

	}


	public String filePicker(Shell parent, String filename){

		FileDialog fd = new FileDialog(parent, SWT.SAVE);
		fd.setFilterExtensions(extensions);
		fd.setFileName(filename);

		return fd.open();

	}


	public String saveFile(Shell parent, byte[] bytes, String filename) {

		try {
			Debug.info("filename",filename);

			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename);

			if(fd.open() != null){

				FileUtils.writeBytesStream(bytes, fd.getFilterPath()+File.separator+fd.getFileName());
				return fd.getFilterPath();
			}

		} catch (Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public void writeText(Shell parent, String text, String filename, String fileext, String charset){
		try {
			Debug.info("filename",filename);
			Debug.info("fileext",fileext);

			FileDialog fd = new FileDialog(parent,SWT.SAVE);
			fd.setFilterExtensions(extensions);
			fd.setFileName(filename+"."+fileext);

			if(fd.open() != null){
				FileUtils.writeTextStream(text, fd.getFilterPath()+File.separator+fd.getFileName(),charset);
			}

		} catch (Exception e){
			e.printStackTrace();
		}
	}


}
