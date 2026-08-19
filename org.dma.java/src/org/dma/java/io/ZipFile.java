/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;

public class ZipFile extends CustomFile {

	public final Charset charset;

	/** Uses JAVA DEFAULT charset */
	public ZipFile(File file, String...more) {
		this(Charset.defaultCharset(), file, more);
	}

	/** @see CustomFile#CustomFile(File, String...) */
	public ZipFile(Charset charset, File file, String...more) {
		super(file, more);
		this.charset=charset;
	}

	/** Uses JAVA DEFAULT charset */
	public ZipFile(String pathname, String...more) {
		this(Charset.defaultCharset(), pathname, more);
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public ZipFile(Charset charset, String pathname, String...more) {
		super(pathname, more);
		this.charset=charset;
	}

	/** Uses JAVA DEFAULT charset */
	public ZipFile(File file) {
		this(Charset.defaultCharset(), file);
	}

	/** @see CustomFile#CustomFile(File) */
	public ZipFile(Charset charset, File file) {
		super(file);
		this.charset=charset;
	}

	public boolean store(File filesToAdd) {
		return store(Arrays.asList(filesToAdd));
	}

	public boolean store(Collection<File> files) {
		return append(files, ZipEntry.STORED);
	}

	public boolean deflate(File files) {
		return deflate(Arrays.asList(files));
	}

	public boolean deflate(Collection<File> files) {
		return append(files, ZipEntry.DEFLATED);
	}

	public boolean append(Collection<File> files, int method) {

		return new AbstractZipAppend(this, charset) {
			public boolean cancel() {
				return false;
			}
		}.from(files, method);

	}

	public boolean extract(Folder folder, Collection<File> files) {

		return new AbstractZipExtract(this, charset) {
			public boolean cancel() {
				return false;
			}
		}.to(folder, files);

	}


}