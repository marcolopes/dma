/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.viewers;

import org.apache.commons.collections15.map.LinkedMap;
import org.dma.utils.eclipse.swt.custom.CustomAction;
import org.dma.utils.eclipse.swt.custom.CustomBrowser;
import org.dma.utils.eclipse.swt.graphics.SWTImageUtils;
import org.dma.utils.java.Debug;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.TitleEvent;
import org.eclipse.swt.browser.TitleListener;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Adapter;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public abstract class BrowserViewer {

	public abstract IToolBarManager getToolBarManager();

	private String homeUrl;
	private CTabFolder tabFolder;
	private final LinkedMap<CTabItem, Browser> tabMap=new LinkedMap();

	private Action button_home;
	private Action button_stop;
	private Action button_back;
	private Action button_forward;

	public BrowserViewer(Composite parent) {
		try{
			createTabFolder(parent);
			createToolbarManager();
			createBrowser();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public void dispose() {
		try{
			tabFolder.dispose();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public void createTabFolder(Composite parent) {
		try{
			Composite composite=new Composite(parent, SWT.NONE);
			composite.setLayout(new FillLayout());

			tabFolder=new CTabFolder(composite, SWT.NONE);
			tabFolder.pack();
			//tabFolder.setBorderVisible(true);
			tabFolder.setSimple(false);

			tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
				public void close(CTabFolderEvent event) {
					Debug.out("CLOSE");
					//dispose control (Browser)
					tabMap.getValue(tabFolder.getSelectionIndex()).dispose();
					//remove TabItem
					tabMap.remove(tabFolder.getSelectionIndex());
				}
			});
			tabFolder.addSelectionListener(new SelectionListener(){
				public void widgetSelected(SelectionEvent e) {
					Debug.out("SELECTED");
					setFocus();
					updateToolbar(getBrowser()!=null);
				}
				public void widgetDefaultSelected(SelectionEvent e) {
					Debug.out("DEFAULT SELECTED");
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private Browser createBrowser() {

		Browser browser=null;

		final CTabItem tabItem=new CTabItem(tabFolder, SWT.NONE);
		tabItem.setShowClose(tabMap.size()>0);
		tabItem.setText("Loading...");

		try{
			//test browser creation failure
			//if (tabMap.size()>=0) throw new Exception();

			browser=new CustomBrowser(tabFolder);
			//listeners are not created if browser throws exception
			browser.addOpenWindowListener(new OpenWindowListener() {
				public void open(WindowEvent event) {
					Debug.out("OPEN");
					event.browser=createBrowser();
					updateToolbar(getBrowser()!=null);
				}
			});
			browser.addTitleListener(new TitleListener(){
				public void changed(TitleEvent event) {
					Debug.out("CHANGED");
					CTabItem tabItem=tabMap.get(tabFolder.getSelectionIndex());
					tabItem.setText(getBrowser().getUrl());
					setFocus();
					updateToolbar(getBrowser()!=null);
				}
			});

			tabItem.setControl(browser);

		}catch(Exception e){
			/*
			 * If the browser cannot be created, an external browser is used
			 * but that is what we are currently avoiding by creating a new one :-\
			 */
			tabItem.setText("Browser could not be created!");
		}

		tabFolder.setSelection(tabMap.size());
		tabMap.put(tabItem, browser);

		return browser;

	}


	private void createToolbarManager(){

		try{
			//toolbar
			IToolBarManager toolbarManager=getToolBarManager();

			button_home=new CustomAction(){
				public final void run(){
					goHome();
				}
			};
			button_home.setToolTipText("Home");
			button_home.setImageDescriptor(SWTImageUtils.getImageDescriptor(
					BrowserViewer.class, "icons/browser_home.png"));
			toolbarManager.add(button_home);

			button_stop=new CustomAction(){
				public final void run(){
					getBrowser().stop();
				}
			};
			button_stop.setToolTipText("Stop");
			button_stop.setImageDescriptor(SWTImageUtils.getImageDescriptor(
					BrowserViewer.class, "icons/browser_stop.png"));
			toolbarManager.add(button_stop);

			button_back=new CustomAction(){
				public final void run(){
					getBrowser().back();
				}
			};
			button_back.setToolTipText("Back");
			button_back.setImageDescriptor(SWTImageUtils.getImageDescriptor(
					BrowserViewer.class, "icons/browser_back.png"));
			toolbarManager.add(button_back);

			button_forward=new CustomAction(){
				public final void run(){
					getBrowser().forward();
				}
			};
			button_forward.setToolTipText("Forward");
			button_forward.setImageDescriptor(SWTImageUtils.getImageDescriptor(
					BrowserViewer.class, "icons/browser_forward.png"));
			toolbarManager.add(button_forward);

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private void updateToolbar(boolean enabled){

		try{
			final Action[] buttons=new Action[]{
				button_home, button_stop, button_back, button_forward};

			for(int i=0; i<buttons.length; i++){
				if (buttons[i]!=null)
					buttons[i].setEnabled(enabled);
			}

			button_back.setEnabled(getBrowser().isBackEnabled());
			button_forward.setEnabled(getBrowser().isForwardEnabled());

		}catch(Exception e){
			e.printStackTrace();
		}
	}




	//browser
	public void setFocus() {
		//browser may not exist!
		if (getBrowser()!=null){
			getBrowser().setFocus();
		}
	}


	public void setInvisible() {
		//browser may not exist!
		if (getBrowser()!=null){
			getBrowser().setVisible(false);
			getBrowser().setBounds(0, 0, 1, 1);
		}
	}


	public void goHome(String homeUrl) {
		this.homeUrl=homeUrl;
		//browser may not exist!
		if (getBrowser()!=null){
			getBrowser().setUrl(homeUrl);
		}
	}


	public void goHome() {
		goHome(homeUrl);
	}


	public Browser getBrowser() {
		return tabMap.getValue(tabFolder.getSelectionIndex());
	}


}