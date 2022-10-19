/*******************************************************************************
 * Copyright 2008-2010 Marco Lopes (marcolopespt@gmail.com)
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
 * Jaime Ferreira (jaimesferreira@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.dragndrop;

import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.widgets.Control;

public abstract class CustomDragNDrop implements IDragNDropSupport {

	private Control sourceControl = null;
	private Control targetControl = null;

	private DragSource source = null;
	private DropTarget target = null;

	public CustomDragNDrop() {}


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