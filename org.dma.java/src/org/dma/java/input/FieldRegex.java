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
package org.dma.java.input;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.dma.java.input.FieldFormat.TYPES;
import org.dma.java.util.StringUtils;

public class FieldRegex extends FieldProperties {

	/** Regex Pattern CACHE */
	private static final Map<String, Pattern> RP_CACHE = new ConcurrentHashMap();

	public static Pattern getPattern(String regex) {
		Pattern pattern=RP_CACHE.get(regex);
		if (pattern==null) RP_CACHE.put(regex, pattern=Pattern.compile(regex));
		return pattern;
	}

	private final String regex;

	public FieldRegex(TYPES type, FieldSize size, int properties, char...exclude) {
		super(properties);
		this.regex=build(type, size, String.valueOf(exclude).concat(isNoSpaces() ? " " : ""));
	}

	public Pattern getPattern() {
		return getPattern(regex);
	}

	private String build(TYPES type, FieldSize size, String exclude) {
		//expression start
		String regex="^";
		switch(type){
		case TIME: //implement!
		case DATE: //implement!
		case STRING:
			String range="";
			//allows digits
			if (isDigits()) range+="0-9 ";
			//allows letters
			if (isLetters()) range+="a-zA-Z ";
			//default (digits and letters)
			if (range.isEmpty()) range+=(char)0+"-"+(char)65535;
			//character set
			regex+="[" + range;
			if (!exclude.isEmpty()) regex+="&&[^" + StringUtils.escape(exclude) + "]";
			regex+="]";
			//alfanumeric limit
			regex+="{0," + size.size + "}";
			break;

		case LONG:
		case DOUBLE:
		case DECIMAL:
		case INTEGER:
			//negative signal?
			if (!isPositive()) regex+="-{0,1}"; //$FALL-THROUGH$
		case BOOLEAN:
			//digits only
			regex+="\\d";
			//integer limit
			regex+="{0," + size.size + "}";
			//decimal group (decimal sparator + fraction limit + optional group)
			if (size.scale>0) regex+="(\\.\\d{0," + size.scale + "})?";
			break;
		}
		//expression end
		regex+="$";
		return regex;
	}


}