/*******************************************************************************
 * 2008-2021 Public Domain
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