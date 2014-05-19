/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

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
		//not supported
	}

	private UTF8INIConfiguration(String filename) {
		//not supported
	}

	private UTF8INIConfiguration(URL url) {
		//not supported
	}


}
