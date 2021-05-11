/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile extends CustomFile {

	public ZipFile(String pathname, String...more) {
		super(pathname, more);
	}

	public ZipFile(File file) {
		super(file);
	}


	private void create(Collection<File> filesToAdd, int method) throws Exception {

		ZipOutputStream out=new ZipOutputStream(asOutputStream());

		for(File file: filesToAdd){
			ZipEntry entry=new ZipEntry(file.getName());
			entry.setMethod(method);
			out.putNextEntry(entry);
			out.write(new ByteFile(file).read());
			out.closeEntry();
		}

		out.close();

	}


	public void store(Collection<File> filesToAdd) throws Exception {
		create(filesToAdd, ZipEntry.STORED);
	}

	public void store(File filesToAdd) throws Exception {
		store(Arrays.asList(filesToAdd));
	}

	public void deflate(Collection<File> filesToAdd) throws Exception {
		create(filesToAdd, ZipEntry.DEFLATED);
	}

	public void deflate(File filesToAdd) throws Exception {
		deflate(Arrays.asList(filesToAdd));
	}

}
