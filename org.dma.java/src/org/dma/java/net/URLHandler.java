/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

import org.dma.java.io.CustomFile;
import org.dma.java.util.ArrayUtils;
import org.dma.java.util.StringUtils;

/**
 * https://docs.oracle.com/javase/tutorial/networking/urls/urlInfo.html
 */
public class URLHandler {

	public enum LOCALHOST {

		/** 127.0.0.1 */ IP ("127.0.0.1"),
		/** localhost */ NAME ("localhost");

		public final String value;

		LOCALHOST(String value){
			this.value=value;
		}

		public static boolean is(String host) {
			return host.equals(IP.value) || host.equalsIgnoreCase(NAME.value);
		}

		public static boolean is(URL url) {
			return is(url.getHost());
		}

	}

	public static String getLocalAddress() {
		try{return InetAddress.getLocalHost().getHostAddress();
		}catch(UnknownHostException e){
			return LOCALHOST.IP.value;
		}
	}

	/**
	 * Generates a Base64 URL-safe encoded string from the given base64 String.
	 * This method uses the URL and Filename Safe Base64 alphabet, replacing '+' with '-' and '/' with '_'.
	 * Padding characters ('=') are omitted for conciseness and to ensure URL safety.
	 *
	 * @param base64 The base64 string to be converted.
	 * @return A Base64 URL-safe encoded string.
	 */
	public static String normalizeBase64URL(String base64) {
		return base64.replace('+', '-').replace('/', '_').replace("=", "");
	}

	/** Example: "www.ftp.com", "file.txt" */
	public static URL getURL(String spec, String...more) {
		if (!StringUtils.isEmpty(spec)) try{
			return more.length==0 ? new URL(spec) :
			new URL(spec+"/"+ArrayUtils.concat(more, "/"));
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** Workaround for EXTENDS URL */
	public final URL url;

	/** Example: www.ftp.com:21 */
	public String getName() {return url.getAuthority()+url.getPath();}

	public URLHandler(String url, String...more) {
		this(getURL(url, more));
	}

	public URLHandler(URL url) {
		this.url=url;
	}


	/** @see URL#toURI() */
	public boolean isValid() {
		if (url!=null) try{
			url.toURI();
			return true;
		}catch(Exception e){
		}return false;
	}

	public boolean isLocalhost() {
		return url!=null && LOCALHOST.is(url);
	}

	public boolean hasPort() {
		return url!=null && url.getPort()>0;
	}

	public boolean isPortValid() {
		return url!=null && url.getPort()>0 && url.getPort()<=65535;
	}


	@Deprecated
	private boolean checkStream() {
		if (url!=null) try{
			url.openStream().close();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}return false;
	}


	/** @see URL#openConnection() */
	public URLConnection openConnection() throws IOException {
		if (url==null) throw new IOException("URL cannot be null");
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
		if (url!=null) try{
			System.err.println(url);
			Map<String, List<String>> map=getHeaderFields();
			for(String key: map.keySet()){
				if (key!=null) System.out.print(key+"=");
				System.out.println(map.get(key));
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}


	/** @see URL#getHost() */
	public String getHost() {
		if (url!=null) try{
			return url.getHost();
		}catch(Exception e){}
		return null;
	}


	/** @see URL#getFile() */
	public CustomFile getFile() {
		if (url!=null) try{
			return new CustomFile(url.getFile());
		}catch(Exception e){}
		return null;
	}


	/** @see URI#resolve(String) */
	public String getParent() {
		if (url!=null) try{
			return url.toURI().resolve(toString().endsWith("/") ? ".." : "").toString();
		}catch(Exception e){}
		return null;
	}


	public String path(String...more) {
		String spec=url==null ? "" : url.toString();
		return more.length==0 ? spec : spec+"/"+ArrayUtils.concat(more, "/");
	}

	@Override
	public String toString() {
		return path();
	}


}
