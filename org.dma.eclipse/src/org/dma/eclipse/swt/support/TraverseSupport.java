/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import java.util.ArrayList;

import org.dma.java.math.NumericUtils;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class TraverseSupport extends ArrayList<Control> {

	private static final long serialVersionUID = 1L;

	private final TraverseListener traverseListener = new TraverseListener() {

		public void keyTraversed(TraverseEvent event) {
			try{
				//current control
				Control control=(Control)event.getSource();

				//multi-line TEXT?
				if (control instanceof Text &&
						NumericUtils.bit(((Text)control).getStyle(), SWT.MULTI)){

					Debug.out("SWT.MULTI");

					if (keypadReturn) switch(event.keyCode){
					case SWT.KEYPAD_CR:
						event.doit=false; // do not traverse
						break;

					case SWT.CR:
						event.detail=SWT.TRAVERSE_NONE; // avoid NEW line
						event.doit=true; // traverse
						break;
					}
					//TAB key pressed?
					else if (event.keyCode==SWT.TAB){
						event.doit=true; // traverse
					}

				}

				//next control
				if (event.doit) selectNext(control);

			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	};

	private final boolean keypadReturn;

	public TraverseSupport(boolean keypadReturn){
		this.keypadReturn=keypadReturn;
	}


	@Override
	public boolean add(Control control) {
		control.addTraverseListener(traverseListener);
		return super.add(control);
	}

	public void add(Control...control) {
		for(Control element: control){
			add(element);
		}
	}


	public boolean remove(Control control) {
		control.removeTraverseListener(traverseListener);
		return super.remove(control);
	}

	public void remove(Control...control) {
		for(Control element: control){
			remove(element);
		}
	}

	public void removeAll() {
		for(Control element: this){
			remove(element);
		}
	}


	public Control getNext(Control control) {
		int index=indexOf(control);
		int index2=index;
		do{
			index=index+1==size() ? 0 : index+1;
		}while(index!=index2 && !get(index).isEnabled());
		return get(index);
	}

	public void select(Control control) {
		control.setFocus();
		control.update();
		//selects text
		if (control instanceof Text){
			Text text=(Text)control;
			//avoid MULTI
			if (!NumericUtils.bit(text.getStyle(), SWT.MULTI))
				text.selectAll();
		}
	}

	public void selectNext(Control control) {
		select(getNext(control));
	}

	public void selectFirst() {
		if (isEmpty()) return;
		Control control=get(0);
		if (control.isEnabled()){
			select(control);
		}else{
			selectNext(control);
		}
	}


}