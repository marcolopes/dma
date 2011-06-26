/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.jobs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dma.utils.eclipse.Debug;
import org.dma.utils.eclipse.jobs.tasks.JobAction;
import org.dma.utils.eclipse.jobs.tasks.JobTask;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ILock;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.swt.widgets.Display;

public class CustomJob extends Job {

	/*
	 * MUTEX (mutual exclusion semaphore)
	 * Regra para evitar execucoes simultaneas
	 */
	public static final ISchedulingRule MUTEX_RULE=new MutexRule();

	/*
	 * On the Job: The Eclipse Jobs API
	 * http://www.eclipse.org/articles/Article-Concurrency/jobs-api.html
	 *
	 */

	private ILock lock;

	private final List<JobTask> tasks=new ArrayList();
	private JobAction exitAction;
	private boolean working=false;


	public CustomJob(String description, int priority) {
		super(description);
		setPriority(priority);

		/*
		 * Comentar a regra para testar operacoes simultaneas
		 */
		setRule(MUTEX_RULE);
	}


	//execute job
	public void execute() {

		Debug.info();

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




	//main method
	protected IStatus run(IProgressMonitor monitor) {

		try {
			Debug.info("### JOB STARTED ###", getName());

			lock = getJobManager().newLock();
			lock.acquire();
			monitor.beginTask("",IProgressMonitor.UNKNOWN);

			Iterator<JobTask> iterator=tasks.iterator();
			while(iterator.hasNext()) {

				final JobTask jtask=iterator.next();
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{

			lock.release();
			monitor.done();
			Debug.info("### JOB FINISHED ###", getName());
		}

		return Status.OK_STATUS;
	}




	//add and remove tasks
	public void addTask(JobTask action) {
		this.tasks.add(action);
	}

	public void removeTask(JobTask action) {
		this.tasks.remove(action);
	}



	//getters and setters
	public void setExitAction(JobAction exitAction) {
		this.exitAction = exitAction;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}


}
