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
package org.dma.eclipse.jface.dialogs.message;

import org.dma.eclipse.core.jobs.CustomJob;
import org.dma.eclipse.swt.graphics.FontManager;
import org.dma.eclipse.swt.graphics.FontManager.FONTS;
import org.dma.java.util.StringList;
import org.dma.java.util.StringUtils;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class CustomMessageDialog extends MessageDialog {

	@SuppressWarnings("hiding")
	public enum DIALOG_TITLES {

		ERROR ("Error"),
		WARNING ("Warning"),
		INFORMATION ("Information"),
		CONFIRM ("Confirmation"),
		QUESTION ("Attention");

		private String name;

		DIALOG_TITLES(String name) {this.name=name;}
		public void setName(String name){this.name=name;}
		public String toString() {return name;}

	}

	@SuppressWarnings("hiding")
	public enum DIALOG_BUTTON_LABELS {

		OK (IDialogConstants.OK_LABEL),
		CANCEL (IDialogConstants.CANCEL_LABEL),
		YES (IDialogConstants.YES_LABEL),
		NO (IDialogConstants.NO_LABEL);

		private String name;

		DIALOG_BUTTON_LABELS(String name) {this.name=name;}
		public void setName(String name){this.name=name;}
		public String toString() {return name;}

	}

	@SuppressWarnings("hiding")
	public enum DIALOG_TYPES {

		ERROR (MessageDialog.ERROR, DIALOG_TITLES.ERROR, DIALOG_BUTTON_LABELS.OK),
		WARNING (MessageDialog.WARNING, DIALOG_TITLES.WARNING, DIALOG_BUTTON_LABELS.OK),
		INFORMATION (MessageDialog.INFORMATION, DIALOG_TITLES.INFORMATION, DIALOG_BUTTON_LABELS.OK),
		CONFIRM (MessageDialog.CONFIRM, DIALOG_TITLES.CONFIRM, DIALOG_BUTTON_LABELS.OK, DIALOG_BUTTON_LABELS.CANCEL),
		QUESTION (MessageDialog.QUESTION, DIALOG_TITLES.QUESTION, DIALOG_BUTTON_LABELS.YES, DIALOG_BUTTON_LABELS.NO);

		public final int type;
		public final String title;
		public final String[] buttonLabels;

		DIALOG_TYPES(int type, DIALOG_TITLES title, DIALOG_BUTTON_LABELS...buttonLabels) {
			this.type=type;
			this.title=title.toString();
			this.buttonLabels=StringList.valueOf(buttonLabels).toArray();
		}

		private boolean result;

		public boolean open(String message) {
			return open(null, message);
		}

		public boolean open(String message, Font messageFont) {
			return open(null, message, messageFont);
		}

		public boolean open(String header, String message) {
			return open(header, message, null);
		}

		public boolean open(final String header, final String message, final Font messageFont) {
			if (message!=null && !message.isEmpty()) try{
				CustomJob.syncExec(new Runnable() {
					public void run() {
						MessageDialog dialog=new CustomMessageDialog(
								Display.getDefault().getActiveShell(), title, header, message, type, messageFont);
						int code=dialog.open(); //button index OR -1 (manual close)
						switch(DIALOG_TYPES.this){ //control manual close
						case ERROR: result=code<=0; break;
						case WARNING: result=code<=0; break;
						case INFORMATION: result=code<=0; break;
						case CONFIRM: result=code==0; break;
						case QUESTION: result=code==0; break;
						}
					}
				});return result;
			}catch(Exception e){
				e.printStackTrace();
			}return this==CONFIRM || this==QUESTION;
		}

	}

	private static String[] getButtonLabels(int dialogType) {
		switch(dialogType){
		case ERROR: return DIALOG_TYPES.ERROR.buttonLabels;
		case WARNING: return DIALOG_TYPES.WARNING.buttonLabels;
		case INFORMATION: return DIALOG_TYPES.INFORMATION.buttonLabels;
		case CONFIRM: return DIALOG_TYPES.CONFIRM.buttonLabels;
		case QUESTION: return DIALOG_TYPES.QUESTION.buttonLabels;
		}return new String[0];
	}

	protected final String dialogHeader;
	protected final Font messageFont;

	public CustomMessageDialog(Shell parentShell, String dialogTitle, String dialogHeader, String dialogMessage, int dialogType) {
		this(parentShell, dialogTitle, dialogHeader, dialogMessage, dialogType, null);
	}

	public CustomMessageDialog(Shell parentShell, String dialogTitle, String dialogHeader, String dialogMessage, int dialogType, Font messageFont) {
		this(parentShell, dialogTitle, null, dialogHeader, dialogMessage, dialogType, getButtonLabels(dialogType), 0, messageFont);
	}

	public CustomMessageDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage, String dialogHeader,
			String dialogMessage, int dialogType, String[] dialogButtonLabels, int defaultIndex, Font messageFont) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogType, dialogButtonLabels, defaultIndex);
		this.dialogHeader=dialogHeader;
		this.messageFont=messageFont;
	}

	@Override
	protected Control createMessageArea(Composite composite) {
		final Image image = getImage();
		if (image != null) {
			imageLabel = new Label(composite, SWT.NONE);
			image.setBackground(imageLabel.getBackground());
			imageLabel.setImage(image);
			GridDataFactory.fillDefaults().
				align(SWT.LEFT, SWT.BEGINNING).
				applyTo(imageLabel);
		}
		Composite container = new Composite(composite, SWT.NONE);
		container.setLayout(new GridLayout());
		createText(container, dialogHeader, false, FontManager.SYSTEM_FONT_BOLD);
		createText(container, message, true, messageFont);
		return composite;
	}

	private Text createText(Composite composite, String message, boolean enabled, Font font) {
		if (message!=null && !message.isEmpty()){
			Text text = new Text(composite, SWT.MULTI | SWT.WRAP);
			text.setText(message);
			text.setEnabled(enabled);
			text.setEditable(false);
			text.setFont(font);
			GridDataFactory.fillDefaults().
				align(SWT.FILL, SWT.BEGINNING).
				grab(true, false).
				hint(convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH), SWT.DEFAULT).
				applyTo(text);
			return text;
		}return null;
	}


	public static void main(String[] args) {

		System.out.println(DIALOG_TYPES.ERROR.open(""));
		System.out.println(WarningDialog.open(""));
		System.out.println(DIALOG_TYPES.INFORMATION.open(""));
		System.out.println(DIALOG_TYPES.CONFIRM.open(""));
		System.out.println(DIALOG_TYPES.QUESTION.open(""));

		String message="The quick brown fox jumps over the lazy dog"+
				" over" + StringUtils.replicas(" and over", 20) + "..." ;

		System.out.println(DIALOG_TYPES.ERROR.open(message));
		System.out.println(WarningDialog.open(message));
		System.out.println(DIALOG_TYPES.INFORMATION.open(message));
		System.out.println(DIALOG_TYPES.CONFIRM.open(message));
		System.out.println(DIALOG_TYPES.QUESTION.open(message));

		String header="Happy forever" + StringUtils.replicas(" and ever", 20) + "...";

		System.out.println(DIALOG_TYPES.ERROR.open(header, message));
		System.out.println(DIALOG_TYPES.ERROR.open(null, message));

		for(FONTS font: FONTS.values()){
			System.out.println(DIALOG_TYPES.ERROR.open(font.name(), message, font.font));
			System.out.println(DIALOG_TYPES.ERROR.open(font.name(), message, font.bold));
			System.out.println(DIALOG_TYPES.ERROR.open(font.name(), message, font.italic));
		}

	}


}