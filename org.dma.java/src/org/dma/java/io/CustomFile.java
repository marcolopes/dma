/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.dma.java.util.StringUtils;

public class CustomFile extends File {

	/**
	 * Unicode Byte Order Mark<br>
	 * http://unicode.org/faq/utf_bom.html
	 */
	public static final String UTF8_BOM = new String(new char[]{0xEF,0xBB,0xBF});
	public static final String UTF16_BOM = "\ufeff";

	public static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
	public static final Charset UTF16_CHARSET = Charset.forName("UTF-16");
	public static final Charset ISO_CHARSET = Charset.forName("ISO-8859-1");
	public static final Charset WIN1252_CHARSET = Charset.forName("Windows-1252");

	public static final int BASE64_LINE_LENGTH = 64;
	public static final int STRING_BUFFER_LENGTH = 4096;

	/** Replace an existing file AND copy attributes */
	public static final CopyOption[] COPY_OPTIONS = new CopyOption[]{
		StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES};

	/** Replace an existing file */
	public static final CopyOption[] MOVE_OPTIONS = new CopyOption[]{
		StandardCopyOption.REPLACE_EXISTING};

	/** Replaces accented and illegal characters */
	public static String normalize(String filename) {
		String plain=StringUtils.unaccent(filename).
				replace("  "," ").replace(" -","-").replace("- ","-").
				replace('\\','-').replace('/','-').replace('|','-').replace("--","-").
				replace(' ','_').replace("__","_");
		return StringUtils.removeChars(plain,"<>:?*\"\n\r\t\f\0");
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public CustomFile(File path, String...more) {
		this(path.getAbsolutePath(), more);
	}

	/** @see Paths#get(String, String...) */
	public CustomFile(String pathname, String...more) {
		this(Paths.get(pathname, more).toFile());
	}

	public CustomFile(File file) {
		super(file.getAbsolutePath());
	}


	/**
	 * Generic File Copy<br>
	 * Does not cancel the operation
	 */
	@Deprecated
	public AbstractFileCopy copy() {
		return new AbstractFileCopy(this){
			@Override
			public boolean cancel() {
				return false;
			}
		};
	}


	/**
	 * Copies the file to DESTINATION
	 * @param dst can be file or directory
	 */
	public boolean copyTo(File dst, CopyOption...options) {
		if (exists()) try{//destination can be a directory!
			File target=dst.isDirectory() ? Paths.get(dst.getPath(), getName()).toFile() : dst;
			Files.copy(toPath(), target.toPath(), options.length==0 ? COPY_OPTIONS : options);
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/**
	 * Moves the file to DESTINATION
	 * @param dst can be file or directory
	 */
	public boolean moveTo(File dst, CopyOption...options) {
		if (exists()) try{//destination can be a directory!
			File target=dst.isDirectory() ? Paths.get(dst.getPath(), getName()).toFile() : dst;
			Files.move(toPath(), target.toPath(), options.length==0 ? MOVE_OPTIONS : options);
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	public boolean renameTo(String pathname) {
		try{return renameTo(new File(pathname));
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	@Override
	public boolean delete() {
		try{return super.delete();
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	public FileInputStream asInputStream() {
		try{return new FileInputStream(this);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public FileOutputStream asOutputStream() {
		return asOutputStream(false);
	}


	public FileOutputStream asOutputStream(boolean append) {
		try{return new FileOutputStream(this, append);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public URL toURL() {
		try{return toURI().toURL();
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}


	public boolean equals(File file) {
		try{return getCanonicalFile().equals(file.getCanonicalFile());
		}catch(Exception e){
			System.err.println(e);
		}return false;
	}


	/** @see File#getPath() */
	@Override
	public String toString() {
		return getPath();
	}


}
