/*******************************************************************************
 * 2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.custom;

import org.eclipse.jface.action.Action;

public abstract class CustomAction extends Action {

	public final String ID=getClass().getName();

	public CustomAction() {
		setId(ID);
	}


}