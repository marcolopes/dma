/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.timedate;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

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
	public static final String DATE_YEAR_FORMAT = String.valueOf(new char[]{JAVA_YEAR,JAVA_YEAR,JAVA_YEAR,JAVA_YEAR});
	public static final String DATE_MONTH_FORMAT = String.valueOf(new char[]{JAVA_MONTH,JAVA_MONTH});
	public static final String DATE_DAY_FORMAT = String.valueOf(new char[]{JAVA_DAY_OF_MONTH,JAVA_DAY_OF_MONTH});

	public static final char DEFAULT_DATE_SEPARATOR = '-';
	public static final String DEFAULT_DATE_FORMAT = DATE_DAY_FORMAT+DEFAULT_DATE_SEPARATOR+DATE_MONTH_FORMAT+DEFAULT_DATE_SEPARATOR+DATE_YEAR_FORMAT;

	/*
	 * Time
	 */
	public static final String TIME_HOUR_FORMAT = String.valueOf(new char[]{JAVA_HOUR_IN_DAY24,JAVA_HOUR_IN_DAY24});
	public static final String TIME_MINUTE_FORMAT = String.valueOf(new char[]{JAVA_MINUTE,JAVA_MINUTE});
	public static final String TIME_SECOND_FORMAT = String.valueOf(new char[]{JAVA_SECOND,JAVA_SECOND});
	public static final String TIME_MILISECOND_FORMAT = String.valueOf(new char[]{JAVA_MILLISECOND,JAVA_MILLISECOND,JAVA_MILLISECOND});

	public static final char DEFAULT_TIME_SEPARATOR = ':';
	public static final String DEFAULT_TIME_FORMAT = TIME_HOUR_FORMAT+DEFAULT_TIME_SEPARATOR+TIME_MINUTE_FORMAT;

	/*
	 * Validation
	 */
	public static boolean isDateFormatValid(String date, String format) {
		return getDate(date, format)!=null;
	}


	public static boolean isDateFormatValid(String date) {
		return isDateFormatValid(date, DEFAULT_DATE_FORMAT);
	}


	public static boolean isTimeFormatValid(String time, String format) {
		return getTime(time, format)!=null;
	}


	public static boolean isTimeFormatValid(String time) {
		return isTimeFormatValid(time, DEFAULT_TIME_FORMAT);
	}





	/*
	 * Format
	 */
	public static String getDateFormatted(Date date, String format) {
		try{
			return new SimpleDateFormat(format).format(date);

		} catch (Exception e){}
		return null;
	}

	/**
	 * Date formatted with DEFAULT FORMAT
	 */
	public static String getDateFormatted(Date date) {
		return getDateFormatted(date, DEFAULT_DATE_FORMAT);
	}


	public static String getTimeFormatted(Time time, String format) {
		try{
			return new SimpleDateFormat(format).format(time);

		} catch (Exception e){}
		return null;
	}

	/**
	 * Time formatted with DEFAULT FORMAT
	 */
	public static String getTimeFormatted(Time time) {
		return getTimeFormatted(time, DEFAULT_TIME_FORMAT);
	}


	public static String getTimestampFormatted(Timestamp timestamp, String format) {
		try{
			return new SimpleDateFormat(format).format(timestamp);

		} catch (Exception e){}
		return null;
	}





	/*
	 * Conversion
	 */
	public static Date getDateParsed(String date, String format) {
		try{
			return new SimpleDateFormat(format).parse(date);

		} catch (ParseException e){}
		return null;
	}


	public static Date getDateParsed(String date) {
		return getDateParsed(date, DEFAULT_DATE_FORMAT);
	}


	public static Time getTimeParsed(String time, String format) {
		try{
			return new Time(new SimpleDateFormat(format).parse(time).getTime());

		} catch (ParseException e){}
		return null;
	}


	public static Time getTimeParsed(String time) {
		return getTimeParsed(time, DEFAULT_TIME_FORMAT);
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


	public static Calendar getCalendar(String date, String format){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(getDate(date, format));
		return calendar;
	}

	/**
	 * Calendar formatted with DEFAULT FORMAT
	 */
	public static Calendar getCalendar(String date) {
		return getCalendar(date, DEFAULT_DATE_FORMAT);
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


	public static Calendar getCalendarWithoutTimezone() {
		return getCalendarWithoutTimezone(getCalendar());
	}


	public static Calendar getCalendarWithoutTimezone(Calendar calendar) {
		Calendar clone=(Calendar)calendar.clone();
		calendar.clear(); // clear all fields, including Calendar.ZONE_OFFSET
		calendar.set(
			clone.get(Calendar.YEAR),
			clone.get(Calendar.MONTH),
			clone.get(Calendar.DAY_OF_MONTH),
			clone.get(Calendar.HOUR_OF_DAY),
			clone.get(Calendar.MINUTE),
			clone.get(Calendar.SECOND));
		return calendar;

	}


	public static Calendar getCalendarWithoutTimezone(Date date) {
		return getCalendarWithoutTimezone(getCalendar(date));
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
		return dayOfWeek==Calendar.SUNDAY ? Calendar.SATURDAY : dayOfWeek-1;
	}


	public static int getCurrentYear(){
		return getYear(Calendar.getInstance());
	}


	public static int getCurrentMonth(){
		return getMonth(Calendar.getInstance());
	}


	public static int getCurrentDayOfMonth(){
		return getDayOfMonth(Calendar.getInstance());
	}


	public static int getCurrentDayOfMonthMax() {
		return getDayOfMonthMax(Calendar.getInstance());
	}


	public static int getCurrentHour(){
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	}


	public static int getCurrentMinute(){
		return Calendar.getInstance().get(Calendar.MINUTE);
	}


	public static int getCurrentSecond(){
		return Calendar.getInstance().get(Calendar.SECOND);
	}





	/*
	 * Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}


	public static String getCurrentDate(String format) {
		return getDateFormatted(getCurrentDate(),format);
	}


	public static Date getDate(String date, String format) {
		date=date.replace(DATE_YEAR_FORMAT, String.valueOf(getCurrentYear()));
		date=date.replace(DATE_MONTH_FORMAT, String.valueOf(getCurrentMonth()));
		date=date.replace(DATE_DAY_FORMAT, String.valueOf(getCurrentDayOfMonth()));
		return getDateParsed(date, format);
	}


	/**
	 * Date formatted with DEFAULT FORMAT
	 */
	public static Date getDate(String date) {
		return getDate(date, DEFAULT_DATE_FORMAT);
	}


	public static Date getDate(Time time) {
		return new Date(time.getTime());
	}


	public static Date getDate(Calendar calendar) {
		return calendar.getTime();
	}


	public static Date getDateWithoutTime(Date date) {
		Calendar calendar=getCalendar(date);
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		calendar.set(Calendar.MILLISECOND,0);
		return calendar.getTime();
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


	public static Date addDays(Date date, int days) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.DATE,days);
		return calendar.getTime();
	}


	public static Date addHours(Date date, int hours) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.HOUR,hours);
		return getTime(calendar);
	}


	public static Date addMinutes(Date date, int minutes) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.MINUTE,minutes);
		return getTime(calendar);
	}


	public static Date addSeconds(Date date, int seconds) {
		Calendar calendar=getCalendar(date);
		calendar.add(Calendar.SECOND,seconds);
		return getTime(calendar);
	}


	public static int getYear(Date date) {
		return getYear(getCalendar(date));
	}


	public static int getMonth(Date date) {
		return getMonth(getCalendar(date));
	}


	public static Date getCurrentYear1() {
		return getCalendar(getCurrentYear(), 0, 1).getTime();
	}


	public static Date getCurrentYear2() {
		return getCalendar(getCurrentYear(), 11, getCurrentDayOfMonthMax()).getTime();
	}


	public static Date getCurrentMonth1() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), 1).getTime();
	}


	public static Date getCurrentMonth2() {
		return getCalendar(getCurrentYear(), getCurrentMonth(), getCurrentDayOfMonthMax()).getTime();
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
		time=time.replace(TIME_HOUR_FORMAT, String.valueOf(getCurrentHour()));
		time=time.replace(TIME_MINUTE_FORMAT, String.valueOf(getCurrentMinute()));
		time=time.replace(TIME_SECOND_FORMAT, String.valueOf(getCurrentSecond()));
		return getTimeParsed(time, format);
	}


	/**
	 * Time formatted with DEFAULT FORMAT
	 */
	public static Time getTime(String time) {
		return getTime(time, DEFAULT_TIME_FORMAT);
	}


	public static Time getTime(Date date) {
		return new Time(date.getTime());
	}


	public static Time getTime(Calendar calendar) {
		return new Time(calendar.getTime().getTime());
	}





	/*
	 * Timestamp
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(getCurrentDate().getTime());
	}


	public static Timestamp getTimestamp(String data, String format) {
		return new Timestamp(getDate(data, format).getTime());
	}


}