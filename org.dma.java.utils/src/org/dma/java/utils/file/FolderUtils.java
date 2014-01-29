/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

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

		}catch (IOException e){
			System.out.println(e);
		}catch (Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static boolean createFolder(String foldername) {

		try{
			File folder=new File(foldername);

			return folder.exists() ? true : folder.mkdir();

		}catch (Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean createFolder(String foldername, boolean clean) {

		try{
			if(createFolder(foldername) && clean){
				deleteFiles(foldername, "*.*");
			}

			return true;

		}catch (Exception e){
			e.printStackTrace();
		}

		return false;

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

		}catch (Exception e){
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
	public static int deleteFiles(String foldername, String wildcards) {

		int n=0;

		File folder=new File(foldername);
		File[] files=listFiles(folder, wildcards);
		if(files!=null){
			for(File file: files){
				if(file.delete()) n++;
			}
			System.out.println(n+"/"+files.length+" files deleted in "+
					folder.getAbsolutePath()+File.separator+wildcards);
		}

		return n;

	}


	public static int deleteFiles(String wildcards){

		return deleteFiles(currentFolder(), wildcards);

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

		}catch (Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static File[] listFiles(File folder) {

		return listFiles(folder, "*.*");

	}


	public static String[] getFileNames(File[] files) {

		try{
			String[] names=new String[files.length];
			for(int i=0; i<files.length; i++){
				names[i]=files[i].getName();
			}

			return names;

		}catch (Exception e){
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
