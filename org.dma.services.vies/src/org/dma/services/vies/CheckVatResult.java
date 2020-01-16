/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.services.vies;

public class CheckVatResult {

	private final Boolean valid;
	private final String name;
	private final CheckVatAddress address;

	public CheckVatResult(boolean valid, String name, CheckVatAddress address) {
		this.valid=valid;
		this.name=name.trim();
		this.address=address;
	}


	public boolean isValid() {
		return valid;
	}

	public String getName() {
		return name;
	}

	public CheckVatAddress getAddress() {
		return address;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return name + "\n" + address;

	}

}