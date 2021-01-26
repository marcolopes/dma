/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.time;

import java.util.Calendar;
import java.util.Date;

import org.dma.java.util.TimeDateUtils;


public class CalendarPeriod {

	private final Calendar startDate;
	private final Calendar endDate;

	/** 01-01-1999, TODAY */
	public CalendarPeriod() {
		this(TimeDateUtils.getCalendar(1999), TimeDateUtils.getCalendar());
	}

	public CalendarPeriod(Date startDate, Date endDate) {
		this(TimeDateUtils.getCalendar(startDate), TimeDateUtils.getCalendar(endDate));
	}

	public CalendarPeriod(Calendar startDate, Calendar endDate) {
		this.startDate=startDate;
		this.endDate=endDate;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public String getStartDate(String pattern) {
		return TimeDateUtils.getDateFormatted(startDate, pattern);
	}

	public String getEndDate(String pattern) {
		return TimeDateUtils.getDateFormatted(endDate, pattern);
	}

	public Calendar[] toArray() {
		return new Calendar[]{getStartDate(), getEndDate()};
	}

	public String[] toArray(String pattern) {
		return new String[]{getStartDate(pattern), getEndDate(pattern)};
	}

}
