/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.copypaste;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.swt.widgets.TabItem;

public class CopyPasteManager {

	private final ICopyPaste header;
	private final Map<ICopyPaste, TabItem> itemMap=new LinkedHashMap();

	public CopyPasteManager(ICopyPaste header) {
		this.header=header;
	}


	public void add(ICopyPaste element, TabItem item) {
		itemMap.put(element, item);
	}



	public void executeCopy() {

		header.executeCopy();

		for(ICopyPaste element: itemMap.keySet()){

			TabItem item=itemMap.get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executeCopy();
			}

		}

	}


	public void executePaste() {

		header.executePaste();

		for(ICopyPaste element: itemMap.keySet()){

			TabItem item=itemMap.get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executePaste();
			}

		}

	}


}
