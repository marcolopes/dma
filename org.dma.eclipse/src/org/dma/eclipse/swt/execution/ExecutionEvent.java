/*******************************************************************************
 * 2008-2016 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import org.eclipse.jface.action.IAction;

public class ExecutionEvent {

	private final int[] keycode;
	private final IAction executionAction;
	private final IAction[] responseAction;

	private boolean executed=false;

	public ExecutionEvent(int[] keycode, IAction executionAction, IAction...responseAction) {
		this.keycode=keycode;
		this.executionAction=executionAction;
		this.responseAction=responseAction;
	}


	public void execute() {
		executionAction.run();
		executed=true;
	}


	public void executeResponse() {
		for(IAction action: responseAction) action.run();
		executed=false;
	}


	public boolean hasResponseAction() {
		return responseAction.length>0;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return executionAction.getId();
	}



	/*
	 * Getters and setters
	 */
	public int[] getKeycode() {
		return keycode;
	}

	public IAction getExecutionAction() {
		return executionAction;
	}

	public IAction[] getResponseAction() {
		return responseAction;
	}

	public boolean isExecuted() {
		return executed;
	}


}
