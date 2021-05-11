/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

public class URLHandler {

	public static Pattern URL_PATTERN = Pattern.compile(
			"^((((https?)://)|(mailto:|news:))" +
			"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
			"([).!';/?:,][[:blank:]])?$");

	public static String getLocalAddress() {
		try{return InetAddress.getLocalHost().getHostAddress();
		}catch(UnknownHostException e){
			return "127.0.0.1"; //localhost
		}
	}

	public static URL getURL(String urlname) {
		try{return new URL(urlname);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** Workaround for EXTENDS URL */
	public final URL url;

	public URLHandler(String urlname) {
		this(getURL(urlname));
	}

	public URLHandler(URL url) {
		this.url=url;
	}


	public boolean isValid() {
		return url!=null && URL_PATTERN.matcher(toString()).matches();
	}


	public URLConnection openConnection() throws IOException {

		return url.openConnection();

	}


	public InputStream asInputStream() throws IOException {

		URLConnection connection=openConnection();
		connection.setDoInput(true); //input connection
		connection.setDoOutput(false); //output connection
		connection.setUseCaches(false); //avoid a cached file

		return connection.getInputStream();

	}


	public OutputStream asOutputStream() throws IOException {

		URLConnection connection=openConnection();
		connection.setDoInput(false); //input connection
		connection.setDoOutput(true); //output connection
		connection.setUseCaches(false); //avoid a cached file

		return connection.getOutputStream();

	}


	/** Returns URL filename */
	public String getFile() {
		return url.getFile();
	}


	@Override
	public String toString() {
		return url.toString();
	}


}
