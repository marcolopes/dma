/*******************************************************************************
 * Copyright 2008-2021 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.eclipse.ui;

import java.net.URL;

import org.eclipse.core.runtime.dynamichelpers.IExtensionChangeHandler;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

/**
 * The term used to represent the entire UI is workbench.
 * The workbench itself has no physical manifestation, but the workbench object is used to
 * access most of the general APIs and services available in the generic UI.
 * The workbench is displayed in one or more workbench windows.
 * These basic top-level windows make up an Eclipse application.
 * Note that dialogs, wizards, and other transient pop-ups are not called workbench windows.
 * <p>
 * At the top of each window is the title bar, typically a native widget with a title and
 * controls for resizing and closing.
 * Next comes the menu bar, and after that is the cool bar.
 * The cool bar is a fancy term for a bar of buttons that can be dragged around and
 * reorganized across multiple lines. On the left, right, or bottom, depending on user
 * preference, is the fast view bar, where fast views—iconified views—are stored.
 * At the bottom is the status line, where various bits of information are shown;
 * the far-right corner of the status line is called the progress indicator.
 * <p>
 * The main body of a workbench window is represented by the workbench page,
 * which in turn is made up of workbench parts, which come in two varieties:
 * views and editors. The initial size and orientation of the parts in the page are
 * determined by a perspective.
 * <p>
 * Parts interact with the rest of the window via their site.
 * The site is not a visible entity but simply an API mechanism to separate the methods that
 * operate on the view from the methods that operate on controls and services outside the view.
 * This allows the workbench implementers to add new features to the sites without breaking
 * all the plug-ins that implement the parts. Figure 9.1 Spider graph shows how a view
 * (ContentOutline) and an editor (WelcomeEditor) each has its own site, which is hosted by
 * a page, inside a workbench window
 *
 * http://www.eclipse.org/articles/Article-UI-Workbench/workbench.html
 */
public class UIHelper {

	/*
	 * IWorkbench
	 */
	/** @see PlatformUI#getWorkbench */
	public static IWorkbench getWorkbench() {
		try{return PlatformUI.getWorkbench();
		}catch(Exception e){
			e.printStackTrace();
		}return null;
	}

	/** @see IWorkbench#getDisplay */
	public static Display getDisplay() {
		return getWorkbench().getDisplay();
	}

	/** @see IWorkbench#getHelpSystem */
	public static IWorkbenchHelpSystem getHelpSystem() {
		return getWorkbench().getHelpSystem();
	}

	/** @see IWorkbench#isClosing */
	public static boolean isWorkbenchClosing() {
		return getWorkbench().isClosing();
	}

	/** @see BusyIndicator */
	public static void showBusyWhile(Runnable runnable) {
		BusyIndicator.showWhile(getDisplay(), runnable);
	}

	public static boolean openWorkbenchBrowser(URL url) {
		try{IWorkbenchBrowserSupport browserSupport=getWorkbench().getBrowserSupport();
			IWebBrowser browser=browserSupport.createBrowser(url.toString());
			browser.openURL(url);
			return true;
		}catch(PartInitException e){
			e.printStackTrace();
		}return false;
	}



	/*
	 * IWorkbenchWindow
	 */
	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getWorkbench().getActiveWorkbenchWindow();
	}

	public static IWorkbenchPage getActivePage() {
		return getActiveWorkbenchWindow().getActivePage();
	}

	public static Shell getWorkbenchShell() {
		return getActiveWorkbenchWindow().getShell();
	}



	/*
	 * IPerspectiveDescriptor
	 */
	public static IPerspectiveDescriptor findPerspectiveWithId(String perspectiveId) {
		return getWorkbench().getPerspectiveRegistry().findPerspectiveWithId(perspectiveId);
	}

	public static void removePerspective(String perspectiveId) {
		IExtensionChangeHandler handler=(IExtensionChangeHandler)getWorkbench().getPerspectiveRegistry();
		handler.removeExtension(null, new Object[]{findPerspectiveWithId(perspectiveId)});
	}

	public static IPerspectiveDescriptor[] getOpenPerspectives() {
		return getActivePage().getOpenPerspectives();
	}

	public static boolean isPerspectiveOpen(String perspectiveId) {
		for (IPerspectiveDescriptor perspective: getOpenPerspectives()) {
			if (perspective.getId().equals(perspectiveId)) return true;
		}return false;
	}

	public static void setPerspective(IPerspectiveDescriptor perspective) {
		getActivePage().setPerspective(perspective);
	}

	public static void setPerspective(String perspectiveId) {
		setPerspective(findPerspectiveWithId(perspectiveId));
	}

	/** Returns the active perspective */
	public static IPerspectiveDescriptor closePerspective(IPerspectiveDescriptor perspective) {
		getActivePage().closePerspective(perspective, false, false);
		return getActivePage().getPerspective();
	}

	/** Returns the active perspective */
	public static IPerspectiveDescriptor closePerspective(String perspectiveId) {
		return closePerspective(findPerspectiveWithId(perspectiveId));
	}

	public static void resetPerspective() {
		getActivePage().resetPerspective();
	}



	/*
	 * IViewReference
	 */
	public static IViewReference findViewReference(String viewId, String secondaryId) {
		return getActivePage().findViewReference(viewId, secondaryId);
	}

	public static IViewReference findViewReference(String viewId) {
		return findViewReference(viewId, null);
	}

	public static boolean isViewOpen(String viewId, String secondaryId) {
		return findViewReference(viewId, secondaryId)!=null;
	}

	public static boolean isViewOpen(String viewId) {
		return findViewReference(viewId)!=null;
	}

	public static void hideView(IViewReference view) {
		getActivePage().hideView(view);
	}

	public static void hideView(String viewId, String secondaryId) {
		hideView(findViewReference(viewId, secondaryId));
	}

	public static void hideView(String viewId) {
		hideView(findViewReference(viewId));
	}



	/*
	 * IViewPart
	 */
	public static boolean isViewOpen(IViewPart view) {
		return isViewOpen(view.getViewSite().getId(), view.getViewSite().getSecondaryId());
	}

	public static IViewPart openView(String viewId, String secondaryId) throws Exception {
		return getActivePage().showView(viewId, secondaryId, IWorkbenchPage.VIEW_VISIBLE);
	}

	public static IViewPart openView(String viewId) throws Exception {
		return openView(viewId, null);
	}

	public static IViewPart showView(String viewId, String secondaryId) throws Exception {
		return getActivePage().showView(viewId, secondaryId, IWorkbenchPage.VIEW_ACTIVATE);
	}

	public static IViewPart showView(String viewId) throws Exception {
		return showView(viewId, null);
	}

	public static void showView(IViewPart view) throws Exception {
		showView(view.getViewSite().getId(), view.getViewSite().getSecondaryId());
	}

	public static void hideView(IViewPart view) {
		getActivePage().hideView(view);
	}


}