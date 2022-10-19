/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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
		try{File tmpdir=new File(System.getProperty("java.io.tmpdir")).getCanonicalFile();
			return new Folder(tmpdir, more);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public Folder(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see CustomFile#CustomFile(File, String...) */
	public Folder(File path, String...more) {
		super(path, more);
	}


	/*
	 * Folders
	 */
	public File[] listDirectories(final String wildcards) {

		FileFilter filter=new FileFilter() {
			//convert to regex
			String regex=wildcards.replace("*", ".*").replace("?", ".");
			Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File file) {
				return file.isDirectory() && pattern.matcher(file.getName()).find();
			}
		};

		try{return listFiles(filter);
		}catch(Exception e){
			System.err.println(e);
		}return new File[0];

	}

	public File[] listDirectories() {

		return listDirectories("*.*");

	}


	public boolean create() {

		try{return exists() ? true : mkdir();
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}



	/*
	 * Files
	 */
	public File[] listFiles(final String wildcards) {

		FileFilter filter=new FileFilter() {
			//convert to regex
			String regex=wildcards.replace("*", ".*").replace("?", ".");
			Pattern pattern=Pattern.compile(regex);
			@Override
			public boolean accept(File file) {
				return file.isFile() &&	pattern.matcher(file.getName()).find();
			}
		};

		try{return listFiles(filter);
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


	public static void main(String[] args) {

		System.out.println(current());
		System.out.println(current("tmp"));
		System.out.println(temporary());

	}


}