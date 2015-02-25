/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;

public class FileParameters {

	public final String prefix;
	public final String suffix;
	public final File folder;
	public final String filename;

	public FileParameters(String prefix, String suffix){
		this(prefix, suffix, "");
	}

	public FileParameters(String prefix, String suffix, String foldername){
		this(prefix, suffix, new File(foldername));
	}

	public FileParameters(String prefix, String suffix, File folder){
		this.prefix=prefix;
		this.suffix=suffix==null || suffix.startsWith(".") ? suffix : "."+suffix;
		this.folder=folder;
		this.filename=prefix + (suffix==null ? "" : this.suffix);
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
			File file=File.createTempFile(prefix+"-", suffix, folder);
			file.deleteOnExit();

			return file;

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	public File createTempFile(byte[] bytes) {

		File file=createTempFile();
		new ByteFileHandler(file).write(bytes);

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


}