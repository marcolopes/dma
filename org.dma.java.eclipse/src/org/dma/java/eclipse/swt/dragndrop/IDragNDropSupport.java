/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Jaime Ferreira (jaimesferreira@gmail.com)
 *******************************************************************************/
package org.dma.java.eclipse.swt.dragndrop;

import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.widgets.Control;

public interface IDragNDropSupport {

	public boolean processDroppedObject(Control obj);

	public Control getSourceControl();

	public void setSourceControl(Control sourceControl);

	public Control getTargetControl();

	public void setTargetControl(Control targetControl);

	public DragSource getDragSource();

	public void setDragSource(DragSource dragSource);

	public DropTarget getDropTarget();

	public void setDropTarget(DropTarget dropTarget);

}