/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.io;

import java.io.File;

public class FileParameters {

	public final String prefix;
	public final String suffix;
	public final Folder folder;
	/** prefix.suffix */
	public final String filename;
	public final String wildcards;

	/** @see FileParameters#FileParameters(String, String, Folder) */
	public FileParameters(String prefix, String suffix) {
		this(prefix, suffix, Folder.current());
	}

	/** suffix CAN be null, or may or may not start with DOT (.) */
	public FileParameters(String prefix, String suffix, Folder folder) {
		this.prefix=prefix;
		this.suffix=suffix==null || suffix.startsWith(".") ? suffix : "."+suffix;
		this.folder=folder;
		this.filename=prefix + (suffix==null ? "" : this.suffix);
		this.wildcards="*" + (suffix==null ? "" : this.suffix);
	}

	public FileParameters cloneCopy(Folder folder) {
		return new FileParameters(prefix, suffix, folder);
	}


	/** @see File#createTempFile(String, String, File) */
	public File createTempFile() {
		try{File file=File.createTempFile(prefix+"-", suffix, folder);
			file.deleteOnExit();
			return file;
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	/** @see FileParameters#createTempFile() */
	public ByteFile createTempFile(byte[] bytes) {
		ByteFile file=new ByteFile(createTempFile());
		file.write(bytes);
		return file;
	}


	/** @see File#exists() */
	public boolean exists() {
		return toFile().exists();
	}


	public CustomFile toFile() {
		return new CustomFile(toString());
	}


	/** path + filename */
	@Override
	public String toString() {
		return folder + File.separator + filename;
	}


}