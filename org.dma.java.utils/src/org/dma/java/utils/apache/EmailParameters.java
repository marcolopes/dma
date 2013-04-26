/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.apache;

public class EmailParameters {

	private EmailAddress[] addresses=new EmailAddress[0];
	private String description;

	public EmailParameters() {
	}


	public EmailParameters(EmailAddress[] addresses, String description) {
		this.addresses=addresses;
		this.description=description;
	}





	/*
	 * Getters and setters
	 */
	public EmailAddress[] getAddresses() {
		return addresses;
	}

	public void setAddresses(EmailAddress[] addresses) {
		this.addresses=addresses;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description=description;
	}


}
