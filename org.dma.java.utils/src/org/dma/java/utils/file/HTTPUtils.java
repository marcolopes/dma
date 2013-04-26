/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class HTTPUtils {

	public static InputStream getInputStream(String url){

		try{
			URLConnection urlConn = new URL(url).openConnection();
			//input connection
			urlConn.setDoInput(true);
			//avoid a cached file
			urlConn.setUseCaches(false);

			return urlConn.getInputStream();

		} catch (IOException e){
			System.out.println(e);
		}

		return null;

	}


	public static OutputStream getOutputStream(String url){

		try{
			URLConnection urlConn = new URL(url).openConnection();
			//output connection
			urlConn.setDoInput(false);
			//avoid a cached file
			urlConn.setUseCaches(false);

			return urlConn.getOutputStream();

		} catch (IOException e){
			System.out.println(e);
		}

		return null;

	}


}
