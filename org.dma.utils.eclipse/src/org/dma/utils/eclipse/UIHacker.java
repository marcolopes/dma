/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse;

import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceNode;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.PerspectiveBarManager;
import org.eclipse.ui.internal.WorkbenchWindow;

@SuppressWarnings("restriction")
public class UIHacker {

	/*
	 * Aberto BUG de ECLIPSE UI
	 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=341030
	 */
	public static void disablePerspectiveToolbarMenu() {
		try{
			PerspectiveBarManager perspectiveBarManager=((WorkbenchWindow)
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()).getPerspectiveBar();

			//perspectiveBar existe?
			if (perspectiveBarManager!=null){
				ToolBar toolBar=perspectiveBarManager.getControl();
				Listener[] listeners=toolBar.getListeners(SWT.MenuDetect);
				if (listeners!=null){
					for (Listener listener : listeners){
						toolBar.removeListener(SWT.MenuDetect, listener);
						Debug.out("REMOVED", listener.toString());
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
			IConfigurationElement[] elements=Platform.getExtensionRegistry().
					getConfigurationElementsFor("org.eclipse.ui.perspectives");
			for(int i=0; i<elements.length; i++){
				String id=elements[i].getAttribute("id");
				if (!id.equals(perspectiveId)){
					layout.addPerspectiveShortcut(id);
					Debug.out("ADDED", id);
				}
			}

		}catch(InvalidRegistryObjectException e){
			e.printStackTrace();
		}
	}


	public static void removePreferenceManagerNodes(){
		try{
			PreferenceManager manager=PlatformUI.getWorkbench().getPreferenceManager();
			IPreferenceNode[] nodes=manager.getRootSubNodes();
			for(IPreferenceNode node : nodes){
				manager.remove(node.getId());
				Debug.out("REMOVED", node.getId());
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}


}