/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

public class ZipFile extends CustomFile {

	/** @see CustomFile#CustomFile(File, String...) */
	public ZipFile(File path, String...more) {
		super(path, more);
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public ZipFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see CustomFile#CustomFile(File) */
	public ZipFile(File path) {
		super(path);
	}


	/** @see ZipEntry#setMethod(int) */
	public void append(Collection<File> files, int method) throws ZipException, IOException {

		byte[] buffer=new byte[1024];

		ZipOutputStream out=new ZipOutputStream(
				new BufferedOutputStream(asOutputStream(true)));

		for(File file: files){

			ZipEntry entry=new ZipEntry(file.getName());
			entry.setMethod(method);
			out.putNextEntry(entry);

			BufferedInputStream in=new BufferedInputStream(new FileInputStream(file));
			try{int len;
				while((len=in.read(buffer))>0){
					out.write(buffer, 0, len);
				}
			}finally{
				in.close();
			}out.closeEntry();

		}out.close();

	}


	public void store(Collection<File> files) throws ZipException, IOException {
		append(files, ZipEntry.STORED);
	}

	public void store(File filesToAdd) throws ZipException, IOException {
		store(Arrays.asList(filesToAdd));
	}

	public void deflate(Collection<File> files) throws ZipException, IOException {
		append(files, ZipEntry.DEFLATED);
	}

	public void deflate(File files) throws ZipException, IOException {
		deflate(Arrays.asList(files));
	}

}