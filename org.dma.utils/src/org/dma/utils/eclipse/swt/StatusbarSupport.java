/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

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

	private String timedate;
	private Timer timer;

	public StatusbarSupport(StatusLineContributionItem item, Locale locale) {
		this.item=item;
		this.locale=locale;
	}


	public void startTimer(String format, int seconds) {
		Timer timer=new Timer();
		timer.schedule(new CustomTimer(), 0, seconds*1000);

		Format formatter=new SimpleDateFormat(format,this.locale);
		timedate=formatter.format(new Date());
	}


	public void stopTimer() {
		timer.cancel();
	}


	private void updateStatusBar() {
		try {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					item.setText(timedate);
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	class CustomTimer extends TimerTask {

		public void run() {
			updateStatusBar();
		}

	}



}
