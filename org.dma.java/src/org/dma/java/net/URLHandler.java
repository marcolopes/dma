/*******************************************************************************
 * 2008-2022 Public Domain
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
import java.util.List;
import java.util.Map;
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


	/** @see URL#openConnection() */
	public URLConnection openConnection() throws IOException {
		return url.openConnection();
	}


	/** @see URLConnection#getInputStream() */
	public InputStream asInputStream() throws IOException {
		URLConnection connection=openConnection();
		connection.setDoInput(true); //input connection
		connection.setDoOutput(false); //output connection
		connection.setUseCaches(false); //avoid a cached file
		return connection.getInputStream();
	}


	/** @see URLConnection#getOutputStream() */
	public OutputStream asOutputStream() throws IOException {
		URLConnection connection=openConnection();
		connection.setDoInput(false); //input connection
		connection.setDoOutput(true); //output connection
		connection.setUseCaches(false); //avoid a cached file
		return connection.getOutputStream();
	}


	/** @see URLConnection#getHeaderFields() */
	public Map<String, List<String>> getHeaderFields() throws IOException {
		return openConnection().getHeaderFields();
	}


	/** @see URLConnection#getHeaderFields() */
	public void printHeaderFields() {
		try{Map<String, List<String>> map=getHeaderFields();
			System.err.println(url);
			for(String key: map.keySet()){
				if (key!=null){
					System.out.print(key);
					System.out.print("=");
				}System.out.println(map.get(key));
			}
		}catch(Exception e){}
	}


	/** @see URL#getFile() */
	public String getFile() {
		return url.getFile();
	}


	/** @see URL#toString() */
	@Override
	public String toString() {
		return url.toString();
	}


}
