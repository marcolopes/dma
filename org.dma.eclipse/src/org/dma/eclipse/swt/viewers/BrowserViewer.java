/*******************************************************************************
 * Copyright 2008-2023 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.viewers;

import java.util.LinkedHashMap;

import org.dma.eclipse.Activator;
import org.dma.eclipse.jface.CustomAction;
import org.dma.eclipse.swt.widgets.CustomBrowser;
import org.dma.eclipse.swt.widgets.CustomCTabItem;
import org.dma.java.util.Debug;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public abstract class BrowserViewer extends LinkedHashMap<CustomCTabItem, CustomBrowser> {

	private static final long serialVersionUID = 1L;

	public abstract IToolBarManager getToolBarManager();

	private class BrowserAction extends CustomAction {

		public BrowserAction(String text, String iconName, int iconSize) {
			super(text);
			setImageDescriptor(Activator.getBufferedImage("icons/"+iconName, iconSize));
		}

	}

	private String url;

	private CTabFolder tabFolder;

	private CustomAction button_home;
	private CustomAction button_stop;
	private CustomAction button_back;
	private CustomAction button_forward;

	public BrowserViewer(Composite parent, int iconSize) {
		try{createToolBar(iconSize);
			createTabFolder(parent);
			createBrowser();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public void dispose(CTabItem tabItem) {

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
		}tabFolder.dispose();

	}

	private void createToolBar(int iconSize) {

		button_home=new BrowserAction("Home", "browser_home.png", iconSize){
			public final void run(){
				goHome();
			}
		};

		button_stop=new BrowserAction("Stop", "browser_stop.png", iconSize){
			public final void run(){
				getBrowser().stop();
			}
		};

		button_back=new BrowserAction("Back", "browser_back.png", iconSize){
			public final void run(){
				getBrowser().back();
			}
		};

		button_forward=new BrowserAction("Forward", "browser_forward.png", iconSize){
			public final void run(){
				getBrowser().forward();
			}
		};

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

		final Composite composite=new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());

		tabFolder=new CTabFolder(composite, SWT.NONE);
		tabFolder.pack();
		tabFolder.setBorderVisible(false);
		tabFolder.setSimple(false);

		tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
			@Override
			public void close(CTabFolderEvent event) {
				CTabItem tabItem=(CTabItem)event.item;
				Debug.out("CLOSE", tabItem);
				dispose(tabItem);
			}
		});
		tabFolder.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CTabItem tabItem=(CTabItem)e.item;
				Debug.out("SELECTED", tabItem);
				updateToolBar();
				setFocus();
			}
		});

	}


	private CustomBrowser createBrowser() {

		CustomBrowser browser=null;

		final CustomCTabItem tabItem=new CustomCTabItem(tabFolder, SWT.NONE);
		tabItem.setShowClose(!isEmpty());
		tabItem.setText("Loading...");

		try{//browser creation failure test
			//if (size()>=0) throw new Exception();

			browser=new CustomBrowser(tabFolder);

			//listeners are not created if browser throws exception
			browser.addOpenWindowListener(new OpenWindowListener(){
				@Override
				public void open(WindowEvent event) {
					//avoid external browser creation
					event.browser=createBrowser();
					Debug.out("OPEN", event.browser);
					updateToolBar();
				}
			});
			browser.addTitleListener(new TitleListener(){
				@Override
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
		if (browser!=null) browser.setFocus();
	}


	public void setInvisible() {
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser!=null){
			browser.setVisible(false);
			browser.setBounds(0, 0, 1, 1);
		}
	}


	public void browse(String url) {
		if (this.url==null) this.url=url;
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser!=null) browser.setUrl(url);
	}


	public void goHome() {
		browse(url);
	}


}