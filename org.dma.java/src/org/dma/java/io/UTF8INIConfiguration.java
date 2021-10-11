/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.nio.charset.Charset;

import org.apache.commons.configuration.HierarchicalINIConfiguration;

public class UTF8INIConfiguration extends HierarchicalINIConfiguration {

	private static final long serialVersionUID = 1L;

	public UTF8INIConfiguration() {
		super();
		setEncoding(getCharset().name());
	}

	public Charset getCharset() {
		return CustomFile.UTF8_CHARSET;
	}

}
