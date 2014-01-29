/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.LinkedHashMap;

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

public abstract class BrowserViewer extends LinkedHashMap<CTabItem, Browser> {

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


	private void dispose(CTabItem tabItem) {

		Debug.out("DISPOSE", tabItem);
		Browser browser=get(tabItem);
		if (browser!=null){
			browser.dispose();
		}
		tabItem.dispose();
		remove(tabItem);
		Debug.out("SIZE", size());

	}


	public void dispose() {

		while(size()>0){
			CTabItem tabItem=keySet().iterator().next();
			dispose(tabItem);
		}
		tabFolder.dispose();

	}


	private void createToolbarManager(){

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

	}


	private void updateToolbar(boolean enabled){

		button_home.setEnabled(enabled);
		button_stop.setEnabled(enabled);
		button_back.setEnabled(getBrowser().isBackEnabled());
		button_forward.setEnabled(getBrowser().isForwardEnabled());

	}


	public void createTabFolder(Composite parent) {

		Composite composite=new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());

		tabFolder=new CTabFolder(composite, SWT.NONE);
		tabFolder.pack();
		tabFolder.setBorderVisible(false);
		tabFolder.setSimple(false);

		tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
			public void close(CTabFolderEvent event) {
				CTabItem tabItem=(CTabItem)event.item;
				Debug.out("CLOSE", tabItem);
				dispose(tabItem);
			}
		});
		tabFolder.addSelectionListener(new SelectionListener(){
			public void widgetSelected(SelectionEvent e) {
				CTabItem tabItem=(CTabItem)e.item;
				Debug.out("SELECTED", tabItem);
				updateToolbar(getBrowser()!=null);
				setFocus();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				Debug.out("DEFAULT SELECTED");
			}
		});

	}


	private Browser createBrowser() {

		Browser browser=null;

		final CTabItem tabItem=new CTabItem(tabFolder, SWT.NONE);
		tabItem.setShowClose(size()>0);
		tabItem.setText("Loading...");

		try{
			//browser creation failure test
			//if (size()>=0) throw new Exception();

			browser=new CustomBrowser(tabFolder);

			//listeners are not created if browser throws exception
			browser.addOpenWindowListener(new OpenWindowListener(){
				//avoid external browser creation
				public void open(WindowEvent event) {
					event.browser=createBrowser();
					Debug.out("OPEN", event.browser);
					updateToolbar(getBrowser()!=null);
				}
			});
			browser.addTitleListener(new TitleListener(){
				public void changed(TitleEvent event) {
					CTabItem tabItem=tabFolder.getSelection();
					Debug.out("CHANGED", tabItem);
					tabItem.setText(getBrowser().getUrl());
					updateToolbar(getBrowser()!=null);
					setFocus();
				}
			});

			tabItem.setControl(browser);

		}catch(Exception e){
			tabItem.setText("Browser could not be created!");
		}

		tabFolder.setSelection(size());
		put(tabItem, browser);

		return browser;

	}


	public Browser getBrowser() {
		return get(tabFolder.getSelection());
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