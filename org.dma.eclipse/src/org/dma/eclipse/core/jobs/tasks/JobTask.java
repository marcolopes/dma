/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.Action;

public class JobTask {

	private final String name;
	private final Action action;

	public JobTask(Action action) {
		this.action=action;
		this.name="";
	}

	public JobTask(String name, Action action) {
		this.name=name;
		this.action=action;
	}

	public String getName() {
		return name;
	}

	public Action getAction() {
		return action;
	}


}