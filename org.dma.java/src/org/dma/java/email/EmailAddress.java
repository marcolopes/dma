/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.email;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class EmailAddress {

	private final String email;
	private final String name;
	private InternetAddress address;

	public EmailAddress(String email) {
		this(email, "");
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
		}catch(Exception e){
			System.err.println(e);
		}return false;
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
		if (obj instanceof EmailAddress)
			return equals((EmailAddress)obj);
		return equals(obj.toString());
	}

	public boolean equals(EmailAddress other) {
		return equals(other.email);
	}

	public boolean equals(String email) {
		return this.email.equals(email);
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
