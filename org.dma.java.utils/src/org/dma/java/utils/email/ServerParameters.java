/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import javax.mail.Authenticator;

import org.apache.commons.mail.DefaultAuthenticator;
import org.dma.java.utils.Debug;

public class ServerParameters {

	public enum SECURITY {NONE, STARTTLS, SSLTLS}

	private final String hostname;
	private final int smtpport;
	private final SECURITY security;
	private final DefaultAuthenticator authenticator;

	public ServerParameters(String hostname, int smtpport, SECURITY security, DefaultAuthenticator authenticator) {
		this.hostname=hostname;
		this.smtpport=smtpport;
		this.security=security;
		this.authenticator=authenticator;
	}

	public ServerParameters(String hostname, int smtpport, int security, DefaultAuthenticator authenticator) {
		this(hostname, smtpport, SECURITY.values()[security], authenticator);
	}

	public ServerParameters(String hostname, int smtpport, SECURITY security) {
		this(hostname, smtpport, security, null);
	}

	public ServerParameters(String hostname, int smtpport, int security) {
		this(hostname, smtpport, security, null);
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

	public Authenticator getAuthenticator() {
		return authenticator;
	}


}