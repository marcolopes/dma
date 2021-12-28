/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.IAction;

public class JobTask {

	private final String name;
	private final IAction action;

	public JobTask(IAction action) {
		this(action.getText(), action);
	}

	public JobTask(String name, IAction action) {
		this.name=name==null ? "" : name;
		this.action=action;
	}

	public String getName() {
		return name;
	}

	public IAction getAction() {
		return action;
	}

	@Override
	public String toString() {
		return name;
	}

}