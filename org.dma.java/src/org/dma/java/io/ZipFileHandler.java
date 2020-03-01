/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileHandler extends FileHandler {

	public ZipFileHandler(String path) {
		super(path);
	}

	public ZipFileHandler(File file) {
		super(file);
	}


	private void create(Collection<File> filesToAdd, int method) throws Exception {

		ZipOutputStream out=new ZipOutputStream(asOutputStream());

		for(File file: filesToAdd){
			ZipEntry entry=new ZipEntry(file.getName());
			entry.setMethod(method);
            out.putNextEntry(entry);
            out.write(new ByteFileHandler(file).read());
            out.closeEntry();
		}

		out.close();

	}


	public void store(Collection<File> filesToAdd) throws Exception {

		create(filesToAdd, ZipEntry.STORED);

	}


	public void deflate(Collection<File> filesToAdd) throws Exception {

		create(filesToAdd, ZipEntry.DEFLATED);

	}

}
