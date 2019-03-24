/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

public class XMLFileHandler<T> extends FileHandler {

	public XMLFileHandler(String pathname) {
		super(pathname);
	}

	public XMLFileHandler(File file) {
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
	public T read() {

		try{
			BufferedInputStream bis=new BufferedInputStream(asInputStream());

			XMLDecoder decoder=new XMLDecoder(bis);

			try{
				return (T)decoder.readObject();

			}finally{
				decoder.close();
				bis.close();
			}

		}catch(Exception e){
			System.err.println(e);
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
	public boolean write(T obj) {

		try{
			BufferedOutputStream bos=new BufferedOutputStream(asOutputStream());

			XMLEncoder encoder=new XMLEncoder(bos);

			try{
				encoder.writeObject(obj);

			}finally{
				encoder.close();
				bos.close();
			}

			return true;

		}catch(Exception e){
			System.err.println(e);
		}

		return false;

	}


}
