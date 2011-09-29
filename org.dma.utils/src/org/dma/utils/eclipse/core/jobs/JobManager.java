/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dma.utils.eclipse.swt.custom.CustomAction;
import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.jobs.Job;

public class JobManager {

	private static final Map<IJobSupport, List<CustomJob>> jobMap=new HashMap();

	/*
	 * Exit Action class
	 */
	public static class ExitAction extends CustomAction {

		private final CustomJob job;

		public ExitAction(CustomJob job) {
			this.job=job;
		}

		public void run() {
			try{
				Debug.info("EXIT ACTION", job);
				IJobSupport ijob=findJobSupport(job);

				if (remove(job) && getQueuedJobs(ijob)==0)
					ijob.jobDone();

				debug();

			} catch (Exception e){
				e.printStackTrace();
			}
		}

	}



	/*
	 * Register
	 */
	public static void register(IJobSupport ijob, CustomJob job) {

		job.setExitAction(new ExitAction(job));

		if(!jobMap.containsKey(ijob))
			jobMap.put(ijob, new ArrayList());

		if (jobMap.get(ijob).contains(job))
			Debug.warning("JOB ALREADY REGISTERD", job);
		else
			jobMap.get(ijob).add(job);

	}



	/*
	 * Remove
	 */
	public static boolean remove(CustomJob job) {

		IJobSupport ijob=findJobSupport(job);
		if (ijob!=null){
			jobMap.get(ijob).remove(job);
			Debug.info("JOB REMOVED", job);
			return true;
		}

		Debug.warning("JOB NOT FOUND", job);
		return false;

	}


	public static void clean() {

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()){
			if(jobMap.get(iterator.next()).size()==0)
				iterator.remove();
		}

	}



	/*
	 * Execute
	 */
	public static void execute(CustomJob job) {

		IJobSupport ijob=findJobSupport(job);
		execute(ijob);

	}

	/**
	 * Execute all jobs with default Mutex Rule
	 */
	public static void execute(IJobSupport ijob) {

		List<CustomJob> jobs=jobMap.get(ijob);

		for(int i=0; i<jobs.size(); i++){

			CustomJob job=jobs.get(i);
			/*
			 * Avoids successive calls
			 */
			if (!job.isRunning()){
				/*
				 * Is this the first job?
				 */
				if (getPendingJobs(ijob)==0 && getRunningJobs(ijob)==0)
					ijob.jobBusy();
				/*
				 * Overrides job rule
				 */
				job.execute(CustomJob.MUTEX_RULE); // queue
			}

		}

	}



	/*
	 * Cancel
	 */
	public static boolean cancelJobs(IJobSupport ijob) {

		boolean result=true;
		List<CustomJob> jobs=jobMap.get(ijob);
		/*
		 * Starts with last element to avoid iteration problems
		 * caused by JOB removal executed by the ExitTask
		 */
		for(int i=jobs.size()-1; i>=0; i--){
			CustomJob job=jobs.get(i);
			if (!job.cancel())
				result=false;
		}

		return result;

	}


	public static boolean cancelJobs() {

		boolean result=true;
		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {
			IJobSupport ijob=iterator.next();
			if (!cancelJobs(ijob))
				result=false;
		}

		return result;

	}



	/*
	 * Helper
	 */
	public static IJobSupport findJobSupport(CustomJob job) {

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {
			IJobSupport ijob=iterator.next();
			if(jobMap.get(ijob).contains(job))
				return ijob;
		}

		return null;
	}



	public static int getQueuedJobs(IJobSupport ijob) {

		List<CustomJob> jobs=jobMap.get(ijob);
		return jobs==null ? 0 : jobs.size();

	}


	public static int getQueuedJobs() {

		int n=0;
		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			n+=getQueuedJobs(iterator.next());

		return n;

	}


	public static int getPendingJobs(IJobSupport ijob) {

		int n=0;
		List<CustomJob> jobs=jobMap.get(ijob);
		for(int i=0; i<jobs.size(); i++){
			CustomJob job=jobs.get(i);
			if (job.getState()==Job.WAITING) ++n;
		}

		return n;

	}


	public static int getPendingJobs() {

		int n=0;
		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			n+=getPendingJobs(iterator.next());

		return n;

	}


	public static int getRunningJobs(IJobSupport ijob) {

		int n=0;
		List<CustomJob> jobs=jobMap.get(ijob);
		for(int i=0; i<jobs.size(); i++){
			CustomJob job=jobs.get(i);
			if (job.getState()==Job.RUNNING) ++n;
		}

		return n;

	}


	public static int getRunningJobs() {

		int n=0;
		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext())
			n+=getRunningJobs(iterator.next());

		return n;

	}



	/*
	 * Debug
	 */
	public static void debug() {

		if (!Debug.isOn())
			return;

		Debug.header("JOB MANAGER");
		System.out.println("QUEUED: " + getQueuedJobs());
		System.out.println("PENDING: " + getPendingJobs());
		System.out.println("RUNNING: " + getRunningJobs());

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {

			IJobSupport ijob=iterator.next();
			System.out.println("IJob: " + ijob +"/"+ jobMap.get(ijob).size());

			List<CustomJob> jobList=jobMap.get(ijob);
			for(int i=0; i<jobList.size(); i++){
				CustomJob job=jobList.get(i);
				System.out.println("Job #"+i+": " + job);
			}

		}
		Debug.footer();

	}


}
