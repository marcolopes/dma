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

import org.dma.java.io.ByteFile;
import org.dma.java.io.Folder;
import org.dma.java.io.TextFile;
import org.dma.java.io.XMLFile;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class FileImport extends FileDialog {

	@Override //subclassing
	protected void checkSubclass() {}

	public FileImport(String...extensions) {
		this(Display.getDefault().getActiveShell(), extensions);
	}

	/** @see FileDialog#setFilterExtensions(String[]) */
	public FileImport(Shell parent, String...extensions) {
		super(parent, SWT.OPEN | SWT.MULTI);
		setFilterExtensions(extensions);
		Debug.out("extensions: "+Arrays.asList(extensions));
	}


	/** @see FileDialog#setFilterPath(String) */
	public File filePicker(Folder defaultPath, String filename) {

		try{
			// FileDialog SWT 3.7 BUG
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=364116
			// OSX 10.9 workaround
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=361530#c2
			setFilterPath(defaultPath==null ? "." : defaultPath.getAbsolutePath());
			setFileName(filename);

			File file=new File(open());
			// The name could be entered manually in the dialog
			// so we must check if the file really exists
			return file.exists() ? file : null;

		}catch(Exception e){
		}return null;

	}


	public File filePicker(String filename) {
		return filePicker(null, filename);
	}


	public File filePicker() {
		return filePicker(null);
	}


	public String readText(Charset charset) {
		String filename=open();
		return filename==null ? "" : new TextFile(charset, filename).read();
	}


	public byte[] readBytes() {
		String filename=open();
		return filename==null ? null : new ByteFile(filename).read();
	}


	public Object readXML() {
		String filename=open();
		return filename==null ? null : new XMLFile(filename).read();
	}


}
