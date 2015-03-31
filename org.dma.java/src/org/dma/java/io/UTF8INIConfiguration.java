/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import org.apache.commons.configuration.HierarchicalINIConfiguration;

public class UTF8INIConfiguration extends HierarchicalINIConfiguration {

	private static final long serialVersionUID = 1L;

	public UTF8INIConfiguration() {
		super();
		setEncoding(FileHandler.UTF8_CHARSET);
	}


}
