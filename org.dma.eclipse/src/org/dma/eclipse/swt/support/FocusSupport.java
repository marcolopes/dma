/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;

public class FocusSupport {

	private final List<Control> controlList = new ArrayList();

	private Control control;

	private final FocusListener focusListener = new FocusListener() {
		@Override
		public void focusGained(FocusEvent e) {
			if(e.widget instanceof Control) {
				control=(Control)e.widget;
			}
		}
		@Override
		public void focusLost(FocusEvent e) {}
	};


	/*
	 * Add / Remove
	 */
	public boolean add(Control control) {
		control.addFocusListener(focusListener);
		return controlList.add(control);
	}

	public void add(Control...control) {
		for(Control element: control){
			add(element);
		}
	}

	public boolean remove(Control control) {
		control.removeFocusListener(focusListener);
		return controlList.remove(control);
	}

	public void remove(Control...control) {
		for(Control element: control){
			remove(element);
		}
	}

	public void removeAll() {
		for(Control element: controlList){
			remove(element);
		}
	}


	/*
	 * Control
	 */
	public void reset() {
		control=null;
	}

	public boolean setFocus() {
		return control==null ? false : control.setFocus();
	}

	public boolean forceFocus() {
		return control==null ? false : control.forceFocus();
	}


}
