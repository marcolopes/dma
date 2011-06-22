/*******************************************************************************
 * 2008-2011 Public Domain
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
	public static File[] getDirectories(File folder, String wilcards) {

		try {
			final Pattern pattern=Pattern.compile(wilcards.replace("*", ".*").replace("?", "."));

			FileFilter fileFilter = new FileFilter() {
				public boolean accept(File file) {
					return file.isDirectory() && pattern.matcher(file.getName()).find();
				}
			};
			return folder.listFiles(fileFilter);

		} catch (Exception e) {}

		return null;

	}


	public static File[] getDirectories(File folder) {

		return getDirectories(folder, "*.*");

	}


	public static boolean createFolder(String folder) {

		try{
			File file=new File(folder);

			return file.exists() ? true : file.mkdir();

		}catch(Exception e){}

		return false;

	}


	public static boolean createFolder(String folder, boolean clean) {

		try{
			if (createFolder(folder)){
				if (clean) deleteFiles(folder, "*.*");
				return true;
			}

		}catch(Exception e){}

		return false;

	}


	/*
	 * Files
	 */
	public static File[] getFiles(File folder, final String wilcards) {

		try {
			final Pattern pattern=Pattern.compile(wilcards.replace("*", ".*").replace("?", "."));

			FileFilter fileFilter = new FileFilter() {
				public boolean accept(File file) {
					return file.isFile() &&	pattern.matcher(file.getName()).find();
				}
			};
			return folder.listFiles(fileFilter);

		} catch (Exception e) {}

		return null;

	}


	public static File[] getFiles(File folder) {

		return getFiles(folder, "*.*");

	}


	public static int deleteFiles(String folder, String wilcards) {

		int n=0;

		File[] files = getFiles(new File(folder),wilcards);
		if (files!=null){

			for (File file : files)
				if (file.delete()) ++n;

			System.out.println(n+"/"+files.length+" files deleted in "+folder+wilcards);
		}

		return n;
	}



	/*
	 * Utils
	 */
	public static String[] getFileNames(File[] files) {

		try {
			String[] names=new String[files.length];
			for(int i=0; i<files.length; i++){
				names[i]=files[i].getName();
			}

			return names;

		} catch (Exception e) {}

		return null;

	}


	public static String[] getFileNames(File folder, final String wilcards) {

		return getFileNames(getFiles(folder,wilcards));

	}


	public static String[] getFileNames(File folder) {

		return getFileNames(folder,"*.*");

	}


}
