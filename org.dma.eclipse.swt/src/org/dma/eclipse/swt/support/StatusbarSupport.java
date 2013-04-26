/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.jface.action.StatusLineContributionItem;
import org.eclipse.swt.widgets.Display;

public class StatusbarSupport {

	public static enum CLOCK_FORMAT {

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
	private Format formatter;
	private Timer timer;

	private final StatusLineContributionItem item;
	private final Locale locale;

	public StatusbarSupport(StatusLineContributionItem item, Locale locale) {
		this.item=item;
		this.locale=locale;
	}


	public void startTimer() {
		startTimer(CLOCK_FORMAT.SIMPLE);
	}


	public void startTimer(CLOCK_FORMAT format) {
		formatter=new SimpleDateFormat(format.pattern,locale);
		timer=new Timer();
		timer.schedule(new TimerTask(){
			public void run() {
				updateStatusBar();
			}
		}, format.period-(System.currentTimeMillis() % format.period), format.period);
		//force update
		updateStatusBar();
	}


	public void stopTimer() {
		timer.cancel();
	}


	private void updateStatusBar() {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try{
					//re-use date object
					date.setTime(System.currentTimeMillis());
					item.setText(formatter.format(date));
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
	}


}