/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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

import java.math.BigDecimal;
import java.math.BigInteger;
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

	private final TYPES type;
	private final FieldSize size;
	private final char[] exclude;
	private final String regex;

	public TYPES getType() {return type;}
	public FieldSize getSize() {return size;}
	public Pattern getPattern() {return getPattern(regex);}

	public FieldRegex(TYPES type, FieldSize size, int properties, char...exclude) {
		super(properties);
		this.type=type;
		this.size=size;
		this.exclude=exclude;
		this.regex=build();
	}

	private String build() {
		//expression start
		StringBuilder sb=new StringBuilder("^");
		switch(type){
		case TIME: //implement!
		case DATE: //implement!
		case BOOLEAN:
		case STRING: sb.append(alphanumericExpression()); break;
		case LONG:
		case DOUBLE:
		case DECIMAL:
		case INTEGER: sb.append(numericExpression()); break;
		}//expression end
		sb.append("$");
		return sb.toString();
	}

	public String alphanumericExpression() {
		StringBuilder sb=new StringBuilder();
		/*
		 * exclude expression
		 * JavaScript compatibility!
		 * https://stackoverflow.com/questions/28271771/excluding-some-character-from-a-range-javascript-regular-expression
		 */
		String exclude=String.valueOf(this.exclude);
		//does not allow spaces
		if (isNoSpaces()) exclude+=" ";
		if (!exclude.isEmpty()) sb.append("(?!.*[" + StringUtils.escape(exclude) + "])");
		/*
		 * range expression
		 */
		String range="";
		//allows digits
		if (isDigits()) range+="0-9 ";
		//allows letters
		if (isLetters()) range+="a-zA-Z ";
		//allows all chars
		if (range.isEmpty()) range+="\\u0000"+"-"+"\\uffff";
		sb.append("[" + range + "]");
		/*
		 * limit expression
		 */
		sb.append(size.size==0 ? "*" : "{0," + size.size + "}");
		return sb.toString();
	}

	/** Creates the numeric expression */
	public String numericExpression() {
		StringBuilder sb=new StringBuilder();
		/*
		 * negative signal expression
		 */
		if (!isPositive()) sb.append("-{0,1}");
		/*
		 * digits only expression
		 */
		sb.append("\\d");
		/*
		 * limit expression
		 */
		sb.append("{0," + size.size + "}");
		/*
		 * decimal group expression
		 * (decimal sparator + fraction limit + optional group)
		 */
		if (size.scale>0) sb.append("(\\.\\d{0," + size.scale + "})?");
		return sb.toString();
	}


	/*
	 * Validation
	 */
	public boolean isValid(BigDecimal number) {
		return isValid(number.toBigInteger());
	}

	public boolean isValid(BigInteger number) {
		return number!=null && (!isPositive() || number.signum()>=0) &&
				(number.toString().length()<=getSize().size+(number.signum()<0 ? 1 : 0));
	}

	public boolean isValid(Integer number) {
		return number!=null && (!isPositive() || number>=0) &&
				(number.toString().length()<=getSize().size+(number<0 ? 1 : 0));
	}

	public boolean isValid(String string) {
		return string!=null && string.length()<=getSize().size &&
				(!isUppercase() || StringUtils.isUppercase(string)) &&
				(!isLowercase() || StringUtils.isLowercase(string)) &&
				getPattern().matcher(string).matches();
	}

}