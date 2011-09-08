/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.copypaste;

import java.util.Iterator;
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

		Iterator<ICopyPaste> iterator=itemMap.keySet().iterator();
		while(iterator.hasNext()){

			ICopyPaste element=iterator.next();
			if (itemMap.get(element).getControl().isVisible())
				element.executeCopy();
		}

	}


	public void executePaste() {

		header.executePaste();

		Iterator<ICopyPaste> iterator=itemMap.keySet().iterator();
		while(iterator.hasNext()){

			ICopyPaste element=iterator.next();
			if (itemMap.get(element).getControl().isVisible())
				element.executePaste();
		}

	}


}
