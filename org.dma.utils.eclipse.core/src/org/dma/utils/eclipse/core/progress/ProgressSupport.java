/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.progress;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class ProgressSupport {

	public static final int CANCELED=0;
	public static final int COMPLETED=1;

	private final String title;

	private final Map<IProgressAction, String> tasks=new LinkedHashMap();
	private IProgressAction action;
	private int work;

	public ProgressSupport(String title){
		this.title=title;
	}


	public void add(Class klass) {

		Assert.isTrue(IProgressAction.class.isAssignableFrom(klass));

		try{
			IProgressAction action=((Class<IProgressAction>)klass).newInstance();
			add(action, action.getClass().getName());

		} catch (Exception e){
			e.printStackTrace();
		}

	}


	public void add(Class klass, String taskName) {

		try{
			add(((Class<IProgressAction>)klass).newInstance(), taskName);

		} catch (Exception e){
			e.printStackTrace();
		}

	}


	public void add(IProgressAction action, String taskName) {

		this.tasks.put(action, taskName);
		this.work=100/tasks.size();

	}


	public boolean run() throws Exception {

		final Error error=new Error();

		try{
			new ProgressMonitorDialog(null).run(true, true, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InterruptedException {

					monitor.beginTask(title, 100);

					// execute the tasks
					Iterator<IProgressAction> iterator=tasks.keySet().iterator();
					while(iterator.hasNext() && error.getCause()==null){

						action=iterator.next();

						//task name
						String taskName=tasks.get(action);
						Debug.out("TASK", taskName);
						monitor.subTask(taskName);

						if (!action.run()){
							error.initCause(new Exception());
						}
						else if (monitor.isCanceled()){
							throw new InterruptedException();
						}

						monitor.worked(work);

					}

					monitor.done();

				}
			});

			return error.getCause()==null;

		}catch (InterruptedException e){
			Debug.out("InterruptedException");
			return false;
		}

	}


	public String getActionClass() {
		return action.getClass().getCanonicalName();
	}


	public void debug() {
		for(int i=0; i<tasks.size(); i++){
			Debug.out(tasks.get(i));
		}
	}


}