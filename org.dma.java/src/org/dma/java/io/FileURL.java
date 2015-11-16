/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.net.URL;

import org.dma.java.util.StringUtils;

public class FileURL {

	public static URL getURL(String ftpurl, String filename) {
		try{
			return new URL(ftpurl+"/"+filename);
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
	}

	public final String ftpurl;
	public final String filename;
	/** EXTENDS URL Workaround */
	public final URL url;

	/** Example: https//www.ftp.com/file.txt */
	public FileURL(String fileurl) {
		String array[]=StringUtils.splitLastIndex(fileurl, "/");
		this.ftpurl=array[0];
		this.filename=array[1];
		this.url=getURL(ftpurl, filename);
	}

	public FileURL(String ftpurl, String filename) {
		this.ftpurl=ftpurl;
		this.filename=filename;
		this.url=getURL(ftpurl, filename);
	}


	@Override
	public String toString() {
		return url.toString();
	}


}
