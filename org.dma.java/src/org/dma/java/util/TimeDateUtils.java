/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
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
import java.util.TimeZone;
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
	 * Validation
	 */
	public static boolean isDateValid(String date, String pattern) {
		return getDate(date, pattern)!=null;
	}


	public static boolean isDateValid(String date) {
		return isDateValid(date, DEFAULT_DATE_PATTERN);
	}


	public static boolean isTimeValid(String time, String pattern) {
		return getTime(time, pattern)!=null;
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
	/** Simple Date Format CACHE */
	private static final Map<String, SimpleDateFormat> SDF_CACHE=new HashMap();

	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		SimpleDateFormat sdf=SDF_CACHE.get(pattern);
		if (sdf==null) SDF_CACHE.put(pattern, sdf=new SimpleDateFormat(pattern));
		return sdf;
	}

	public static String getDateFormatted(Date date, String pattern) {
		try{
			return getSimpleDateFormat(pattern).format(date);

		}catch(Exception e){}
		return null;
	}


	public static String getDateFormatted(String pattern) {
		return getDateFormatted(getCurrentDate(), pattern);
	}


	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static String getDateFormatted(Date date) {
		return getDateFormatted(date, DEFAULT_DATE_PATTERN);
	}


	public static String getTimeFormatted(Time time, String pattern) {
		try{
			return getSimpleDateFormat(pattern).format(time);

		}catch(Exception e){}
		return null;
	}


	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static String getTimeFormatted(Time time) {
		return getTimeFormatted(time, DEFAULT_TIME_PATTERN);
	}


	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static String getTimeFormatted(Date time) {
		return getTimeFormatted(getTime(time));
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
		GregorianCalendar clone=new GregorianCalendar(calendar.getTimeZone());
		clone.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH),
				calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE),
				calendar.get(Calendar.SECOND));
		return clone;
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


	/** @see GregorianCalendar#GregorianCalendar(int, int, int) */
	public static Calendar getCalendar(int year, int month, int day) {
		return new GregorianCalendar(year, month, day);
	}


	public static Calendar getCalendar(String date, String pattern) {
		Calendar calendar=getCalendar();
		try{
			calendar.setTime(getDate(date, pattern));
		}catch(Exception e){}
		return calendar;
	}


	public static Calendar getCalendar(String date) {
		return getCalendar(date, DEFAULT_DATE_PATTERN);
	}


	public static Calendar getCalendar(Date date) {
		Calendar calendar=getCalendar();
		calendar.setTime(date);
		return calendar;
	}


	public static Calendar getCalendar(Time time) {
		Calendar calendar=getCalendar();
		calendar.setTime(time);
		return calendar;
	}


	public static Calendar getCalendarWithTime(Calendar calendar, Time time) {
		Calendar clone=(Calendar)calendar.clone();
		Calendar calendar2=getCalendar(time);
		clone.set(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		clone.set(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		clone.set(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return clone;
	}


	public static Calendar getCalendarWithDay(Calendar calendar, int day) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.DAY_OF_MONTH, day);
		return clone;
	}


	public static Calendar getCalendarWithDayOfMonthMax(Calendar calendar) {
		return getCalendarWithDay(calendar, getDayOfMonthMax(calendar));
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


	public static Calendar getCalendarWithoutTime(Calendar calendar) {
		Calendar clone=(Calendar)calendar.clone();
		clone.set(Calendar.HOUR_OF_DAY, 0);
		clone.set(Calendar.MINUTE, 0);
		clone.set(Calendar.SECOND, 0);
		clone.set(Calendar.MILLISECOND, 0);
		return clone;
	}


	public static Calendar getCalendarWithoutTime(Date date) {
		return getCalendarWithoutTime(getCalendar(date));
	}


	public static Calendar getCalendarWithoutTime() {
		return getCalendarWithoutTime(getCalendar());
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


	public static Calendar addTime(Calendar calendar, Time time) {
		Calendar clone=(Calendar)calendar.clone();
		Calendar calendar2=getCalendar(time);
		clone.add(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		clone.add(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		clone.add(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return clone;
	}


	public static Calendar addYears(Calendar calendar, int years) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.YEAR, years);
		return clone;
	}


	public static Calendar addMonths(Calendar calendar, int months) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.MONTH, months);
		return clone;
	}


	public static Calendar addDays(Calendar calendar, int days) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.DAY_OF_MONTH, days);
		return clone;
	}


	public static Calendar addHours(Calendar calendar, int hours) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.HOUR, hours);
		return clone;
	}


	public static Calendar addMinutes(Calendar calendar, int minutes) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.MINUTE, minutes);
		return clone;
	}


	public static Calendar addSeconds(Calendar calendar, int seconds) {
		Calendar clone=(Calendar)calendar.clone();
		clone.add(Calendar.SECOND, seconds);
		return clone;
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


	public static int getDaysSinceMonday(Calendar calendar) {
		int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek==Calendar.SUNDAY ? 7 : dayOfWeek-1;
	}


	public static long getDaysBetween(Calendar startDate, Calendar endDate) {
		Calendar clone1=(Calendar)startDate.clone();
		clone1.set(Calendar.HOUR_OF_DAY, 0); // Crucial
		clone1.set(Calendar.MINUTE, 0);
		clone1.set(Calendar.SECOND, 0);
		clone1.set(Calendar.MILLISECOND, 0);
		Calendar clone2=(Calendar)endDate.clone();
		clone2.set(Calendar.HOUR_OF_DAY, 0); // Crucial
		clone2.set(Calendar.MINUTE, 0);
		clone2.set(Calendar.SECOND, 0);
		clone2.set(Calendar.MILLISECOND, 0);
		return TimeUnit.MILLISECONDS.toDays(clone2.getTimeInMillis()-clone1.getTimeInMillis());
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
		return getYear(getCalendar());
	}


	public static int getCurrentMonth() {
		return getMonth(getCalendar());
	}


	public static int getCurrentDayOfMonth() {
		return getDayOfMonth(getCalendar());
	}


	public static int getCurrentDayOfMonthMax() {
		return getDayOfMonthMax(getCalendar());
	}


	public static int getCurrentHour() {
		return getHour(getCalendar());
	}


	public static int getCurrentMinute() {
		return getMinute(getCalendar());
	}


	public static int getCurrentSecond() {
		return getSecond(getCalendar());
	}




	/*
	 * Date
	 */
	public static Date getCurrentDate() {
		return new Date();
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
		Calendar calendar=getCalendar();
		calendar.add(Calendar.DAY_OF_YEAR, -getDaysSinceMonday(calendar)+1);
		return calendar.getTime();
	}


	public static Date getCurrentWeekMax() {
		Calendar calendar=getCalendar();
		calendar.add(Calendar.DAY_OF_YEAR, 7-getDaysSinceMonday(calendar));
		return calendar.getTime();
	}


	public static Date getDate(String date, String pattern) {
		try{
			return getSimpleDateFormat(pattern).parse(date);

		}catch(ParseException e){
			System.err.println(e);
		}catch(Exception e){}
		return null;
	}


	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static Date getDate(String date) {
		return getDate(date, DEFAULT_DATE_PATTERN);
	}


	public static Date getDate(Calendar calendar) {
		return calendar.getTime();
	}


	public static Date getDate(Time time) {
		return new Date(time.getTime());
	}


	public static Date getDateWithTime(Date date, Time time) {
		return getCalendarWithTime(getCalendar(date), time).getTime();
	}


	public static Date getDateWithDay(Date date, int day) {
		return getCalendarWithDay(getCalendar(date), day).getTime();
	}


	public static Date getDateWithMonth(Date date, int month) {
		return getCalendarWithMonth(getCalendar(date), month).getTime();
	}


	public static Date getDateWithYear(Date date, int year) {
		return getCalendarWithYear(getCalendar(date), year).getTime();
	}


	public static Date getDateWithoutTime(Date date) {
		return getCalendarWithoutTime(getCalendar(date)).getTime();
	}


	public static Date getDateWithoutTime() {
		return getCalendarWithoutTime().getTime();
	}


	public static Date addTime(Date date, Time time) {
		//return new Date(date.getTime()+time.getTime()-Time.valueOf("00:00:00").getTime());
		return addTime(getCalendar(date), time).getTime();
	}


	public static Date addYears(Date date, int years) {
		return addYears(getCalendar(date), years).getTime();
	}


	public static Date addMonths(Date date, int months) {
		return addMonths(getCalendar(date), months).getTime();
	}


	public static Date addDays(Date date, int days) {
		return addDays(getCalendar(date), days).getTime();
	}


	public static Date addHours(Date date, int hours) {
		return addHours(getCalendar(date), hours).getTime();
	}


	public static Date addMinutes(Date date, int minutes) {
		return addMinutes(getCalendar(date), minutes).getTime();
	}


	public static Date addSeconds(Date date, int seconds) {
		return addSeconds(getCalendar(date), seconds).getTime();
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


	public static long getDaysBetween(Date startDate, Date endDate) {
		return getDaysBetween(getCalendar(startDate), getCalendar(endDate));
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


	public static Time getTime(String time, String pattern) {
		try{
			return new Time(getSimpleDateFormat(pattern).parse(time).getTime());

		}catch(ParseException e){
			System.err.println(e);
		}catch(Exception e){}
		return null;
	}


	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static Time getTime(String time) {
		return getTime(time, DEFAULT_TIME_PATTERN);
	}


	public static Time getTime(int hour, int minute, int second) {
		Calendar calendar=getCalendar();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return getTime(calendar);
	}


	public static Time getTime(int hour, int minute) {
		return getTime(hour, minute, 0);
	}


	public static Time getTime(Date date) {
		return new Time(date.getTime());
	}


	public static Time getTime(Calendar calendar) {
		return new Time(calendar.getTimeInMillis());
	}


	public static Time getTimeWithoutSeconds(Time time) {
		Calendar calendar=getCalendar(time);
		//MINUTE precision ONLY
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return getTime(calendar);
	}


	public static Time getTimeWithoutSeconds(Date date) {
		return getTimeWithoutSeconds(getTime(date));
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
			return new Timestamp(getDate(data, pattern).getTime());
		}catch(Exception e){}
		return null;
	}


	public static void main(String[] argvs) {


		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("SimpleDateFormat: "+sdf.format(new Date()));

		Calendar calendar=getCalendar();
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println("getCalendar: "+calendar);

		System.out.println("getGregorianCalendar: "+getGregorianCalendar(calendar));

		System.out.println("getCalendarWithoutTime: "+getCalendarWithoutTime());

		System.out.println("getCalendarWithoutTimezone: "+getCalendarWithoutTimezone());

		System.out.println("getDateWithMonth (12): "+getDateWithMonth(getCurrentDate(), Calendar.DECEMBER));

		System.out.println("getDateWithDay (25): "+getDateWithDay(getCurrentDate(), 25));

		System.out.println("getDaysBetween (30): "+getDaysBetween(
				getCalendar(2014,0,1),
				getCalendar(2014,0,31)));

		System.out.println("getDaysBetween (31): "+getDaysBetween(
				getCalendar(2014,0,1),
				getCalendar(2014,1,1)));

	}


}