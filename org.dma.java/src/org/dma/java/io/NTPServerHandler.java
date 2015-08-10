/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

/** Network Time Protocol */
public class NTPServerHandler {

	public enum NTPServers {

		OAL ("ntp02.oal.ul.pt", "ntp04.oal.ul.pt"),
		XS2ALL ("ntp.xs4all.nl");

		private static NTPTimeInfo time;

		public String[] hosts;

		private NTPServers(String...hosts){
			this.hosts=hosts;
		}

		/** Returns DEFAULT instance or NULL */
		public NTPTimeInfo getDefaultTime(int timeout) {
			if (time==null) time=new NTPServerHandler(this).getTime(timeout);
			return time;
		}

	}

	private final String[] hosts;

	public NTPServerHandler(NTPServers server) {
		this(server.hosts);
	}

	public NTPServerHandler(String...hosts) {
		this.hosts=hosts;
	}


	/** Returns NEW instance or NULL */
	public NTPTimeInfo getTime(int timeout) {

		NTPUDPClient client=new NTPUDPClient();
		client.setDefaultTimeout(timeout);

		for(String host : hosts) try{

			InetAddress hostAddr=InetAddress.getByName(host);
			System.out.println(hostAddr.getHostName() + "/" + hostAddr.getHostAddress());
			TimeInfo time=client.getTime(hostAddr);
			client.close();
			return new NTPTimeInfo(time.getMessage(), time.getReturnTime());

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		return null;

	}


	/** @Deprecated @use {@link NTPServerHandler#getTime(int)} */
	public Date getDate(int timeout) {

		NTPTimeInfo time=getTime(timeout);
		return time==null ? new Date() : time.getServerDate();

	}


	public static final void main(String[] args) {

		NTPServerHandler handler=new NTPServerHandler(NTPServers.OAL);
		NTPTimeInfo time=handler.getTime(1000);
		System.out.println("Reference TimeStamp: "+time.getMessage().getReferenceTimeStamp().getDate());
		System.out.println("Originate TimeStamp: "+time.getMessage().getOriginateTimeStamp().getDate());
		System.out.println("Transmit TimeStamp: "+time.getMessage().getTransmitTimeStamp().getDate());
		System.out.println("Receive TimeStamp: "+time.getMessage().getReceiveTimeStamp().getDate());
		System.out.println("Return Date: "+new Date(time.getReturnTime()));
		System.out.println("Current Date: "+new Date());
		System.out.println("Offset: "+time.getOffset());
		System.out.println("Server Date: "+time.getServerDate());

	}


}
