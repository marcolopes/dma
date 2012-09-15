/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.dma.utils.eclipse.ui.UIHelper;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;

public class SWTUtils {

	public static int getComboIndex(CCombo ccombo){
		for(int i=0; i<ccombo.getItemCount(); i++) {
			if(ccombo.getItem(i).toLowerCase().equals(ccombo.getText().toLowerCase()))
				return i;
		}
		return 0;
	}


	public static int getComboIndex(ComboViewer comboviewer, String element){
		for(int i=0; i<comboviewer.getCombo().getItemCount(); i++) {
			if(comboviewer.getCombo().getItem(i).toString().equals(element))
				return i;
		}
		return 0;
	}


	public static String getComboString(CCombo ccombo){
		return ccombo.getItemCount()==0 ? "" : ccombo.getItem(getComboIndex(ccombo));
	}


	public static Font createFont(Control control, int height){

		FontData[] fontData = control.getFont().getFontData();

		for(int i=0; i<fontData.length; ++i)
		    fontData[i].setHeight(height);

		final Font font=new Font(UIHelper.getDisplay(), fontData);

		// Since you created the font, you must dispose it
		control.addDisposeListener(new DisposeListener() {
		    public void widgetDisposed(DisposeEvent e) {
		        font.dispose();
		    }
		});

		return font;

	}

}
