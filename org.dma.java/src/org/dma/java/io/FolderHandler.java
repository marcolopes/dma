/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.regex.Pattern;

public class FolderHandler {

	public final File folder;

	public static String currentFolder() {
		try{
			return new File(".").getCanonicalPath();
		}catch(IOException e){
			return null;
		}
	}

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


	/*
	 * Folders
	 */
	public boolean create() {

		try{
			return folder.exists() ? true : folder.mkdir();

		}catch(Exception e){
			System.out.println(e);
		}

		return false;

	}


	public File[] listDirectories(final String wildcards) {

		try{
			return folder.listFiles(new FileFilter() {
				Pattern pattern=Pattern.compile(
						//convert to regex
						wildcards.replace("*",".*").replace("?","."));
				@Override
				public boolean accept(File file) {
					return file.isDirectory() && pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public File[] listDirectories() {

		return listDirectories("*.*");

	}



	/*
	 * Files
	 */
	public int deleteFiles(String wildcards) {

		int n=0;

		File[] files=listFiles(wildcards);
		if(files!=null){

			for(File file: files) try{

				if(file.delete()) n++;

			}catch(Exception e){
				System.out.println(e);
			}

			System.out.println(n+"/"+files.length+" files deleted in "+
					folder.getAbsolutePath()+File.separator+wildcards);
		}

		return n;

	}


	public int deleteAllFiles() {

		return deleteFiles("*.*");

	}


	public File[] listFiles(final String wildcards) {

		try{
			return folder.listFiles(new FileFilter() {
				Pattern pattern=Pattern.compile(
						//convert to regex
						wildcards.replace("*",".*").replace("?","."));
				@Override
				public boolean accept(File file) {
					return file.isFile() &&	pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public File[] listFiles() {

		return listFiles("*.*");

	}


	public String[] getFileNames(String wildcards) {

		File[] files=listFiles(wildcards);

		if (files!=null){
			int i=0;
			String[] names=new String[files.length];
			for(File file: files){
				names[i++]=file.getName();
			}

			return names;
		}

		return null;

	}


	public String[] getFileNames() {

		return getFileNames("*.*");

	}


	public static final void main(String[] args) {

		FolderHandler handler=new FolderHandler();
		System.out.println(handler.folder);

	}


}
