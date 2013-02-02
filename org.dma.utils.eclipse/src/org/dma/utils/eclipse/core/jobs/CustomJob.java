/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.eclipse.core.jobs.tasks.JobTask;
import org.dma.utils.eclipse.core.jobs.tasks.JobUITask;
import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;
/**
 * On the Job: The Eclipse Jobs API
 * http://www.eclipse.org/articles/Article-Concurrency/jobs-api.html
 *
 */
public class CustomJob extends Job {

	/**
	 * MUTEX: MUTual EXclusion semaphore.
	 * Global rule to avoid simultaneous executions.
	 */
	public static final ISchedulingRule MUTEX_RULE=new MutexRule();

	private final List<JobTask> tasks=new ArrayList();
	private boolean canceled=false;

	/**
	 * Creates a new job
	 * <p>
	 * The new job is created with a MUTUAL EXCLUSION rule that prevents
	 * two or more jobs with the same rule from executing at the same time
	 * <p>
	 * <b>setRule(new MutexRule());</b> can be used to create a new rule for a new
	 * group of jobs that need to be mutal exclusive.
	 * <p>
	 * <b>setRule(null);</b> can be used to indicate that the job has no rule and
	 * can be executed immediately
	 *
	 */
	public CustomJob(String name, int priority) {
		super(name);
		setPriority(priority);
		//setUser(true); // shows progress dialogue
		setRule(MUTEX_RULE);
	}

	public CustomJob(String name) {
		this(name,Job.LONG);
	}

	public CustomJob() {
		this("");
	}

	public void reset(){
		canceled=false;
	}



	/*
	 * Tasks
	 */
	public void addTask(JobTask action) {
		tasks.add(action);
	}

	public void removeTask(JobTask action) {
		tasks.remove(action);
	}



	/*
	 * Execution
	 */
	public void schedule(ISchedulingRule rule) {
		setRule(rule);
		schedule();
		Debug.out("JOB STATE", getStateName());
	}


	public void canceling(){
		Debug.out("CANCELING", this);
		canceled=true;
		Debug.out("JOB STATE", getStateName());
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IStatus run(IProgressMonitor monitor) {

		ILock lock = getJobManager().newLock();

		try{
			Debug.out("RUN STARTED", this);
			Debug.out("JOB STATE", getStateName());

			lock.acquire();
			monitor.beginTask("",IProgressMonitor.UNKNOWN);

			for(int i=0; i<tasks.size() && !canceled; i++){

				final JobTask jtask=tasks.get(i);

				monitor.setTaskName(jtask.getName());
				Debug.out("JOB TASK", jtask.getName());

				if (jtask instanceof JobUITask){
					//UI task
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							((JobUITask)jtask).getAction().run();
						}
					});
				}else{
					//normal task
					jtask.getAction().run();
				}

			}

		} catch (Exception e){
			e.printStackTrace();
		}
		finally{
			lock.release();
			monitor.done();
		}

		Debug.out("RUN FINISHED", this);
		Debug.out("JOB STATE", getStateName());

		return Status.OK_STATUS;
	}


	public String getStateName() {

		switch (getState()){
			case Job.RUNNING: return "RUNNING";
			case Job.WAITING: return "WAITING";
			case Job.SLEEPING: return "SLEEPING";
			default: return "NONE";
		}

	}



	/*
	 * Getters and setters
	 */
	public boolean isBusy() {
		Debug.out("JOB STATE", getStateName());
		int state=getState();
		return state==Job.RUNNING || state==Job.WAITING || state==Job.SLEEPING;
	}

	public boolean isCanceled() {
		return canceled;
	}


}
