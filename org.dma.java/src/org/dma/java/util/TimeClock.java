/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public abstract class TimeClock {

	public abstract void event();

	public enum CLOCK_FORMAT {

		SIMPLE ("dd MMM yyyy - HH:mm", 60*1000),
		FULL ("EEEE, dd MMMM yyyy - HH:mm", 60*1000);

		public String pattern;
		public int period;

		CLOCK_FORMAT(String pattern, int period) {
			this.pattern=pattern;
			this.period=period;
		}

	}

	private final Date date=new Date();
	private final Timer timer=new Timer();

	private final CLOCK_FORMAT format;
	private final Format formatter;

	public TimeClock(Locale locale) {
		this(locale, CLOCK_FORMAT.SIMPLE);
	}

	public TimeClock(Locale locale, CLOCK_FORMAT format) {
		this.format=format;
		this.formatter=new SimpleDateFormat(format.pattern, locale);
	}


	public void start() {
		timer.schedule(new TimerTask(){
			public void run() {
				event();
			}
		},
		//remaining milliseconds to next period
		format.period-(System.currentTimeMillis() % format.period),
			//milliseconds period between executions
			format.period);

		event(); //force event
	}


	public void stop() {
		timer.cancel();
	}


	@Override
	public String toString() {
		//reuse date object
		date.setTime(System.currentTimeMillis());
		return formatter.format(date);
	}

}