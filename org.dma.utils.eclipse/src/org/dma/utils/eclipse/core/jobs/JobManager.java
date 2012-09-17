/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.widgets.Display;

public class JobManager {

	private static final Map<IJobGroup, List<CustomJob>> jobMap=new LinkedHashMap();

	/*
	 * Register
	 */
	public static void register(CustomJob job, IJobGroup group) {

		try{
			if(!jobMap.containsKey(group))
				jobMap.put(group, new ArrayList());

			if (!jobMap.get(group).contains(job)){
				/*
				 * The only way to be sure that a CANCELED job
				 * has finished is by overriding the done method
				 */
				job.addJobChangeListener(new JobChangeAdapter() {
					@Override
					public void done(final IJobChangeEvent event) {
						try{
							final CustomJob job=(CustomJob)event.getJob();
							Debug.out("JOB DONE", job);

							final IJobGroup group=findJobGroup(job);
							if (remove(job) && getQueuedJobs(group)==0){
								Display.getDefault().asyncExec(new Runnable() {
									public void run() {
										group.jobDone();
									}
								});
							}

							debug();

						} catch (Exception e){
							e.printStackTrace();
						}
					}
				});

				jobMap.get(group).add(job);

			}else{
				throw new Exception("JOB ALREADY REGISTERD: "+job);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

	}



	/*
	 * Remove
	 */
	public static boolean remove(CustomJob job) {

		IJobGroup group=findJobGroup(job);

		try{
			if (group!=null){
				jobMap.get(group).remove(job);
				Debug.out("JOB REMOVED", job);
			}else{
				throw new Exception("JOB NOT FOUND: "+job);
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return group!=null;

	}


	public static void clean() {

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()){
			if(jobMap.get(iterator.next()).size()==0)
				iterator.remove();
		}

	}



	/*
	 * Cancel
	 */
	public static boolean cancelJobs(IJobGroup group) {

		boolean result=true;

		/*
		 * Starts with last element to avoid iteration problems
		 * caused by JOB removal executed by the exit method
		 */
		List<CustomJob> jobs=jobMap.get(group);
		for(int i=jobs.size()-1; i>=0; i--){
			CustomJob job=jobs.get(i);
			if (!job.cancel())
				result=false;
		}

		return result;

	}


	public static boolean cancelJobs() {

		boolean result=true;

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {
			IJobGroup group=iterator.next();
			if (!cancelJobs(group))
				result=false;
		}

		return result;

	}



	/**
	 * Execute all jobs with default Mutex Rule
	 */
	public static void execute(IJobGroup group) {

		List<CustomJob> jobs=jobMap.get(group);

		for(int i=0; i<jobs.size(); i++){

			CustomJob job=jobs.get(i);

			// Avoids successive calls
			if (!job.isBusy()){

				// Is this the first job?
				if (getPendingJobs(group)==0 && getRunningJobs(group)==0)
					group.jobStart();

				// Overrides job rule
				job.execute(CustomJob.MUTEX_RULE); // queue
			}

		}

	}

	public static void execute(CustomJob job) {

		IJobGroup group=findJobGroup(job);
		execute(group);

	}




	/*
	 * Helpers
	 */
	public static IJobGroup findJobGroup(CustomJob job) {

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {
			IJobGroup group=iterator.next();
			if(jobMap.get(group).contains(job))
				return group;
		}

		return null;
	}



	public static int getQueuedJobs(IJobGroup group) {

		List<CustomJob> jobs=jobMap.get(group);
		return jobs==null ? 0 : jobs.size();

	}


	public static int getQueuedJobs() {

		int count=0;

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			count+=getQueuedJobs(iterator.next());

		return count;

	}


	public static int getPendingJobs(IJobGroup group) {

		int count=0;

		List<CustomJob> jobs=jobMap.get(group);
		for(int i=0; i<jobs.size(); i++){
			CustomJob job=jobs.get(i);
			if (job.getState()==Job.WAITING)
				count++;
		}

		return count;

	}


	public static int getPendingJobs() {

		int count=0;

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			count+=getPendingJobs(iterator.next());

		return count;

	}


	public static int getRunningJobs(IJobGroup group) {

		int count=0;

		List<CustomJob> jobs=jobMap.get(group);
		for(int i=0; i<jobs.size(); i++){
			CustomJob job=jobs.get(i);
			if (job.getState()==Job.RUNNING)
				count++;
		}

		return count;

	}


	public static int getRunningJobs() {

		int count=0;

		Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			count+=getRunningJobs(iterator.next());

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

			Iterator<IJobGroup> iterator=jobMap.keySet().iterator();
			while(iterator.hasNext()) {

				IJobGroup group=iterator.next();
				System.out.println("Group: " + group +"/"+ jobMap.get(group).size());

				List<CustomJob> jobList=jobMap.get(group);
				for(int i=0; i<jobList.size(); i++){
					CustomJob job=jobList.get(i);
					System.out.println("Job #"+i+": " + job);
				}

			}

		}

	}


}
