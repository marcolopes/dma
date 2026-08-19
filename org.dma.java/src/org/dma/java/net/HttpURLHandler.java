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

import java.awt.Desktop;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.apache.commons.codec.binary.Base64;

public class HttpURLHandler extends URLHandler {

	public HttpURLHandler(String url, String...more) {
		this(getURL(url, more));
	}

	public HttpURLHandler(URL url) {
		super(url);
	}


	public boolean isSecure() {
		return url.getProtocol().equals("https");
	}


	public boolean ping(int timeout) {

		try{HttpURLConnection connection=(HttpURLConnection)openConnection();
			if (connection!=null) try{
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(timeout);
				return connection.getResponseCode()!=HttpURLConnection.HTTP_NOT_FOUND;
			}catch(Exception e){
				System.err.println(e);
			}finally{
				connection.disconnect();
			}
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	/** @see HttpURLConnection */
	public boolean check(int status) {

		try{HttpURLConnection connection=(HttpURLConnection)openConnection();
			if (connection!=null) try{
				connection.setRequestMethod("HEAD");
				connection.setInstanceFollowRedirects(false);
				if (connection instanceof HttpsURLConnection){
					HttpsURLConnection httpsConnection=(HttpsURLConnection)connection;
					httpsConnection.setSSLSocketFactory(PermissiveTrustStore.createSSLContext()	.getSocketFactory());
					httpsConnection.setHostnameVerifier(new HostnameVerifier(){
						public boolean verify(String hostname, SSLSession session) {
							return true;
						}
					});
				}return connection.getResponseCode()==status;
			}catch(Exception e){
				System.err.println(e);
			}finally{
				connection.disconnect();
			}
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	public HttpURLConnection getConnection(String key) {

		try{HttpURLConnection connection=(HttpURLConnection)openConnection();
			if (connection!=null) try{
				connection.setRequestProperty("Authorization",
						"Basic "+new String(new Base64().encode(key.getBytes())));
				/*AVOID Authenticator mayhem at ALL COST!
				Authenticator.setDefault(new Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(key, new char[0]);
					}
				});*/
				/*
				 * https://stackoverflow.com/questions/6932369/inputstream-from-a-url
				 *
				 * By default the connection will follow redirects. The following
				 * block is only entered if the implementation of HttpURLConnection
				 * does not perform the redirect. The exact behavior depends to
				 * the actual implementation (e.g. sun.net).
				 * !!! Attention: This block allows the connection to
				 * switch protocols (e.g. HTTP to HTTPS), which is <b>not</b>
				 * default behavior. See: https://stackoverflow.com/questions/1884230
				 * for more info!!!
				 */
				//connection.connect();
				int responseCode=connection.getResponseCode();
				if (responseCode>=HttpURLConnection.HTTP_MULT_CHOICE &&
					responseCode<HttpURLConnection.HTTP_BAD_REQUEST){
					String location=connection.getHeaderField("Location");
					HttpURLHandler handler=new HttpURLHandler(location);
					return handler.isValid() ? handler.getConnection(key) :
						new HttpURLHandler(url.getProtocol()+"://"+url.getHost()+location).getConnection(key);
				}return connection;
			}catch(Exception e){
				System.err.println(e);
			}finally{
				connection.disconnect();
			}
		}catch(Exception e){
			e.printStackTrace();
		}return null;

	}


	public boolean isAuthValid(String key) {

		HttpURLConnection connection=getConnection(key);

		if (connection!=null) try{
			return connection.getResponseCode()==HttpURLConnection.HTTP_OK;
		}catch(Exception e){
			System.err.println(e);
		}finally{
			connection.disconnect();
		}return false;

	}


	public boolean browse() {

		if (Desktop.isDesktopSupported()) try{
			Desktop.getDesktop().browse(url.toURI());
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	public static void main(String[] args) {

		System.setProperty("https.protocols", "TLSv1.2");

		HttpURLHandler handler=new HttpURLHandler("https://web.projectocolibri.com");

		System.err.println(handler.path());
		System.err.println("Valid? " + handler.isValid());
		System.err.println("HTTP? " + handler.check(HttpURLConnection.HTTP_OK));
		System.err.println("Ping? " + handler.ping(3*1000));
		System.err.println("Auth? " + handler.isAuthValid("***"));

	}

}
