/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.support;

import java.util.ArrayList;
import java.util.List;

import org.dma.java.math.NumericUtils;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class TraverseSupport implements TraverseListener {

	private final List<Control> controlList=new ArrayList();

	private final boolean keypadReturn;

	public TraverseSupport(boolean keypadReturn) {
		this.keypadReturn=keypadReturn;
	}


	@Override
	public void keyTraversed(TraverseEvent event) {
		try{//current control
			Control control=(Control)event.getSource();
			//multi-line TEXT?
			if (control instanceof Text){
				Text text=(Text)control;
				if (NumericUtils.bit(text.getStyle(), SWT.MULTI)){
					Debug.out("SWT.MULTI");
					//TAB key pressed?
					if (event.keyCode==SWT.TAB) event.doit=true; // traverse
					//control KEYPAD return?
					else if (keypadReturn) switch(event.keyCode){
					case SWT.KEYPAD_CR:
						event.doit=false; // do not traverse
						break;
					case SWT.CR:
						event.detail=SWT.TRAVERSE_NONE; // avoid NEW line
						event.doit=true; // traverse
						break;
					}
				}
			}//next control
			if (event.doit) selectNext(control);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	/*
	 * Add / Remove
	 */
	public boolean add(Control control) {
		control.addTraverseListener(this);
		return controlList.add(control);
	}

	public void add(Control...control) {
		for(Control element: control){
			add(element);
		}
	}

	public boolean remove(Control control) {
		control.removeTraverseListener(this);
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
	public Control getNext(Control control) {
		int index=controlList.indexOf(control);
		int index2=index;
		do{index=index+1==controlList.size() ? 0 : index+1; control=controlList.get(index);
		}while(index!=index2 && (!control.isEnabled() || !control.isVisible()));
		return control;
	}

	public void select(Control control) {
		//remove focus (isolated control)
		if (controlList.size()==1) control.getShell().setFocus();
		control.setFocus();
		//selects text
		if (control instanceof Text){
			Text text=(Text)control;
			//avoid MULTI
			if (!NumericUtils.bit(text.getStyle(), SWT.MULTI)) text.selectAll();
		}//update control
		control.update();
	}

	public void selectNext(Control control) {
		select(getNext(control));
	}

	public void selectFirst() {
		if (controlList.isEmpty()) return;
		Control control=controlList.get(0);
		if (control.isEnabled() && control.isVisible()){
			select(control);
		}else{
			selectNext(control);
		}
	}


}