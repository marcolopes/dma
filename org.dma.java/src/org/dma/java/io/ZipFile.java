/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

public class ZipFile extends CustomFile {

	/** @see CustomFile#CustomFile(String, String...) */
	public ZipFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see CustomFile#CustomFile(File, String...) */
	public ZipFile(File path, String...more) {
		super(path, more);
	}


	/** @see ZipEntry#setMethod(int) */
	public void append(Collection<File> files, int method) throws ZipException, IOException {

		ZipOutputStream out=new ZipOutputStream(asOutputStream(true));

		for(File file: files){
			ZipEntry entry=new ZipEntry(file.getName());
			entry.setMethod(method);
			out.putNextEntry(entry);
			out.write(new ByteFile(file).read());
			out.closeEntry();
		}

		out.close();

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
