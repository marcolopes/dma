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
package org.dma.icu.numerals;

import java.util.Locale;

public class ENWordNumerals extends WordNumerals {

	public static final NumeralUnit UNIT_EURO = new NumeralUnit("Euros", "Cents");

	public static final NumeralUnit UNIT_METER = new NumeralUnit("Meters", "Centimeters");

	/** EURO by default */
	public ENWordNumerals(int scale) {
		this(scale, UNIT_EURO);
	}

	public ENWordNumerals(int scale, NumeralUnit unit) {
		super(new Locale("EN"), scale, unit);
	}


}