/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class FolderUtils {

	/*
	 * Folders
	 */
	public static File[] getDirectories(File folder, String wildcards) {

		try{
			final Pattern pattern=Pattern.compile(
					wildcards.replace("*",".*").replace("?","."));

			return folder.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isDirectory() && pattern.matcher(file.getName()).find();
				}
			});

		} catch (Exception e){}

		return null;

	}


	public static File[] getDirectories(File folder) {

		return getDirectories(folder, "*.*");

	}


	public static String getCurrentFolder() {

		try{
			return new File(".").getCanonicalPath();

		} catch (Exception e){}

		return null;

	}


	public static boolean createFolder(String foldername) {

		try{
			File folder=new File(foldername);

			return folder.exists() ? true : folder.mkdir();

		} catch (Exception e){}

		return false;

	}


	public static boolean createFolder(String foldername, boolean clean) {

		try{
			if (createFolder(foldername) && clean)
				deleteFiles(foldername, "*.*");

			return true;

		} catch (Exception e){}

		return false;

	}



	/*
	 * Files
	 */
	public static File[] getFiles(File folder, String wildcards) {

		try{
			final Pattern pattern=Pattern.compile(
					wildcards.replace("*",".*").replace("?","."));

			return folder.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isFile() &&	pattern.matcher(file.getName()).find();
				}
			});

		} catch (Exception e){}

		return null;

	}


	public static File[] getFiles(File folder) {

		return getFiles(folder, "*.*");

	}


	public static int deleteFiles(String foldername, String wildcards) {

		int n=0;

		File folder=new File(foldername);
		File[] files=getFiles(folder, wildcards);
		if (files!=null){
			for (File file: files){
				if (file.delete())
					n++;
			}
			System.out.println(n+"/"+files.length+" files deleted in "+folder.getAbsolutePath()+wildcards);
		}

		return n;
	}



	/*
	 * Utils
	 */
	public static String[] getFileNames(File[] files) {

		try{
			String[] names=new String[files.length];
			for(int i=0; i<files.length; i++){
				names[i]=files[i].getName();
			}

			return names;

		} catch (Exception e){}

		return null;

	}


	public static String[] getFileNames(File folder, String wildcards) {

		return getFileNames(getFiles(folder,wildcards));

	}


	public static String[] getFileNames(File folder) {

		return getFileNames(folder,"*.*");

	}


}
