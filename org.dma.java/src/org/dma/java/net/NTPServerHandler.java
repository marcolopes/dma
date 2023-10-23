/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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

import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;

import org.dma.java.time.Chronograph;

/** Network Time Protocol */
public class NTPServerHandler {

	public class NTPTimeInfo extends TimeInfo {

		/** COMPUTES message */
		public NTPTimeInfo(NtpV3Packet message, long returnTime) {
			super(message, returnTime, true);
		}

		/** Returns CURRENT TIME with SERVER OFFSET */
		public long getServerTime() {
			return System.currentTimeMillis()+getOffset();
		}

		/** Returns CURRENT DATE with SERVER OFFSET */
		public Date getServerDate() {
			return new Date(getServerTime());
		}

	}

	public enum NTP_SERVERS {

		OAL ("ntp02.oal.ul.pt", "ntp04.oal.ul.pt"),
		XS2ALL ("ntp.xs4all.nl"),
		WINDOWS ("time.windows.com");

		private static NTPTimeInfo info;

		public String[] hosts;

		private NTP_SERVERS(String...hosts) {
			this.hosts=hosts;
		}

		/** @see NTPServerHandler#getTime(int) */
		public NTPTimeInfo query(int timeout) {
			if (info==null) info=new NTPServerHandler(this).getTime(timeout);
			return info;
		}

		/** @see NTP_SERVERS#query(int) */
		public static NTPTimeInfo queryAll(int timeout, NTP_SERVERS...servers) {
			for(NTP_SERVERS server: servers){
				NTPTimeInfo info=server.query(timeout);
				if (info!=null) return info;
			}return null;
		}

		/** @see NTP_SERVERS#queryAll(int, NTP_SERVERS...) */
		public static NTPTimeInfo queryAll(int timeout) {
			return queryAll(timeout, values());
		}

	}

	private final String[] hosts;

	public NTPServerHandler(NTP_SERVERS server) {
		this(server.hosts);
	}

	public NTPServerHandler(String...hosts) {
		this.hosts=hosts;
	}


	/**
	 * @param timeout The timeout in milliseconds to use for the datagram socket connection
	 * @return {@link NTPTimeInfo} instance or NULL
	 */
	public NTPTimeInfo getTime(int timeout) {

		NTPUDPClient client=new NTPUDPClient();
		client.setDefaultTimeout(timeout);

		for(String host: hosts) try{
			InetAddress address=InetAddress.getByName(host);
			System.err.println(address);
			TimeInfo time=client.getTime(address);
			client.close();
			return new NTPTimeInfo(time.getMessage(), time.getReturnTime());

		}catch(Exception e){
			System.err.println(e);
		}return null;

	}


	/** @Deprecated @use {@link NTPServerHandler#getTime(int)} */
	public Date getDate(int timeout) {

		NTPTimeInfo info=getTime(timeout);
		return info==null ? new Date() : info.getServerDate();

	}


	public static void query(NTP_SERVERS server) {

		Chronograph time=new Chronograph().start();
		NTPServerHandler handler=new NTPServerHandler(server);
		NTPTimeInfo info=handler.getTime(1000);
		System.out.println("Elapsed Time: "+time.stop());

		if (info!=null) try{
			/*System.out.println("Receive TimeStamp: "+info.getMessage().getReceiveTimeStamp().toDateString());
			System.out.println("Transmit TimeStamp: "+info.getMessage().getTransmitTimeStamp().toDateString());
			System.out.println("Originate TimeStamp: "+info.getMessage().getOriginateTimeStamp().toDateString());
			System.out.println("Reference TimeStamp: "+info.getMessage().getReferenceTimeStamp().toDateString());
			System.out.println("Return Date: "+new Date(info.getReturnTime()));*/
			System.out.println("Server Date: "+info.getServerDate());
			System.out.println("System Date: "+new Date());
			System.out.println("Offset needed to adjust local clock: "+info.getOffset());
			System.out.println("Round-trip network delay: "+info.getDelay());
			System.out.println("Comments: "+info.getComments());
			System.out.println();

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

		query(NTP_SERVERS.OAL);
		query(NTP_SERVERS.OAL);

	}


}
