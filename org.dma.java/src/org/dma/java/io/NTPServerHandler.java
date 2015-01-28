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

public class NTPServerHandler {

	public enum NTPServers {

		OAL ("ntp02.oal.ul.pt", "ntp04.oal.ul.pt"),
		XS2ALL ("ntp.xs4all.nl");

		public String[] hosts;

		private NTPServers(String...hosts){
			this.hosts=hosts;
		}

	}

	public final String[] hosts;

	public NTPServerHandler(NTPServers server) {
		this(server.hosts);
	}

	public NTPServerHandler(String...hosts) {
		this.hosts=hosts;
	}


	public Date getDate(int timeout) {

		NTPUDPClient client=new NTPUDPClient();
		client.setDefaultTimeout(timeout);

		for(String host : hosts) try{

            InetAddress hostAddr=InetAddress.getByName(host);
            System.out.println(hostAddr.getHostName() + "/" + hostAddr.getHostAddress());
            TimeInfo info=client.getTime(hostAddr);
            return new Date(info.getReturnTime());

		}catch(IOException e){
			System.out.println(e);
		}catch(Exception e){
			e.printStackTrace();
		}

		client.close();

		return null;

	}


	public static final void main(String[] args) {

		NTPServerHandler handler=new NTPServerHandler(NTPServers.OAL);
		System.out.println(handler.getDate(1000));

	}


}
