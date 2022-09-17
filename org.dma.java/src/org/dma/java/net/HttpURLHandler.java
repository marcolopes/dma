/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.net;

import java.awt.Desktop;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

public class HttpURLHandler extends URLHandler {

	public HttpURLHandler(String urlname) {
		super(urlname);
	}

	public HttpURLHandler(URL url) {
		super(url);
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
				return connection.getResponseCode()==status;
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
				return connection;
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


	public boolean isSecure() {

		return url.getProtocol().equals("https");

	}


	public boolean browse() {

		if (Desktop.isDesktopSupported()) try{
			Desktop.getDesktop().browse(url.toURI());
			return true;
		}catch(Exception e){
			System.err.println(e);
		}return false;

	}


	public static void main(String[] argvs) {

		HttpURLHandler handler=new HttpURLHandler("http://loja.projectocolibri.com/api");

		System.err.println(handler);
		System.err.println("Valid? " + handler.isValid());
		System.err.println("HTTP? " + handler.check(HttpURLConnection.HTTP_OK));
		System.err.println("Ping? " + handler.ping(3*1000));
		System.err.println("Auth? " + handler.isAuthValid("***"));

	}

}
