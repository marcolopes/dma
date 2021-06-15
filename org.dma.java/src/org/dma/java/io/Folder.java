/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class Folder extends CustomFile {

	public static Folder current(String...more) {
		try{return new Folder("", more);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	public static Folder temporary(String...more) {
		try{return new Folder(System.getProperty("java.io.tmpdir"), more);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	public Folder(File path, String...more) {
		super(path, more);
	}

	public Folder(String pathname, String...more) {
		super(pathname, more);
	}

	public Folder(File folder) {
		super(folder);
	}


	/*
	 * Folders
	 */
	public File[] listDirectories(final String wildcards) {

		try{
			return listFiles(new FileFilter() {
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
			return exists() ? true : mkdir();

		}catch(Exception e){
			System.err.println(e);
		}return false;

	}



	/*
	 * Files
	 */
	public File[] listFiles(final String wildcards) {

		try{
			return listFiles(new FileFilter() {
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

	@Override
	public File[] listFiles() {

		return listFiles("*.*");

	}


	@Deprecated
	String[] getFileNames(String wildcards) {

		int index=0;
		File[] files=listFiles(wildcards);
		String[] names=new String[files.length];
		for(File file: files) names[index++]=file.getName();
		return names;

	}

	@Deprecated
	String[] getFileNames() {

		return getFileNames("*.*");

	}


	public int deleteFiles(String wildcards) {

		int count=0;

		File[] files=listFiles(wildcards);
		for(File file: files) try{
			if (file.delete()) count++;

		}catch(Exception e){
			System.err.println(e);
		}System.out.println(count+"/"+files.length+" files deleted in "+toString());

		return count;

	}


	public int deleteAllFiles() {

		return deleteFiles("*.*");

	}


	public static final void main(String[] args) {

		System.out.println(current());
		System.out.println(current("tmp"));
		System.out.println(temporary());

	}


}