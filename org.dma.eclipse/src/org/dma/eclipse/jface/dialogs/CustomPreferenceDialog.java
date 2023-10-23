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
package org.dma.eclipse.jface.dialogs;

import org.dma.eclipse.jface.dialogs.message.CustomMessageDialog.DIALOG_BUTTONS;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;

public class CustomPreferenceDialog extends PreferenceDialog {

	private final Shell shell;

	public CustomPreferenceDialog(Shell parentShell, PreferenceManager manager) {
		super(parentShell, manager);
		super.create();
		getButton(IDialogConstants.OK_ID).setText(DIALOG_BUTTONS.OK.label());
		getButton(IDialogConstants.CANCEL_ID).setText(DIALOG_BUTTONS.CANCEL.label());
		//setBlockOnOpen(false);
		shell=getShell();
	}

	@Override
	public void create() {
		throw new UnsupportedOperationException();
	}

	public void setText(String text) {
		shell.setText(text);
	}

	public void setImage(Image image) {
		shell.setImage(image);
	}

	/** Returns the node ID */
	public IPreferenceNode findNode(String id) {
		for(IPreferenceNode node: getPreferenceManager().getRootSubNodes()){
			IPreferenceNode subnode=node.findSubNode(id);
			if (subnode!=null) return subnode;
		}return null;
	}

	/** Disables the default button */
	public void disableDefaultButton() {
		if (!shell.isDisposed()){
			Button button=new Button(shell, SWT.PUSH);
			button.setVisible(false); // hide & avoid focus
			shell.setDefaultButton(button);
		}
	}

	/** Selects the tree node */
	public void select(IPreferenceNode node) {
		getTreeViewer().setSelection(new StructuredSelection(node));
		//showPage(node);
	}

	public int open(IPreferenceNode node) {
		if (!shell.isDisposed()){
			getTreeViewer().expandAll();
			if (node!=null) select(node);
			constrainShellSize();
			//super.open();
			shell.open();
			while(!shell.isDisposed()){
				if (!shell.getDisplay().readAndDispatch()) shell.getDisplay().sleep();
			}
		}return getReturnCode();
	}

	@Override
	public int open() {
		return open(null);
	}

}