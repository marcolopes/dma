/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.services.vies;

public class CheckVatAddress {

	private final String street;
	private final String zipcode;
	private final String city;

	public CheckVatAddress(String street) {
		this(street, "", "");
	}

	public CheckVatAddress(String street, String zipcode, String city) {
		this.street=street.trim();
		this.zipcode=zipcode.trim();
		this.city=city.trim();
	}


	public String getStreet() {
		return street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return street + (zipcode.isEmpty() ?
				"" : "\n" + zipcode+" "+city);
	}

}