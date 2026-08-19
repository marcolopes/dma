/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;

import org.dma.java.net.HttpURLHandler;
import org.dma.java.net.PermissiveTrustStore;
import org.dma.java.net.URLHandler;
import org.dma.java.util.StringUtils;
import org.dma.java.util.SystemUtils;

public class URLFile extends URLHandler {

	/*
	 * http://www.w3.org/Addressing/URL/uri-spec.html
	 */
	public static String encode(String spec) {
		try{URL url=new URL(spec);
			URI uri=new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
			return uri.toASCIIString();
		}catch(MalformedURLException e){
		}catch(URISyntaxException e){
		}return spec;
	}

	/** Replaces accented and illegal characters */
	public static String normalize(String string) {
		String plain=encode(StringUtils.replaceAll(StringUtils.unaccent(string), " ", "+"));
		return StringUtils.removeAll(plain, '\n','\r','\t','\f','\0');
	}

	/** @see URLHandler#getURL(String, String...) */
	public URLFile(String url, String...more) {
		this(getURL(url, more));
	}

	public URLFile(URL url) {
		super(url);
	}


	@Override
	public URLConnection openConnection() throws IOException {
		URLConnection connection=super.openConnection();
		if (connection!=null) {
			connection.setRequestProperty("User-Agent", "Mozilla");
			if (connection instanceof HttpsURLConnection){
				HttpsURLConnection httpsConnection=(HttpsURLConnection)connection;
				if (SystemUtils.IS_JAVA_1_7) try{
					SSLContext sslContext=SSLContext.getInstance("TLSv1.2");
					sslContext.init(null, new TrustManager[]{new PermissiveTrustStore()}, new SecureRandom());
					httpsConnection.setSSLSocketFactory(sslContext.getSocketFactory());
				}catch(Exception e){}
				httpsConnection.setHostnameVerifier(new HostnameVerifier(){
					@Override
					public boolean verify(String hostname, SSLSession session) {return true;}
				});
			}
		}return connection;
	}


	public boolean exists() {
		try{return new File(url.toURI()).exists();
		}catch(Exception e){
			return new HttpURLHandler(url).check(HttpURLConnection.HTTP_OK);
		}
	}


	public void download(File dst) throws Exception {
		new AbstractURLFileCopy(this) {
			@Override
			public boolean cancel() {
				return false;
			}
		}.to(dst);
	}


	public void upload(File src) throws Exception {
		new AbstractURLFileCopy(this) {
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
	@Override
	public String getName() {
		return getFile().getName();
	}


	@Override
	public String toString() {
		return path();
	}


	public static void main(String[] args) {

		for(URLFile file: new URLFile[]{
			new URLFile("https://ind.millenniumbcp.pt", "pt", "Articles", "Documents", "precario", "FCD.pdf"),
			new URLFile("https://amagovpt.github.io", "docs.autenticacao.gov", "Manual_de_Utilizacao_v3.pdf"),
			new URLFile("https://info.portaldasfinancas.gov.pt", "pt", "apoio_ao_contribuinte", "Outras_entidades", "Suporte_tecnologico", "Certificados_de_seguranca", "Documents", "TesteWebservices.zip")
			}) try{

			System.out.println("File: "+file);
			System.out.println("Parent: "+file.getParent());
			System.out.println("Host: "+file.getHost());

			if (file.exists()){
				System.out.println("FOUND: "+file.getName());
				File dst=new CustomFile(Folder.temporary(), file.getName());
				file.download(dst);
				System.err.print(dst.length());
				System.err.print(" Bytes downloaded to ");
				System.err.println(dst);
			}else{
				System.err.println("NOT FOUND: "+file.getName());
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}


}