/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package dma.utils.eclipse.core.jobs.tasks;

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

