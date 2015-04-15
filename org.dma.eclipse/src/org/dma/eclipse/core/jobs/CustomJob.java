/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.List;

import org.dma.eclipse.core.jobs.tasks.JobTask;
import org.dma.eclipse.core.jobs.tasks.JobUITask;
import org.dma.java.util.Debug;

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
 */
public class CustomJob extends Job {

	// MUTEX: MUTual EXclusion semaphore
	/** Global rule to avoid simultaneous executions */
	public static final ISchedulingRule MUTEX_RULE = new MutexRule();

	private final List<JobTask> tasks=new ArrayList();

	private boolean canceled=false;

	public CustomJob() {
		this("");
	}

	/** @see CustomJob#CustomJob(String, int) */
	public CustomJob(String name) {
		this(name,Job.LONG);
	}

	/**
	 * Creates a new job
	 * <p>
	 * The new job is created with a MUTUAL EXCLUSION rule that prevents
	 * two or more jobs with the same rule from executing at the same time
	 * <p>
	 * <b>setRule(MUTEX_RULE)</b> can be used to create a new rule for a new
	 * batch of jobs that need to be mutal exclusive.
	 * <p>
	 * <b>setRule(null)</b> can be used to indicate that the job has no rule and
	 * can be executed immediately
	 *
	 * @param name - The job name. <b>if NULL job will be silent!</b>
	 * @param priority - One of INTERACTIVE, SHORT, LONG, BUILD, or DECORATE.
	 *
	 */
	public CustomJob(String name, int priority) {
		super(name==null ? "" : name);
		setPriority(priority);
		setUser(false); // avoid progress dialogue
		setSystem(name==null); // do not reveal in any UI
		setRule(MUTEX_RULE);
	}

	public void reset() {
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

	public boolean hasTasks() {
		return !tasks.isEmpty();
	}



	/*
	 * Execution
	 */
	public void schedule(ISchedulingRule rule) {
		Debug.out("JOB", this);
		setRule(rule);
		schedule();
	}


	public boolean isBusy() {
		Debug.out("JOB STATE", getStateName());
		int state=getState();
		return state==Job.RUNNING || state==Job.WAITING || state==Job.SLEEPING;
	}

	public boolean isCanceled() {
		return canceled;
	}


	@Override
	public void canceling() {
		Debug.out("JOB", this);
		canceled=true;
	}


	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {

		ILock lock = getJobManager().newLock();

		try{
			Debug.out("STARTED", this);

			lock.acquire();
			monitor.beginTask("",IProgressMonitor.UNKNOWN);

			for(int i=0; i<tasks.size() && !canceled; i++){

				final JobTask jtask=tasks.get(i);

				monitor.subTask(jtask.getName());
				Debug.out("JOB TASK", jtask.getName());

				if(jtask instanceof JobUITask){
					//UI task
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							jtask.getAction().run();
						}
					});
				}else{
					//NORMAL task
					jtask.getAction().run();
				}

			}

			return Status.OK_STATUS;

		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			lock.release();
			monitor.done();
			Debug.out("FINISHED", this);
		}

		return Status.CANCEL_STATUS;

	}


	public String getStateName() {

		switch(getState()){
		default: return "NONE";
		case Job.RUNNING: return "RUNNING";
		case Job.WAITING: return "WAITING";
		case Job.SLEEPING: return "SLEEPING";
		}

	}


}
