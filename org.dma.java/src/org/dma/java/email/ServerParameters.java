/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.email;

import javax.mail.PasswordAuthentication;

import org.dma.java.util.StringList;

public class ServerParameters {

	@Deprecated
	public static final int SECURITY_NONE = SECURITY.NONE.ordinal();
	@Deprecated
	public static final int SECURITY_STARTTLS = SECURITY.STARTTLS.ordinal();
	@Deprecated
	public static final int SECURITY_SSLTLS = SECURITY.SSLTLS.ordinal();

	public enum SECURITY {

		NONE, STARTTLS, SSLTLS;

		public static final String[] NAMES = StringList.valueOf(values()).toArray();

		public static SECURITY get(String name) {
			try{return valueOf(name);}
			catch(Exception e){}
			return NONE;
		}

		public static SECURITY get(int security) {
			try{return values()[security];}
			catch(Exception e){}
			return NONE;
		}

	}

	private final String hostName;
	private final int smtpPort;
	private final SECURITY security;
	private final PasswordAuthentication authentication;

	public String getHostName() {return hostName;}
	public int getSmtpPort() {return smtpPort;}
	public SECURITY getSecurity() {return security;}
	public PasswordAuthentication getAuthentication() {return authentication;}

	@Deprecated
	public ServerParameters(String hostName, int smtpPort, int security) {
		this(hostName, smtpPort, security, null);
	}

	public ServerParameters(String hostName, int smtpPort, SECURITY security) {
		this(hostName, smtpPort, security, null);
	}

	@Deprecated
	public ServerParameters(String hostName, int smtpPort, int security, PasswordAuthentication authentication) {
		this(hostName, smtpPort, SECURITY.get(security), authentication);
	}

	public ServerParameters(String hostName, int smtpPort, SECURITY security, PasswordAuthentication authentication) {
		this.hostName=hostName;
		this.smtpPort=smtpPort;
		this.security=security;
		this.authentication=authentication;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [hostName=" + hostName +
				", smtpPort=" + smtpPort +
				", security=" + security + "]";
	}

}