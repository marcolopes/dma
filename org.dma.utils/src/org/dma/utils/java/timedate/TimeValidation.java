/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.java.timedate;

import java.util.Calendar;
import java.util.regex.Pattern;

public final class TimeValidation {

	private static final String REGEX_HOUR="([0-9]|"+TimeDateUtils.CHAR_HOUR+"){"+TimeDateUtils.TIME_HOUR.length()+"}";
	private static final String REGEX_MINUTE="([0-9]|"+TimeDateUtils.CHAR_MINUTE+"){"+TimeDateUtils.TIME_MINUTES.length()+"}";

	public static boolean isTimeValid(String time, String format) {

		if(time.matches(format))
			return false;

		/*
		//existem caracteres NAO numericos?
		String numericDate=StringUtils.remove(time, Character.toString(getSeparator(format)));
		if (!StringUtils.isNumeric(numericDate))
			return false;
		 */

		//contem algum caractere de formatacao?
		if((time.indexOf(TimeDateUtils.CHAR_HOUR)!=-1) ||
				(time.indexOf(TimeDateUtils.CHAR_MINUTE)!=-1))
			return false;

		//inicializa calendario
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 1901);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 1);

		//verifica limite das horas
		int hour = Integer.parseInt(getHour(time, format));
		if(hour < 0 || hour > 23)
			return false;
		calendar.set(Calendar.HOUR_OF_DAY, hour);

		//verifica limite dos minutos
		int minutes = Integer.parseInt(getMinutes(time, format));
		if (minutes < 0 || minutes >= 60)
			return false;

		return true;
	}


	public static boolean isFormatValid(String text, String format) {

		String separator=Character.toString(getSeparator(format));
		String regex=format.replace(separator, "("+separator+")");
		regex=regex.replace(TimeDateUtils.TIME_HOUR, REGEX_HOUR);
		regex=regex.replace(TimeDateUtils.TIME_MINUTES, REGEX_MINUTE);

		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(text).matches();
	}


	public static char getSeparator(String format) {

		for(int i=0; i<format.length(); i++) {
			char chr=format.charAt(i);
			if(chr!=TimeDateUtils.CHAR_HOUR && chr!=TimeDateUtils.CHAR_MINUTE)
				return chr;
		}
		return TimeDateUtils.DEFAULT_TIME_SEPARATOR;
	}


	private static String getHour(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.TIME_HOUR);
		int endindex=startindex+TimeDateUtils.TIME_HOUR.length();
		return text.substring(startindex, endindex);
	}


	private static String getMinutes(String text, String format) {

		int startindex=format.indexOf(TimeDateUtils.TIME_MINUTES);
		int endindex=startindex+TimeDateUtils.TIME_MINUTES.length();
		return text.substring(startindex, endindex);

	}


}
