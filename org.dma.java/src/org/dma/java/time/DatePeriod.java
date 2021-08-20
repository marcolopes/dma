/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.time;

import java.util.Calendar;
import java.util.Date;

import org.dma.java.util.TimeDateUtils;


public class DatePeriod {

	private final Date startDate;
	private final Date endDate;

	/** 01-01-1999, TODAY */
	public DatePeriod() {
		this(TimeDateUtils.getCalendar(1999), TimeDateUtils.getCalendar());
	}

	public DatePeriod(Calendar startDate, Calendar endDate) {
		this(startDate.getTime(), endDate.getTime());
	}

	public DatePeriod(Date startDate, Date endDate) {
		this.startDate=startDate;
		this.endDate=endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getStartDate(String pattern) {
		return TimeDateUtils.getDateFormatted(startDate, pattern);
	}

	public String getEndDate(String pattern) {
		return TimeDateUtils.getDateFormatted(endDate, pattern);
	}

	public Date[] toArray() {
		return new Date[]{getStartDate(), getEndDate()};
	}

	public String[] toArray(String pattern) {
		return new String[]{getStartDate(pattern), getEndDate(pattern)};
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() +
				" [startDate=" + startDate +
				", endDate=" + endDate + "]";
	}

}
