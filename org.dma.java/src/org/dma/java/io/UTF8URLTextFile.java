/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

public class UTF8URLTextFile extends URLTextFile {

	public UTF8URLTextFile(String urlname, String...more) {
		super(CustomFile.UTF8_CHARSET, urlname, more);
	}


}
