/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.support;

import java.util.ArrayList;
import java.util.List;

import org.dma.java.utils.Debug;
import org.dma.java.utils.numeric.IntegerUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class TraverseSupport {

	private final List<Control> components = new ArrayList();

	private final TraverseListener traverseListener = new TraverseListener() {

		public void keyTraversed(TraverseEvent e) {

			try{
				//control actual
				Control actualControl=(Control)e.getSource();

				//e' uma TEXT multi-linha?
				if(actualControl instanceof Text &&
						IntegerUtils.bit(((Text)actualControl).getStyle(), SWT.MULTI)){

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
					if(nextControl instanceof Text &&
							!IntegerUtils.bit(((Text)nextControl).getStyle(), SWT.MULTI)){
						((Text)nextControl).selectAll();
					}

				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	};

	private final boolean keypadReturn;

	public TraverseSupport(boolean keypadReturn){
		this.keypadReturn=keypadReturn;
	}


	private Control getNextControl(Object obj) {

		int index=components.indexOf(obj);
		try{
			Control control;
			int index2=index;
			do{
				index=index+1==components.size() ? 0 : index+1;
				control=components.get(index);

			}while(index!=index2 && !control.isEnabled());

		} catch (Exception e){
			e.printStackTrace();
		}

		return components.get(index);

	}


	public void add(Control control) {
		control.addTraverseListener(traverseListener);
		components.add(control);
	}


	public void remove(Control control) {
		control.removeTraverseListener(traverseListener);
		components.remove(control);
	}


}
