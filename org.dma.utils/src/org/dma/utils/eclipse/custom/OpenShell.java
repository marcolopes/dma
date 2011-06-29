/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.custom;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class OpenShell extends Action implements IWorkbenchAction {

	private final Shell shell;

	public OpenShell(Shell shell){
		this.shell=shell;
	}


	public void with(Composite parent){
		try {
			Rectangle parentBounds = parent.getBounds();
			Rectangle childBounds = shell.getBounds();
			int x = parentBounds.x + (parentBounds.width - childBounds.width) / 2;
			int y = parentBounds.y + (parentBounds.height - childBounds.height) / 2;
			shell.setLocation (x, y);

			shell.open();
			shell.setFocus();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void dispose(){}


}