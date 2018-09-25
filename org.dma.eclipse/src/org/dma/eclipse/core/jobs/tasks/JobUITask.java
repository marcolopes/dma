/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.Action;

public class JobUITask extends JobTask {

	public JobUITask(Action action) {
		super(action);
	}

	public JobUITask(String description, Action action) {
		super(description, action);
	}

}

