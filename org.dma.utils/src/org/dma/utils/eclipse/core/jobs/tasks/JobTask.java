/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.Action;

public class JobTask {

	private final String description;
	private final Action action;

	public JobTask(Action action) {
		this.action = action;
		this.description = "";
	}

	public JobTask(String description, Action action) {
		this.action = action;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public Action getAction() {
		return action;
	}


}

