/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.regex.Pattern;

public class FolderUtils {

	/*
	 * Folders
	 */
	public static String currentFolder() {

		try{
			return new File(".").getCanonicalPath();

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static boolean createFolder(File folder) {

		try{
			return folder.exists() ? true : folder.mkdir();

		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean createFolder(String foldername) {

		return createFolder(new File(foldername));

	}


	public static File[] listDirectories(File folder, String wildcards) {

		try{
			final Pattern pattern=Pattern.compile(
					//convert to regex
					wildcards.replace("*",".*").replace("?","."));

			return folder.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isDirectory() && pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static File[] listDirectories(File folder) {

		return listDirectories(folder, "*.*");

	}





	/*
	 * Files
	 */
	public static int deleteFiles(File folder, String wildcards) {

		int n=0;

		try{
			File[] files=listFiles(folder, wildcards);
			if(files!=null){
				for(File file: files){
					if(file.delete()) n++;
				}
				System.out.println(n+"/"+files.length+" files deleted in "+
						folder.getAbsolutePath()+File.separator+wildcards);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return n;

	}


	public static int deleteFiles(String foldername, String wildcards) {

		return deleteFiles(new File(foldername), wildcards);

	}


	public static int deleteFiles(String wildcards){

		return deleteFiles(currentFolder(), wildcards);

	}


	public static int deleteAllFiles(String foldername) {

		return deleteFiles(foldername, "*.*");

	}


	public static File[] listFiles(File folder, String wildcards) {

		try{
			final Pattern pattern=Pattern.compile(
					wildcards.replace("*",".*").replace("?","."));

			return folder.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isFile() &&	pattern.matcher(file.getName()).find();
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static File[] listFiles(File folder) {

		return listFiles(folder, "*.*");

	}


	public static String[] getFileNames(File[] files) {

		try{
			int i=0;
			String[] names=new String[files.length];
			for(File file: files){
				names[i++]=file.getName();
			}

			return names;

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static String[] getFileNames(File folder, String wildcards) {

		return getFileNames(listFiles(folder,wildcards));

	}


	public static String[] getFileNames(File folder) {

		return getFileNames(folder,"*.*");

	}


}
