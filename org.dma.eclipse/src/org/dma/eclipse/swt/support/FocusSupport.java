/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;

public class FocusSupport {

	private Control lastFocusControl;

	private final FocusListener focusListener = new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			if(e.widget instanceof Control) {
				lastFocusControl=(Control)e.widget;
			}
		}
		@Override
		public void focusLost(FocusEvent e) {
		}
	};

	public void reset() {
		lastFocusControl=null;
	}


	public void add(Control control) {
		control.addFocusListener(focusListener);
	}

	public void add(Control...control) {
		for(Control e: control){
			add(e);
		}
	}

	public void remove(Control control) {
		control.removeFocusListener(focusListener);
	}

	public void remove(Control...control) {
		for(Control e: control){
			remove(e);
		}
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
