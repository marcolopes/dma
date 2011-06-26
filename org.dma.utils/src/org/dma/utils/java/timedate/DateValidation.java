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

	private static final String REGEX_YEAR="([0-9]|"+TimeDateUtils.CHAR_YEAR+"){"+TimeDateUtils.DATE_YEAR.length()+"}";
	private static final String REGEX_MONTH="([0-9]|"+TimeDateUtils.CHAR_MONTH+"){"+TimeDateUtils.DATE_MONTH.length()+"}";
	private static final String REGEX_DAY="([0-9]|"+TimeDateUtils.CHAR_DAY+"){"+TimeDateUtils.DATE_DAY.length()+"}";

	public static boolean isDateValid(String date, String format) {

		if(date.matches(format))
			return false;

		/*
		//existem caracteres NAO numericos?
		String numericDate=StringUtils.remove(date, Character.toString(getSeparator(format)));
		if (!StringUtils.isNumeric(numericDate))
			return false;
		 */

		//contem algum caractere de formatacao?
		if((date.indexOf(TimeDateUtils.CHAR_YEAR)!=-1) ||
				(date.indexOf(TimeDateUtils.CHAR_MONTH)!=-1) ||
				(date.indexOf(TimeDateUtils.CHAR_DAY)!=-1))
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
		regex=regex.replace(TimeDateUtils.DATE_YEAR, REGEX_YEAR);
		regex=regex.replace(TimeDateUtils.DATE_MONTH, REGEX_MONTH);
		regex=regex.replace(TimeDateUtils.DATE_DAY, REGEX_DAY);

		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(text).matches();
	}


	public static char getSeparator(String format) {

		for(int i=0; i<format.length(); i++) {
			char chr=format.charAt(i);
			if(chr!=TimeDateUtils.CHAR_DAY && chr!=TimeDateUtils.CHAR_MONTH && chr!=TimeDateUtils.CHAR_YEAR)
				return chr;
		}
		return TimeDateUtils.DATE_SEPARATOR[0];
	}


	private static String getYear(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_YEAR);
		int endindex=startindex+TimeDateUtils.DATE_YEAR.length();
		return text.substring(startindex, endindex);
	}


	private static String getMonth(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_MONTH);
		int endindex=startindex+TimeDateUtils.DATE_MONTH.length();
		return text.substring(startindex, endindex);
	}


	private static String getDay(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.DATE_DAY);
		int endindex=startindex+TimeDateUtils.DATE_DAY.length();
		return text.substring(startindex, endindex);
	}


}
