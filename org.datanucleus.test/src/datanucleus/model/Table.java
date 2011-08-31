/**********************************************************************
Copyright (c) 2009 Stefan Seelmann. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 **********************************************************************/
package datanucleus.model;

//@PersistenceCapable(table = "ou=People,dc=example,dc=com", schema = "top,person,organizationalPerson,inetOrgPerson")
public class Table{

	//@Persistent(column = "cn", primaryKey = "true")
	private String fullName;

	//@Persistent(column = "givenName")
	private String firstName;

	//@Persistent(column = "sn")
	private String lastName;

	public Table(String fullName, String firstName, String lastName){

		super();
		this.fullName = fullName;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	//@Override
	public String toString() {
		return " firstName=" + firstName + ", fullName=" + fullName + ", lastName=" + lastName ;
	}

}
