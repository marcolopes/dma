/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

public class FileParameters {

	private final String prefix;
	private final String suffix;
	private final String folder;

	public FileParameters(String prefix, String suffix){

		this(prefix,suffix,null);

	}

	public FileParameters(String prefix, String suffix, String folder){

		this.prefix=prefix;
		this.suffix=suffix;
		this.folder=folder;

	}



	//getters and setters
	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public String getFolder() {
		return folder;
	}


}
