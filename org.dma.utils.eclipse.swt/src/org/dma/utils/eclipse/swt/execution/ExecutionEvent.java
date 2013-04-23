/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.utils.eclipse.swt.execution;

import org.eclipse.jface.action.Action;

public class ExecutionEvent {

	private final Action executionAction;
	private final Action responseAction;
	private final Action postresponseAction;
	private final int[] keycode;

	private boolean actionExecuted=false;

	public ExecutionEvent(Action executionAction, Action responseAction, Action postresponseAction, int[] keycode) {
		this.executionAction=executionAction;
		this.responseAction=responseAction;
		this.postresponseAction=postresponseAction;
		this.keycode=keycode;
	}



	/*
	 * Getters and setters
	 */
	public Action getExecutionAction() {
		return executionAction;
	}

	public Action getResponseAction() {
		return responseAction;
	}

	public Action getPostresponseAction() {
		return postresponseAction;
	}

	public int[] getKeycode() {
		return keycode;
	}

	public boolean isActionExecuted() {
		return actionExecuted;
	}

	public void setActionExecuted(boolean actionExecuted) {
		this.actionExecuted = actionExecuted;
	}


}
