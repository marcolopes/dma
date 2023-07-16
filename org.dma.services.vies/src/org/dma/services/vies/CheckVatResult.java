/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.services.vies;

public class CheckVatResult {

	private final Boolean valid;
	private final String name;
	private final CheckVatAddress address;

	public CheckVatResult() {
		this(false, "", new CheckVatAddress());
	}

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