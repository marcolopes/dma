/*******************************************************************************
 * 2008-2019 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 * Paulo Silva (wickay@hotmail.com)
 *******************************************************************************/
package org.dma.eclipse.swt.execution;

import java.util.ArrayList;

import org.eclipse.jface.action.IAction;

public class ExecutionEvent extends ArrayList<IAction> {

	private static final long serialVersionUID = 1L;

	public ExecutionEvent addResponse(IAction action) {
		super.add(action);
		return this;
	}

	private final int[] keycode;
	private final IAction action;

	private boolean executed=false;

	public ExecutionEvent(int[] keycode, IAction action) {
		this.keycode=keycode;
		this.action=action;
	}


	public void execute() {
		action.run();
		executed=true;
	}


	public void executeResponse() {
		for(IAction action: this) action.run();
		executed=false;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object
	 */
	@Override
	public String toString() {
		return action.getId();
	}



	/*
	 * Getters and setters
	 */
	public int[] getKeycode() {
		return keycode;
	}

	public IAction getAction() {
		return action;
	}

	public boolean isExecuted() {
		return executed;
	}


}
