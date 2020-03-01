/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import org.dma.java.util.StringUtils;

public class URLFileHandler {

	/** Replaces accented and illegal characters */
	public static String normalize(String string) {
		//http://www.w3.org/Addressing/URL/uri-spec.html
		String plain=StringUtils.unaccent(string).replaceAll(" ","+");
		return StringUtils.removeChars(plain,"\n\r\t\f\0");
	}

	public static URL getURL(String urlname, String filename) {
		try{
			return new URL(urlname+"/"+filename);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	public final String urlname;
	public final String filename;
	/** Workaround for EXTENDS URL */
	public final URL url;

	/** Example: https//www.ftp.com/file.txt */
	public URLFileHandler(String fileurl) {
		String array[]=StringUtils.splitLastIndex(fileurl, "/");
		this.urlname=array[0];
		this.filename=array[1];
		this.url=getURL(urlname, filename);
	}

	public URLFileHandler(String urlname, String filename) {
		this.urlname=urlname;
		this.filename=filename;
		this.url=getURL(urlname, filename);
	}


	public InputStream asInputStream() throws IOException {

		URLConnection connection=url.openConnection();

		connection.setDoInput(true); //input connection
		connection.setDoOutput(false); //output connection
		connection.setUseCaches(false); //avoid a cached file

		return connection.getInputStream();

	}

	public OutputStream asOutputStream() throws IOException {

		URLConnection connection=url.openConnection();

		connection.setDoInput(false); //input connection
		connection.setDoOutput(true); //output connection
		connection.setUseCaches(false); //avoid a cached file

		return connection.getOutputStream();

	}

	@Override
	public String toString() {
		return url.toString();
	}


}
