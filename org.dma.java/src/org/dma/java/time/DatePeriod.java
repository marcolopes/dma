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

public class DatePeriod {

	protected final Date startDate;
	protected final Date endDate;

	public Date getStartDate() {return startDate;}
	public Date getEndDate() {return endDate;}

	/** 1999-01-01 */
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

	public String getStartDate(String pattern) {
		return TimeDateUtils.getDateFormatted(startDate, pattern);
	}

	public String getEndDate(String pattern) {
		return TimeDateUtils.getDateFormatted(endDate, pattern);
	}

	public String[] toArray(String pattern) {
		return new String[]{getStartDate(pattern), getEndDate(pattern)};
	}

	public Date[] toArray() {
		return new Date[]{startDate, endDate};
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
