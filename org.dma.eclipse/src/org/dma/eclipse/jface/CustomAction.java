/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.jface;

import java.awt.image.BufferedImage;

import org.dma.eclipse.swt.widgets.CustomImageDescriptor;
import org.dma.java.awt.ImageHandler;
import org.dma.java.util.Debug;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName()+":"+String.valueOf(System.nanoTime());

	/** @see Action */
	public CustomAction() {
		this(null);
	}

	/** @see Action */
	public CustomAction(String text) {
		Debug.out("ID", ID);
		setText(text);
		setId(ID);
	}

	public void setImageDescriptor(String pathname) {
		setImageDescriptor(ImageHandler.createImage(pathname));
	}

	@Deprecated
	void setImageDescriptor(String pathname, int size) {
		setImageDescriptor(new ImageHandler(pathname).resize(size));
	}

	public void setImageDescriptor(BufferedImage image) {
		setImageDescriptor(new CustomImageDescriptor(image));
	}

	/** @see Action#setEnabled(boolean) */
	public void enable() {
		setEnabled(true);
	}

	/** @see Action#setEnabled(boolean) */
	public void disable() {
		setEnabled(false);
	}

}