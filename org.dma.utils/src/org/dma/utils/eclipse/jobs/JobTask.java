/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.jobs;

public class JobTask {

	private final String description;
	private final JobAction action;

	public JobTask(JobAction action) {
		this.action = action;
		this.description = "";
	}

	public JobTask(String description, JobAction action) {
		this.action = action;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public JobAction getAction() {
		return action;
	}


}

