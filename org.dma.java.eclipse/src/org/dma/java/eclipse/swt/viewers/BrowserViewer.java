/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.eclipse.swt.viewers;

import java.util.LinkedHashMap;

import org.dma.java.eclipse.swt.custom.CustomBrowser;
import org.dma.java.eclipse.swt.custom.CustomCTabItem;
import org.dma.java.eclipse.swt.graphics.SWTImageUtils;
import org.dma.java.utils.Debug;
import org.dma.java.utils.awt.ImageUtils;

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

public abstract class BrowserViewer extends LinkedHashMap<CustomCTabItem, CustomBrowser> {

	private static final long serialVersionUID = 1L;

	public abstract IToolBarManager getToolBarManager();

	private String homeUrl;
	private CTabFolder tabFolder;

	private Action button_home;
	private Action button_stop;
	private Action button_back;
	private Action button_forward;

	private final int iconSize;

	public BrowserViewer(Composite parent, int iconSize) {

		this.iconSize=iconSize;

		try{
			createToolBar();
			createTabFolder(parent);
			createBrowser();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private void dispose(CTabItem tabItem) {

		Debug.out("DISPOSE", tabItem);
		Browser browser=get(tabItem);
		if (browser!=null) browser.dispose();
		tabItem.dispose();
		remove(tabItem);
		Debug.out("SIZE", size());

	}


	public void dispose() {

		while(!isEmpty()){
			CTabItem tabItem=keySet().iterator().next();
			dispose(tabItem);
		}
		tabFolder.dispose();

	}


	private void createToolBar() {

		button_home=new Action("Home"){
			public final void run(){
				goHome();
			}
		};

		button_stop=new Action("Stop"){
			public final void run(){
				getBrowser().stop();
			}
		};

		button_back=new Action("Back"){
			public final void run(){
				getBrowser().back();
			}
		};

		button_forward=new Action("Forward"){
			public final void run(){
				getBrowser().forward();
			}
		};

		button_home.setImageDescriptor(SWTImageUtils.getImageDescriptor(
				ImageUtils.resizeImage(BrowserViewer.class, "icons/browser_home.png", iconSize)));
		button_stop.setImageDescriptor(SWTImageUtils.getImageDescriptor(
				ImageUtils.resizeImage(BrowserViewer.class, "icons/browser_stop.png", iconSize)));
		button_back.setImageDescriptor(SWTImageUtils.getImageDescriptor(
				ImageUtils.resizeImage(BrowserViewer.class, "icons/browser_back.png", iconSize)));
		button_forward.setImageDescriptor(SWTImageUtils.getImageDescriptor(
				ImageUtils.resizeImage(BrowserViewer.class, "icons/browser_forward.png", iconSize)));

		//toolbar
		IToolBarManager toolBar=getToolBarManager();
		toolBar.add(button_home);
		toolBar.add(button_stop);
		toolBar.add(button_back);
		toolBar.add(button_forward);

	}


	private void updateToolBar() {

		Browser browser=getBrowser();
		//browser may not exist!
		button_home.setEnabled(browser!=null);
		button_stop.setEnabled(browser!=null);
		button_back.setEnabled(browser!=null && browser.isBackEnabled());
		button_forward.setEnabled(browser!=null && browser.isForwardEnabled());

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
				updateToolBar();
				setFocus();
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				Debug.out("DEFAULT SELECTED");
			}
		});

	}


	private CustomBrowser createBrowser() {

		CustomBrowser browser=null;

		final CustomCTabItem tabItem=new CustomCTabItem(tabFolder);
		tabItem.setShowClose(!isEmpty());
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
					updateToolBar();
				}
			});
			browser.addTitleListener(new TitleListener(){
				public void changed(TitleEvent event) {
					CTabItem tabItem=tabFolder.getSelection();
					Debug.out("CHANGED", tabItem);
					tabItem.setText(getBrowser().getUrl());
					updateToolBar();
					setFocus();
				}
			});

			tabItem.setControl(browser);

		}catch(Exception e){
			tabItem.setText("Browser could not be created!");
		}

		tabFolder.setSelection(size());
		put(tabItem, browser);
		updateToolBar();

		return browser;

	}


	public Browser getBrowser() {
		return get(tabFolder.getSelection());
	}


	public void setFocus() {
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser==null) return;
		browser.setFocus();
	}


	public void setInvisible() {
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser==null) return;
		browser.setVisible(false);
		browser.setBounds(0, 0, 1, 1);
	}


	public void goHome(String homeUrl) {
		this.homeUrl=homeUrl;
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser==null) return;
		browser.setUrl(homeUrl);
	}


	public void goHome() {
		goHome(homeUrl);
	}


}