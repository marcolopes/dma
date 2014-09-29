/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.copypaste;

import java.util.LinkedHashMap;

import org.eclipse.swt.widgets.TabItem;

public class CopyPasteManager extends LinkedHashMap<ICopyPaste, TabItem> {

	private static final long serialVersionUID = 1L;

	private final ICopyPaste header;

	public CopyPasteManager(ICopyPaste header) {
		this.header=header;
	}


	public void add(ICopyPaste element, TabItem item) {
		put(element, item);
	}


	public void executeCopy() {

		header.executeCopy();

		for(ICopyPaste element: keySet()){

			TabItem item=get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executeCopy();
			}

		}

	}


	public void executePaste() {

		header.executePaste();

		for(ICopyPaste element: keySet()){

			TabItem item=get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executePaste();
			}

		}

	}


}
