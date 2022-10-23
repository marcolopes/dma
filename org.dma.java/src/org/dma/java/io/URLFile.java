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
package org.dma.java.io;

import java.io.File;
import java.net.URL;
import java.net.URLConnection;

import org.dma.java.net.URLHandler;
import org.dma.java.util.StringUtils;

public class URLFile extends URLHandler {

	/** Replaces accented and illegal characters */
	public static String normalize(String string) {
		//http://www.w3.org/Addressing/URL/uri-spec.html
		String plain=StringUtils.replaceAll(StringUtils.unaccent(string), " ", "+");
		return StringUtils.removeChars(plain, "\n\r\t\f\0");
	}

	/** Example: "www.ftp.com", "file.txt" */
	public static URL getURL(String urlname, String...more) {
		try{StringBuilder sb=new StringBuilder(urlname);
			for(String element: more){
				sb.append("/"+element);
			}return new URL(sb.toString());
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** @see URLFile#getURL(String, String...) */
	public URLFile(String urlname, String...more) {
		this(getURL(urlname, more));
	}

	public URLFile(URL url) {
		super(url);
	}


	public boolean download(File dst) {
		return new AbstractURLFileCopy(this) {
			@Override
			public boolean cancel() {
				return false;
			}
		}.to(dst);
	}


	public boolean upload(File src) {
		return new AbstractURLFileCopy(this) {
			@Override
			public boolean cancel() {
				return false;
			}
		}.from(src);
	}


	/** @see URLConnection#getLastModified() */
	public long getLastModified() {
		try{return openConnection().getLastModified();
		}catch(Exception e){}
		return 0;
	}


	/** Returns LOCAL filename */
	public String getFilename() {
		return getFile().getName();
	}


	public static void main(String[] args) {

		URLFile handler=new URLFile("https://faturas.portaldasfinancas.gov.pt" ,"factemipf_static", "java", "certificados.zip");

		System.out.println(handler);
		System.out.println(handler.url.getHost());
		System.out.println(handler.url.getFile());
		System.out.println(handler.getFilename());

	}


}
