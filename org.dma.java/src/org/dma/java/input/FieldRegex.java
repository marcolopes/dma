/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.dma.java.input.FieldFormat.TYPES;
import org.dma.java.util.StringUtils;
import org.dma.java.util.TimeDateUtils;

public class FieldRegex extends FieldProperties {

	private static final Map<String, String> DATETIME_PATTERNS = new HashMap();
	static{
		DATETIME_PATTERNS.put(TimeDateUtils.DATE_YEAR_PATTERN, "\\d{4}");
		DATETIME_PATTERNS.put(TimeDateUtils.DATE_MONTH_PATTERN, "([0]{0,1}[1-9]|1[012])");
		DATETIME_PATTERNS.put(TimeDateUtils.DATE_DAY_PATTERN, "(([012][0-9])|(3[01]))");
		DATETIME_PATTERNS.put(TimeDateUtils.TIME_HOUR_PATTERN, "([01][0-9]|[2][0-3])");
		DATETIME_PATTERNS.put(TimeDateUtils.TIME_MINUTE_PATTERN, "([012345][0-9])");
		DATETIME_PATTERNS.put(TimeDateUtils.TIME_SECOND_PATTERN, "([012345][0-9])");
		DATETIME_PATTERNS.put(TimeDateUtils.TIME_MILISECOND_PATTERN, "\\d{3}");
	}

	/** Regex Pattern CACHE */
	private static final Map<String, Pattern> RP_CACHE = new ConcurrentHashMap();

	public static Pattern getPattern(String regex) {
		Pattern pattern=RP_CACHE.get(regex);
		if (pattern==null) RP_CACHE.put(regex, pattern=Pattern.compile(regex));
		return pattern;
	}

	protected final TYPES type;
	protected final FieldSize size;
	protected final String pattern;
	protected final char[] exclude;
	protected final String regex;

	public TYPES getType() {return type;}
	public FieldSize getSize() {return size;}
	public char[] getExclude() {return exclude;}
	public Pattern getPattern() {return getPattern(regex);}

	public FieldRegex(TYPES type, FieldSize size, int properties, char...exclude) {
		this(type, size, null, properties, exclude);
	}

	public FieldRegex(TYPES type, FieldSize size, String pattern, int properties, char...exclude) {
		super(properties);
		this.type=type;
		this.size=size;
		this.pattern=pattern;
		this.exclude=exclude;
		this.regex=buildRegex();
	}

	private String buildRegex() {
		//START of the expression
		StringBuilder sb=new StringBuilder("^");
		switch(type){
		case TIME:
		case DATE:
		case BOOLEAN:
		case STRING: sb.append(alphanumericExpression()); break;
		case LONG:
		case DOUBLE:
		case DECIMAL:
		case INTEGER: sb.append(numericExpression()); break;
		}//END of the expression
		sb.append("$");
		return sb.toString();
	}

	public String alphanumericExpression() {
		StringBuilder sb=new StringBuilder();
		if (pattern==null){
			/*
			 * EXCLUDE expression
			 * JavaScript compatibility!
			 * https://stackoverflow.com/questions/28271771/excluding-some-character-from-a-range-javascript-regular-expression
			 */
			String exclude=String.valueOf(this.exclude);
			//does not allow spaces
			if (isNoSpaces()) exclude+=" ";
			if (!exclude.isEmpty()) sb.append("(?!.*[" + StringUtils.escape(exclude) + "])");
			/*
			 * RANGE expression
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
			 * LIMIT expression
			 */
			sb.append(size.size==0 ? "*" : "{0," + size.size + "}");
		}//TIME & DATE
		else if (type==TYPES.TIME || type==TYPES.DATE){
			for(char c: pattern.toCharArray()){
				switch(c){
				default: sb.append(c); break;
				//JavaScript compatibility!
				case '/': sb.append("\\/"); break;
				}
			}//values
			for(String key: DATETIME_PATTERNS.keySet()){
				int index=sb.indexOf(key);
				if (index!=-1) sb.replace(index, index+key.length(), DATETIME_PATTERNS.get(key));
			}
		}else for(char c: pattern.toCharArray()){
			switch(c){
			//separator
			default: sb.append(c); break;
			//JavaScript compatibility!
			case '/': sb.append("\\/"); break;
			//values
			case '#': sb.append("[0-9]"); break;
			case 'A':
			case 'a': sb.append("[A-Za-z]"); break;
			}
		}return sb.toString();
	}

	/** Creates the numeric expression */
	public String numericExpression() {
		StringBuilder sb=new StringBuilder();
		/*
		 * NEGATIVE SIGNAL expression
		 */
		if (!isPositive()) sb.append("-{0,1}");
		/*
		 * DIGITS ONLY expression
		 */
		sb.append("\\d");
		/*
		 * LIMIT expression
		 */
		sb.append("{0," + size.size + "}");
		/*
		 * DECIMAL GROUP expression
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
		return number!=null &&
				(!isPositive() || number.signum()>=0) &&
				(number.toString().length()<=getSize().size+(number.signum()<0 ? 1 : 0));
	}

	public boolean isValid(Integer number) {
		return number!=null &&
				(!isPositive() || number>=0) &&
				(number.toString().length()<=getSize().size+(number<0 ? 1 : 0));
	}

	public boolean isValid(String string) {
		return string!=null &&
				(getSize().size==0 || string.length()<=getSize().size) &&
				(!isUppercase() || StringUtils.isUppercase(string)) &&
				(!isLowercase() || StringUtils.isLowercase(string)) &&
				getPattern().matcher(string).matches();
	}

}