/*******************************************************************************
 * 2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.apache.commons.collections15.map.LinkedMap;
import org.dma.utils.eclipse.core.resources.ResourceManager;
import org.dma.utils.java.Debug;
import org.eclipse.jface.action.IAction;
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
import org.eclipse.ui.part.ViewPart;

public abstract class CustomBrowserView extends ViewPart {

	private String url;

	private CTabFolder tabFolder;
	private final LinkedMap<Browser, CTabItem> browserMap=new LinkedMap();

	private IAction button_back;
	private IAction button_forward;

	public abstract String getHomeIcon();
	public abstract String getStopIcon();
	public abstract String getBackIcon();
	public abstract String getForwardIcon();

	public void createPartControl(Composite parent) {
		try{
			createTabFolder(parent);
			createToolbarManager();
			createBrowser();

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public void createTabFolder(Composite parent) {
		try{
			Composite container=new Composite(parent, SWT.NONE);
			container.setLayout(new FillLayout());

			tabFolder=new CTabFolder(container, SWT.NONE);
			tabFolder.pack();
			//tabFolder.setBorderVisible(true);
			tabFolder.setSimple(false);

			tabFolder.addCTabFolder2Listener(new CTabFolder2Adapter() {
				public void close(CTabFolderEvent event) {
					Debug.info("### CLOSE ###");
					browserMap.remove(tabFolder.getSelectionIndex());
				}
			});
			tabFolder.addSelectionListener(new SelectionListener(){
				public void widgetSelected(SelectionEvent e) {
					Debug.info("### SELECTED ###");
					getBrowser().setFocus();
					updateToolbar();
				}
				public void widgetDefaultSelected(SelectionEvent e) {
					Debug.info("### DEFAULT SELECTED ###");
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private Browser createBrowser() {

		final CTabItem tabItem=new CTabItem(tabFolder, SWT.NONE);
		tabItem.setShowClose(browserMap.size()>0);
		tabItem.setText("Loading...");

		try{
			//Composite container=new Composite(tabFolder, SWT.NONE);
			//container.setLayout(new FillLayout());

			int x;
			if (browserMap.size()>1) x=1/0;

			Browser browser=new Browser(tabFolder, SWT.NONE);

			//listeners are not created if browser throws exception
			browser.addOpenWindowListener(new OpenWindowListener() {
				public void open(WindowEvent event) {
					Debug.info("### OPEN ###");
					/*
					 * If the browser cannot be created, an external browser is used
					 * and that is what we are currently avoiding by creating a new one!
					 */
					event.browser=createBrowser();
					updateToolbar();
				}
			});
			browser.addTitleListener(new TitleListener(){
				public void changed(TitleEvent event) {
					Debug.info("### CHANGED ###");
					CTabItem tabItem=browserMap.getValue(tabFolder.getSelectionIndex());
					tabItem.setText(getBrowser().getUrl());
					getBrowser().setFocus();
					updateToolbar();
				}
			});

			tabItem.setControl(browser);
			tabFolder.setSelection(browserMap.size());
			browserMap.put(browser, tabItem);

			return browser;

		}catch(Exception e){
			e.printStackTrace();
		}

		//tabItem must no be created to avoid tabFolder listeners
		tabItem.dispose();

		return null;

	}


	private void createToolbarManager(){

		try{
			//toolbar
			IToolBarManager toolbarManager=getViewSite().getActionBars().getToolBarManager();

			if (getHomeIcon()!=null){
				IAction button_home=new CustomAction(){
					public final void run(){
						goHome();
					}
				};
				button_home.setToolTipText("Home");
				button_home.setImageDescriptor(ResourceManager.getImageDescriptor(getHomeIcon()));
				toolbarManager.add(button_home);
			}

			if (getStopIcon()!=null){
				IAction button_stop=new CustomAction(){
					public final void run(){
						getBrowser().stop();
					}
				};
				button_stop.setToolTipText("Stop");
				button_stop.setImageDescriptor(ResourceManager.getImageDescriptor(getStopIcon()));
				toolbarManager.add(button_stop);
			}

			if (getBackIcon()!=null){
				button_back=new CustomAction(){
					public final void run(){
						Debug.info("### BACK ###", getBrowser().isBackEnabled());
						getBrowser().back();
					}
				};
				button_back.setToolTipText("Back");
				button_back.setImageDescriptor(ResourceManager.getImageDescriptor(getBackIcon()));
				toolbarManager.add(button_back);
			}

			if (getForwardIcon()!=null){
				button_forward=new CustomAction(){
					public final void run(){
						Debug.info("### FORWARD ###", getBrowser().isForwardEnabled());
						getBrowser().forward();
					}
				};
				button_forward.setToolTipText("Forward");
				button_forward.setImageDescriptor(ResourceManager.getImageDescriptor(getForwardIcon()));
				toolbarManager.add(button_forward);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private void updateToolbar(){

		try{
			if (button_back!=null)
				button_back.setEnabled(getBrowser().isBackEnabled());

			if (button_forward!=null)
				button_forward.setEnabled(getBrowser().isForwardEnabled());

		}catch(Exception e){
			e.printStackTrace();
		}
	}




	//browser
	public void setInvisible() {
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser!=null){
			browser.setVisible(false);
			browser.setBounds(0, 0, 1, 1);
		}
	}


	public void goHome(String url) {
		this.url=url;
		Browser browser=getBrowser();
		//browser may not exist!
		if (browser!=null){
			browser.setUrl(url);
		}
	}


	public void goHome() {
		goHome(url);
	}


	public Browser getBrowser() {
		int index=tabFolder.getSelectionIndex();
		return index>=0 && index<browserMap.size() ? browserMap.get(index) : null;
	}


}