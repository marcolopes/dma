/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

import java.io.File;

public class UTF8TextFileHandler extends TextFileHandler {

	public UTF8TextFileHandler(String filename) {
		this(new File(filename));
	}

	public UTF8TextFileHandler(File file) {
		super(file, FileUtils.UTF8_CHARSET);
	}


}
