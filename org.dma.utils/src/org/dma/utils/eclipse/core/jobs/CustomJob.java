/*******************************************************************************
 * 2008-2011 Public Domain
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



	/*
	 * Tasks
	 */
	public void addTask(JobTask action) {
		this.tasks.add(action);
	}

	public void removeTask(JobTask action) {
		this.tasks.remove(action);
	}



	/*
	 * Execution
	 */
	public void execute() {
		schedule();
	}


	public void execute(ISchedulingRule rule) {
		setRule(rule);
		execute();
		Debug.info("### STATE ###", getStateName());
	}


	public void canceling(){
		Debug.info("CANCELING", this);
		this.canceled=true;
		Debug.info("### STATE ###", getStateName());
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IStatus run(IProgressMonitor monitor) {

		ILock lock = getJobManager().newLock();

		try{
			Debug.info("RUN STARTED", this);
			Debug.info("### STATE ###", getStateName());

			lock.acquire();
			monitor.beginTask("",IProgressMonitor.UNKNOWN);

			for(int i=0; i<tasks.size() && !canceled; i++){

				final JobTask jtask=tasks.get(i);
				monitor.setTaskName(jtask.getDescription());

				//UI task
				if (jtask instanceof JobUITask){
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							((JobUITask)jtask).getAction().run();
						}
					});
				}
				//normal task
				else{
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

		Debug.info("RUN FINISHED", this);
		Debug.info("### STATE ###", getStateName());

		return Status.OK_STATUS;
	}


	public String getStateName() {

		String state="NONE";
		switch (getState()){
			case Job.RUNNING: state="RUNNING"; break;
			case Job.WAITING: state="WAITING"; break;
			case Job.SLEEPING: state="SLEEPING"; break;
		}

		return state;

	}



	/*
	 * Getters and setters
	 */
	public boolean isRunning() {
		Debug.info("### STATE ###", getStateName());
		int state=getState();
		return state==Job.RUNNING || state==Job.WAITING || state==Job.SLEEPING;
	}

	public boolean isCanceled() {
		return canceled;
	}


}
