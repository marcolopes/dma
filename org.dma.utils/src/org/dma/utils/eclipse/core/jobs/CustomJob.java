/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.List;

import org.dma.utils.eclipse.core.jobs.tasks.JobAction;
import org.dma.utils.eclipse.core.jobs.tasks.JobTask;
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
	private JobAction exitAction;
	private boolean executing=false;


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
	public CustomJob(String description) {
		this(description,Job.LONG);
	}

	public CustomJob(String description, int priority) {
		super(description);
		setPriority(priority);
		//setUser(true); // Apresenta dialogo de progresso
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
	public void execute(ISchedulingRule rule) {

		setRule(rule);

		executing=true;

		/*
		addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				Debug.info("JOB DONE", this);
			}
		});
		*/

		schedule();
	}


	public void execute() {

		execute(MUTEX_RULE); // default rule
	}


	public void canceling(){
		Debug.info("CANCELING", this);
		//this.executing=false;
	}



	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IStatus run(IProgressMonitor monitor) {

		ILock lock = getJobManager().newLock();

		try{
			Debug.info("RUN STARTED", this);

			lock.acquire();
			monitor.beginTask("",IProgressMonitor.UNKNOWN);

			for(int i=0; i<tasks.size() && executing; i++){

				final JobTask jtask=tasks.get(i);
				monitor.setTaskName(jtask.getDescription());

				//task normal
				jtask.getAction().task();

				//task grafica
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						jtask.getAction().UItask();
					}
				});
			}

		} catch (Exception e){
			e.printStackTrace();
		}
		finally{

			lock.release();
			monitor.done();
		}

		//exit action
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (exitAction!=null){
					exitAction.task();
					Debug.info("EXIT ACTION", exitAction);
				}
			}
		});

		executing=false;
		Debug.info("RUN FINISHED", this);

		return Status.OK_STATUS;
	}




	/*
	 * Getters and setters
	 */
	public void setExitAction(JobAction exitAction) {
		this.exitAction = exitAction;
	}

	public List<JobTask> getTasks() {
		return tasks;
	}

	public boolean isExecuting() {
		return executing;
	}


}
