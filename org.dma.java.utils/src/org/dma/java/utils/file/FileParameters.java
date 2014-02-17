/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

import java.io.File;

public class FileParameters {

	private final String prefix;
	private final String suffix;
	private final File folder;
	private final String filename;

	public FileParameters(String prefix, String suffix, File folder){

		this.prefix=prefix;
		this.suffix=suffix;
		this.folder=folder;
		this.filename=prefix + (suffix==null ? "" : "."+suffix);

	}

	public FileParameters(String prefix, String suffix, String foldername){

		this(prefix, suffix, new File(foldername));

	}

	public FileParameters(String prefix, String suffix){

		this(prefix, suffix, "");

	}


	public boolean exists(){
		return toFile().exists();
	}


	public File toFile(){
		return new File(toString());
	}


	public String toString(){
		return folder.getAbsolutePath() + File.separator + filename;
	}



	/*
	 * Getters and setters
	 */
	public String getPrefix() {
		return prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public File getFolder() {
		return folder;
	}

	public String getFilename(){
		return filename;
	}


}