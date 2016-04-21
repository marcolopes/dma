/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.services.vies;

public class CheckVatResult {

	private final Boolean valid;
	private final String name;
	private final String address;

	public CheckVatResult(Boolean valid, String name, String address){
		this.valid=valid;
		this.name=name.trim();
		this.address=address.trim();
	}


	public Boolean isValid() {
		return valid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString(){
		return name + "\n" + address;

	}

}