/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.net.URL;

import org.apache.commons.configuration.HierarchicalINIConfiguration;

public class UTF8INIConfiguration extends HierarchicalINIConfiguration {

	private static final long serialVersionUID = 1L;

	public UTF8INIConfiguration() {
		super();
		setEncoding(FileUtils.UTF8_CHARSET);
	}

	private UTF8INIConfiguration(File file) {
		throw new UnsupportedOperationException();
	}

	private UTF8INIConfiguration(String filename) {
		throw new UnsupportedOperationException();
	}

	private UTF8INIConfiguration(URL url) {
		throw new UnsupportedOperationException();
	}


}
