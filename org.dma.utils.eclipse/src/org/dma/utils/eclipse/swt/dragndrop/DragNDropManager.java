/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Jaime Ferreira (jaimesferreira@gmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dragndrop;

import org.dma.java.utils.Debug;

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

	public static void createDragObject(Control sourceControl){

		DragSource source = new DragSource(sourceControl, DND.DROP_MOVE | DND.DROP_COPY);

		// Provide data in Text format
		Transfer[] types = new Transfer[] {TextTransfer.getInstance(), FileTransfer.getInstance()};
		source.setTransfer(types);
		source.setData(sourceControl);

		addSourceListneres(source);

	}


	public static void createDropObject(Control targetControl){

		DropTarget target = new DropTarget(targetControl, DND.DROP_MOVE | DND.DROP_COPY);

		Transfer[] types = new Transfer[] {TextTransfer.getInstance(), FileTransfer.getInstance()};
		target.setTransfer(types);
		target.setData(targetControl);

		addTargetListeners(target);

	}



	/*
	 * Listeners
	 */
	public static void addSourceListneres(DragSource source){

		DragSourceListener dsl = new DragSourceListener() {

			public void dragStart(DragSourceEvent event) {
				Debug.out("event.data", event.data);
				DragSource source=(DragSource)event.getSource();
				Debug.out("source", source);
				if (source.getData() instanceof Table){
					Table table=(Table)source.getData();
					Debug.out("table selection", table.getSelection()[0].getText());
				}
				event.doit = true;
			}

			public void dragSetData(DragSourceEvent event) {
				Debug.out("event.data", event.data);
				event.data = ((DragSource)event.getSource()).getControl();
			}

			public void dragFinished(DragSourceEvent event) {
				Debug.out("event.data", event.data);
			}
		};

		source.addDragListener(dsl);

	}


	public static void addTargetListeners(DropTarget target){

		DropTargetListener dtl = new DropTargetListener() {
			public void dragEnter(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}

			public void dragOver(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}

			public void dragOperationChanged(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}

			public void dragLeave(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}

			public void dropAccept(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}

			public void drop(DropTargetEvent event) {
				Debug.out("event.data", event.data);
			}
		};

		target.addDropListener(dtl);

	}


}