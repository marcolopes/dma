/*******************************************************************************
 * 2008-2015 Public Domain
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

		private Control getNextControl(Object obj) {

			int index=indexOf(obj);
			try{
				int index2=index;
				do{
					index=index+1==size() ? 0 : index+1;

				}while(index!=index2 && !get(index).isEnabled());

			}catch(Exception e){
				e.printStackTrace();
			}

			return get(index);

		}

		public void keyTraversed(TraverseEvent e) {

			try{
				//control actual
				Control actualControl=(Control)e.getSource();

				//TEXT multi-linha?
				if (actualControl instanceof Text &&
						NumericUtils.bit(((Text)actualControl).getStyle(), SWT.MULTI)){

					Debug.out("SWT.MULTI");

					if (keypadReturn){

						//foi pressionado ENTER do teclado numerico?
						if (e.keyCode==SWT.KEYPAD_CR){
							Debug.out("SWT.KEYPAD_CR");
							//NAO passa de campo
							e.doit = false;
						}
						//foi pressionado ENTER principal?
						else if (e.keyCode==SWT.CR){
							Debug.out("SWT.CR");
							//NAO insere nova linha
							e.detail = SWT.TRAVERSE_NONE;
							//passa de campo
							e.doit = true;
						}

					}
					//foi pressionado TAB?
					else if (e.keyCode==SWT.TAB){
						Debug.out("SWT.TAB");
						//passa de campo
						e.doit = true;
					}

				}

				//processa proximo control
				if (e.doit){

					Control nextControl=getNextControl(e.getSource());
					nextControl.setFocus();
					nextControl.update();

					//selecciona texto caso nao seja MULTI
					if (nextControl instanceof Text &&
							!NumericUtils.bit(((Text)nextControl).getStyle(), SWT.MULTI)){
						((Text)nextControl).selectAll();
					}

				}

			}catch(Exception e1) {
				e1.printStackTrace();
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
		for(Control e: control){
			add(e);
		}
	}


	public boolean remove(Control control) {
		control.removeTraverseListener(traverseListener);
		return super.remove(control);
	}

	public void remove(Control...control) {
		for(Control e: control){
			remove(e);
		}
	}

	public void removeAll() {
		for(Control e: this){
			remove(e);
		}

	}


}