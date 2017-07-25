/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;

import org.dma.eclipse.core.jobs.tasks.JobUITask;
import org.dma.java.util.Debug;

import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.action.Action;

public abstract class CustomJobList extends ArrayList<CustomJob> {

	private static final long serialVersionUID=1L;

	public abstract void done();

	/** Rule to avoid simultaneous executions */
	private final ISchedulingRule jobRule=new MutexRule();

	/** This is the last job to be executed */
	private final CustomJob doneJob=new CustomJob(null){
		@Override
		public boolean belongsTo(Object family) {
			return false; //avoid IJobManager cancel
		}
	}.addTask(new JobUITask(new Action() {
		@Override
		public void run() {
			Debug.err("DONE");
			clear();
			done();
		}
	}));

	/** Schedules all the jobs */
	public synchronized void schedule() {
		if (isEmpty()) return;
		for (CustomJob job: this) job.schedule(jobRule);
		doneJob.schedule(jobRule);
	}

	/** Cancels all the jobs */
	public synchronized void cancel() {
		for (CustomJob job: this) job.cancel();
	}

}