/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;

public abstract class CustomAction extends Action implements IAction {

	public final String ID = getClass().getName();

	public CustomAction() {
		setId(ID);
	}

	public void dispose() {}

}