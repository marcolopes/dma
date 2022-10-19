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

import org.dma.java.io.CustomFile;
import org.dma.java.util.StringUtils;

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
		if (!StringUtils.isEmpty(urlname)) try{
			return new URL(urlname);
		}catch(Exception e){
			System.err.println(e+urlname);
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


	public boolean exists() {
		try{url.openStream();
			return true;
		}catch(Exception e){}
		return false;
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
	public CustomFile getFile() {
		return new CustomFile(url.getFile());
	}


	/** @see URL#toString() */
	@Override
	public String toString() {
		return url.toString();
	}


}
