/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
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
	/** yyyy */
	public static final String DATE_YEAR_PATTERN = String.valueOf(new char[]{JAVA_YEAR, JAVA_YEAR, JAVA_YEAR,JAVA_YEAR});
	/** MM */
	public static final String DATE_MONTH_PATTERN = String.valueOf(new char[]{JAVA_MONTH, JAVA_MONTH});
	/** dd */
	public static final String DATE_DAY_PATTERN = String.valueOf(new char[]{JAVA_DAY_OF_MONTH, JAVA_DAY_OF_MONTH});
	/** (-) Dash */
	public static final char DEFAULT_DATE_SEPARATOR = '-';
	/** dd-MM-yyyy */
	public static final String DEFAULT_DATE_PATTERN = DATE_DAY_PATTERN + DEFAULT_DATE_SEPARATOR + DATE_MONTH_PATTERN + DEFAULT_DATE_SEPARATOR + DATE_YEAR_PATTERN;

	/*
	 * Time
	 */
	public static final long MILLISECOND_PER_DAY = 60 * 60 * 24 * 1000;
	/** HH */
	public static final String TIME_HOUR_PATTERN = String.valueOf(new char[]{JAVA_HOUR_IN_DAY24, JAVA_HOUR_IN_DAY24});
	/** mm */
	public static final String TIME_MINUTE_PATTERN = String.valueOf(new char[]{JAVA_MINUTE, JAVA_MINUTE});
	/** ss */
	public static final String TIME_SECOND_PATTERN = String.valueOf(new char[]{JAVA_SECOND, JAVA_SECOND});
	/** SSS */
	public static final String TIME_MILISECOND_PATTERN = String.valueOf(new char[]{JAVA_MILLISECOND, JAVA_MILLISECOND, JAVA_MILLISECOND});
	/** (:) Colon */
	public static final char DEFAULT_TIME_SEPARATOR = ':';
	/** HH:mm */
	public static final String DEFAULT_TIME_PATTERN = TIME_HOUR_PATTERN + DEFAULT_TIME_SEPARATOR + TIME_MINUTE_PATTERN;
	/** yyyy-MM-dd;HH:mm:ss:SSS */
	public static final String DEFAULT_TIMESTAMP_PATTERN = DATE_YEAR_PATTERN + DEFAULT_DATE_SEPARATOR + DATE_MONTH_PATTERN + DEFAULT_DATE_SEPARATOR + DATE_DAY_PATTERN+";"+
			TIME_HOUR_PATTERN + DEFAULT_TIME_SEPARATOR + TIME_MINUTE_PATTERN + DEFAULT_TIME_SEPARATOR + TIME_SECOND_PATTERN + DEFAULT_TIME_SEPARATOR + TIME_MILISECOND_PATTERN;

	/*
	 * Format
	 */
	/** Simple Date Format CACHE */
	private static final Map<String, SimpleDateFormat> SDF_CACHE = new ConcurrentHashMap();

	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		SimpleDateFormat sdf=SDF_CACHE.get(pattern);
		if (sdf==null) SDF_CACHE.put(pattern, sdf=new SimpleDateFormat(pattern));
		return sdf;
	}



	/*
	 * Gregorian Calendar
	 */
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

	public static XMLGregorianCalendar getXMLGregorianCalendar() {
		return getXMLGregorianCalendar(getCalendar());
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) {
		return getXMLGregorianCalendar(getCalendar(date));
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(Calendar calendar) {
		return getXMLGregorianCalendar(getGregorianCalendar(calendar));
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(GregorianCalendar calendar) {
		try{return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		}catch(DatatypeConfigurationException e){}
		return null;
	}

	public static XMLGregorianCalendar getXMLGregorianCalendar(String date) {
		try{return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
		}catch(DatatypeConfigurationException e){
		}catch(IllegalArgumentException e){}
		return null;
	}



	/*
	 * Calendar
	 */
	public static int getCurrentYear() {
		return getYear(getCalendar());
	}

	public static int getCurrentMonth() {
		return getMonth(getCalendar());
	}

	public static int getCurrentDayOfMonth() {
		return getDayOfMonth(getCalendar());
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

	public static GregorianCalendar getCalendar() {
		return new GregorianCalendar();
	}

	public static Calendar getClone(Calendar calendar) {
		return (Calendar)calendar.clone();
	}

	/** FIRST day of YEAR */
	public static GregorianCalendar getCalendar(int year) {
		return getCalendar(year, 0);
	}

	/** FIRST day of MONTH */
	public static GregorianCalendar getCalendar(int year, int month) {
		return getCalendar(year, month, 1);
	}

	/** @see GregorianCalendar#GregorianCalendar(int, int, int) */
	public static GregorianCalendar getCalendar(int year, int month, int day) {
		return new GregorianCalendar(year, month, day);
	}

	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static GregorianCalendar getCalendar(String date) {
		return getCalendar(date, DEFAULT_DATE_PATTERN);
	}

	public static GregorianCalendar getCalendar(String date, String pattern) {
		GregorianCalendar calendar=getCalendar();
		try{calendar.setTime(getDate(date, pattern));
		}catch(Exception e){}
		return calendar;
	}

	public static GregorianCalendar getCalendar(Date date) {
		GregorianCalendar calendar=getCalendar();
		calendar.setTime(date);
		return calendar;
	}

	public static GregorianCalendar getCalendar(Time time) {
		GregorianCalendar calendar=getCalendar();
		calendar.setTime(time);
		return calendar;
	}

	public static Calendar getCalendarYearMin(Calendar calendar) {
		return getCalendarDayMin(getCalendarMonthMin(calendar));
	}

	public static Calendar getCalendarYearMax(Calendar calendar) {
		return getCalendarDayMax(getCalendarMonthMax(calendar));
	}

	public static Calendar getCalendarMonthMin(Calendar calendar) {
		return getCalendarWithMonth(calendar, getMonthMin(calendar));
	}

	public static Calendar getCalendarMonthMax(Calendar calendar) {
		return getCalendarWithMonth(calendar, getMonthMax(calendar));
	}

	public static Calendar getCalendarDayMin(Calendar calendar) {
		return getCalendarWithDay(calendar, getDayOfMonthMin(calendar));
	}

	public static Calendar getCalendarDayMax(Calendar calendar) {
		return getCalendarWithDay(calendar, getDayOfMonthMax(calendar));
	}

	public static Calendar getCalendarWeekMin(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.DAY_OF_YEAR, -getDaysSinceMonday(calendar)+1);
		return clone;
	}

	public static Calendar getCalendarWeekMax(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.DAY_OF_YEAR, 7-getDaysSinceMonday(calendar));
		return clone;
	}

	public static Calendar getCalendarWithTime(Calendar calendar, Time time) {
		Calendar clone=getClone(calendar);
		Calendar calendar2=getCalendar(time);
		clone.set(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		clone.set(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		clone.set(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return clone;
	}

	public static Calendar getCalendarWithYear(Calendar calendar, int year) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.YEAR, year);
		return clone;
	}

	public static Calendar getCalendarWithMonth(Calendar calendar, int month) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.MONTH, month);
		return clone;
	}

	public static Calendar getCalendarWithDay(Calendar calendar, int day) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.DAY_OF_MONTH, day);
		return clone;
	}

	/** HOUR precision ONLY */
	public static Calendar getCalendarWithoutMinutes(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.MINUTE, 0);
		clone.set(Calendar.SECOND, 0);
		clone.set(Calendar.MILLISECOND, 0);
		return clone;
	}

	/** MINUTE precision ONLY */
	public static Calendar getCalendarWithoutSeconds(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.SECOND, 0);
		clone.set(Calendar.MILLISECOND, 0);
		return clone;
	}

	/** SECOND precision ONLY */
	public static Calendar getCalendarWithoutMilliseconds(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.MILLISECOND, 0);
		return clone;
	}

	public static Calendar getCalendarWithoutTime() {
		return getCalendarWithoutTime(getCalendar());
	}

	public static Calendar getCalendarWithoutTime(Date date) {
		return getCalendarWithoutTime(getCalendar(date));
	}

	public static Calendar getCalendarWithoutTime(Calendar calendar) {
		Calendar clone=getClone(calendar);
		clone.set(Calendar.HOUR_OF_DAY, 0);
		clone.set(Calendar.MINUTE, 0);
		clone.set(Calendar.SECOND, 0);
		clone.set(Calendar.MILLISECOND, 0);
		return clone;
	}

	public static Calendar getCalendarWithoutTimezone() {
		return getCalendarWithoutTimezone(getCalendar());
	}

	public static Calendar getCalendarWithoutTimezone(Date date) {
		return getCalendarWithoutTimezone(getCalendar(date));
	}

	public static Calendar getCalendarWithoutTimezone(Calendar calendar) {
		Calendar clone=getClone(calendar);
		// clear all fields, including ZONE_OFFSET
		clone.clear(); clone.set(
			calendar.get(Calendar.YEAR),
			calendar.get(Calendar.MONTH),
			calendar.get(Calendar.DAY_OF_MONTH),
			calendar.get(Calendar.HOUR_OF_DAY),
			calendar.get(Calendar.MINUTE),
			calendar.get(Calendar.SECOND));
		return clone;
	}

	public static Calendar addDate(Calendar calendar, Date date) {
		Calendar clone=getClone(calendar);
		Calendar calendar2=getCalendar(date);
		clone.add(Calendar.YEAR, calendar2.get(Calendar.YEAR));
		clone.add(Calendar.MONTH, calendar2.get(Calendar.MONTH));
		clone.add(Calendar.DAY_OF_MONTH, calendar2.get(Calendar.DAY_OF_MONTH));
		return clone;
	}

	public static Calendar addDate(Calendar calendar, int years, int months, int days) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.YEAR, years);
		clone.add(Calendar.MONTH, months);
		clone.add(Calendar.DAY_OF_MONTH, days);
		return clone;
	}

	public static Calendar addTime(Calendar calendar, Time time) {
		Calendar clone=getClone(calendar);
		Calendar calendar2=getCalendar(time);
		clone.add(Calendar.HOUR_OF_DAY, calendar2.get(Calendar.HOUR_OF_DAY));
		clone.add(Calendar.MINUTE, calendar2.get(Calendar.MINUTE));
		clone.add(Calendar.SECOND, calendar2.get(Calendar.SECOND));
		return clone;
	}

	public static Calendar addTime(Calendar calendar, int hours, int minutes, int seconds) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.HOUR, hours);
		clone.add(Calendar.MINUTE, minutes);
		clone.add(Calendar.SECOND, seconds);
		return clone;
	}

	public static Calendar addYears(Calendar calendar, int years) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.YEAR, years);
		return clone;
	}

	public static Calendar addMonths(Calendar calendar, int months) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.MONTH, months);
		return clone;
	}

	public static Calendar addDays(Calendar calendar, int days) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.DAY_OF_MONTH, days);
		return clone;
	}

	public static Calendar addHours(Calendar calendar, int hours) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.HOUR, hours);
		return clone;
	}

	public static Calendar addMinutes(Calendar calendar, int minutes) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.MINUTE, minutes);
		return clone;
	}

	public static Calendar addSeconds(Calendar calendar, int seconds) {
		Calendar clone=getClone(calendar);
		clone.add(Calendar.SECOND, seconds);
		return clone;
	}

	public static int getYear(Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}

	public static int getYearMax(Calendar calendar) {
		return calendar.getActualMaximum(Calendar.YEAR);
	}

	public static int getYearMin(Calendar calendar) {
		return calendar.getActualMinimum(Calendar.YEAR);
	}

	public static int getMonth(Calendar calendar) {
		return calendar.get(Calendar.MONTH);
	}

	public static int getMonthMax(Calendar calendar) {
		return calendar.getActualMaximum(Calendar.MONTH);
	}

	public static int getMonthMin(Calendar calendar) {
		return calendar.getActualMinimum(Calendar.MONTH);
	}

	public static int getDayOfMonth(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	public static int getDayOfMonthMax(Calendar calendar) {
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static int getDayOfMonthMin(Calendar calendar) {
		return calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
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

	public static int getDaysSinceMonday(Calendar calendar) {
		int dayOfWeek=calendar.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek==Calendar.SUNDAY ? 7 : dayOfWeek-1;
	}

	public static long getDaysBetween(Calendar startDate, Calendar endDate) {
		Calendar[] clone=new Calendar[]{getClone(startDate), getClone(endDate)};
		for(Calendar calendar: clone){
			calendar.set(Calendar.HOUR_OF_DAY, 0); // Crucial
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
		}return TimeUnit.MILLISECONDS.toDays(clone[1].getTimeInMillis()-clone[0].getTimeInMillis());
	}

	public static boolean isTodayAfter(Calendar calendar) {
		return isTodayAfter(calendar, 0);
	}

	public static boolean isTodayAfter(Calendar calendar, int daysToAdd) {
		Calendar when=getClone(calendar);
		when.add(Calendar.DAY_OF_MONTH, daysToAdd);
		return getCalendarWithoutTime().after(when);
	}



	/*
	 * Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}

	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static String getDateFormatted() {
		return getDateFormatted(getCurrentDate());
	}

	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static String getDateFormatted(Date date) {
		return getDateFormatted(date, DEFAULT_DATE_PATTERN);
	}

	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static String getDateFormatted(Calendar calendar) {
		return getDateFormatted(calendar, DEFAULT_DATE_PATTERN);
	}

	public static String getDateFormatted(Calendar calendar, String pattern) {
		return getDateFormatted(getDate(calendar), pattern);
	}

	public static String getDateFormatted(String pattern) {
		return getDateFormatted(getCurrentDate(), pattern);
	}

	public static String getDateFormatted(Date date, String pattern) {
		try{return getSimpleDateFormat(pattern).format(date);
		}catch(Exception e){}
		return null;
	}

	/** Date formatted with {@link #DEFAULT_DATE_PATTERN} */
	public static Date getDate(String date) {
		return getDate(date, DEFAULT_DATE_PATTERN);
	}

	public static Date getDate(String date, String pattern) {
		try{return getSimpleDateFormat(pattern).parse(date);
		}catch(Exception e){
		}return null;
	}

	public static boolean isDateValid(String date) {
		return isDateValid(date, DEFAULT_DATE_PATTERN);
	}

	public static boolean isDateValid(String date, String pattern) {
		return getDate(date, pattern)!=null;
	}

	public static Date getDate(Time time) {
		return getDate(time.getTime());
	}

	/** @see Date#Date(long) */
	public static Date getDate(long date) {
		return new Date(date);
	}

	public static Date getDate(Calendar calendar) {
		return calendar.getTime();
	}

	public static Date getCurrentYearMin() {
		return getCalendarYearMin(getCalendar()).getTime();
	}

	public static Date getCurrentYearMax() {
		return getCalendarYearMax(getCalendar()).getTime();
	}

	public static Date getCurrentMonthMin() {
		return getCalendarDayMin(getCalendar()).getTime();
	}

	public static Date getCurrentMonthMax() {
		return getCalendarDayMax(getCalendar()).getTime();
	}

	public static Date getCurrentWeekMin() {
		return getCalendarWeekMin(getCalendar()).getTime();
	}

	public static Date getCurrentWeekMax() {
		return getCalendarWeekMax(getCalendar()).getTime();
	}

	@Deprecated
	static Date getDateWeekMin(Date date) {
		return getCalendarWeekMin(getCalendar(date)).getTime();
	}

	@Deprecated
	static Date getDateWeekMax(Date date) {
		return getCalendarWeekMax(getCalendar(date)).getTime();
	}

	public static Date getDateWithTime(Date date, Time time) {
		return getCalendarWithTime(getCalendar(date), time).getTime();
	}

	public static Date getDateWithYear(Date date, int year) {
		return getCalendarWithYear(getCalendar(date), year).getTime();
	}

	public static Date getDateWithMonth(Date date, int month) {
		return getCalendarWithMonth(getCalendar(date), month).getTime();
	}

	public static Date getDateWithDay(Date date, int day) {
		return getCalendarWithDay(getCalendar(date), day).getTime();
	}

	public static Date getDateWithoutMinutes(Date date) {
		return getCalendarWithoutMinutes(getCalendar(date)).getTime();
	}

	public static Date getDateWithoutSeconds(Date date) {
		return getCalendarWithoutSeconds(getCalendar(date)).getTime();
	}

	public static Date getDateWithoutMilliseconds(Date date) {
		return getCalendarWithoutMilliseconds(getCalendar(date)).getTime();
	}

	public static Date getDateWithoutTime() {
		return getCalendarWithoutTime().getTime();
	}

	public static Date getDateWithoutTime(Date date) {
		return getCalendarWithoutTime(getCalendar(date)).getTime();
	}

	public static Date addDate(Date date, Date toAdd) {
		return addDate(getCalendar(date), toAdd).getTime();
	}

	public static Date addTime(Date date, Time time) {
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

	public static int getDayOfMonthMax(Date date) {
		return getDayOfMonthMax(getCalendar(date));
	}

	public static int getHour(Date date) {
		return getHour(getCalendar(date));
	}

	public static int getMinute(Date date) {
		return getMinute(getCalendar(date));
	}

	public static int getSecond(Date date) {
		return getSecond(getCalendar(date));
	}

	public static int getDaysSinceMonday(Date date) {
		return getDaysSinceMonday(getCalendar(date));
	}

	public static long getDaysBetween(Date startDate, Date endDate) {
		return getDaysBetween(getCalendar(startDate), getCalendar(endDate));
	}

	public static boolean isTodayAfter(Date date) {
		return isTodayAfter(date, 0);
	}

	public static boolean isTodayAfter(Date date, int daysToAdd) {
		return isTodayAfter(getCalendar(date), daysToAdd);
	}



	/*
	 * Time
	 */
	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static String getTimeFormatted() {
		return getTimeFormatted(getCurrentTime());
	}

	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static String getTimeFormatted(Date time) {
		return getTimeFormatted(getTime(time));
	}

	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static String getTimeFormatted(Time time) {
		return getTimeFormatted(time, DEFAULT_TIME_PATTERN);
	}

	public static String getTimeFormatted(String pattern) {
		return getTimeFormatted(getCurrentTime(), pattern);
	}

	public static String getTimeFormatted(Time time, String pattern) {
		try{return getSimpleDateFormat(pattern).format(time);
		}catch(Exception e){}
		return null;
	}

	/** Time formatted with {@link #DEFAULT_TIME_PATTERN} */
	public static Time getTime(String time) {
		return getTime(time, DEFAULT_TIME_PATTERN);
	}

	public static Time getTime(String time, String pattern) {
		try{return new Time(getDate(time, pattern).getTime());
		}catch(Exception e){}
		return null;
	}

	public static boolean isTimeValid(String time) {
		return isTimeValid(time, DEFAULT_TIME_PATTERN);
	}

	public static boolean isTimeValid(String time, String pattern) {
		return getTime(time, pattern)!=null;
	}

	/** SECOND precision ONLY */
	public static Time getCurrentTime() {
		GregorianCalendar calendar=getCalendar();
		calendar.set(Calendar.MILLISECOND, 0);
		return getTime(calendar);
	}

	public static Time getTime(int hour, int minute) {
		return getTime(hour, minute, 0);
	}

	public static Time getTime(int hour, int minute, int second) {
		GregorianCalendar calendar=getCalendar();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return getTime(calendar);
	}

	public static Time getTime(Date date) {
		return new Time(date.getTime());
	}

	public static Time getTime(Calendar calendar) {
		return new Time(calendar.getTimeInMillis());
	}

	public static Time getTimeWithoutSeconds() {
		return getTimeWithoutSeconds(getCurrentTime());
	}

	public static Time getTimeWithoutSeconds(Date date) {
		return getTimeWithoutSeconds(getTime(date));
	}

	/** MINUTE precision ONLY */
	public static Time getTimeWithoutSeconds(Time time) {
		GregorianCalendar calendar=getCalendar(time);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return getTime(calendar);
	}



	/*
	 * Timestamp
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(getCurrentDate().getTime());
	}

	/** Timestamp formatted with {@link #DEFAULT_TIMESTAMP_PATTERN} */
	public static String getTimestampFormatted() {
		return getTimestampFormatted(getCurrentTimestamp());
	}

	/** Timestamp formatted with {@link #DEFAULT_TIMESTAMP_PATTERN} */
	public static String getTimestampFormatted(Timestamp timestamp) {
		return getTimestampFormatted(timestamp, DEFAULT_TIMESTAMP_PATTERN);
	}

	public static String getTimestampFormatted(String pattern) {
		return getTimestampFormatted(getCurrentTimestamp(), pattern);
	}

	public static String getTimestampFormatted(Timestamp timestamp, String pattern) {
		try{return getSimpleDateFormat(pattern).format(timestamp);
		}catch(Exception e){}
		return null;
	}

	/** Timestamp formatted with {@link #DEFAULT_TIMESTAMP_PATTERN} */
	public static Timestamp getTimestamp(String time) {
		return getTimestamp(time, DEFAULT_TIMESTAMP_PATTERN);
	}

	public static Timestamp getTimestamp(String time, String pattern) {
		try{return new Timestamp(getDate(time, pattern).getTime());
		}catch(Exception e){}
		return null;
	}


	public static void main(String[] args) {

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("SimpleDateFormat: "+sdf.format(new Date()));

		GregorianCalendar calendar=getCalendar();
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println("getCalendar: "+calendar);
		System.out.println("getGregorianCalendar: "+getGregorianCalendar(calendar));
		System.out.println("getCalendarWithoutTime: "+getCalendarWithoutTime().getTime());
		System.out.println("getCalendarWithoutTimezone: "+getCalendarWithoutTimezone());
		System.out.println("getCalendarYearMin: "+getCalendarYearMin(calendar).getTime());
		System.out.println("getCalendarYearMax: "+getCalendarYearMax(calendar).getTime());
		System.out.println("getCalendarMonthMin: "+getCalendarMonthMin(calendar).getTime());
		System.out.println("getCalendarMonthMax: "+getCalendarMonthMax(calendar).getTime());
		System.out.println("getCalendarDayMin: "+getCalendarDayMin(calendar).getTime());
		System.out.println("getCalendarDayMax: "+getCalendarDayMax(calendar).getTime());
		System.out.println("getCalendarWeekMin: "+getCalendarWeekMin(calendar).getTime());
		System.out.println("getCalendarWeekMax: "+getCalendarWeekMax(calendar).getTime());
		System.out.println("getCalendarWithYear (1971): "+getCalendarWithYear(calendar, 1971));
		System.out.println("getCalendarWithMonth (9): "+getCalendarWithMonth(calendar, Calendar.SEPTEMBER));
		System.out.println("getCalendarWithDay (11): "+getCalendarWithDay(calendar, 11));
		System.out.println("getDaysBetween (30): "+getDaysBetween(getCalendar(2014,0,1), getCalendar(2014,0,31)));
		System.out.println("getDaysBetween (31): "+getDaysBetween(getCalendar(2014,0,1), getCalendar(2014,1,1)));

	}


}