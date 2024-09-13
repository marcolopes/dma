/*******************************************************************************
 * Copyright 2008-2013 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.snippets;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import org.dma.java.util.Debug;

public final class PublicServerTime {

	public static Date getNTPDate() {

		String[] hosts = {"ntp02.oal.ul.pt", "ntp04.oal.ul.pt", "ntp.xs4all.nl"};

		NTPUDPClient client = new NTPUDPClient();
		// We want to timeout if a response takes longer than 5 seconds
		client.setDefaultTimeout(5000);

		for(String host : hosts){

			try{InetAddress hostAddr = InetAddress.getByName(host);
				Debug.out("> " + hostAddr.getHostName() + "/" + hostAddr.getHostAddress());
				TimeInfo info = client.getTime(hostAddr);
				Date date = new Date(info.getReturnTime());
				return date;

			}catch(IOException e) {
				e.printStackTrace();
			}
		}client.close();

		return null;

	}


	public static void main(String[] args) {

		System.out.println(getNTPDate());

	}


}