/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.io;

import java.util.Date;

import org.apache.commons.net.ntp.NtpV3Packet;
import org.apache.commons.net.ntp.TimeInfo;

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
