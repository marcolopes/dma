/*******************************************************************************
 * Copyright 2008-2024 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.validation.field;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class FieldLabel {

	private final Control control;
	private final String text;

	public FieldLabel(String text) {
		this(null, text);
	}

	public FieldLabel(Control control) {
		this(control, null);
	}

	public FieldLabel(Control control, String text) {
		this.control=control;
		this.text=text;
	}


	/** @see Control#setForeground(Color) */
	public void setColor(Color color) {
		if (control!=null){
			if (control instanceof Label) ((Label)control).setForeground(color);
			if (control instanceof Button)((Button)control).setBackground(color);
		}
	}

	public String getText() {
		if (text!=null) return text;
		if (control!=null){
			if (control instanceof Label) return ((Label)control).getText();
			if (control instanceof Button) return ((Button)control).getText();
		}return "";
	}

}