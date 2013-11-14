/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.file;

import java.io.File;
import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

public class FolderDialog {

	private final Shell parent;

	public FolderDialog(Shell parent, String...extensions) {
		this.parent = parent;
		System.out.println("extensions: "+Arrays.toString(extensions));
	}


	public File folderPicker(String foldername){

		try{
			DirectoryDialog dd = new DirectoryDialog(parent,SWT.SAVE);
			dd.setFilterPath(foldername);

			return new File(dd.open());

		}catch(Exception e){}

		return null;

	}


	public File folderPicker(){

		return folderPicker(null);

	}


}
