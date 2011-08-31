/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.file;

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
import java.net.MalformedURLException;

public class FileUtils {

	public static final String UTF8_SIGNATURE = "\ufeff";

	public static final String CHARSET_ISO = "ISO-8859-1";
	public static final String CHARSET_UTF8 = "UTF8";


	/*
	 * Close
	 */
	public static void close(Closeable resource) {
		if (resource!=null) {
			try{
				resource.close();

			} catch (IOException e){}
		}
	}


	/*
	 * Delete
	 */
	public static boolean deleteFile(String filename){

		return new File(filename).delete();

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

			final StringBuffer buffer=new StringBuffer();

			try{
				int ch;
				while ((ch = br.read()) > -1)
					buffer.append((char)ch);

			}finally{
				close(br);
			}

			return buffer.toString();

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static String readTextFile(String filename) {

		return readTextFile(new File(filename));

	}


	public static String readTextFileLines(File file, int count) {

		try{
			final BufferedReader br =
				new BufferedReader(
						new FileReader(file));

			String text = "";

			try{
				String line;
				while((line = br.readLine()) != null && count--!=0){
					text += line + "\n";
				}

			}finally{
				close(br);
			}

			return text;

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static String readTextFileLines(String filename, int count) {

		return readTextFileLines(new File(filename), count);

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

		} catch (IOException e){
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
			if(file != null){

				final BufferedInputStream bis =
					new BufferedInputStream(
							new FileInputStream(file));

				// Create the byte array to hold the data
				byte[] bytes;
				try{
					// Get the size of the file
					long length = file.length();

					// File is too large
					if (length > Integer.MAX_VALUE)
						throw new IOException("File is too large: "+file.getName());

					bytes=new byte[(int)length];

					// Read in the bytes
					int offset = 0;
					int numRead = 0;
					while (offset < bytes.length && (numRead=bis.read(bytes, offset, bytes.length-offset)) >= 0)
						offset += numRead;

					// Ensure all the bytes have been read in
					if (offset < bytes.length)
						throw new IOException("Could not completely read file: "+file.getName());

				}finally{
					// Close the input stream
					close(bis);
				}

				return bytes;

			}

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static byte[] readBytesStream(String filename) {

		return readBytesStream(new File(filename));

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
			if (bytes!=null){

				final BufferedOutputStream bos =
					new BufferedOutputStream(
							new FileOutputStream(file));

				try{
					bos.write(bytes);

				}finally{
					close(bos);
				}

				return bytes.length;
			}

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return 0;

	}


	public static int writeBytesStream(byte[] bytes, String filename) {

		return writeBytesStream(bytes, new File(filename));

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

		try{
			final BufferedReader br =
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(file), charset));

			StringBuffer buffer=new StringBuffer();

			try{
				int ch;
				while ((ch = br.read()) > -1)
					buffer.append((char)ch);

			}finally{
				close(br);
			}

			return buffer.toString();

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static String readTextStream(String filename, String charset) {

		return readTextStream(new File(filename), charset);

	}


	public static String readTextStreamUTF8(File file) {

		return readTextStream(file, CHARSET_UTF8);
	}


	public static String readTextStreamUTF8(String filename) {

		return readTextStreamUTF8(new File(filename));

	}


	public static String readURLTextStream(String fileurl) {

		try{
			final BufferedReader br = new BufferedReader(
					new InputStreamReader(HTTPUtils.getInputStream(fileurl)));

			final StringBuffer buffer=new StringBuffer();

			try{
				int ch;
				while ((ch = br.read()) > -1)
					buffer.append((char)ch);

			}finally{
				close(br);
			}

			return buffer.toString();

		} catch (MalformedURLException e){
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static String readTextStreamLines(File file, int count, String charset) {

		try{
			final BufferedReader br =
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(file), charset));

			String text="";

			try{
				String line;
				while((line = br.readLine()) != null && count--!=0)
					text += line + "\n";

			}finally{
				close(br);
			}

			return text;

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return null;

	}


	public static String readTextStreamLines(String filename, int count, String charset) {

		return readTextStreamLines(new File(filename), count, charset);

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

		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		} catch (IOException e){
		}

		return false;

	}


	public static boolean writeTextStream(String text, String filename, String charset) {

		return writeTextStream(text, new File(filename), charset);

	}


	public static boolean writeTextStreamUTF8(String text, File file) {

		return writeTextStream(text, file, CHARSET_UTF8);

	}


	public static boolean writeTextStreamUTF8(String text, String filename) {

		return writeTextStreamUTF8(text, new File(filename));

	}


	public static boolean replaceOcurrencesUTF8(String filename, String[][] searchReplace){
		try{
			String text=FileUtils.readTextStreamUTF8(filename);

			for(int i=0; i<searchReplace.length; i++)
				text=text.replaceAll(searchReplace[i][0], searchReplace[i][1]);

			FileUtils.writeTextStreamUTF8(text, filename);

			return true;

		} catch (Exception e){
			e.printStackTrace();
		}

		return false;

	}


	/*
	 * Temporary Files
	 *
	 * prefix - The prefix string to be used in generating the file's name;
	 * 			must be at least three characters long
	 *
	 * suffix - The suffix string to be used in generating the file's name;
	 * 			may be null, in which case the suffix ".tmp" will be used
	 *
	 * directory - The directory in which the file is to be created,
	 * 			or null if the default temporary-file directory is to be used
	 *
	 */
	public static String createTempFile(FileParameters parameters){

		try{
			File directory=parameters.getFolder()!=null ? new File(parameters.getFolder()): null;
			File file=File.createTempFile(parameters.getPrefix(), "."+parameters.getSuffix(), directory);
			file.deleteOnExit();

			return file.getAbsolutePath();

		} catch (IOException e){
		}

		return null;

	}


	public static String createTempFile(byte[] bytes, FileParameters parameters){

		try{
			String filename=createTempFile(parameters);
			writeBytesStream(bytes, filename);

			return filename;

		} catch (Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static void main(String[] argvs){

		String text=readURLTextStream("http://dl.dropbox.com/u/126065/Colibri/versao.txt");
		System.out.println(text);

	}


}
