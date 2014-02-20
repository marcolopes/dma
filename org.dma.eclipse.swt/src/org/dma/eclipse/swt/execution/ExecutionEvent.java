/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import org.eclipse.jface.action.IAction;

public class ExecutionEvent {

	private final IAction executionAction;
	private final IAction responseAction;
	private final IAction postresponseAction;
	private final int[] keycode;

	private boolean actionExecuted=false;

	public ExecutionEvent(IAction executionAction, IAction responseAction, IAction postresponseAction, int[] keycode) {
		this.executionAction=executionAction;
		this.responseAction=responseAction;
		this.postresponseAction=postresponseAction;
		this.keycode=keycode;
	}



	/*
	 * Getters and setters
	 */
	public IAction getExecutionAction() {
		return executionAction;
	}

	public IAction getResponseAction() {
		return responseAction;
	}

	public IAction getPostresponseAction() {
		return postresponseAction;
	}

	public int[] getKeycode() {
		return keycode;
	}

	public boolean isActionExecuted() {
		return actionExecuted;
	}

	public void setActionExecuted(boolean actionExecuted) {
		this.actionExecuted=actionExecuted;
	}


}
