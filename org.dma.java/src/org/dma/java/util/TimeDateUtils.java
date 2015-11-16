/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * http://www.odi.ch/prog/design/datetime.php
 */
public class TimeDateUtils {

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
	 * Date
	 */
	public static final String DATE_YEAR_PATTERN = String.valueOf(new char[]{JAVA_YEAR,JAVA_YEAR,JAVA_YEAR,JAVA_YEAR});
	public static final String DATE_MONTH_PATTERN = String.valueOf(new char[]{JAVA_MONTH,JAVA_MONTH});
	public static final String DATE_DAY_PATTERN = String.valueOf(new char[]{JAVA_DAY_OF_MONTH,JAVA_DAY_OF_MONTH});

	public static final char DEFAULT_DATE_SEPARATOR = '-';
	public static final String DEFAULT_DATE_PATTERN = DATE_DAY_PATTERN+DEFAULT_DATE_SEPARATOR+DATE_MONTH_PATTERN+DEFAULT_DATE_SEPARATOR+DATE_YEAR_PATTERN;

	/*
	 * Time
	 */
	public static final long MILLISECOND_PER_DAY = 60 * 60 * 24 * 1000;
	public static final String TIME_HOUR_PATTERN = String.valueOf(new char[]{JAVA_HOUR_IN_DAY24,JAVA_HOUR_IN_DAY24});
	public static final String TIME_MINUTE_PATTERN = String.valueOf(new char[]{JAVA_MINUTE,JAVA_MINUTE});
	public static final String TIME_SECOND_PATTERN = String.valueOf(new char[]{JAVA_SECOND,JAVA_SECOND});
	public static final String TIME_MILISECOND_PATTERN = String.valueOf(new char[]{JAVA_MILLISECOND,JAVA_MILLISECOND,JAVA_MILLISECOND});

	public static final char DEFAULT_TIME_SEPARATOR = ':';
	public static final String DEFAULT_TIME_PATTERN = TIME_HOUR_PATTERN+DEFAULT_TIME_SEPARATOR+TIME_MINUTE_PATTERN;

	/*
	 * Cache
	 */
	private static final Map<String, SimpleDateFormat> SDF_CACHE=new HashMap();

	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		SimpleDateFormat sdf=SDF_CACHE.get(pattern);
		if (sdf==null){
			sdf=new SimpleDateFormat(pattern);
			SDF_CACHE.put(pattern, sdf);
		}
		return sdf;
	}

	/*
	 * Validation
	 */
	public static boolean isDateValid(String date, String pattern) {
		return getDateParsed(date, pattern)!=null;
	}


	public static boolean isDateValid(String date) {
		return isDateValid(date, DEFAULT_DATE_PATTERN);
	}


	public static boolean isTimeValid(String time, String pattern) {
		return getTimeParsed(time, pattern)!=null;
	}


	public static boolean isTimeValid(String time) {
		return isTimeValid(time, DEFAULT_TIME_PATTERN);
	}


	public static boolean isTodayAfter(Calendar calendar, int daysToAdd) {
		Calendar when=(Calendar)calendar.clone();
		when.add(Calendar.DAY_OF_MONTH, daysToAdd);
		return getCalendarWithoutTime().after(when);
	}


	public static boolean isTodayAfter(Calendar calendar) {
		return isTodayAfter(calendar, 0);
	}


	public static boolean isTodayAfter(Date date, int daysToAdd) {
		return isTodayAfter(getCalendar(date), daysToAdd);
	}


	public static boolean isTodayAfter(Date date) {
		return isTodayAfter(date, 0);
	}





	/*
	 * Format
	 */
	public static String getDateFormatted(Date date, String pattern) {
		try{
			return getSimpleDateFormat(pattern).format(date);

		}catch(Exception e){}
		return null;
	}


	public static String getDateFormatted(String pattern) {
		return getDateFormatted(getCurrentDate(), pattern);
	}


	/** Date formatted with DEFAULT PATTERN */
	public static String getDateFormatted(Date date) {
		return getDateFormatted(date, DEFAULT_DATE_PATTERN);
	}


	public static String getTimeFormatted(Time time, String pattern) {
		try{
			return getSimpleDateFormat(pattern).format(time);

		}catch(Exception e){}
		return null;
	}


	/** Time formatted with DEFAULT PATTERN */
	public static String getTimeFormatted(Time time) {
		return getTimeFormatted(time, DEFAULT_TIME_PATTERN);
	}


	public static String getTimeFormatted(String pattern) {
		return getTimeFormatted(getCurrentTime(), pattern);
	}


	public static String getTimestampFormatted(Timestamp timestamp, String pattern) {
		try{
			return getSimpleDateFormat(pattern).format(timestamp);

		}catch(Exception e){}
		return null;
	}





	/*
	 * Conversion
	 */
	public static Date getDateParsed(String date, String pattern) {
		try{
			return getSimpleDateFormat(pattern).parse(date);

		}catch(ParseException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	public static Date getDateParsed(String date) {
		return getDateParsed(date, DEFAULT_DATE_PATTERN);
	}


	public static Time getTimeParsed(String time, String pattern) {
		try{
			return new Time(getSimpleDateFormat(pattern).parse(time).getTime());

		}catch(ParseException e){
			System.out.println(e);
		}catch(Exception e){}
		return null;
	}


	public static Time getTimeParsed(String time) {
		return getTimeParsed(time, DEFAULT_TIME_PATTERN);
	}





	/*
	 * XML Gregorian Calendar
	 */
	public static XMLGregorianCalendar getXMLGregorianCalendar() {
		return getXMLGregorianCalendar(getCalendar());
	}


	public static XMLGregorianCalendar getXMLGregorianCalendar(Calendar calendar) {
		try{
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(
					getGregorianCalendar(calendar));

		}catch(DatatypeConfigurationException e){}
		return null;
	}


	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) {
		return getXMLGregorianCalendar(getCalendar(date));
	}


	public static XMLGregorianCalendar getXMLGregorianCalendar(String date) {
		try{
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);

		}catch(DatatypeConfigurationException e){
		}catch(IllegalArgumentException e){}
		return null;
	}





	/*
	 * Gregorian Calendar
	 */
	public static GregorianCalendar getGregorianCalendar() {
		return new GregorianCalendar();
	}


	public static GregorianCalendar getGregorianCalendar(Calendar calendar) {
		return new GregorianCalendar(
				calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH),
				calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE),
				calendar.get(Calendar.SECOND));
	}


	public static GregorianCalendar getGregorianCalendar(Date date) {
		return getGregorianCalendar(getCalendar(date));
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


	public static Calendar getCalendar(String date, String pattern) {
		Calendar calendar=Calendar.getInstance();
		try{
			calendar.setTime(getDateParsed(date, pattern));
		}catch(Exception e){}
		return calendar;
	}

	/** Calendar formatted with DEFAULT PATTERN */
	public static Calendar getCalendar(String date) {
		return getCalendar(date, DEFAULT_DATE_PATTERN);
	}


	public static Calendar getCalendar(Date date) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}


	public static Calendar getCalendar(Time time) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(time);
		return calendar;
	}


	public static Calendar getCalendarWithDay(Calendar calendar, int day) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.DAY_OF_MONTH, day);
		return clone;

	}


	public static Calendar getCalendarWithMonth(Calendar calendar, int month) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.MONTH, month);
		return clone;

	}


	public static Calendar getCalendarWithYear(Calendar calendar, int year) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.YEAR, year);
		return clone;

	}


	public static Calendar getCalendarWithoutTimezone(Calendar calendar) {
		Calendar clone=(Calendar)calendar.clone();
		clone.clear(); // clear all fields, including ZONE_OFFSET
		clone.set(
			calendar.get(Calendar.YEAR),
			calendar.get(Calendar.MONTH),
			calendar.get(Calendar.DAY_OF_MONTH),
			calendar.get(Calendar.HOUR_OF_DAY),
			calendar.get(Calendar.MINUTE),
			calendar.get(Calendar.SECOND));
		return clone;
	}


	public static Calendar getCalendarWithoutTimezone(Date date) {
		return getCalendarWithoutTimezone(getCalendar(date));
	}


	public static Calendar getCalendarWithoutTimezone() {
		return getCalendarWithoutTimezone(getCalendar());
	}


	public static Calendar getCalendarWithoutTime(Calendar calendar) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.HOUR_OF_DAY,0);
		clone.set(Calendar.MINUTE,0);
		clone.set(Calendar.SECOND,0);
		clone.set(Calendar.MILLISECOND,0);
		return clone;
	}


	public static Calendar getCalendarWithoutTime(Date date) {
		return getCalendarWithoutTime(getCalendar(date));
	}


	public static Calendar getCalendarWithoutTime() {
		return getCalendarWithoutTime(getCalendar());
	}


	public static int getYear(Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}


	public static int getMonth(Calendar calendar) {
		return calendar.get(Calendar.MONTH);
	}


	public static int getDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}


	public static int getDayOfMonthMax(Calendar calendar) {
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}


	public static int getDayOfMonthMax(int year, int month) {
		return getDayOfMonthMax(getCalendar(year, month, 1));
	}


	public static int getDaysSinceMonday(Calendar calendar) {
		int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek==Calendar.SUNDAY ? 7 : dayOfWeek-1;
	}


	public static long getDaysBetween(Calendar oldDate, Calendar newDate) {
		oldDate.set(Calendar.HOUR_OF_DAY, 0); // Crucial
		oldDate.set(Calendar.MINUTE, 0);
		oldDate.set(Calendar.SECOND, 0);
		oldDate.set(Calendar.MILLISECOND, 0);
		newDate.set(Calendar.HOUR_OF_DAY, 0); // Crucial
		newDate.set(Calendar.MINUTE, 0);
		newDate.set(Calendar.SECOND, 0);
		newDate.set(Calendar.MILLISECOND, 0);
		return TimeUnit.MILLISECONDS.toDays(newDate.getTimeInMillis()-oldDate.getTimeInMillis());
	}


	public static int getHour(Calendar calendar) {
		return calendar.get(Calendar.HOUR_OF_DAY);
	}


	public static int getMinute(Calendar calendar) {
		return calendar.get(Calendar.MINUTE);
	}


	public static int getSecond(Calendar calendar) {
		return calendar.get(Calendar.SECOND);
	}


	public static int getCurrentYear() {
		return getYear(Calendar.getInstance());
	}


	public static int getCurrentMonth() {
		return getMonth(Calendar.getInstance());
	}


	public static int getCurrentDayOfMonth() {
		return getDayOfMonth(Calendar.getInstance());
	}


	public static int getCurrentDayOfMonthMax() {
		return getDayOfMonthMax(Calendar.getInstance());
	}


	public static int getCurrentHour() {
		return getHour(Calendar.getInstance());
	}


	public static int getCurrentMinute() {
		return getMinute(Calendar.getInstance());
	}


	public static int getCurrentSecond() {
		return getSecond(Calendar.getInstance());
	}





	/*
	 * Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}


	/** Date formatted with DEFAULT PATTERN */
	public static Date getDate(String date) {
		return getDateParsed(date, DEFAULT_DATE_PATTERN);
	}


	public static Date getDate(Time time) {
		return new Date(time.getTime());
	}


	public static Date getDate(Calendar calendar) {
		return calendar.getTime();
	}


	public static Date getDateWithDay(Date date, int day) {
		Calendar calendar=getCalendar(date);
		return getCalendarWithDay(calendar, day).getTime();

	}


	public static Date getDateWithMonth(Date date, int month) {
		Calendar calendar=getCalendar(date);
		return getCalendarWithMonth(calendar, month).getTime();
	}


	public static Date getDateWithYear(Date date, int year) {
		Calendar calendar=getCalendar(date);
		return getCalendarWithYear(calendar, year).getTime();
	}


	public static Date getDateWithoutTime(Date date) {
		Calendar calendar=getCalendar(date);
		return getCalendarWithoutTime(calendar).getTime();
	}


	public static Date getDateWithoutTime() {
		return getDateWithoutTime(getCurrentDate());
	}


	public static Date getDate(Date date, Time time) {
		Calendar calendar=getCalendar(date);
		Calendar calendar2=getCalendar(time);
		calendar.set(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		calendar.set(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		calendar.set(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return calendar.getTime();
	}


	public static Date addTime(Date date, Time time) {
		//return new Date(date.getTime()+time.getTime()-Time.valueOf("00:00:00").getTime());
		Calendar calendar=getCalendar(date);
		Calendar calendar2=getCalendar(time);
		calendar.add(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		calendar.add(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		calendar.add(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return calendar.getTime();
	}


	public static Date addMonths(Date date, int months) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.MONTH, months);
		return calendar.getTime();
	}


	public static Date addDays(Date date, int days) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}


	public static Date addHours(Date date, int hours) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.HOUR, hours);
		return getTime(calendar);
	}


	public static Date addMinutes(Date date, int minutes) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.MINUTE, minutes);
		return getTime(calendar);
	}


	public static Date addSeconds(Date date, int seconds) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.SECOND, seconds);
		return getTime(calendar);
	}


	public static int getYear(Date date) {
		return getYear(getCalendar(date));
	}


	public static int getMonth(Date date) {
		return getMonth(getCalendar(date));
	}


	public static int getDayOfMonth(Date date) {
		return getDayOfMonth(getCalendar(date));
	}


	public static long getDaysBetween(Date oldDate, Date newDate) {
		return getDaysBetween(getCalendar(oldDate), getCalendar(newDate));
	}


	public static Date getCurrentYearMin() {
		return getCalendar(getCurrentYear(), 0, 1).getTime();
	}


	public static Date getCurrentYearMax() {
		return getCalendar(getCurrentYear(), 11, getCurrentDayOfMonthMax()).getTime();
	}


	public static Date getCurrentMonthMin() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), 1).getTime();
	}


	public static Date getCurrentMonthMax() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), getCurrentDayOfMonthMax()).getTime();
	}


	public static Date getCurrentWeekMin() {
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -getDaysSinceMonday(calendar)+1);
		return calendar.getTime();
	}


	public static Date getCurrentWeekMax() {
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
		return getTime(calendar);
	}


	/** Time formatted with DEFAULT PATTERN */
	public static Time getTime(String time) {
		return getTimeParsed(time, DEFAULT_TIME_PATTERN);
	}


	public static Time getTime(Date date) {
		return new Time(date.getTime());
	}


	public static Time getTime(Calendar calendar) {
		return new Time(calendar.getTime().getTime());
	}


	public static Time getTimeWithoutSeconds(Time time) {
		Calendar calendar=getCalendar(time);
		//MINUTE precision ONLY
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.SECOND, 0);
		return getTime(calendar);
	}


	public static Time getTimeWithoutSeconds() {
		return getTimeWithoutSeconds(getCurrentTime());
	}





	/*
	 * Timestamp
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(getCurrentDate().getTime());
	}


	public static Timestamp getTimestamp(String data, String pattern) {
		try{
			return new Timestamp(getDateParsed(data, pattern).getTime());
		}catch(Exception e){}
		return null;
	}


	public static void main(String[] argvs) {

		System.out.println("getCalendar: "+getCalendar());

		System.out.println("getCalendarWithoutTime: "+getCalendarWithoutTime());

		System.out.println("getCalendarWithoutTimezone: "+getCalendarWithoutTimezone());

		System.out.println("getDateWithMonth (12): "+getDateWithMonth(getCurrentDate(), Calendar.DECEMBER));

		System.out.println("getDateWithDay (25): "+getDateWithDay(getCurrentDate(), 25));

		System.out.println("getDaysBetween (30): "+getDaysBetween(
				new GregorianCalendar(2014,01,01),
				new GregorianCalendar(2014,01,31)));

		System.out.println("getDaysBetween (31): "+getDaysBetween(
				new GregorianCalendar(2014,01,01),
				new GregorianCalendar(2014,02,01)));

		System.out.println(
				TimeUnit.MILLISECONDS.toDays(
				new GregorianCalendar(2014,02,01).getTimeInMillis()-
				new GregorianCalendar(2014,01,01).getTimeInMillis()));

	}


}