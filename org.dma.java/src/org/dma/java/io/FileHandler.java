/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.dma.java.util.StringUtils;

public class FileHandler {

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

	public final File file;

	public FileHandler(String filename) {
		this(new File(filename));
	}

	public FileHandler(File file) {
		this.file=file;
	}


	/**
	 * Removes accents and illegal characters<br>
	 * Replaces SPACES with UNDERLINES
	 */
	public static String normalize(String filename) {
		return StringUtils.normalize(filename).
				replace("- ","-").
				replace(" -","-").
				replace(" ","_");
	}


	/**
	 * Generic File Copy<br>
	 * Does not cancel the operation
	 */
	public AbstractFileCopy copy() {
		return new AbstractFileCopy(file){
			public boolean cancel() {
				return false;
			}
		};
	}


	public boolean delete() {
		try{
			return file.delete();

		}catch(Exception e){
			System.out.println(e);
		}

		return false;
	}


	public boolean renameTo(String filename) {
		try{
			return file.renameTo(new File(filename));

		}catch(Exception e){
			System.out.println(e);
		}

		return false;
	}


	public InputStream asInputStream() {
		try{
			return new FileInputStream(file);

		}catch(FileNotFoundException e){
			System.out.println(e);
		}

		return null;
	}


	public URL toURL() {
		try{
			return file.toURI().toURL();

		}catch(MalformedURLException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;
	}


	public boolean equals(File file){
		try{
			return this.file.getCanonicalFile().
					equals(file.getCanonicalFile());

		}catch(IOException e){}

		return false;
	}


}
