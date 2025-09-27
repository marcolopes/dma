/*******************************************************************************
 * Copyright 2008-2025 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.time;

import java.util.Calendar;
import java.util.Date;

import org.dma.java.util.TimeDateUtils;

public class CalendarPeriod {

	protected final Calendar startDate;
	protected final Calendar endDate;

	public Calendar getStartDate() {return startDate;}
	public Calendar getEndDate() {return endDate;}

	/** 1999-01-01 */
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

	public String getStartDate(String pattern) {
		return TimeDateUtils.getDateFormatted(startDate, pattern);
	}

	public String getEndDate(String pattern) {
		return TimeDateUtils.getDateFormatted(endDate, pattern);
	}

	public String[] toArray(String pattern) {
		return new String[]{getStartDate(pattern), getEndDate(pattern)};
	}

	public Calendar[] toArray() {
		return new Calendar[]{startDate, endDate};
	}

	public DatePeriod toDatePeriod() {
		return new DatePeriod(startDate, endDate);
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
