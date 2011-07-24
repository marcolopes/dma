/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.copypaste;

import java.util.ArrayList;
import java.util.List;

public class CopyPasteManager {

	private final List<ICopyPaste> collection=new ArrayList();

	public CopyPasteManager(ICopyPaste header) {
		add(header);
	}


	public void add(ICopyPaste element) {
		collection.add(element);
	}





	//executions
	public void executeCopy() {

		for(int i=0; i<collection.size(); i++){

			collection.get(i).executeCopy();
		}
	}


	public void executePaste() {

		for(int i=0; i<collection.size(); i++){

			collection.get(i).executePaste();
		}
	}


}
