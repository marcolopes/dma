/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

public class NetUtils {

	public enum NTPServers {

		OAL ("ntp02.oal.ul.pt", "ntp04.oal.ul.pt"),
		XS2ALL ("ntp.xs4all.nl");

		public String[] hosts;

		private NTPServers(String...hosts){
			this.hosts=hosts;
		}

	}

	public static InputStream getInputStream(String url){

		try{
			URLConnection urlConn = new URL(url).openConnection();
			//input connection
			urlConn.setDoInput(true);
			//avoid a cached file
			urlConn.setUseCaches(false);

			return urlConn.getInputStream();

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
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

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	public static Date getNTPDate(int timeout, String...hosts) {

		NTPUDPClient client=new NTPUDPClient();
		client.setDefaultTimeout(timeout);

		for(String host : hosts) {

			try{
                InetAddress hostAddr=InetAddress.getByName(host);
                System.out.println(hostAddr.getHostName() + "/" + hostAddr.getHostAddress());
                TimeInfo info=client.getTime(hostAddr);
                return new Date(info.getReturnTime());

			}catch(IOException e){
				System.out.println(e);
			}catch(Exception e){
				e.printStackTrace();
			}

		}

		client.close();

		return null;

	}


	public static final void main(String[] args) {

		System.out.println(getNTPDate(1000, NTPServers.OAL.hosts));

	}


}
