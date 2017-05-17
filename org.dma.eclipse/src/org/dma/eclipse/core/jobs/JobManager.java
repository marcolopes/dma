/*******************************************************************************
 * 2008-2017 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.HashSet;
import java.util.Set;

import org.dma.java.util.Debug;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.widgets.Display;

public class JobManager {

	private static final Set<JobBatch> QUEUE = new HashSet();

	/** Execute jobs with rule (null=immediately) */
	protected static void schedule(CustomJob job, ISchedulingRule rule) {

		//allow reuse
		job.reset();

		//listeners
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void aboutToRun(IJobChangeEvent event) {
				synchronized(QUEUE){
					try{
						CustomJob job=(CustomJob)event.getJob();
						Debug.out("STARTED", job);
						//find batch
						final JobBatch batch=findJobBatch(job);
						Debug.out("BATCH", batch);
						if(!batch.running){
							batch.running=true;
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									batch.aboutToRun();
								}
							});
						}

						debug();

					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}

			/*
			 * The only way to be sure that a CANCELED job
			 * has finished is by overriding the done method
			 */
			@Override
			public void done(final IJobChangeEvent event) {
				synchronized(QUEUE){
					try{
						CustomJob job=(CustomJob)event.getJob();
						Debug.out("DONE", job);
						//remove listener
						job.removeJobChangeListener(this);
						//find batch
						final JobBatch batch=findJobBatch(job);
						if(remove(job) && batch.getQueuedJobs()==0){
							batch.running=false;
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									batch.done();
								}
							});
							//remove batch
							QUEUE.remove(batch);
						}

						debug();

					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		});

		job.schedule(rule);

	}


	/** Execute jobs with rule (null=immediately) */
	protected static void schedule(JobBatch batch, ISchedulingRule rule) {
		QUEUE.add(batch);
		Debug.out("QUEUE", QUEUE);
		for(CustomJob job: batch){
			//avoid successive calls
			if(!job.isBusy()) schedule(job, rule);
		}
	}



	/*
	 * Remove
	 */
	public static boolean remove(CustomJob job) {
		JobBatch batch=findJobBatch(job);
		return batch.remove(job);
	}


	public static void clean() {
		for(JobBatch batch: QUEUE){
			if(batch.isEmpty()) QUEUE.remove(batch);
		}
	}



	/*
	 * Cancel
	 */
	public static boolean cancelJobs() {
		boolean result=true;
		for(JobBatch batch: QUEUE) {
			if(!batch.cancelJobs()) result=false;
		}
		return result;
	}

	/** @see Thread#sleep(long) */
	public static boolean cancelJobs(long timeout) throws InterruptedException {
		cancelJobs();
		int interval=100;
		while(timeout>0 && !isEmpty()){
			Thread.sleep(interval);
			timeout-=interval;
		}
		return isEmpty();
	}



	/*
	 * Query
	 */
	public static boolean isEmpty() {
		return QUEUE.isEmpty();
	}


	public static JobBatch findJobBatch(CustomJob job) {
		for(JobBatch batch: QUEUE) {
			if(batch.contains(job)) return batch;
		}
		return null;
	}


	public static int getQueuedJobs() {
		int count=0;
		for(JobBatch batch: QUEUE) {
			count+=batch.getQueuedJobs();
		}
		return count;
	}


	public static int getPendingJobs() {
		int count=0;
		for(JobBatch batch: QUEUE) {
			count+=batch.getPendingJobs();
		}
		return count;
	}


	public static int getRunningJobs() {
		int count=0;
		for(JobBatch batch: QUEUE) {
			count+=batch.getRunningJobs();
		}
		return count;
	}



	/** Debug */
	public static void debug() {

		if (!Debug.STATUS) return;

		System.out.println("QUEUED: " + getQueuedJobs());
		System.out.println("PENDING: " + getPendingJobs());
		System.out.println("RUNNING: " + getRunningJobs());
		for(JobBatch batch: QUEUE) batch.debug();

	}


}
