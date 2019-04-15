/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

public class UTF8URLTextFileHandler extends URLTextFileHandler {

	public UTF8URLTextFileHandler(FileURL fileurl) {
		super(fileurl, FileHandler.UTF8_CHARSET);
	}


}
