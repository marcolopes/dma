/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

public class EmailParameters {

	private String description;
	private EmailAddress[] addresses=new EmailAddress[0];

	public EmailParameters() {
	}


	public EmailParameters(String description, EmailAddress...addresses) {
		this.description=description;
		this.addresses=addresses;
	}



	/*
	 * Getters and setters
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description=description;
	}


	public EmailAddress[] getAddresses() {
		return addresses;
	}

	public void setAddresses(EmailAddress[] addresses) {
		this.addresses=addresses;
	}


}
