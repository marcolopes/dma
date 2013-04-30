/*******************************************************************************
 * 2008-2013 Public Domain
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

	private static final Set<JobGroup> jobSet=new HashSet();

	private static void schedule(CustomJob job, ISchedulingRule rule) {

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
					//find group
					final JobGroup group=findJobGroup(job);
					Debug.out("GROUP", group);
					//Is this the first job?
					//if (group.getPendingJobs()==0 && group.getRunningJobs()==1)
					if (!group.running){
						group.running=true;
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								group.jobGroupStart();
							}
						});
					}

				} catch (Exception e){
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
					//find group
					final JobGroup group=findJobGroup(job);
					Debug.out("GROUP", group);
					if (remove(job) && group.getQueuedJobs()==0){
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								group.jobGroupDone();
							}
						});
						group.running=false;
					}

					debug();

				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});

		job.schedule(rule);

	}


	/**
	 * Execute jobs with rule
	 */
	public static void schedule(JobGroup group, ISchedulingRule rule) {

		jobSet.add(group);
		Debug.out("SET", jobSet);

		for(CustomJob job: group){
			// Avoids successive calls
			if (!job.isBusy()){
				schedule(job,rule);
			}

		}

	}


	/**
	 * Execute jobs with default Mutex Rule
	 */
	public static void schedule(JobGroup group) {

		schedule(group, CustomJob.MUTEX_RULE);

	}



	/*
	 * Remove
	 */
	public static boolean remove(CustomJob job) {

		JobGroup group=findJobGroup(job);

		return group.remove(job);

	}


	public static void clean() {

		List<JobGroup> list=new ArrayList(jobSet);
		for(JobGroup group: list){
			if(group.size()==0)
				jobSet.remove(group);
		}

	}



	/*
	 * Cancel
	 */
	public static boolean cancelJobs() {

		boolean result=true;

		for(JobGroup group: jobSet) {
			if (!group.cancelJobs())
				result=false;
		}

		return result;

	}




	/*
	 * Query
	 */
	public static JobGroup findJobGroup(CustomJob job) {

		for(JobGroup group: jobSet) {
			if(group.contains(job))
				return group;
		}

		return null;
	}


	public static int getQueuedJobs() {

		int count=0;

		for(JobGroup group: jobSet) {
			count+=group.getQueuedJobs();
		}

		return count;

	}


	public static int getPendingJobs() {

		int count=0;

		for(JobGroup group: jobSet) {
			count+=group.getPendingJobs();
		}

		return count;

	}


	public static int getRunningJobs() {

		int count=0;

		for(JobGroup group: jobSet) {
			count+=group.getRunningJobs();
		}

		return count;

	}



	/*
	 * Debug
	 */
	public static void debug() {

		Debug.out("JOB MANAGER");

		if (Debug.STATUS){
			System.out.println("QUEUED: " + getQueuedJobs());
			System.out.println("PENDING: " + getPendingJobs());
			System.out.println("RUNNING: " + getRunningJobs());

			for(JobGroup group: jobSet) {

				group.debug();

			}

		}

	}


}
