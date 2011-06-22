/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.eclipse.Debug;
import org.dma.utils.java.numeric.IntegerUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class TraverseSupport {

	private final List<Control> components = new ArrayList();

	private final TraverseListener traverseListener = new TraverseListener() {

		//TODO INTERFACE: Implementar o controle de teclado para SWT.MULTI
		public void keyTraversed(TraverseEvent e){

			try {
				e.doit = true;

				if (e.detail == SWT.TRAVERSE_RETURN) {

					Debug.info("### TRAVERSE_RETURN ###");

					//processa control actual
					Control actualControl=(Control)e.getSource();
					//e' uma TEXT multi-linha?
					if(actualControl instanceof Text &&
							IntegerUtils.bit(((Text) actualControl).getStyle(), SWT.MULTI)){

						Debug.info("### SWT.MULTI ###");

						//foi pressionado ENTER principal?
						if (e.keyCode==SWT.CR){
							Debug.info("### SWT.CR ###");
							//NAO insere nova linha
							e.detail = SWT.TRAVERSE_NONE;
							//passa de campo
							e.doit = true;
						//foi pressionado ENTER do teclado numerico?
						}else if (e.keyCode==SWT.KEYPAD_CR){
							Debug.info("### SWT.KEYPAD_CR ###");
							//NAO passa de campo
							e.doit = false;
						}
					}

					//processa proximo control
					if (e.doit){
						Debug.info("### doit ###");

						Control nextControl=getNextControl(e.getSource());
						nextControl.setFocus();
						nextControl.update();

						//selecciona texto caso nao seja MULTI
						if(nextControl instanceof Text &&
								!IntegerUtils.bit(((Text) nextControl).getStyle(), SWT.MULTI)){
							((Text) nextControl).selectAll();
						}
					}

				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	};


	private Control getNextControl(Object obj){

		int index=components.indexOf(obj);
		try {

			Control control;
			int index2=index;
			do{
				index++;
				if(index==components.size())
					index=0;

				control=components.get(index);

			}while(index!=index2 && !control.isEnabled());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return components.get(index);

	}


	public void addTraverseSupport(Control control) {
		control.addTraverseListener(traverseListener);
		components.add(control);
	}


	public void removeTraverseSupport(Control control) {
		control.removeTraverseListener(traverseListener);
		components.remove(control);
	}


}
