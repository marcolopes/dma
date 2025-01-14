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
	public enum DIALOG_BUTTONS {

		OK, CANCEL, YES, NO;

		private String label;

		public void setLabel(String label) {this.label=label;}

		@Override
		public String toString() {return label();}

		public String label() {
			if (label==null) switch(this){
			case OK: return IDialogConstants.OK_LABEL;
			case CANCEL: return IDialogConstants.CANCEL_LABEL;
			case YES: return IDialogConstants.YES_LABEL;
			case NO: return IDialogConstants.NO_LABEL;
			}return label;
		}

	}

	@SuppressWarnings("hiding")
	public enum DIALOG_TYPES {

		ERROR (null, DIALOG_BUTTONS.OK),
		INFORMATION ("Information", DIALOG_BUTTONS.OK),
		WARNING ("Warning", DIALOG_BUTTONS.OK),
		QUESTION ("Attention", DIALOG_BUTTONS.YES, DIALOG_BUTTONS.NO),
		CONFIRM ("Confirmation", DIALOG_BUTTONS.OK, DIALOG_BUTTONS.CANCEL);

		private String title;

		public String title() {return title;}
		public void setTitle(String title) {this.title=title;}

		private DIALOG_BUTTONS[] buttons;

		public static String[] buttonLabels(int dialogType) {
			for(DIALOG_TYPES dialog: values()){
				if (dialog.type()==dialogType) return StringList.valueOf(dialog.buttons).toArray();
			}return new String[0];
		}

		DIALOG_TYPES(String title, DIALOG_BUTTONS...buttons) {
			this.title=title;
			this.buttons=buttons;
		}

		public int type() {
			switch(this){
			case ERROR: return MessageDialog.ERROR;
			case INFORMATION: return MessageDialog.INFORMATION;
			case WARNING: return MessageDialog.WARNING;
			case QUESTION: return MessageDialog.QUESTION;
			case CONFIRM: return MessageDialog.CONFIRM;
			}return MessageDialog.NONE;
		}

		private boolean result; //false

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
						MessageDialog dialog=new CustomMessageDialog(Display.getDefault().
								getActiveShell(), title, header, message, type(), messageFont);
						int code=dialog.open(); //button index OR -1 (manual close)
						switch(DIALOG_TYPES.this){ //control manual close
						case ERROR:
						case INFORMATION:
						case WARNING: result=code<=0; break;
						case QUESTION:
						case CONFIRM: result=code>=0 &&
							(buttons[code]==DIALOG_BUTTONS.OK ||
							buttons[code]==DIALOG_BUTTONS.YES); break;
						}
					}
				});return result;
			}catch(Exception e){
				e.printStackTrace();
			}return this==QUESTION || this==CONFIRM;
		}

	}

	protected final String dialogHeader;
	protected final Font messageFont;

	public CustomMessageDialog(Shell parentShell, String dialogTitle, String dialogHeader, String dialogMessage, int dialogType) {
		this(parentShell, dialogTitle, dialogHeader, dialogMessage, dialogType, null);
	}

	public CustomMessageDialog(Shell parentShell, String dialogTitle, String dialogHeader, String dialogMessage, int dialogType, Font messageFont) {
		this(parentShell, dialogTitle, null, dialogHeader, dialogMessage, dialogType, DIALOG_TYPES.buttonLabels(dialogType), 0, messageFont);
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

		System.out.println(ErrorDialog.open("")==DIALOG_TYPES.ERROR.open(""));
		System.out.println(InformationDialog.open("")==DIALOG_TYPES.INFORMATION.open(""));
		System.out.println(WarningDialog.open("")==DIALOG_TYPES.WARNING.open(""));
		System.out.println(QuestionDialog.open("")==DIALOG_TYPES.QUESTION.open(""));
		System.out.println(ConfirmationDialog.open("")==DIALOG_TYPES.CONFIRM.open(""));

		String message="The quick brown fox jumps over the lazy dog"+
				" over" + StringUtils.replicas(" and over", 20) + "...";

		System.out.println(DIALOG_TYPES.ERROR.open(message));
		System.out.println(DIALOG_TYPES.INFORMATION.open(message));
		System.out.println(DIALOG_TYPES.WARNING.open(message));
		System.out.println(DIALOG_TYPES.QUESTION.open(message));
		System.out.println(DIALOG_TYPES.CONFIRM.open(message));

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