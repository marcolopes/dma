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
package org.dma.eclipse.ui.internal;

import org.dma.eclipse.ui.UIHelper;
import org.dma.java.util.Debug;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.internal.PerspectiveBarManager;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.presentations.defaultpresentation.DefaultTabItem;

/**
 * Discouraged access!
 */
@SuppressWarnings("restriction")
public class UIHelper2 extends UIHelper {

	/*
	 * ECLIPSE BUG: https://bugs.eclipse.org/bugs/show_bug.cgi?id=341030
	 */
	public static ToolBar getPerspectiveToolBar() {
		try{WorkbenchWindow window=(WorkbenchWindow)getActiveWorkbenchWindow();
			PerspectiveBarManager manager=window.getPerspectiveBar();
			return manager.getControl();
		}catch(Exception e){
			e.printStackTrace();
		}return null;
	}

	public static void disablePerspectiveToolBarMenu() {
		ToolBar toolBar=getPerspectiveToolBar();
		if (toolBar!=null) for (Listener listener: toolBar.getListeners(SWT.MenuDetect)){
			toolBar.removeListener(SWT.MenuDetect, listener);
			Debug.out("REMOVED", listener.toString());
		}
	}

	public static void removeDefaultTabItemPrefix() {
		DefaultTabItem.DIRTY_PREFIX="";
	}

	public static void detachView(IViewPart view) {
		IViewSite site=view.getViewSite();
		WorkbenchPage page=(WorkbenchPage)site.getPage();
		page.detachView(findViewReference(site.getId(), site.getSecondaryId()));
	}


}