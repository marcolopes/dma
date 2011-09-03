/*******************************************************************************
 * 2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.apache.commons.collections15.map.LinkedMap;
import org.dma.utils.eclipse.core.resources.ResourceManager;
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

	private CTabFolder tabFolder;
	private final LinkedMap<CTabItem, Browser> browserMap=new LinkedMap();

	private String url;

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
					browserMap.remove(tabFolder.getSelectionIndex());
				}
			});
			tabFolder.addSelectionListener(new SelectionListener(){
				public void widgetSelected(SelectionEvent e) {
					getBrowser().setFocus();
				}
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private Browser createBrowser() {
		try{
			final CTabItem tabItem=new CTabItem(tabFolder, SWT.NONE);
			tabItem.setShowClose(browserMap.size()>0);
			tabItem.setText("Loading...");

			Composite container=new Composite(tabFolder, SWT.NONE);
			container.setLayout(new FillLayout());

			Browser browser=new Browser(tabFolder, SWT.NONE);
			tabItem.setControl(browser);
			tabFolder.setSelection(browserMap.size());

			browser.addOpenWindowListener(new OpenWindowListener() {
				public void open(WindowEvent event) {
					event.browser=createBrowser();
				}
			});
			browser.addTitleListener(new TitleListener(){
				public void changed(TitleEvent event) {
					browserMap.get(tabFolder.getSelectionIndex()).setText(getBrowser().getUrl());
				}
			});

			browser.setFocus();
			browserMap.put(tabItem, browser);

			return browser;

		}catch(Exception e){
			e.printStackTrace();
		}

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
				IAction button_back=new CustomAction(){
					public final void run(){
						getBrowser().back();
					}
				};
				button_back.setToolTipText("Back");
				button_back.setImageDescriptor(ResourceManager.getImageDescriptor(getBackIcon()));
				toolbarManager.add(button_back);
			}

			if (getForwardIcon()!=null){
				IAction button_forward=new CustomAction(){
					public final void run(){
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




	//browser
	public void setInvisible() {
		try{
			Browser browser=getBrowser();
			browser.setVisible(false);
			browser.setBounds(0, 0, 1, 1);

		} catch (Exception e){
			e.printStackTrace();
		}
	}


	public void goHome(String url) {
		try{
			this.url=url;
			getBrowser().setUrl(url);

		} catch (Exception e){
			e.printStackTrace();
		}
	}


	public void goHome() {
		goHome(url);
	}





	//getters and setters
	public Browser getBrowser() {
		return browserMap.getValue(tabFolder.getSelectionIndex());
	}


}