/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.email;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class EmailAddress {

	private String email;
	private String name;
	private InternetAddress address;

	public EmailAddress(String email, String name){
		this.email=email;
		this.name=name;
		try{
			address=new InternetAddress(email);
		}catch(AddressException e){}
	}

	public EmailAddress(String email){
		this(email,"");
	}


	public boolean isValid() {
		try{
			address.validate();
			return true;

		}catch(AddressException e){
			System.out.println(e.getMessage());
		}catch(Exception e){}

		return false;
	}


	@Override
	public String toString() {
		return name + " <"+email+">";
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

	public InternetAddress getAddress() {
		return address;
	}


}
