/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Sergio Gomes (sergiogomes@projectocolibri.com)
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

public class URLHandler {

	public static Pattern URL_PATTERN = Pattern.compile(
			"^((((https?)://)|(mailto:|news:))" +
			"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)" +
			"([).!';/?:,][[:blank:]])?$");

	public static String getLocalAddress() {
		try{
			return InetAddress.getLocalHost().getHostAddress();
		}catch(UnknownHostException e){
			return "127.0.0.1"; //localhost
		}
	}

	public static URL getURL(String urlname) {
		try{
			return new URL(urlname);
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	public final String urlname;
	/** Workaround for EXTENDS URL */
	public final URL url;

	public URLHandler(String urlname) {
		System.out.println(urlname);
		this.urlname=urlname;
		this.url=getURL(urlname);
	}


	public boolean isValid() {
		return !urlname.isEmpty() && URL_PATTERN.matcher(urlname).matches();
	}


}
