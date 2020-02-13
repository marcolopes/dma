/*******************************************************************************
 * 2008-2019 Public Domain
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
	private static final Map<String, Pattern> RP_CACHE=new ConcurrentHashMap();

	public static Pattern getRegexPattern(String regex) {
		Pattern pattern=RP_CACHE.get(regex);
		if (pattern==null) RP_CACHE.put(regex, pattern=Pattern.compile(regex));
		return pattern;
	}

	private final String regex;

	public FieldRegex(TYPES type, FieldSize size, int properties, char...exclude) {
		super(properties);
		this.regex=buildRegex(type, size, String.valueOf(exclude).concat(isNoSpaces() ? " " : ""));
	}

	public Pattern getRegexPattern() {
		return getRegexPattern(regex);
	}

	private String buildRegex(TYPES type, FieldSize size, String exclude) {
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
			//allows separators
			if (isSeparators()) range+="\\-/";
			//default (digits and letters)
			if (range.isEmpty()) range+=(char)0+"-"+(char)65535;
			//character set
			regex+="[" + range;
			if (!exclude.isEmpty()) regex+="&&[^" + StringUtils.escape(exclude) + "]";
			regex+="]";
			//alfanumeric limit
			regex+="{0," + size.size + "}";
			break;

		case DECIMAL:
		case INTEGER:
			//negative signal?
			if (!isPositive()) regex+="-{0,1}";
		//$FALL-THROUGH$
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