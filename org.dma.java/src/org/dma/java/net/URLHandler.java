/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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

	public URLHandler(String urlname) {
		this(getURL(urlname));
	}

	public URLHandler(URL url) {
		this.url=url;
	}


	/** @see URL#toURI() */
	public boolean isValid() {
		try{url.toURI();
		}catch(Exception e){
			return false;
		}return true;
	}

	public boolean isLocalhost() {
		return LOCALHOST.is(url);
	}

	public boolean hasPort() {
		return url.getPort()>0;
	}

	public boolean isPortValid() {
		return url.getPort()>0 && url.getPort()<=65535;
	}


	public boolean checkStream() {
		try{url.openStream();
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}return false;
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


	/** @see URL#getFile() */
	public CustomFile getFile() {
		return new CustomFile(url.getFile());
	}

	public String path(String...more) {
		String spec=url==null ? "" : url.toString();
		return more.length==0 ? spec : spec+"/"+ArrayUtils.concat(more, "/");
	}


}
