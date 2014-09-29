/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dma.java.utils.Debug;

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.widgets.Display;

public class JobManager {

	private static final Set<JobBatch> jobSet=new HashSet();

	protected static void schedule(CustomJob job, ISchedulingRule rule) {

		//allow reuse
		job.reset();

		//listeners
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void scheduled(IJobChangeEvent event) {
				try{
					debug();

					final CustomJob job=(CustomJob)event.getJob();
					Debug.out("STARTED", job);
					//find batch
					final JobBatch batch=findJobBatch(job);
					Debug.out("BATCH", batch);
					//first job?
					//if (batch.getPendingJobs()==0 && batch.getRunningJobs()==1)
					if (!batch.running){
						batch.running=true;
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								batch.start();
							}
						});
					}

				}catch(Exception e){
					e.printStackTrace();
				}
			}
			/*
			 * The only way to be sure that a CANCELED job
			 * has finished is by overriding the done method
			 */
			@Override
			public void done(final IJobChangeEvent event) {
				try{
					final CustomJob job=(CustomJob)event.getJob();
					Debug.out("DONE", job);
					//remove listener
					job.removeJobChangeListener(this);
					//find batch
					final JobBatch batch=findJobBatch(job);
					Debug.out("BATCH", batch);
					if (remove(job) && batch.getQueuedJobs()==0){
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								batch.done();
							}
						});
						batch.running=false;
						//remove batch
						jobSet.remove(batch);
					}

					debug();

				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});

		job.schedule(rule);

	}


	protected static void schedule(JobBatch batch, ISchedulingRule rule) {
		jobSet.add(batch);
		Debug.out("SET", jobSet);
		for(CustomJob job: batch){
			//avoid successive calls
			if (!job.isBusy()) schedule(job,rule);
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
		List<JobBatch> list=new ArrayList(jobSet);
		for(JobBatch batch: list){
			if(batch.isEmpty()) jobSet.remove(batch);
		}
	}



	/*
	 * Cancel
	 */
	public static boolean cancelJobs() {
		boolean result=true;
		for(JobBatch batch: jobSet) {
			if (!batch.cancelJobs()) result=false;
		}
		return result;
	}



	/*
	 * Query
	 */
	public static JobBatch findJobBatch(CustomJob job) {
		for(JobBatch batch: jobSet) {
			if(batch.contains(job)) return batch;
		}
		return null;
	}


	public static int getQueuedJobs() {
		int count=0;
		for(JobBatch batch: jobSet) {
			count+=batch.getQueuedJobs();
		}
		return count;
	}


	public static int getPendingJobs() {
		int count=0;
		for(JobBatch batch: jobSet) {
			count+=batch.getPendingJobs();
		}
		return count;
	}


	public static int getRunningJobs() {
		int count=0;
		for(JobBatch batch: jobSet) {
			count+=batch.getRunningJobs();
		}
		return count;
	}



	/** Debug */
	public static void debug() {

		Debug.out("JOB MANAGER");

		if (Debug.STATUS){
			System.out.println("QUEUED: " + getQueuedJobs());
			System.out.println("PENDING: " + getPendingJobs());
			System.out.println("RUNNING: " + getRunningJobs());
			for(JobBatch batch: jobSet) {
				batch.debug();
			}
		}

	}


}
