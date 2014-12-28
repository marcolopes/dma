/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;
import org.dma.utils.java.net.NetUtils;
import org.dma.utils.java.string.StringUtils;

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


	/**
	 * Encodes a file into BASE64
	 * @param filename - the file whose contents will be encoded
	 * @param lineLength - Each line of encoded data will be at most
	 * of the given length (rounded down to nearest multiple of 4).
	 * If lineLength <= 0, then the output will not be divided into lines.
	 */
	public static String encodeToBase64(String filename, int lineLength) {

		try{
			byte[] bytes=readBytesStream(filename);

			return new Base64(lineLength).encodeToString(bytes);

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}



	/**
	 * Encodes a file into BASE64 with a line length of 64
	 * @param filename - the file whose contents will be encoded
	 */
	public static String encodeToBase64(String filename) {

		return encodeToBase64(filename, BASE64_LINE_LENGTH);

	}





	/*
	 * Close
	 */
	public static void close(Closeable resource) {
		try{
			resource.close();

		}catch(IOException e){
		}catch(Exception e){
			e.printStackTrace();
		}
	}





	/*
	 * Delete
	 */
	public static boolean deleteFile(File file){

		try{
			return file.delete();

		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean deleteFile(String filename) {

		return deleteFile(new File(filename));

	}





	/*
	 * Class FileReader
	 *
	 * Convenience class for reading character files.
	 *
	 * The constructors of this class assume that the default character encoding and the
	 * default byte-buffer size are appropriate. To specify these values yourself,
	 * construct an InputStreamReader on a FileInputStream.
	 *
	 * FileReader is meant for reading streams of characters.
	 * For reading streams of raw bytes, consider using a FileInputStream.
	 *
	 */
	public static String readTextFile(File file) {

		try{
			final BufferedReader br =
					new BufferedReader(
							new FileReader(file));

			final StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

			try{
				int ch;
				while((ch = br.read()) > -1){
					buffer.append((char)ch);
				}

			}finally{
				close(br);
			}

			return buffer.toString();

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static String readTextFile(String filename) {

		return readTextFile(new File(filename));

	}


	public static String readTextFile(File file, int lines) {

		StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

		try{
			final BufferedReader br =
					new BufferedReader(
							new FileReader(file));

			try{
				String line;
				while((line = br.readLine()) != null && lines--!=0){
					buffer.append(line + "\n");
				}

			}finally{
				close(br);
			}

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return buffer.toString();

	}


	public static String readTextFile(String filename, int lines) {

		return readTextFile(new File(filename), lines);

	}





	/*
	 * Class FileWriter
	 *
	 * Convenience class for writing character files.
	 *
	 * The constructors of this class assume that the default character encoding and
	 * the default byte-buffer size are acceptable. To specify these values yourself,
	 * construct an OutputStreamWriter on a FileOutputStream.
	 *
	 * Whether or not a file is available or may be created depends upon the underlying
	 * platform. Some platforms, in particular, allow a file to be opened for writing
	 * by only one FileWriter (or other file-writing object) at a time.
	 * In such situations the constructors in this class will fail if the file involved
	 * is already open.
	 *
	 * FileWriter is meant for writing streams of characters. For writing streams of raw bytes,
	 * consider using a FileOutputStream.
	 *
	 */
	public static boolean writeTextFile(String text, File file) {

		try{
			final BufferedWriter bw =
					new BufferedWriter(
							new FileWriter(file));

			try{
				bw.write(text);

			}finally{
				close(bw);
			}

			return true;

		}catch(IOException e){
			System.out.println(e);
		}catch(NullPointerException e){
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean writeTextFile(String text, String filename) {

		return writeTextFile(text, new File(filename));

	}





	/*
	 * Class FileInputStream
	 *
	 * A FileInputStream obtains input bytes from a file in a file system.
	 * What files are available depends on the host environment.
	 *
	 * FileInputStream is meant for reading streams of raw bytes such as image data.
	 * For reading streams of characters, consider using FileReader.
	 */
	public static byte[] readBytesStream(File file) {

		try{
			final BufferedInputStream bis =
					new BufferedInputStream(
							new FileInputStream(file));

			try{
				return new AbstractByteReader(){
					public int read(byte[] b, int off, int len) throws IOException {
						return bis.read(b, off, len);
					}
				}.readFile(file);

			}finally{
				close(bis);
			}

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static byte[] readBytesStream(String filename) {

		return readBytesStream(new File(filename));

	}


	public static Object readXMLStream(File file) {

		try{
			final XMLDecoder decoder =
					new XMLDecoder(
							new BufferedInputStream(
									new FileInputStream(file)));

			try{
				return decoder.readObject();

			}finally{
				decoder.close();
			}

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static Object readXMLStream(String filename) {

		return readXMLStream(new File(filename));

	}





	/*
	 * Class FileOutputStream
	 *
	 * A file output stream is an output stream for writing data to a File or to a
	 * FileDescriptor. Whether or not a file is available or may be created depends upon
	 * the underlying platform. Some platforms, in particular, allow a file to be opened
	 * for writing by only one FileOutputStream (or other file-writing object) at a time.
	 * In such situations the constructors in this class will fail if the file involved
	 * is already open.
	 *
	 * FileOutputStream is meant for writing streams of raw bytes such as image data.
	 * For writing streams of characters, consider using FileWriter.
	 *
	 */
	public static int writeBytesStream(byte[] bytes, File file) {

		try{
			final BufferedOutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(file));

			try{
				bos.write(bytes);

			}finally{
				close(bos);
			}

			return bytes.length;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(NullPointerException e){
		}catch(Exception e){
			e.printStackTrace();
		}

		return 0;

	}


	public static int writeBytesStream(byte[] bytes, String filename) {

		return writeBytesStream(bytes, new File(filename));

	}


	public static boolean writeXMLStream(Object obj, File file) {

		try{
			XMLEncoder encoder =
				new XMLEncoder(
					new BufferedOutputStream(
						new FileOutputStream(file)));

			try{
				encoder.writeObject(obj);

			}finally{
				encoder.close();
			}

			return true;

		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean writeXMLStream(Object obj, String filename) {

		return writeXMLStream(obj, new File(filename));

	}






	/*
	 * Class InputStreamReader
	 *
	 * An InputStreamReader is a bridge from byte streams to character streams:
	 * It reads bytes and decodes them into characters using a specified charset.
	 * The charset that it uses may be specified by name or may be given explicitly,
	 * or the platform's default charset may be accepted.
	 *
	 * Each invocation of one of an InputStreamReader's read() methods may cause one
	 * or more bytes to be read from the underlying byte-input stream. To enable the
	 * efficient conversion of bytes to characters, more bytes may be read ahead from
	 * the underlying stream than are necessary to satisfy the current read operation.
	 *
	 * For top efficiency, consider wrapping an InputStreamReader within a BufferedReader.
	 * For example:
	 *  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 *
	 */
	public static String readTextStream(File file, String charset) {

		StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

		try{
			final BufferedReader br =
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(file), charset));

			try{
				int ch;
				while((ch = br.read()) > -1){
					buffer.append((char)ch);
				}

			}finally{
				close(br);
			}

		}catch(UnsupportedEncodingException e) {
			System.out.println(e);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return buffer.toString();

	}


	public static String readTextStream(String filename, String charset) {

		return readTextStream(new File(filename), charset);

	}


	public static String readUTF8TextStream(File file) {

		return readTextStream(file, UTF8_CHARSET);
	}


	public static String readUTF8TextStream(String filename) {

		return readUTF8TextStream(new File(filename));

	}


	public static String readTextStream(File file, String charset, int lines) {

		StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

		try{
			final BufferedReader br =
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(file), charset));

			try{
				String line;
				while((line = br.readLine()) != null && lines--!=0){
					buffer.append(line + "\n");
				}

			}finally{
				close(br);
			}

		}catch(UnsupportedEncodingException e) {
			System.out.println(e);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return buffer.toString();

	}


	public static String readTextStream(String filename, String charset, int lines) {

		return readTextStream(new File(filename), charset, lines);

	}


	public static String readURLTextStream(String fileurl, String charset) {

		final StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

		try{
			final BufferedReader br =
					new BufferedReader(
							new InputStreamReader(
									NetUtils.getInputStream(fileurl), charset));

			try{
				int ch;
				while((ch = br.read()) > -1){
					buffer.append((char)ch);
				}

			}finally{
				close(br);
			}

		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return buffer.toString();

	}


	public static String readUTF8URLTextStream(String fileurl) {

		return readURLTextStream(fileurl, UTF8_CHARSET);
	}





	/*
	 * Class OutputStreamWriter
	 *
	 * An OutputStreamWriter is a bridge from character streams to byte streams:
	 *
	 * Characters written to it are encoded into bytes using a specified charset.
	 * The charset that it uses may be specified by name or may be given explicitly,
	 * or the platform's default charset may be accepted.
	 *
	 * Each invocation of a write() method causes the encoding converter to be invoked
	 * on the given character(s). The resulting bytes are accumulated in a buffer
	 * before being written to the underlying output stream.
	 * The size of this buffer may be specified, but by default it is large enough
	 * for most purposes.
	 *
	 * Note that the characters passed to the write() methods are not buffered.
	 * For top efficiency, consider wrapping an OutputStreamWriter within a BufferedWriter
	 * so as to avoid frequent converter invocations. For example:
	 * Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
	 *
	 */
	public static boolean writeTextStream(String text, File file, String charset) {

		try{
			final BufferedWriter bw =
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream(file), charset));

			try{
				bw.write(text);

			}finally{
				close(bw);
			}

			return true;

		}catch(UnsupportedEncodingException e) {
			System.out.println(e);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}catch(NullPointerException e){
		}catch(Exception e){
			e.printStackTrace();
		}

		return false;

	}


	public static boolean writeTextStream(String text, String filename, String charset) {

		return writeTextStream(text, new File(filename), charset);

	}


	public static boolean writeUTF8TextStream(String text, File file) {

		return writeTextStream(text, file, UTF8_CHARSET);

	}


	public static boolean writeUTF8TextStream(String text, String filename) {

		return writeUTF8TextStream(text, new File(filename));

	}


}
