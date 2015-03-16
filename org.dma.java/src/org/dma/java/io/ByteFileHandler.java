/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

public class ByteFileHandler extends FileHandler {

	public ByteFileHandler(String filename) {
		super(filename);
	}

	public ByteFileHandler(File file) {
		super(file);
	}


	/**
	 * Reads and encodes into BASE64
	 * @param lineLength - Each line of encoded data will be
	 * at most of the given length. If lineLength <= 0, then
	 * the output will not be divided into lines.
	 */
	public String readBase64(int lineLength) {

		try{
			return new Base64(lineLength).encodeToString(read());

		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	/**
	 * Reads and encodes into BASE64
	 * with a line length of 64
	 */
	public String readBase64() {

		return readBase64(BASE64_LINE_LENGTH);

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
	public byte[] read() {

		try{
			final BufferedInputStream bis=
					new BufferedInputStream(
							new FileInputStream(file));

			try{
				return new AbstractByteReader(){
					public int read(byte[] b, int off, int len) throws IOException {
						return bis.read(b, off, len);
					}
				}.read(file);

			}finally{
				bis.close();
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
	public int write(byte[] bytes) {

		try{
			BufferedOutputStream bos=
					new BufferedOutputStream(
							new FileOutputStream(file));

			try{
				bos.write(bytes);

			}finally{
				bos.close();
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


}
