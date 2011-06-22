/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;

public class FocusSupport {

	private Control lastfocuscontrol;

	private final FocusListener focusListener = new FocusListener() {

		public void focusGained(FocusEvent e) {
			if(e.widget instanceof Control) {
				lastfocuscontrol=(Control)e.widget;
			}
		}

		public void focusLost(FocusEvent e) {

		}
	};


	public void addRetainFocusListener(Control control) {
		control.addFocusListener(focusListener);
	}

	public void removeRetainFocusListener(Control control) {
		control.removeFocusListener(focusListener);
	}

	public void reset() {
		lastfocuscontrol = null;
	}





	//getters and setters
	public Control getLastfocuscontrol() {
		return lastfocuscontrol;
	}

	public void setLastfocuscontrol(Control lastfocuscontrol) {
		this.lastfocuscontrol = lastfocuscontrol;
	}


}
