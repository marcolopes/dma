/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLTextFileHandler extends TextFileHandler {

	public final FileURL fileurl;

	/** Uses JAVA DEFAULT charset */
	public URLTextFileHandler(FileURL fileurl) {
		this(fileurl, null);
	}

	/** charsetName=null uses JAVA DEFAULT charset */
	public URLTextFileHandler(FileURL fileurl, String charsetName) {
		super(fileurl.toString(), charsetName);
		this.fileurl=fileurl;
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
	@Override
	public String read() {

		StringBuffer buffer=new StringBuffer(STRING_BUFFER_LENGTH);

		try{
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(
									fileurl.asInputStream(), charset));

			try{
				String line;
				while((line=br.readLine()) != null){
					buffer.append(buffer.length()==0 ? line : "\n"+line);
				}

			}finally{
				br.close();
			}

		}catch(Exception e){
			System.out.println(e);
		}

		return buffer.toString();

	}


}
