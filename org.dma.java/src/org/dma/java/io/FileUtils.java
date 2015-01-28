/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.dma.java.util.StringUtils;

public class FileUtils {

	/**
	 * Unicode Byte Order Mark<br>
	 * http://unicode.org/faq/utf_bom.html
	 */
	public static final String UTF8_CHARSET = "UTF-8";
	public static final String UTF8_BOM = new String(new char[]{0xEF,0xBB,0xBF});

	public static final String UTF16_CHARSET = "UTF-16";
	public static final String UTF16_BOM = "\ufeff";

	public static final String ISO_CHARSET = "ISO-8859-1";
	public static final String WIN1252_CHARSET = "Windows-1252";

	public static final int BASE64_LINE_LENGTH = 64;
	public static final int STRING_BUFFER_LENGTH = 4096;

	/**
	 * Generic File Copy<br>
	 * Does not cancel the operation
	 */
	public static final AbstractFileCopy FILECOPY = new AbstractFileCopy(){
		public boolean cancel() {
			return false;
		}
	};


	/*
	 * Delete
	 */
	public static boolean deleteFile(File file){

		try{
			return file.delete();

		}catch(Exception e){
			System.out.println(e);
		}

		return false;

	}


	public static boolean deleteFile(String filename) {

		return deleteFile(new File(filename));

	}



	/*
	 * Conversion
	 */
	public static URL toURL(File file){
		try{
			return file.toURI().toURL();

		}catch(MalformedURLException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}


	public static URL toURL(String filename){

		return toURL(new File(filename));

	}


	/**
	 * Removes accents and illegal characters<br>
	 * Replaces SPACES with UNDERLINES
	 */
	public static String normalize(String filename){

		return StringUtils.normalize(filename).
				replace("- ","-").replace(" -","-").replace(" ","_");

	}


}
