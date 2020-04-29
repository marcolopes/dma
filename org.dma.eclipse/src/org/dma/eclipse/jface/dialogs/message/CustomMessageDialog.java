/*******************************************************************************
 * 2008-2020 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.message;

import org.dma.eclipse.swt.graphics.FontManager;

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
	public enum TYPE {

		ERROR ("Error", MessageDialog.ERROR),
		INFORMATION ("Information", MessageDialog.INFORMATION),
		CONFIRM ("Confirmation", MessageDialog.CONFIRM),
		QUESTION ("Question", MessageDialog.QUESTION);

		private String title;
		private int dialogType;

		TYPE(String title, int dialogType) {
			this.title=title;
			this.dialogType=dialogType;
		}

		public void setTitle(String title){
			this.title=title;
		}

		private boolean result;

		public boolean open(String message) {
			return open("", message);
		}

		public boolean open(String message, Font messageFont) {
			return open("", message, messageFont);
		}

		public boolean open(String header, String message) {
			return open(header, message, null);
		}

		public boolean open(final String header, final String message, final Font messageFont) {

			if (!message.isEmpty()) try{
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						MessageDialog dialog=new CustomMessageDialog(Display.getDefault().getActiveShell(),
								title, header, message, dialogType, messageFont);
						int code=dialog.open(); //button index OR -1 (manual close)
						switch(TYPE.this){ //control manual close
						case ERROR: result=code<=0; break;
						case INFORMATION: result=code<=0; break;
						case CONFIRM: result=code==0; break;
						case QUESTION: result=code==0; break;
						}
					}
				});
				return result;

			}catch(Exception e){
				e.printStackTrace();
			}return this==CONFIRM || this==QUESTION;

		}

	}

	private static String[] getButtonLabels(int dialogType) {
		switch(dialogType){
		case ERROR:
		case INFORMATION:
		case WARNING: return new String[]{IDialogConstants.OK_LABEL};
		case CONFIRM: return new String[]{IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL};
		case QUESTION: return new String[]{IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL};
		case QUESTION_WITH_CANCEL: return new String[]{IDialogConstants.YES_LABEL,
			IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL};
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
		if (!message.isEmpty()){
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


	public static void main(String[] argvs) {

		String header="Happy forever and ever and ever and ever and ever and ever"+
				" and ever and ever and ever and ever and ever and ever and ever";
		String message="The quick brown fox jumps over the lazy dog"+
				" over and over and over and over and over and over and over and over";

		System.out.println(TYPE.ERROR.open(message));
		System.out.println(TYPE.ERROR.open(header, ""));
		System.out.println(TYPE.ERROR.open("", message));
		System.out.println(TYPE.ERROR.open(header, message));

		System.out.println(TYPE.INFORMATION.open(header, message, FontManager.TEXT_FONT));

		System.out.println(TYPE.CONFIRM.open(message));
		System.out.println(TYPE.CONFIRM.open(header, ""));
		System.out.println(TYPE.CONFIRM.open(header, message));

		System.out.println(TYPE.QUESTION.open(message));
		System.out.println(TYPE.QUESTION.open(header, ""));
		System.out.println(TYPE.QUESTION.open(header, message));

	}


}