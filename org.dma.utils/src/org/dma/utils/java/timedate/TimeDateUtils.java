/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.java.timedate;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public final class TimeDateUtils {

	/*
	 * Date
	 */
	public static final char CHAR_YEAR = 'A';
	public static final char CHAR_MONTH = 'M';
	public static final char CHAR_DAY = 'D';
	public static final String DATE_YEAR = Character.toString(CHAR_YEAR)+Character.toString(CHAR_YEAR)+Character.toString(CHAR_YEAR)+Character.toString(CHAR_YEAR);
	public static final String DATE_MONTH = Character.toString(CHAR_MONTH)+Character.toString(CHAR_MONTH);
	public static final String DATE_DAY = Character.toString(CHAR_DAY)+Character.toString(CHAR_DAY);
	public static final char[] DATE_SEPARATOR = {'/',','};
	public static final String DEFAULT_DATE_FORMAT = DATE_DAY+DATE_SEPARATOR[0]+DATE_MONTH+DATE_SEPARATOR[0]+DATE_YEAR;
	public static final String CHECK_DATE_FORMAT = DATE_YEAR+DATE_SEPARATOR[1]+DATE_MONTH+DATE_SEPARATOR[1]+DATE_DAY;

	/*
	 * Time
	 */
	public static final char CHAR_HOUR = 'H';
	public static final char CHAR_MINUTE = 'M';
	public static final char CHAR_SECOND = 'S';
	public static final String TIME_HOUR = Character.toString(CHAR_HOUR)+Character.toString(CHAR_HOUR);
	public static final String TIME_MINUTES = Character.toString(CHAR_MINUTE)+Character.toString(CHAR_MINUTE);
	public static final String TIME_SECONDS = Character.toString(CHAR_SECOND)+Character.toString(CHAR_SECOND);
	public static final char DEFAULT_TIME_SEPARATOR = ':';
	public static final String DEFAULT_TIME_FORMAT = TIME_HOUR+DEFAULT_TIME_SEPARATOR+TIME_MINUTES;

	/*
	 * JAVA
	 */
	public static final char JAVA_TIMEZONE = 'z';
	public static final char JAVA_SEPARATOR = ':';

	public static final char JAVA_WEEK_OF_YEAR = 'w';
	public static final char JAVA_WEEK_OF_MONTH = 'W';
	public static final char JAVA_DAY_OF_YEAR = 'D';
	public static final char JAVA_DAY_OF_WEEK = 'E';
	public static final char JAVA_DAY_OF_WEEK_IN_MONTH = 'F';

	public static final char JAVA_ERA = 'G'; // AD or BC
	public static final char JAVA_YEAR = 'y';
	public static final char JAVA_MONTH = 'M';
	public static final char JAVA_DAY_OF_MONTH = 'd';

	public static final String JAVA_AM = "AM";
	public static final String JAVA_PM = "PM";
	public static final char JAVA_HOUR12 = 'h'; // 1-12
	public static final char JAVA_HOUR24 = 'k'; // 1-24
	public static final char JAVA_HOUR_IN_DAY12 = 'K'; // 0-11
	public static final char JAVA_HOUR_IN_DAY24 = 'H'; // 0-23
	public static final char JAVA_MINUTE = 'm';
	public static final char JAVA_SECOND = 's';
	public static final char JAVA_MILLISECOND = 'S';

	/*
	 * Format
	 */
	public static String getDateFormat(String format) {
		try {
			format=format.replace(CHAR_YEAR, JAVA_YEAR);
			format=format.replace(CHAR_MONTH, JAVA_MONTH);
			format=format.replace(CHAR_DAY, JAVA_DAY_OF_MONTH);
			return format;

		} catch (Exception e) {
			return format;
		}
	}


	public static String getTimeFormat(String format) {
		try {
			format=format.replace(CHAR_HOUR, JAVA_HOUR_IN_DAY24);
			format=format.replace(CHAR_MINUTE, JAVA_MINUTE);
			format=format.replace(CHAR_SECOND, JAVA_SECOND);
			return format;

		} catch (Exception e) {
			return format;
		}
	}


	public static String getDateFormatted(Date date, String format) {
		try {
			return new SimpleDateFormat(getDateFormat(format)).format(date);

		} catch (Exception e) {
		}

		return null;
	}


	public static String getTimeFormatted(Time time, String format) {
		try {
			return new SimpleDateFormat(getTimeFormat(format)).format(time);

		} catch (Exception e) {
		}

		return null;
	}


	public static String getTimestampFormatted(Timestamp timestamp, String format) {
		try {
			return new SimpleDateFormat(getDateFormat(format)).format(timestamp);

		} catch (Exception e) {
		}

		return null;
	}





	/*
	 * Conversion
	 */
	public static Date getDateParsed(String date, String format) {
		try {
			return new SimpleDateFormat(getDateFormat(format)).parse(date);

		} catch (ParseException e) {
		}

		return getCurrentDate();
	}


	public static Time getTimeParsed(String time, String format) {
		try {
			return new Time(new SimpleDateFormat(getTimeFormat(format)).parse(time).getTime());

		} catch (ParseException e) {
		}

		return getCurrentTime();
	}





	/*
	 * Calendar
	 */
	public static Calendar getCalendar() {
		return Calendar.getInstance();
	}


	public static Calendar getCalendar(int year, int month, int day) {
		return new GregorianCalendar(year, month, day);
	}


	public static Calendar getCalendar(String date, String format){
		Calendar calendar=Calendar.getInstance();
		if(date!=null) calendar.setTime(getDateParsed(date, format));
		return calendar;
	}


	public static Calendar getCalendarFromDate(Date date) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}


	public static Date getDateFromCalendar(Calendar calendar) {
		return calendar.getTime();
	}


	public static int getYear(Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}


	public static int getMonth(Calendar calendar) {
		return calendar.get(Calendar.MONTH);
	}


	public static int getDaysSinceMonday(Calendar calendar) {
		int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek==Calendar.SUNDAY ? Calendar.SATURDAY : dayOfWeek-1;
	}


	public static int getCurrentYear(){
		return getYear(Calendar.getInstance());
	}


	public static int getCurrentMonth(){
		return getMonth(Calendar.getInstance());
	}


	public static int getCurrentMonthMax() {
		Calendar calendar=Calendar.getInstance();
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}





	/*
	 * Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}


	public static Date getDate(String date, String format) {
		return getDateParsed(date, format);
	}


	public static Date getDateWithoutTime(Date date) {
		Calendar calendar=getCalendarFromDate(date);
		calendar.set(Calendar.HOUR,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		return calendar.getTime();
	}


	public static Date add(Date date, Time time) {
	    //return new Date(date.getTime()+time.getTime()-Time.valueOf("00:00:00").getTime());
		Calendar calendar=getCalendarFromDate(date);
		Calendar calendar2=getCalendarFromDate(time);
		calendar.add(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		calendar.add(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		calendar.add(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return calendar.getTime();
    }


	public static Date add(Date date, int days) {
		Calendar calendar=getCalendarFromDate(date);
		calendar.add(Calendar.DATE,days);
		return calendar.getTime();
	}


	public static int getYear(Date date) {
		return getYear(getCalendarFromDate(date));
	}


	public static int getMonth(Date date) {
		return getMonth(getCalendarFromDate(date));
	}


	public static Date getCurrentYear1() {
		return getCalendar(getCurrentYear(), 0, 1).getTime();
	}


	public static Date getCurrentYear2() {
		return getCalendar(getCurrentYear(), 11, getCurrentMonthMax()).getTime();
	}


	public static Date getCurrentMonth1() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), 1).getTime();
	}


	public static Date getCurrentMonth2() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), getCurrentMonthMax()).getTime();
	}


	public static Date getCurrentWeek1() {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, (getDaysSinceMonday(calendar)-1)*-1);
		return calendar.getTime();
	}


	public static Date getCurrentWeek2() {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 7-getDaysSinceMonday(calendar));
		return calendar.getTime();
	}






	/*
	 * Time
	 */
	public static Time getCurrentTime() {
		Calendar calendar=getCalendar();
		//SECOND precision ONLY
		calendar.set(Calendar.MILLISECOND, 0);
		return new Time(calendar.getTime().getTime());
	}


	public static Time getTime(String time, String format) {
		return getTimeParsed(time, format);
	}


	public static Time getTimeFromDate(Date date) {
		return new Time(date.getTime());
	}





	/*
	 * Timestamp
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(getCurrentDate().getTime());
	}


	public static Timestamp getTimestamp(String data, String format) {
		return new Timestamp(getDateParsed(data, format).getTime());
	}


}
