/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.jface.action.StatusLineContributionItem;
import org.eclipse.swt.widgets.Display;

public class StatusbarSupport {

	private final StatusLineContributionItem item;
	private final Locale locale;
	private final String format;

	private final Timer timer;
	private String timedate;

	public StatusbarSupport(StatusLineContributionItem item, Locale locale, String format, int seconds) {
		this.item=item;
		this.locale=locale;
		this.format=format;
		this.timer=new Timer();
		this.timer.schedule(new DateTimeTask(), 0, seconds*1000);
	}


	private void updateStatusBar() {
		try {
			Format formatter=new SimpleDateFormat(format,this.locale);
			timedate=formatter.format(new Date());

			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					item.setText(timedate);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	class DateTimeTask extends TimerTask {

		public void run() {
			updateStatusBar();
		}

	}



}
