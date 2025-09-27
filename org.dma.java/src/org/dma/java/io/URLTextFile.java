/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import org.dma.java.input.FieldFormat.SEPARATOR;

public class URLTextFile extends URLFile {

	public final Charset charset;

	/** Uses JAVA DEFAULT charset */
	public URLTextFile(String url, String...more) {
		this(Charset.defaultCharset(), url, more);
	}

	public URLTextFile(Charset charset, String url, String...more) {
		this(charset, getURL(url, more));
	}

	public URLTextFile(Charset charset, URL url) {
		super(url);
		this.charset=charset;
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
	 * BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	 *
	 */
	/** Reads text from URL */
	public String read() {

		StringBuffer buffer=new StringBuffer(CustomFile.STRING_BUFFER_LENGTH);

		try{BufferedReader in=new BufferedReader(
					new InputStreamReader(asInputStream(), charset));

			try{String line;
				while((line=in.readLine()) != null){
					buffer.append(buffer.length()==0 ? line : SEPARATOR.LINE.value+line);
				}
			}finally{
				in.close();
			}

		}catch(Exception e){
			System.err.println(e);
		}return buffer.toString();

	}


}
