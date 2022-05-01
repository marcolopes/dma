/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.apache.commons.lang.SystemUtils;

import org.dma.java.util.StringUtils;

public class CustomFile extends File {

	/**
	 * Unicode Byte Order Mark<br>
	 * http://unicode.org/faq/utf_bom.html
	 */
	public static final char[] UTF8_BOM_BYTES = new char[]{0xEF,0xBB,0xBF};
	public static final String UTF8_BOM = new String(UTF8_BOM_BYTES);
	public static final String UTF16_BOM = "\ufeff";

	public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
	public static final Charset UTF16_CHARSET = StandardCharsets.UTF_16;
	public static final Charset ISO_CHARSET = StandardCharsets.ISO_8859_1;
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
		return StringUtils.removeChars(plain, "<>:?*\"\n\r\t\f\0");
	}

	public CustomFile(String pathname, String...more) {
		this(new File(pathname), more);
	}

	/** @see Paths#get(String, String...) */
	public CustomFile(File path, String...more) {
		super(more.length==0 ? path.getAbsolutePath() :
			Paths.get(path.getAbsolutePath(), more).toFile().getAbsolutePath());
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


	public boolean create() {
		try{return super.createNewFile();
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


	/** @see Desktop#open(File) */
	public boolean open() {
		if (Desktop.isDesktopSupported()){
			Desktop desktop=Desktop.getDesktop();
			if (desktop.isSupported(Desktop.Action.OPEN)) try{
				desktop.open(this);
				return true;
			}catch(Exception e){
				System.err.println(e);
			}
		}return false;
	}


	/** @see Command#Command(File, String, List) */
	public boolean execute(File directory) {
		Command command=new Command(directory, toString());
		try{return command.start().exitValue()==0;
		}catch(Exception e){
			System.err.println(e);
		}//The requested operation requires elevation
		command=new Command(directory, "rundll32", "url.dll", "FileProtocolHandler", toString());
		if (SystemUtils.IS_OS_WINDOWS) try{
			return command.start().exitValue()==0;
		}catch(Exception e){
			System.err.println(e);
		}return open();
	}


	public FileInputStream asInputStream() throws FileNotFoundException {
		return new FileInputStream(this);
	}


	public FileOutputStream asOutputStream(boolean append) throws FileNotFoundException {
		return new FileOutputStream(this, append);
	}


	public FileOutputStream asOutputStream() throws FileNotFoundException {
		return asOutputStream(false);
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


	public static void main(String[] args) {

		System.out.println(new CustomFile(""));

	}


}
