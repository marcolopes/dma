/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.email;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class EmailAddress {

	private final String email;
	private final String name;
	private InternetAddress address;

	public EmailAddress(String email) {
		this(email,"");
	}

	public EmailAddress(String email, String name) {
		this.email=email;
		this.name=name;
		try{
			address=new InternetAddress(email);
		}catch(Exception e){}
	}


	public boolean isValid() {
		try{
			address.validate();
			return true;

		}catch(AddressException e){
			System.out.println(e);
		}catch(Exception e){}

		return false;
	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return name + " <"+email+">";
	}

	@Override
	public int hashCode() {
		return email==null ? 0 : email.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}



	/*
	 * Getters and setters
	 */
	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public InternetAddress getAddress() {
		return address;
	}


}
