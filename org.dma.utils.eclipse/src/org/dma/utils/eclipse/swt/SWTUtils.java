/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.custom.CCombo;

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


}
