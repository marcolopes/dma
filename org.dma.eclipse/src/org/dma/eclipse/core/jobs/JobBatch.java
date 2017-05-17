/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

import org.dma.java.util.Debug;

import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public abstract class JobBatch extends LinkedHashSet<CustomJob> {

	private static final long serialVersionUID = 1L;

	/** Executed when first job is about to run */
	public abstract void aboutToRun();
	/** Executed when last job is done */
	public abstract void done();

	/** Random seed for unique ID */
	public static final Random RANDOM = new Random();

	private final int radomHash = RANDOM.nextInt(Integer.MAX_VALUE);

	protected boolean running=false;

	@Override
	public boolean add(CustomJob e) {
		return e.hasTasks() ? super.add(e) : false;
	}

	public boolean isRunning() {
		return running;
	}

	/** Execute jobs with default Mutex Rule */
	public void schedule() {
		schedule(CustomJob.MUTEX_RULE);
	}

	/** Execute jobs with rule (null=immediately) */
	public void schedule(ISchedulingRule rule) {
		JobManager.schedule(this, rule);
	}


	public boolean cancelJobs() {
		boolean result=true;
		//elements can be removed elsewhere!
		List<CustomJob> col=new ArrayList(this);
		for(CustomJob job: col){
			if(!job.cancel()) result=false;
		}
		return result;
	}


	public int getQueuedJobs() {
		return size();
	}


	public int getPendingJobs() {
		int count=0;
		for(CustomJob job: this){
			if(job.getState()==Job.WAITING) count++;
		}
		return count;
	}


	public int getRunningJobs() {
		int count=0;
		for(CustomJob job: this){
			if(job.getState()==Job.RUNNING) count++;
		}
		return count;
	}


	public void debug() {

		if (!Debug.STATUS) return;

		System.out.println("BATCH: " + this);
		int index=0;
		for(CustomJob job: this){
			System.out.println("JOB #"+index+": " + job.getStateName());
			index++;
		}

	}



	/*
	 * (non-Javadoc)
	 * @see java.util.AbstractSet
	 */
	@Override
	public int hashCode() {
		return radomHash;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}