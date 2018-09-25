/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

public class UTF8URLTextFileHandler extends URLTextFileHandler {

	public UTF8URLTextFileHandler(FileURL fileurl) {
		super(fileurl, UTF8_CHARSET);
	}


}
