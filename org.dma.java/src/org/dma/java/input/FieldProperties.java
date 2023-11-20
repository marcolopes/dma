/*******************************************************************************
 * Copyright 2008-2020 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.input;

import org.dma.java.math.NumericUtils;

public class FieldProperties implements IFieldProperties {

	public final int properties;

	public boolean isDigits() {return is(DIGITS);}
	public boolean isLetters() {return is(LETTERS);}
	public boolean isPositive() {return is(POSITIVE);}
	public boolean isNoSpaces() {return is(NOSPACES);}
	public boolean isUppercase() {return is(UPPERCASE);}
	public boolean isLowercase() {return is(LOWERCASE);}

	public FieldProperties(int properties) {
		this.properties=properties;
	}

	public boolean is(int properties) {
		return NumericUtils.bit(this.properties, properties);
	}

}