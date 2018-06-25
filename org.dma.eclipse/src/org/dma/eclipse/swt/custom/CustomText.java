/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.custom;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class CustomText extends Text {

	@Override //subclassing
	protected void checkSubclass() {}

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


}