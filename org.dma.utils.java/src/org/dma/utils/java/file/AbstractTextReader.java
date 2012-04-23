/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.io.File;
import java.io.IOException;

public abstract class AbstractTextReader {

	public abstract int read(char[] b, int off, int len) throws IOException;

	public char[] readText(File file) throws IOException {

		// Get the size of the file
		long length = file.length();

		// File is too large
		if (length > Integer.MAX_VALUE)
			throw new IOException("File is too large: "+file.getName());

		char[] buffer=new char[(int)length];

		int offset = 0;
		int numRead = 0;

		// Read in the bytes
		while (offset < buffer.length && (numRead=read(buffer, offset, buffer.length-offset)) >= 0)
			offset += numRead;

		// Ensure all the bytes have been read in
		if (offset < buffer.length)
			throw new IOException("Could not completely read file: "+file.getName());

		return buffer;

	}


}
