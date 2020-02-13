/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.jobs.tasks;

import org.eclipse.jface.action.IAction;

public class JobUITask extends JobTask {

	public JobUITask(IAction action) {
		super(action);
	}

	public JobUITask(String description, IAction action) {
		super(description, action);
	}

}

