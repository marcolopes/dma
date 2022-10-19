/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.swt.input.validation.table;

import org.dma.eclipse.swt.input.validation.field.FieldBinding;
import org.dma.eclipse.swt.input.validation.field.FieldLabel;
import org.dma.eclipse.swt.input.validation.field.FieldRules;
import org.dma.eclipse.swt.input.validation.field.IFieldRules;
import org.dma.java.input.FieldFormat;

import org.eclipse.swt.widgets.Control;

public abstract class ColumnBinding extends FieldBinding implements IFieldRules {

	/** With regex matcher */
	public ColumnBinding(FieldLabel label, Control control, FieldFormat format) {
		super(label, control, format, new FieldRules(DEFAULT));
	}

	/** Without regex matcher */
	public ColumnBinding(FieldLabel label, Control control) {
		super(label, control, new FieldRules(DEFAULT));
	}


}