/*******************************************************************************
 * Copyright 2008-2019 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.math;

public class CheckDigits {

	/**
	 * ISO 7064 Mod 97,10 check digit
	 */
	public static String ISO7064Mod97_10(String digits) {

		/*int index=0;
		int checksum=0;
		final int[] multiplier={51, 73, 17, 89, 38, 62, 45, 53, 15, 50, 5, 49, 34, 81, 76, 27, 90, 9, 30, 3};
		for(char c: digits.toCharArray()){
			checksum+=Character.getNumericValue(c) * multiplier[index];
			index++;
		}checksum=98-(checksum % 97);*/

		int checksum=0;
		for(char c: digits.toCharArray()){
			checksum=(checksum + Character.getNumericValue(c)) * 10 % 97;
		}checksum=98-(checksum * 10 % 97);

		return checksum>=10 ? ""+checksum : "0"+checksum;

	}


}