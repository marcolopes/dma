/*******************************************************************************
 * Copyright 2008-2019 Marco Lopes (marcolopespt@gmail.com)
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
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.input.support;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Control;

public class FocusSupport {

	private final FocusListener focusListener = new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			if(e.widget instanceof Control) control=(Control)e.widget;
		}
	};

	private final List<Control> controlList = new ArrayList();

	private Control control;


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
