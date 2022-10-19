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
package org.dma.java.time;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public abstract class TimerClock {

	public abstract void event();

	public enum CLOCK_FORMAT {

		/** 1 Jan 2020 - 23:59 */
		DATE_TIME ("dd MMM yyyy - HH:mm", 60*1000),
		/** 1 Jan 2020 - 23:59:59 */
		DATE_TIME_SECONDS ("dd MMM yyyy - HH:mm:ss", 1000),
		/** Monday, 1 January 2020 - 23:59 */
		DAY_DATE_TIME ("EEEE, dd MMMM yyyy - HH:mm", 60*1000),
		/** Monday, 1 January 2020 - 23:59:59 */
		DAY_DATE_TIME_SECONDS ("EEEE, dd MMMM yyyy - HH:mm:ss", 1000);

		public String pattern;
		public int period;

		CLOCK_FORMAT(String pattern, int period) {
			this.pattern=pattern;
			this.period=period;
		}

	}

	private final Date date=new Date();
	/** Daemon thread avoids the need to CANCEL */
	private final Timer timer=new Timer(true);

	private final CLOCK_FORMAT format;
	private final Format formatter;

	public TimerClock() {
		this(Locale.getDefault());
	}

	public TimerClock(Locale locale) {
		this(locale, CLOCK_FORMAT.DATE_TIME);
	}

	public TimerClock(CLOCK_FORMAT format) {
		this(Locale.getDefault(), format);
	}

	public TimerClock(Locale locale, CLOCK_FORMAT format) {
		this.format=format;
		this.formatter=new SimpleDateFormat(format.pattern, locale);
	}


	public void start() {
		timer.schedule(new TimerTask(){
			public void run() {
				event();
			}
		},//remaining milliseconds to next period
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


	public static void main(String[] argvs) throws Exception {

		new TimerClock() {
			@Override
			public void event() {
				System.out.println(toString());
			}
		}.start();

		do try{
			Thread.sleep(1000);
		}catch(Exception e){}
		while(true);

	}

}