/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.snippets;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.dma.java.util.Debug;

public final class PublicServerTime {

	public static Date getNTPDate() {

		String[] hosts = new String[]{
			"ntp02.oal.ul.pt", "ntp04.oal.ul.pt",
			"ntp.xs4all.nl"};

		NTPUDPClient client = new NTPUDPClient();
		// We want to timeout if a response takes longer than 5 seconds
		client.setDefaultTimeout(5000);

		for (String host : hosts) {

			try{
                InetAddress hostAddr = InetAddress.getByName(host);
                System.out.println("> " + hostAddr.getHostName() + "/" + hostAddr.getHostAddress());
                TimeInfo info = client.getTime(hostAddr);
                Date date = new Date(info.getReturnTime());
                return date;

			}catch(IOException e) {
				Debug.err(e);
			}
		}

		client.close();

		return null;

	}


	public static final void main(String[] args) {

		System.out.println(getNTPDate());

	}


}