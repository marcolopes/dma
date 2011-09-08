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
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.widgets.Display;
/**
 * On the Job: The Eclipse Jobs API
 * http://www.eclipse.org/articles/Article-Concurrency/jobs-api.html
 *
 */
public class CustomJob extends Job {

	/**
	 * MUTEX (mutual exclusion semaphore).
	 * Global rule to avoid simultaneous executions
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
		setRule(MUTEX_RULE); // Evita operacoes simultaneas
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
	 * Job
	 */
	public void execute() {

		Debug.info();

		executing=true;

		//executa accao de saida, mesmo que tenha CANCELADO
		addJobChangeListener(new JobChangeAdapter() {

			public void done(IJobChangeEvent event) {
				Debug.info("### EXIT ACTION ###", getName());
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						if (exitAction!=null)
							exitAction.task();
					}
				});
			}
		});

		schedule();
	}


	public void canceling(){
		this.executing=false;
	}



	//main method
	protected IStatus run(IProgressMonitor monitor) {

		ILock lock = getJobManager().newLock();

		try{
			Debug.info("### JOB STARTED ###", getName());

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
			Debug.info("### JOB FINISHED ###", getName());
		}

		executing=false;

		return Status.OK_STATUS;
	}





	/*
	 * Getters and setters
	 */
	public void setExitAction(JobAction exitAction) {
		this.exitAction = exitAction;
	}

	public boolean isExecuting() {
		return executing;
	}


}
