/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.widgets;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class CustomText extends Text {

	@Override //subclassing
	protected void checkSubclass() {}

	public enum FUNCTIONS {
		/** Move cursor 1 position back */
		BACK,
		/** Move cursor 1 position forward */
		FORWARD,
		/** Delete selected / before cursor chars */
		DELETE,
		/** Clear all chars */
		CLEAR;
	}

	/** @see Text#Text(Composite, int) */
	public CustomText(Composite parent, int style) {
		super(parent, style);
	}


	/**
	 * Creates a new font with the specified height.
	 * The font is automatically disposed when
	 * the associated control is disposed
	 */
	public void setFontSize(int height) {
		FontData[] fontData=getFont().getFontData();
		for(int i=0; i<fontData.length; ++i){
			fontData[i].setHeight(height);
		}
		final Font font=new Font(getDisplay(), fontData);
		// Since you created the font, you must dispose it
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				font.dispose();
			}
		});
		setFont(font);
	}


	public void function(FUNCTIONS function) {

		switch(function){
		case BACK: setSelection(getCaretPosition()-1); break;
		case FORWARD: setSelection(getCaretPosition()+1); break;
		case DELETE:
			//select 1 char before cursor
			if (getSelectionCount()==0) setSelection(getCaretPosition()-1, getCaretPosition());
			insert("");
			break;
		case CLEAR:
			selectAll();
			function(FUNCTIONS.DELETE);
			break;
		}

	}


}