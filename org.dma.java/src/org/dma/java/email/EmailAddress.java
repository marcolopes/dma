/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
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

	public String getEmail() {return email;}
	public String getName() {return name;}
	public InternetAddress getAddress() {return address;}

	public EmailAddress(String email) {
		this(email, "");
	}

	public EmailAddress(String email, String name) {
		this.email=email;
		this.name=name;
		try{address=new InternetAddress(email);
		}catch(Exception e){}
	}


	public boolean isValid() {
		if (address!=null) try{
			address.validate();
			return true;
		}catch(AddressException e){
		}return false;
	}



	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return name.isEmpty() ? email : name + " <"+email+">";
	}

	@Override
	public int hashCode() {
		return email==null ? 0 : email.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EmailAddress) return equals((EmailAddress)obj);
		return equals(obj.toString());
	}

	public boolean equals(EmailAddress other) {
		return equals(other.email);
	}

	public boolean equals(String email) {
		return email.equals(this.email);
	}


}
