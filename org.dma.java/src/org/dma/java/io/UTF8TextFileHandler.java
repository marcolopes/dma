/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;

public class UTF8TextFileHandler extends TextFileHandler {

	public UTF8TextFileHandler(String filename) {
		super(filename, FileHandler.UTF8_CHARSET);
	}

	public UTF8TextFileHandler(File file) {
		super(file, FileHandler.UTF8_CHARSET);
	}


}
