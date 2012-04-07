/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.apache.mail;

public class EmailAddress {

	private String email;
	private String name;

	public EmailAddress(String email, String name){
		this.email=email;
		this.name=name;
	}



	/*
	 * Getters and setters
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}


}
