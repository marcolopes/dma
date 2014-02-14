/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import javax.mail.PasswordAuthentication;

import org.dma.java.utils.Debug;

public class ServerParameters {

	public enum SECURITY {
		NONE, STARTTLS, SSLTLS;
		public static SECURITY get(int index){
			return values()[index];
		}
	}

	private final String hostname;
	private final int smtpport;
	private final SECURITY security;
	private final PasswordAuthentication authentication;

	public ServerParameters(String hostname, int smtpport, SECURITY security, PasswordAuthentication authentication) {
		this.hostname=hostname;
		this.smtpport=smtpport;
		this.security=security;
		this.authentication=authentication;
	}

	public ServerParameters(String hostname, int smtpport, int security, PasswordAuthentication authentication) {
		this(hostname, smtpport, SECURITY.get(security), authentication);
	}

	public ServerParameters(String hostname, int smtpport, SECURITY security) {
		this(hostname, smtpport, security, null);
	}

	public ServerParameters(String hostname, int smtpport, int security) {
		this(hostname, smtpport, SECURITY.get(security), null);
	}


	public void debug(){

		if (Debug.STATUS){
			System.out.println("Hostname: "+hostname);
			System.out.println("SMTP Port:"+smtpport);
			System.out.println("Security:" +security);
		}

	}



	/*
	 * Getters and setters
	 */
	public String getHostname() {
		return hostname;
	}

	public int getSmtpport() {
		return smtpport;
	}

	public SECURITY getSecurity() {
		return security;
	}

	public PasswordAuthentication getAuthentication() {
		return authentication;
	}

}