/*******************************************************************************
 * 2008-2018 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

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

	public Calendar getCalendar() {
		return TimeDateUtils.getCalendar(getYear(), getMonth(), getDay());
	}

	public Time getTime() {
		return TimeDateUtils.getTime(getHours(), getMinutes(), getSeconds());
	}

	@Override
	public String toString() {
		int style=getStyle();
		if (NumericUtils.bit(style, SWT.CALENDAR)) return TimeDateUtils.getDateFormatted(getCalendar().getTime());
		if (NumericUtils.bit(style, SWT.TIME)) return TimeDateUtils.getDateFormatted(getTime());
		return super.toString();
	}


}