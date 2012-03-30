/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.internal.PerspectiveBarManager;
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
 */
@SuppressWarnings("restriction")
public class WorkbenchHelper {

	/*
	 * Workbench
	 */
	public static Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}

	public static IWorkbenchHelpSystem getHelpSystem() {
		return PlatformUI.getWorkbench().getHelpSystem();
	}


	/*
	 * Workbench Window
	 */
	public static IWorkbenchWindow getWorkbenchWindow() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	}

	public static IWorkbenchPage getActivePage() {
		return getWorkbenchWindow().getActivePage();
	}

	public static Shell getShell() {
		return getWorkbenchWindow().getShell();
	}


	/*
	 * Aberto BUG de ECLIPSE UI
	 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=341030
	 */
	public static void disablePerspectiveToolbarMenu() {
		try{
			PerspectiveBarManager perspectiveBarManager=((WorkbenchWindow)PlatformUI.getWorkbench().getActiveWorkbenchWindow()).getPerspectiveBar();

			//perspectiveBar existe?
			if (perspectiveBarManager!=null){
				ToolBar toolBar = perspectiveBarManager.getControl();
				Listener[] listeners = toolBar.getListeners(SWT.MenuDetect);
				if (listeners != null){
					for (Listener listener : listeners){
						Debug.info("REMOVING", listener.toString());
						toolBar.removeListener(SWT.MenuDetect, listener);
					}
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}


	/**
	 * Adiciona os shortcuts de todas as OUTRAS perspectivas ao
	 * layout para serem apresentados no PerspectiveBarManager
	 */
	public static void addOtherPerspectiveShortcuts(String perspectiveId, IPageLayout layout){
		try{
			IConfigurationElement[] perspectivesConfig=Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.ui.perspectives");
			for(int i=0; i<perspectivesConfig.length; i++){
				String id=perspectivesConfig[i].getAttribute("id");
				if (!id.equals(perspectiveId)){
					Debug.info("ADDING", id);
					layout.addPerspectiveShortcut(id);
				}
			}

		}catch(InvalidRegistryObjectException e){
			e.printStackTrace();
		}
	}


}