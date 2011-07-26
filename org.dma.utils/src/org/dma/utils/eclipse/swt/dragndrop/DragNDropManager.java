/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Jaime Ferreira (jaimesferreira@gmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dragndrop;

import org.dma.utils.java.Debug;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;

public class DragNDropManager {

	private static DropTargetListener dtl;

	public static void createDragObject(Control sourceControl){

		try {
			int operations = DND.DROP_MOVE | DND.DROP_COPY;

			DragSource source = new DragSource(sourceControl, operations);

			// Provide data in Text format
			Transfer[] types = new Transfer[] {TextTransfer.getInstance(), FileTransfer.getInstance()};
			source.setTransfer(types);
			source.setData(sourceControl);

			addSourceListneres(source);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void addSourceListneres(DragSource source){

		try {
			DragSourceListener dsl = new DragSourceListener() {

				public void dragStart(DragSourceEvent event) {
					try {
						Debug.info("source", ((Table)((DragSource)event.getSource()).getData()).getSelection()[0].getText());

						event.doit = true;

					} catch (Exception e) {
						e.printStackTrace();
					}
				}


				public void dragSetData(DragSourceEvent event) {
					try {
						event.data = ((DragSource)event.getSource()).getControl();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}


				public void dragFinished(DragSourceEvent event) {
					Debug.info();
				}
			};

			source.addDragListener(dsl);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void createDropObject(Control targetControl){

		try {
			int operations = DND.DROP_MOVE | DND.DROP_COPY;

			DropTarget target = new DropTarget(targetControl, operations);

			Transfer[] types = new Transfer[] {TextTransfer.getInstance(), FileTransfer.getInstance()};
			target.setTransfer(types);

			addTargetListeners();
			target.addDropListener(dtl);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void addTargetListeners(){

		dtl = new DropTargetListener() {
			public void dragEnter(DropTargetEvent event) {
			}

			public void dragOver(DropTargetEvent event) {
			}

			public void dragOperationChanged(DropTargetEvent event) {
			}

			public void dragLeave(DropTargetEvent event) {
			}

			public void dropAccept(DropTargetEvent event) {
				Debug.info("event.data", event.data);
				//processDroppedObject(((DropTarget)event.getSource()).getControl());
			}

			public void drop(DropTargetEvent event) {
				Debug.info();
			}
		};
	}


}