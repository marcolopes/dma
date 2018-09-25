/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.IOException;

public abstract class AbstractByteReader {

	public abstract int read(byte[] b, int off, int len) throws IOException;

	public byte[] read(File file) throws IOException {

		// Get the size of the file
		long length=file.length();

		// File is too large
		if (length > Integer.MAX_VALUE)
			throw new IOException("File is too large: "+file.getName());

		byte[] buffer=new byte[(int)length];

		int offset=0;
		int numRead=0;

		// Read in the bytes
		while(offset < buffer.length &&
				(numRead=read(buffer, offset, buffer.length-offset)) >= 0){
			offset+=numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < buffer.length)
			throw new IOException("Could not completely read file: "+file.getName());

		return buffer;

	}


}
