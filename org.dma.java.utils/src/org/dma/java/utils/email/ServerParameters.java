/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import org.dma.java.utils.Debug;

public class ServerParameters {

	public enum SECURITY {NONE, STARTTLS, SSLTLS}

	private final String hostname;
	private final int smtpport;
	private final String smtpuser;
	private final String password;
	private final boolean authentication;
	private final SECURITY security;

	public ServerParameters(String hostname, int smtpport, String smtpuser, String password, boolean authentication, SECURITY security) {
		this.hostname=hostname;
		this.smtpport=smtpport;
		this.smtpuser=smtpuser;
		this.password=password;
		this.security=security;
		this.authentication=authentication;
	}

	public ServerParameters(String hostname, int smtpport, String smtpuser, String password, boolean authentication, int security) {
		this(hostname, smtpport, smtpuser, password, authentication, SECURITY.values()[security]);
	}


	public void debug(){

		if (Debug.STATUS){
			System.out.println("Hostname: "+hostname);
			System.out.println("SMTP Port:"+smtpport);
			System.out.println("SMTP User: "+smtpuser);
			System.out.println("Password: "+password);
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

	public String getSmtpuser() {
		return smtpuser;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAuthentication() {
		return authentication;
	}

	public SECURITY getSecurity() {
		return security;
	}


}