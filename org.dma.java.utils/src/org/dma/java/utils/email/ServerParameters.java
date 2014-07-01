/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import javax.mail.PasswordAuthentication;

import org.dma.java.utils.Debug;
import org.dma.java.utils.array.ArrayUtils;

public class ServerParameters {

	public static final int SECURITY_NONE = 0;
	public static final int SECURITY_STARTTLS = 1;
	public static final int SECURITY_SSLTLS = 2;

	public enum SECURITY {
		NONE, STARTTLS, SSLTLS;
		public static SECURITY get(int security){
			switch(security){
			case SECURITY_STARTTLS: return STARTTLS;
			case SECURITY_SSLTLS: return SSLTLS;
			default: return NONE;
			}
		}
		public static SECURITY get(String name){
			try{
				return valueOf(name);
			}catch(Exception e){}
			return NONE;
		}
		public static String[] toStringArray(){
			return ArrayUtils.toStringArray(values());
		}
	}

	private final String hostName;
	private final int smtpPort;
	private final SECURITY security;
	private final PasswordAuthentication authentication;

	public ServerParameters(String hostName, int smtpPort, int security) {
		this(hostName, smtpPort, security, null);
	}

	public ServerParameters(String hostName, int smtpPort, SECURITY security) {
		this(hostName, smtpPort, security, null);
	}

	public ServerParameters(String hostName, int smtpPort, int security, PasswordAuthentication authentication) {
		this(hostName, smtpPort, SECURITY.get(security), authentication);
	}

	public ServerParameters(String hostName, int smtpPort, SECURITY security, PasswordAuthentication authentication) {
		this.hostName=hostName;
		this.smtpPort=smtpPort;
		this.security=security;
		this.authentication=authentication;
	}


	public void debug(){

		if (Debug.STATUS){
			System.out.println("Host Name: "+hostName);
			System.out.println("SMTP Port:"+smtpPort);
			System.out.println("Security:" +security);
		}

	}



	/*
	 * Getters and setters
	 */
	public String getHostName() {
		return hostName;
	}

	public int getSmtpPort() {
		return smtpPort;
	}

	public SECURITY getSecurity() {
		return security;
	}

	public PasswordAuthentication getAuthentication() {
		return authentication;
	}

}