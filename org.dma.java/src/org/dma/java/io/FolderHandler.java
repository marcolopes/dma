/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class FolderHandler {

	public static File currentFolder() {
		try{
			return new File(".").getCanonicalFile();

		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	public final File folder;

	/** Uses CURRENT FOLDER */
	public FolderHandler() {
		this(currentFolder());
	}

	public FolderHandler(String foldername) {
		this(new File(foldername));
	}

	public FolderHandler(File folder) {
		this.folder=folder;
	}


	/** Returns folder path relative to current folder */
	public String getRelativePath() {
		String current=currentFolder().getAbsolutePath();
		String folder=this.folder.getAbsolutePath();
		return folder.toLowerCase().startsWith(current.toLowerCase()) &&
				folder.length()>current.length() ?
						folder.substring(current.length()+1) : folder;
	}


	/*
	 * Folders
	 */
	public File[] listDirectories(final String wildcards) {

		try{
			return folder.listFiles(new FileFilter() {
				//convert to regex
				String regex=wildcards.replace("*", ".*").replace("?", ".");
				Pattern pattern=Pattern.compile(regex);
				@Override
				public boolean accept(File file) {
					return file.isDirectory() && pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			System.err.println(e);
		}return new File[0];

	}

	public File[] listDirectories() {

		return listDirectories("*.*");

	}


	public boolean create() {

		try{
			return folder.exists() ? true : folder.mkdir();

		}catch(Exception e){
			System.err.println(e);
		}return false;

	}



	/*
	 * Files
	 */
	public File[] listFiles(final String wildcards) {

		try{
			return folder.listFiles(new FileFilter() {
				//convert to regex
				String regex=wildcards.replace("*", ".*").replace("?", ".");
				Pattern pattern=Pattern.compile(regex);
				@Override
				public boolean accept(File file) {
					return file.isFile() &&	pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			System.err.println(e);
		}return new File[0];

	}

	public File[] listFiles() {

		return listFiles("*.*");

	}


	public String[] getFileNames(String wildcards) {

		int index=0;
		File[] files=listFiles(wildcards);
		String[] names=new String[files.length];
		for(File file: files) names[index++]=file.getName();
		return names;

	}

	public String[] getFileNames() {

		return getFileNames("*.*");

	}


	public int deleteFiles(String wildcards) {

		int count=0;

		File[] files=listFiles(wildcards);
		for(File file: files) try{
			if (file.delete()) count++;

		}catch(Exception e){
			System.err.println(e);
		}

		System.out.println(count+"/"+files.length+" files deleted in "+
				folder.getAbsolutePath()+File.separator+wildcards);

		return count;

	}


	public int deleteAllFiles() {

		return deleteFiles("*.*");

	}


	public static final void main(String[] args) {

		System.out.println(currentFolder());

		FolderHandler handler=new FolderHandler(currentFolder()+"/tmp/");
		System.out.println(handler.folder.getAbsolutePath());
		System.out.println(handler.getRelativePath());

	}


}
