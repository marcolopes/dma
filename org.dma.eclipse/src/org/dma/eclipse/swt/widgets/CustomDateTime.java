/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import java.sql.Time;
import java.util.Calendar;

import org.dma.java.math.NumericUtils;
import org.dma.java.util.TimeDateUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;

public class CustomDateTime extends DateTime {

	@Override //subclassing
	protected void checkSubclass() {}

	/** @see DateTime#DateTime(Composite, int) */
	public CustomDateTime(Composite parent, int style) {
		super(parent, style);
	}

	public void setDate(Calendar calendar) {
		setDate(TimeDateUtils.getYear(calendar), TimeDateUtils.getMonth(calendar), TimeDateUtils.getDayOfMonth(calendar));
	}

	public Calendar getCalendar() {
		return TimeDateUtils.getCalendar(getYear(), getMonth(), getDay());
	}

	public Time getTime() {
		return TimeDateUtils.getTime(getHours(), getMinutes(), getSeconds());
	}

	@Override
	public String toString() {
		return NumericUtils.bit(getStyle(), SWT.TIME) ?
				TimeDateUtils.getTimeFormatted(getTime()) :
				TimeDateUtils.getDateFormatted(getCalendar().getTime());
	}


}