/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.java.timedate;

import java.util.Calendar;
import java.util.regex.Pattern;

public final class DateValidation {

	private static final String REGEX_YEAR = "([0-9]|"+TimeDateUtils.DATE_YEAR_CHAR+"){"+TimeDateUtils.DATE_YEAR_FORMAT.length()+"}";
	private static final String REGEX_MONTH = "([0-9]|"+TimeDateUtils.DATE_MONTH_CHAR+"){"+TimeDateUtils.DATE_MONTH_FORMAT.length()+"}";
	private static final String REGEX_DAY = "([0-9]|"+TimeDateUtils.DATE_DAY_CHAR+"){"+TimeDateUtils.DATE_DAY_FORMAT.length()+"}";

	public static boolean isDateValid(String date, String format) {

		if(date.matches(format))
			return false;

		//contem algum caractere de formatacao?
		if((date.indexOf(TimeDateUtils.DATE_YEAR_CHAR)!=-1) ||
				(date.indexOf(TimeDateUtils.DATE_MONTH_CHAR)!=-1) ||
				(date.indexOf(TimeDateUtils.DATE_DAY_CHAR)!=-1))
			return false;

		int year = Integer.parseInt(getYear(date, format));
		int month = Integer.parseInt(getMonth(date, format))-1;

		//inicializa calendario
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, 1);

		//verifica limite dos meses
		int maxMonth = calendar.getActualMaximum(Calendar.MONTH);
		if (month < 0 || month > maxMonth)
			return false;

		//verifica limite dos dias
		int day = Integer.parseInt(getDay(date, format));
		int maxDay = calendar.getActualMaximum(Calendar.DATE);
		if (day < 1 || day > maxDay)
			return false;

		return true;

	}


	public static boolean isFormatValid(String text, String format) {

		String separator=Character.toString(getSeparator(format));
		String regex=format.replace(separator, "("+separator+")");
		regex=regex.replace(TimeDateUtils.DATE_YEAR_FORMAT, REGEX_YEAR);
		regex=regex.replace(TimeDateUtils.DATE_MONTH_FORMAT, REGEX_MONTH);
		regex=regex.replace(TimeDateUtils.DATE_DAY_FORMAT, REGEX_DAY);

		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(text).matches();
	}


	public static char getSeparator(String format) {

		for(int i=0; i<format.length(); i++) {
			char chr=format.charAt(i);
			if(chr!=TimeDateUtils.DATE_DAY_CHAR && chr!=TimeDateUtils.DATE_MONTH_CHAR && chr!=TimeDateUtils.DATE_YEAR_CHAR)
				return chr;
		}
		return TimeDateUtils.DEFAULT_DATE_SEPARATOR;
	}


	private static String getYear(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_YEAR_FORMAT);
		int endindex=startindex+TimeDateUtils.DATE_YEAR_FORMAT.length();
		return text.substring(startindex, endindex);
	}


	private static String getMonth(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_MONTH_FORMAT);
		int endindex=startindex+TimeDateUtils.DATE_MONTH_FORMAT.length();
		return text.substring(startindex, endindex);
	}


	private static String getDay(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_DAY_FORMAT);
		int endindex=startindex+TimeDateUtils.DATE_DAY_FORMAT.length();
		return text.substring(startindex, endindex);
	}


}
