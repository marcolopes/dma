/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileHandler extends FileHandler {

	public ByteFileHandler(String filename) {
		super(filename);
	}

	public ByteFileHandler(File file) {
		super(file);
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

		}catch(Exception e){
			System.out.println(e);
		}

		return null;

	}


	public byte[] readFully() {

		byte[] bytes=new byte[(int)file.length()];

		try{
			DataInputStream dis=
					new DataInputStream(
							new BufferedInputStream(
									new FileInputStream(file)));

			try{
				dis.readFully(bytes);

			}finally{
				dis.close();
			}

		}catch(Exception e){
			System.out.println(e);
		}

		return bytes;

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

		}catch(Exception e){
			System.out.println(e);
		}

		return 0;

	}


}
