/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.support;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;

public class FocusSupport {

	private Control lastFocusControl;

	private final FocusListener focusListener = new FocusListener() {

		public void focusGained(FocusEvent e) {
			if(e.widget instanceof Control) {
				lastFocusControl=(Control)e.widget;
			}
		}

		public void focusLost(FocusEvent e) {
		}

	};


	public void addFocusListener(Control control) {
		control.addFocusListener(focusListener);
	}

	public void removeFocusListener(Control control) {
		control.removeFocusListener(focusListener);
	}

	public void reset() {
		lastFocusControl=null;
	}





	/*
	 * Getters and setters
	 */
	public Control getLastFocusControl() {
		return lastFocusControl;
	}

	public void setLastFocusControl(Control lastFocusControl) {
		this.lastFocusControl=lastFocusControl;
	}


}
