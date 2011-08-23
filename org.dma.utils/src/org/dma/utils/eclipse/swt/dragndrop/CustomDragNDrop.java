/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Jaime Ferreira (jaimesferreira@gmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.dragndrop;

import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.widgets.Control;

public abstract class CustomDragNDrop {

	private Control sourceControl = null;
	private Control targetControl = null;

	private DragSource source = null;
	private DropTarget target = null;

	public CustomDragNDrop() {
	}


	public Control getSourceControl() {
		return sourceControl;
	}

	public void setSourceControl(Control sourceControl) {
		this.sourceControl = sourceControl;
	}

	public Control getTargetControl() {
		return targetControl;
	}

	public void setTargetControl(Control targetControl) {
		this.targetControl = targetControl;
	}

	public DragSource getDragSource() {
		return source;
	}

	public void setDragSource(DragSource source) {
		this.source = source;
	}

	public DropTarget getDropTarget() {
		return target;
	}

	public void setDropTarget(DropTarget target) {
		this.target = target;
	}


}