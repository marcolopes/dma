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

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

public class XMLFile<T> extends CustomFile {

	/** @see CustomFile#CustomFile(File, String...) */
	public XMLFile(File path, String...more) {
		super(path, more);
	}

	/** @see CustomFile#CustomFile(String, String...) */
	public XMLFile(String pathname, String...more) {
		super(pathname, more);
	}

	/** @see CustomFile#CustomFile(File) */
	public XMLFile(File path) {
		super(path);
	}


	/*
	 * Class BufferedInputStream
	 *
	 * A BufferedInputStream adds functionality to another input stream-namely,
	 * the ability to buffer the input and to support the mark and reset methods.
	 * When the BufferedInputStream is created, an internal buffer array is created.
	 * As bytes from the stream are read or skipped, the internal buffer is refilled
	 * as necessary from the contained input stream, many bytes at a time.
	 * The mark operation remembers a point in the input stream and the reset operation
	 * causes all the bytes read since the most recent mark operation to be reread before
	 * new bytes are taken from the contained input stream.
	 */
	public T read() {

		try{BufferedInputStream in=new BufferedInputStream(asInputStream());

			XMLDecoder decoder=new XMLDecoder(in);

			try{return (T)decoder.readObject();
			}finally{
				decoder.close();
				in.close();
			}

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}



	/*
	 * Class BufferedOutputStream
	 *
	 * The class implements a buffered output stream.
	 * By setting up such an output stream, an application can write bytes
	 * to the underlying output stream without necessarily causing a call to
	 * the underlying system for each byte written.
	 *
	 */
	public boolean write(T obj) {

		try{BufferedOutputStream out=new BufferedOutputStream(asOutputStream());

			XMLEncoder encoder=new XMLEncoder(out);

			try{encoder.writeObject(obj);
			}finally{
				encoder.close();
				out.close();
			}return true;

		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	public static void main(String[] args) {

		XMLFile<String> handler=new XMLFile("XMLFileHandler.xml");
		handler.write("The quick brown fox jumps over the lazy dog.");
		System.out.println(handler.read());

	}


}
