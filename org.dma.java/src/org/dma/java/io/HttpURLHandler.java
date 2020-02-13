/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.io;

import java.net.HttpURLConnection;

import org.apache.commons.codec.binary.Base64;

public class HttpURLHandler extends URLHandler {

	public HttpURLHandler(String urlname) {
		super(urlname);
	}


	public boolean ping(int timeout) {

		HttpURLConnection connection=null;

		try{
			connection=(HttpURLConnection)url.openConnection();
			connection.setRequestMethod("HEAD");
			connection.setConnectTimeout(timeout);
			return connection.getResponseCode()!=HttpURLConnection.HTTP_NOT_FOUND;

		}catch(Exception e){
			System.err.println(e);
		}finally{
			if(connection!=null) connection.disconnect();
		}return false;

	}



	/** @see HttpURLConnection */
	public boolean check(int status) {

		HttpURLConnection connection=null;

		try{
			connection=(HttpURLConnection)url.openConnection();
			connection.setRequestMethod("HEAD");
			connection.setInstanceFollowRedirects(false);
			return connection.getResponseCode()==status;

		}catch(Exception e){
			System.err.println(e);
		}finally{
			if(connection!=null) connection.disconnect();
		}return false;

	}


	public boolean isAuthValid(final String key) {

		HttpURLConnection connection=null;

		try{
			connection=(HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/xml");
		    connection.setRequestProperty("Authorization",
		    		"Basic "+new String(new Base64(0).encode(key.getBytes())));
		    /* AVOID Authenticator mayhem at ALL COST!
			Authenticator.setDefault(new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(key, new char[0]);
				}
			});
			*/
			return connection.getResponseCode()==HttpURLConnection.HTTP_OK;

		}catch(Exception e){
			System.err.println(e);
		}finally{
			if(connection!=null) connection.disconnect();
		}return false;

	}


	public static void main(String[] argvs) {

		HttpURLHandler handler=new HttpURLHandler("http://loja.projectocolibri.com/api");

		System.err.println("Valid? " + handler.isValid());
		System.err.println("HTTP? " + handler.check(HttpURLConnection.HTTP_OK));
		System.err.println("Ping? " + handler.ping(3*1000));
		System.err.println("Auth? " + handler.isAuthValid(""));

	}

}
