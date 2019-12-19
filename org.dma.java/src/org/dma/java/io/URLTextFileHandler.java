/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.dma.java.util.Debug;

public class URLTextFileHandler {

	public final FileURL fileurl;
	public final Charset charset;

	/** Uses JAVA DEFAULT charset */
	public URLTextFileHandler(FileURL fileurl) {
		this(fileurl, Charset.defaultCharset());
	}

	public URLTextFileHandler(FileURL fileurl, String charsetName) {
		this(fileurl, Charset.forName(charsetName));
	}

	public URLTextFileHandler(FileURL fileurl, Charset charset) {
		this.fileurl=fileurl;
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

		StringBuffer buffer=new StringBuffer(FileHandler.STRING_BUFFER_LENGTH);

		try{
			BufferedReader in=new BufferedReader(
					new InputStreamReader(fileurl.asInputStream(), charset));

			try{
				String line;
				while((line=in.readLine()) != null){
					buffer.append(buffer.length()==0 ? line : "\n"+line);
				}

			}finally{
				in.close();
			}

		}catch(Exception e){
			Debug.err(e);
		}

		return buffer.toString();

	}


}
