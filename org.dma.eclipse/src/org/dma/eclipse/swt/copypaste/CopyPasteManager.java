/*******************************************************************************
 * 2008-2016 Public Domain
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


	public void executeCopy() {

		for(ICopyPaste element: keySet()){

			TabItem item=get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executeCopy();
			}

		}

		header.executeCopy();

	}


	public void executePaste() {

		for(ICopyPaste element: keySet()){

			TabItem item=get(element);

			if (!item.isDisposed() && !item.getControl().isDisposed() &&
				item.getControl().isVisible()){
				element.executePaste();
			}

		}

		header.executePaste();

	}


}
