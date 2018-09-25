/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.ui;

import org.dma.java.util.Debug;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.dynamichelpers.IExtensionChangeHandler;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.internal.PerspectiveBarManager;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;

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
@SuppressWarnings("restriction")
public class UIHelper {

	public static ToolBar getPerspectiveToolBar() {
		try{
			WorkbenchWindow workbenchWindow=(WorkbenchWindow)getWorkbenchWindow();
			PerspectiveBarManager manager=workbenchWindow.getPerspectiveBar();
			return manager.getControl();
		}catch(Exception e){
			System.err.println(e);
		}

		return null;
	}


	//ECLIPSE BUG: https://bugs.eclipse.org/bugs/show_bug.cgi?id=341030
	public static void disablePerspectiveToolBarMenu() {
		ToolBar toolBar=getPerspectiveToolBar();
		if (toolBar!=null) try{
			for (Listener listener: toolBar.getListeners(SWT.MenuDetect)){
				toolBar.removeListener(SWT.MenuDetect, listener);
				Debug.out("REMOVED", listener.toString());
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}


	public static void setPerspectiveToolBarEnabled(boolean enabled) {
		try{
			ToolBar toolBar=getPerspectiveToolBar();
			toolBar.setEnabled(enabled);
		}catch(Exception e){
			System.err.println(e);
		}
	}


	/**
	 * Adds all other perspective shortcuts to the layout
	 * so they can be present in the PerspectiveBarManager
	 */
	public static void addOtherPerspectiveShortcuts(String perspectiveId, IPageLayout layout) {
		for (IConfigurationElement element: Platform.getExtensionRegistry().
				getConfigurationElementsFor("org.eclipse.ui.perspectives")) try{
			String id=element.getAttribute("id");
			if (!id.equals(perspectiveId)){
				layout.addPerspectiveShortcut(id);
				Debug.out("ADDED", id);
			}

		}catch(Exception e){
			System.err.println(e);
		}
	}


	public static void removePreferenceManagerNodes() {
		PreferenceManager manager=getWorkbench().getPreferenceManager();
		if (manager!=null) try{
			for (IPreferenceNode node: manager.getRootSubNodes()){
				manager.remove(node);
				Debug.out("REMOVED", node.getId());
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}


	public static void saveWorkspaceState(boolean full) {
		try{
			ResourcesPlugin.getWorkspace().save(full, null);
		}catch(Exception e){
			System.err.println(e);
		}
	}


	/*
	 * IWorkbench
	 */
	/** @see PlatformUI#getWorkbench */
	public static IWorkbench getWorkbench() {
		try{
			return PlatformUI.getWorkbench();
		}catch(Exception e){
			System.err.println(e);
		}return null;
	}

	/** @see Workbench#getDisplay */
	public static Display getDisplay() {
		return getWorkbench().getDisplay();
	}

	/** @see Workbench#getHelpSystem */
	public static IWorkbenchHelpSystem getHelpSystem() {
		return getWorkbench().getHelpSystem();
	}

	/** @see Workbench#isClosing */
	public static boolean isWorkbenchClosing() {
		return getWorkbench().isClosing();
	}

	/** @see BusyIndicator */
	public static void showBusyWhile(Runnable runnable) {
		BusyIndicator.showWhile(getDisplay(), runnable);
	}



	/*
	 * IWorkbenchWindow
	 */
	public static IWorkbenchWindow getWorkbenchWindow() {
		return getWorkbench().getActiveWorkbenchWindow();
	}

	public static IWorkbenchPage getActivePage() {
		return getWorkbenchWindow().getActivePage();
	}

	public static Shell getWorkbenchShell() {
		return getWorkbenchWindow().getShell();
	}



	/*
	 * IPerspectiveDescriptor
	 */
	public static IPerspectiveDescriptor findPerspectiveWithId(String perspectiveId) {
		return getWorkbench().getPerspectiveRegistry().findPerspectiveWithId(perspectiveId);
	}

	public static boolean isPerspectiveOpen(String perspectiveId) {
		for (IPerspectiveDescriptor perspective: getActivePage().getOpenPerspectives()) {
			if (perspective.getId().equals(perspectiveId)) return true;
		}
		return false;
	}

	public static void setPerspective(IPerspectiveDescriptor perspective) {
		getActivePage().setPerspective(perspective);
	}

	public static void setPerspective(String perspectiveId) {
		getActivePage().setPerspective(findPerspectiveWithId(perspectiveId));
	}

	public static void closePerspective(IPerspectiveDescriptor perspective) {
		getActivePage().closePerspective(perspective,false,false);
	}

	public static void closePerspective(String perspectiveId) {
		closePerspective(findPerspectiveWithId(perspectiveId));
	}

	public static void removePerspective(String perspectiveId) {
		IExtensionChangeHandler handler=(IExtensionChangeHandler)getWorkbench().getPerspectiveRegistry();
		handler.removeExtension(null, new Object[]{findPerspectiveWithId(perspectiveId)});
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

	public static void detachView(IViewPart view) {
		WorkbenchPage page=(WorkbenchPage)view.getViewSite().getPage();
		page.detachView(findViewReference(view.getViewSite().getId(), view.getViewSite().getSecondaryId()));
	}


}