/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;

public class UTF8TextFile extends TextFile {

	public UTF8TextFile(String pathname, String...more) {
		super(UTF8_CHARSET, pathname, more);
	}

	public UTF8TextFile(File file) {
		super(UTF8_CHARSET, file);
	}


}
