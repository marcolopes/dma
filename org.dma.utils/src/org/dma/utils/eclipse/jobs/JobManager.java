/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.jobs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dma.utils.eclipse.jobs.tasks.JobAction;
import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.jobs.Job;

public class JobManager {

	private static final Map<IJobSupport, List<CustomJob>> jobMap=new HashMap();


	//add
	public static void register(IJobSupport ijob, CustomJob job) {

		job.setExitAction(new ExitTask(job));

		if(!jobMap.containsKey(ijob))
			jobMap.put(ijob, new ArrayList());

		jobMap.get(ijob).add(job);

		debug();

	}



	//remove
	public static void remove(CustomJob job) {

		IJobSupport ijob=findJobView(job);
		if (ijob!=null)
			jobMap.get(ijob).remove(job);
		else
			Debug.warning("JOB NOT FOUND", job.getName());

	}


	public static void clean() {

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()){
			if(jobMap.get(iterator.next()).size()==0)
				iterator.remove();
		}

	}



	//execute
	public static void execute(CustomJob job) {

		IJobSupport ijob=findJobView(job);
		execute(ijob);

	}


	public static void execute(IJobSupport ijob) {

		List<CustomJob> jobs=jobMap.get(ijob);

		for(int i=0; i<jobs.size(); i++){

			CustomJob job=jobs.get(i);
			/*
			 * Evita chamadas sucessivas
			 */
			if (!job.isExecuting()){

				//e' o primeiro JOB?
				if (getPendingJobs(ijob)==0 && getRunningJobs(ijob)==0)
					ijob.setJobRunning(true);

				job.execute();
			}

		}

	}



	//cancel
	public static boolean cancelJobs(IJobSupport ijob) {

		boolean result=true;
		List<CustomJob> jobs=jobMap.get(ijob);
		/*
		 * Deve comecar pelo ultimo elemento para prevenir a remocao
		 * automatica de JOBS da lista efectuada pelo metodo de SAIDA
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

		debug();

		return result;

	}



	public static IJobSupport findJobView(CustomJob job) {

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {
			IJobSupport ijob=iterator.next();
			if(jobMap.get(ijob).contains(job))
				return ijob;
		}

		return null;
	}



	public static void debug() {

		Debug.info("QUEUED", getQueuedJobs());
		Debug.info("PENDING", getPendingJobs());
		Debug.info("RUNNING", getRunningJobs());

		Iterator<IJobSupport> iterator=jobMap.keySet().iterator();
		while(iterator.hasNext()) {

			IJobSupport ijob=iterator.next();
			Debug.info("ijob",ijob);

			List<CustomJob> jobList=jobMap.get(ijob);
			for(int i=0; i<jobList.size(); i++){
				CustomJob job=jobList.get(i);
				Debug.info(job.getName()+": "+getStateName(job));
			}

		}

	}





	//getters and setters
	public static String getStateName(CustomJob job) {

		String state="NONE";
		switch (job.getState()){
			case Job.RUNNING: state="RUNNING"; break;
			case Job.WAITING: state="WAITING"; break;
			case Job.SLEEPING: state="SLEEPING"; break;
		}

		return state;

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
	 * Exit task class
	 */
	public static class ExitTask extends JobAction {

		private final CustomJob job;

		public ExitTask(CustomJob job) {
			this.job=job;
		}

		public void task() {
			try {
				IJobSupport ijob=findJobView(job);

				remove(job);

				if (getQueuedJobs(ijob)==0)
					ijob.setJobRunning(false);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void UItask() {
		}

	}


}
