/*******************************************************************************
 * 2008-2010 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.copypaste;

import org.dma.utils.eclipse.Debug;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CopyPasteManager {

	private final ICopyPasteSupport header;
	private final TabFolder tabFolder;
	private int currentTabIndex=-1;

	Listener tabfolderListener=new Listener() {

		public void handleEvent(Event event) {
			try {
				if(tabFolder!=null)
					currentTabIndex=tabFolder.getSelectionIndex();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	};


	public CopyPasteManager(ICopyPasteSupport header, TabFolder tabFolder) {
		this.header=header;
		this.tabFolder=tabFolder;
		this.tabFolder.addListener(SWT.Selection, tabfolderListener);
		this.currentTabIndex=this.tabFolder.getSelectionIndex();
	}


	public CopyPasteManager(TabFolder tabfolder) {
		this.header=null;
		this.tabFolder=tabfolder;
		this.tabFolder.addListener(SWT.Selection, tabfolderListener);
	}


	public CopyPasteManager(ICopyPasteSupport header) {
		this.header=header;
		this.tabFolder=null;
	}


	public void removeTabCopyPasteSupport() {
		this.tabFolder.removeListener(SWT.Selection, tabfolderListener);
	}








	//executions
	public void executeCopy() {

		Debug.info("currentTabIndex", currentTabIndex);

		if(currentTabIndex!=-1) {

			TabItem currentTabItem=tabFolder.getItem(currentTabIndex);

			if(currentTabItem instanceof ICopyPaste)
				((ICopyPaste) currentTabItem).getCopyPasteSupport().executeCopy();
		}

		if(header!=null)
			header.executeCopy();

	}


	public void executePaste() {

		Debug.info("currentTabIndex", currentTabIndex);

		if(currentTabIndex!=-1) {

			TabItem currentTabItem=tabFolder.getItem(currentTabIndex);

			if(currentTabItem instanceof ICopyPaste)
				((ICopyPaste) currentTabItem).getCopyPasteSupport().executePaste();

		}

		if(header!=null)
			header.executePaste();

	}


}
