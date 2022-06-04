/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.input;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.SystemUtils;

import org.dma.java.util.StringUtils;
import org.dma.java.util.TimeDateUtils;

public class FieldFormat extends FieldRegex {

	/** Decimal Format CACHE */
	private static final Map<String, DecimalFormat> DF_CACHE=new ConcurrentHashMap();

	public static DecimalFormat getDecimalFormat(String pattern, DecimalFormatSymbols symbols) {
		DecimalFormat df=DF_CACHE.get(pattern);
		if (df==null) DF_CACHE.put(pattern, df=new DecimalFormat(pattern, symbols));
		return df;
	}

	public enum SEPARATOR {

		/** JAVA line separator */
		LINE (SystemUtils.LINE_SEPARATOR),
		COMMA (","),
		HYPHEN ("-"),
		SEMICOLON (";");

		public final String value;

		SEPARATOR(String value) {
			this.value=value;
		}

		@Override
		public String toString() {
			return value;
		}

	}

	public enum KEYBOARD {

		TAB (0x09/*SWT.TAB*/),
		SPACE (0x20/*SWT.SPACE*/),
		LINE_FEED (0x0A/*SWT.LF*/),
		CARRIAGE_RETURN (0x0D/*SWT.CR*/);

		public final char code;
		public final String value;

		KEYBOARD(int code) {
			this.code=(char)code;
			this.value=String.valueOf(this.code);
		}

		@Override
		public String toString() {
			return value;
		}

	}

	public enum TYPES {

		TIME (java.sql.Time.class),
		DATE (java.util.Date.class),
		LONG (java.lang.Long.class),
		DOUBLE (java.lang.Double.class),
		DECIMAL (java.math.BigDecimal.class),
		INTEGER (java.lang.Integer.class),
		BOOLEAN (java.lang.Boolean.class),
		STRING (java.lang.String.class);

		public final Class klass;

		TYPES(Class klass) {
			this.klass=klass;
		}

		/*
		 * Examples
		 * SIZE 9,0: ###,###,##0
		 * SIZE 9,3: ###,##0.000
		 * SIZE 4,3: #,##0.000
		 */
		public String buildPattern(FieldSize size) {
			switch(this){
			case TIME: return TimeDateUtils.DEFAULT_TIME_PATTERN;
			case DATE: return TimeDateUtils.DEFAULT_DATE_PATTERN;
			case LONG:
			case DOUBLE:
			case DECIMAL:
			case INTEGER:
			case BOOLEAN:
				String pattern="";
				//#,###,##
				for(int i=size.size; i>1; i--){
					pattern+="#";
					if (i%3==1) pattern+=",";
				}//#,###,##0
				pattern+="0";
				//#,###,##0.000
				if (size.scale>0) pattern+="."+StringUtils.replicas("0", size.scale);
				return pattern;

			case STRING: break;
			}return null;
		}

	}

	private final TYPES type;
	private final FieldSize size;
	private final String pattern;

	public FieldFormat(TYPES type, String pattern) {
		this(type, pattern, NONE);
	}

	public FieldFormat(TYPES type, String pattern, int properties) {
		this(type, new FieldSize(pattern.length()), pattern, properties);
	}

	public FieldFormat(TYPES type, int size, char...exclude) {
		this(type, size, NONE, exclude);
	}

	public FieldFormat(TYPES type, int size, int properties, char...exclude) {
		this(type, new FieldSize(size), NONE, exclude);
	}

	public FieldFormat(TYPES type, FieldSize size, int properties, char...exclude) {
		this(type, size, null, properties, exclude);
	}

	public FieldFormat(TYPES type, FieldSize size, String pattern, int properties, char...exclude) {
		super(type, size, properties, exclude);
		this.type=type;
		this.size=size;
		this.pattern=pattern==null ? type.buildPattern(size) : pattern;
	}



	/*
	 * Format
	 */
	public String getDisplayPattern() {
		return pattern;
	}

	public String getEditPattern() {
		switch(type){
		case TIME:
		case DATE: break;
		case LONG:
		case DOUBLE:
		case DECIMAL:
		case INTEGER: return isPositive() ? pattern : "-"+pattern;
		case BOOLEAN:
		case STRING: break;
		}return pattern;
	}

	public String format(Object value, DecimalFormatSymbols symbols) {
		switch(type){
		case TIME: return TimeDateUtils.getTimeFormatted((Time)value, pattern);
		case DATE: return TimeDateUtils.getDateFormatted((Date)value, pattern);
		case LONG:
		case DOUBLE:
		case DECIMAL:
		case INTEGER: return getDecimalFormat(pattern, symbols).format(value);
		case BOOLEAN:
		case STRING: break;
		}return value.toString();
	}

	public Object parse(String text) {
		try{switch(type){
			case TIME: return TimeDateUtils.getTime(text, pattern);
			case DATE: return TimeDateUtils.getDate(text, pattern);
			case LONG: return new Long(text);
			case DOUBLE: return new Double(text);
			case DECIMAL: return new BigDecimal(text);
			case INTEGER: return new Integer(text);
			case BOOLEAN: return new Boolean(text);
			case STRING: break;
			}return text;
		}catch(Exception e){}
		return null;
	}



	/*
	 * Validation
	 */
	public boolean isValid(BigDecimal number) {
		return isValid(number.toBigInteger());
	}

	public boolean isValid(BigInteger number) {
		return number!=null && (!isPositive() || number.signum()>=0) &&
				(number.toString().length()<=size.size+(number.signum()<0 ? 1 : 0));
	}

	public boolean isValid(Integer number) {
		return number!=null && (!isPositive() || number>=0) &&
				(number.toString().length()<=size.size+(number<0 ? 1 : 0));
	}

	public boolean isValid(String string) {
		return string!=null && string.length()<=size.size &&
				(!isUppercase() || StringUtils.isUppercase(string)) &&
				(!isLowercase() || StringUtils.isLowercase(string)) &&
				getPattern().matcher(string).matches();
	}


	/*
	 * Getters and setters
	 */
	public TYPES getType() {
		return type;
	}

	public FieldSize getSize() {
		return size;
	}

}