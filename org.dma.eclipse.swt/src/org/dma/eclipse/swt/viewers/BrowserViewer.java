/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import org.apache.commons.collections15.map.LinkedMap;
import org.dma.eclipse.swt.custom.CustomAction;
import org.dma.eclipse.swt.custom.CustomBrowser;
import org.dma.eclipse.swt.graphics.SWTImageUtils;
import org.dma.java.utils.Debug;
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

public abstract class BrowserViewer extends LinkedMap<CTabItem, Browser> {

	private static final long serialVersionUID = 1L;

	public abstract IToolBarManager getToolBarManager();

	private String homeUrl;
	private CTabFolder tabFolder;

	private Action button_home;
	private Action button_stop;
	private Action button_back;
	private Action button_forward;

	public BrowserViewer(Composite parent) {
		try{
			createToolbarManager();
			createTabFolder(parent);
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


	private void createToolbarManager(){
		try{
			button_home=new CustomAction("Home", SWTImageUtils.getImageDescriptor(
				BrowserViewer.class, "icons/browser_home.png")){
				public final void run(){
					goHome();
				}
			};

			button_stop=new CustomAction("Stop", SWTImageUtils.getImageDescriptor(
				BrowserViewer.class, "icons/browser_stop.png")){
				public final void run(){
					getBrowser().stop();
				}
			};

			button_back=new CustomAction("Back", SWTImageUtils.getImageDescriptor(
				BrowserViewer.class, "icons/browser_back.png")){
				public final void run(){
					getBrowser().back();
				}
			};

			button_forward=new CustomAction("Forward", SWTImageUtils.getImageDescriptor(
				BrowserViewer.class, "icons/browser_forward.png")){
				public final void run(){
					getBrowser().forward();
				}
			};

			//toolbar
			IToolBarManager toolbarManager=getToolBarManager();
			toolbarManager.add(button_home);
			toolbarManager.add(button_stop);
			toolbarManager.add(button_back);
			toolbarManager.add(button_forward);

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private void updateToolbar(boolean enabled){
		try{
			button_home.setEnabled(enabled);
			button_stop.setEnabled(enabled);
			button_back.setEnabled(getBrowser().isBackEnabled());
			button_forward.setEnabled(getBrowser().isForwardEnabled());

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
			tabFolder.setBorderVisible(false);
			tabFolder.setSimple(false);

			tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
				public void close(CTabFolderEvent event) {
					Debug.out("CLOSE");
					//dispose control (Browser)
					getValue(tabFolder.getSelectionIndex()).dispose();
					//remove TabItem
					remove(tabFolder.getSelectionIndex());
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
		tabItem.setShowClose(size()>0);
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
					CTabItem tabItem=get(tabFolder.getSelectionIndex());
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

		tabFolder.setSelection(size());
		put(tabItem, browser);

		return browser;

	}


	public Browser getBrowser() {
		return getValue(tabFolder.getSelectionIndex());
	}


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


}