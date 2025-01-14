/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
import java.nio.charset.Charset;
import java.util.Arrays;

import org.dma.java.io.Folder;
import org.dma.java.io.TextFile;
import org.dma.java.io.XMLFile;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileExport extends FileDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public FileExport(String...extensions) {
		this(Display.getDefault().getActiveShell(), extensions);
	}

	/** @see FileDialog#setFilterExtensions(String[]) */
	public FileExport(Shell parent, String...extensions) {
		super(parent, SWT.SAVE);
		Debug.out("extensions", Arrays.asList(extensions));
		setFilterExtensions(extensions);
	}


	/** @see FileDialog#setFilterPath(String) */
	public File filePicker(Folder folder, String filename) {

		try{/*
			 * FileDialog SWT 3.7 BUG
			 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			 * OSX 10.9 workaround
			 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			 */
			setFilterPath(folder==null ? "." : folder.getAbsolutePath());
			setFileName(filename);

			return new File(open());

		}catch(Exception e){}
		return null;

	}


	public File filePicker(String filename) {
		return filePicker(null, filename);
	}


	public File filePicker() {
		return filePicker(null);
	}


	public void writeText(String text, String filename, Charset charset) {
		setFileName(filename);
		if (open()!=null) new TextFile(charset, getFilterPath(), getFileName()).write(text);
	}


	public void writeXML(Object obj, String filename) {
		setFileName(filename);
		if (open()!=null) new XMLFile(getFilterPath(), getFileName()).write(obj);
	}


}
