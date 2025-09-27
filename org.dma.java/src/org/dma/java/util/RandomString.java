/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.util;

import java.util.Random;

public class RandomString extends Random {

	public RandomString() {
		super();
	}

	/** Random seed */
	public RandomString(long seed) {
		super(seed);
	}


	public String string(int length, String chars) {

		char[] result=new char[length];

		for (int i=0; i<result.length; i++){
			result[i]=chars.charAt(nextInt(chars.length()));
		}return new String(result);

	}

	/** Lowercase letters + Decimal numbers */
	public String string(int length) {

		return string(length, StringUtils.LOWERCASE_LETTERS+StringUtils.DECIMAL_NUMBERS);

	}

	/** Lowercase letters */
	public String letters(int length) {

		return string(length, StringUtils.LOWERCASE_LETTERS);

	}

	/** Decimal numbers (0-9) */
	public String numbers(int length) {

		return string(length, StringUtils.DECIMAL_NUMBERS);

	}

	/** Integer number (positve) */
	public String integer(int length) {

		if (length==0) return "";

		return (length<0 ? "-" : "") +
				string(1, "123456789") +
				numbers(Math.abs(length)).substring(1);

	}


}