/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.apache.mail;

import org.dma.utils.java.Debug;

public class ServerParameters {

	public static final int SECURITY_NONE = 0;
	public static final int SECURITY_STARTTLS = 1;
	public static final int SECURITY_SSLTLS = 2;

	private String hostname;
	private int smtpport;
	private boolean auth;
	private String username;
	private String password;
	private int security;

	public ServerParameters(String hostname, int smtpport, boolean auth, String username, String password, int security) {

		this.hostname=hostname;
		this.smtpport=smtpport;
		this.auth=auth;
		this.username=username;
		this.password=password;
		this.security=security;

	}


	public void debug(){

		Debug.info("hostname", hostname);
		Debug.info("smtpport", smtpport);
		Debug.info("username", username);
		Debug.info("password", password);
		Debug.info("security", security);

	}



	/*
	 * Getters and setters
	 */
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname=hostname;
	}

	public int getSmtpport() {
		return smtpport;
	}

	public void setSmtpport(int smtpport) {
		this.smtpport=smtpport;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth=auth;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username=username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password=password;
	}


	public int getSecurity() {
		return security;
	}

	public void setSecurity(int security) {
		this.security=security;
	}


}

