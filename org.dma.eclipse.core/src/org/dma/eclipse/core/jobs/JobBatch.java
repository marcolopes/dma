/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.dma.java.utils.Debug;
import org.dma.java.utils.numeric.NumericUtils;

import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public abstract class JobBatch extends LinkedHashSet<CustomJob> {

	private static final long serialVersionUID = 1L;

	/** Executed before first job is started */
	public abstract void start();
	/** Executed when last job is done */
	public abstract void done();

	// MUTEX: MUTual EXclusion semaphore
	/** Global rule to avoid simultaneous executions */
	public static final ISchedulingRule MUTEX_RULE=new MutexRule();

	private final int radomHash=NumericUtils.random();

	protected boolean running=false;

	public boolean isRunning() {
		return running;
	}

	/** Execute jobs with default Mutex Rule */
	public void schedule() {
		schedule(MUTEX_RULE);
	}

	/** Execute jobs with rule (null=immediately) */
	public void schedule(ISchedulingRule rule) {
		JobManager.schedule(this, rule);
	}


	public boolean cancelJobs() {
		boolean result=true;
		//elements can be removed elsewhere!
		List<CustomJob> list=new ArrayList(this);
		for(CustomJob job: list){
			if (!job.cancel()) result=false;
		}
		return result;
	}


	public int getQueuedJobs() {
		return size();
	}


	public int getPendingJobs() {
		int count=0;
		for(CustomJob job: this){
			if (job.getState()==Job.WAITING) count++;
		}
		return count;
	}


	public int getRunningJobs() {
		int count=0;
		for(CustomJob job: this){
			if (job.getState()==Job.RUNNING) count++;
		}
		return count;
	}


	public void debug() {

		if (Debug.STATUS){
			System.out.println("BATCH: " + this);
			int i=0;
			for(CustomJob job: this){
				System.out.println("JOB #"+i+": " + job.getStateName());
				i++;
			}
		}

	}


	/*
	 * (non-Javadoc)
	 * @see java.util.HashSet#add(java.lang.Object)
	 */
	@Override
	public boolean add(CustomJob e) {
		return e.hasTasks() ? super.add(e) : false;
	}

	@Override
	public int hashCode() {
		return radomHash;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}