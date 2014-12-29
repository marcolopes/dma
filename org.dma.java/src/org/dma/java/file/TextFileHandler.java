/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.file;

import java.io.File;

public class TextFileHandler {

	protected final File file;
	protected final String charset;

	public TextFileHandler(String filename, String charset) {
		this(new File(filename), charset);
	}

	public TextFileHandler(File file, String charset) {
		this.file=file;
		this.charset=charset;
	}


	public String read() {

		return FileUtils.readTextStream(file, charset);

	}


	public boolean write(String text) {

		return FileUtils.writeTextStream(text, file, charset);

	}


}
