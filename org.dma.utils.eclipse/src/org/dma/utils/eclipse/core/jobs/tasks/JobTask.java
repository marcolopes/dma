/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.Action;

public class JobTask {

	private final String name;
	private final Action action;

	public JobTask(Action action) {
		this.action = action;
		this.name = "";
	}

	public JobTask(String description, Action action) {
		this.action = action;
		this.name = description;
	}

	public String getName() {
		return name;
	}

	public Action getAction() {
		return action;
	}


}

