/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
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
 */
public class UIHelper extends UIHacker {

	/*
	 * IWorkbench
	 */
	public static Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}

	public static IWorkbenchHelpSystem getHelpSystem() {
		return PlatformUI.getWorkbench().getHelpSystem();
	}


	/*
	 * IWorkbenchWindow
	 */
	public static IWorkbenchWindow getWorkbenchWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
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
		return PlatformUI.getWorkbench().getPerspectiveRegistry().findPerspectiveWithId(perspectiveId);
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


	/*
	 * IViewReference
	 */
	public static IViewReference findViewReference(String viewId, String secondaryId) {
		return getActivePage().findViewReference(viewId, secondaryId);
	}

	public static IViewReference findViewReference(String viewId) {
		return findViewReference(viewId, null);
	}

	public static void hideView(IViewReference view) {
		getActivePage().hideView(view);
	}


	/*
	 * IViewPart
	 */
	public static IViewPart showView(String viewId, String secondaryId) throws Exception {
		return getActivePage().showView(viewId, secondaryId, IWorkbenchPage.VIEW_ACTIVATE);
	}

	public static IViewPart showView(String viewId) throws Exception {
		return showView(viewId, null);
	}

	public static void hideView(IViewPart view) {
		getActivePage().hideView(view);
	}

	public static IViewPart findView(String viewId) {
		return getActivePage().findView(viewId);
	}

	public static boolean isViewOpen(IViewPart view) {
		return findViewReference(view.getViewSite().getId(), view.getViewSite().getSecondaryId())!=null;
	}


}