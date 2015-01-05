/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;

public class FileParameters {

	private final String prefix;
	private final String suffix;
	private final File folder;
	private final String filename;

	public FileParameters(String prefix, String suffix){
		this(prefix, suffix, "");
	}

	public FileParameters(String prefix, String suffix, String foldername){
		this(prefix, suffix, new File(foldername));
	}

	public FileParameters(String prefix, String suffix, File folder){
		this.prefix=prefix;
		this.suffix=suffix;
		this.folder=folder;
		this.filename=prefix + (suffix==null ? "" : "."+suffix);
	}


	/*
	 * Temporary Files
	 *
	 * prefix - The prefix string to be used in generating the file's name;
	 * 			must be at least three characters long
	 *
	 * suffix - The suffix string to be used in generating the file's name;
	 * 			may be null, in which case the suffix ".tmp" will be used
	 *
	 * directory - The directory in which the file is to be created,
	 * 			or null if the default temporary-file directory is to be used
	 *
	 */
	public File createTempFile() {

		try{
			File directory=folder==null ? null : folder;
			File file=File.createTempFile(prefix, "."+suffix, directory);
			file.deleteOnExit();

			return file;

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public File createTempFile(byte[] bytes) {

		File file=createTempFile();
		FileUtils.writeBytesStream(bytes, file);

		return file;

	}


	public boolean exists(){
		return toFile().exists();
	}


	public File toFile(){
		return new File(toString());
	}


	@Override
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