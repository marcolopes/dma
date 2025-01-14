/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.dialogs.file;

import java.io.File;
import java.util.Arrays;

import org.dma.java.io.Folder;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FolderDialog extends DirectoryDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public FolderDialog(String...extensions) {
		this(Display.getDefault().getActiveShell(), extensions);
	}

	public FolderDialog(Shell parent, String...extensions) {
		super(parent, SWT.SAVE);
		Debug.out("extensions", Arrays.asList(extensions));
	}


	/** @see DirectoryDialog#setFilterPath(String) */
	public File folderPicker(Folder folder) {

		try{/*
			 * FileDialog SWT 3.7 BUG
			 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			 * OSX 10.9 workaround
			 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			 */
			setFilterPath(folder==null ? "." : folder.getAbsolutePath());

			return new File(open());

		}catch(Exception e){}
		return null;

	}


	public File folderPicker() {
		return folderPicker(null);
	}


}