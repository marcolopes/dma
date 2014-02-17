/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.progress;

import java.util.LinkedHashMap;

import org.dma.java.utils.Debug;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class ProgressSupport extends LinkedHashMap<IProgressAction, String> {

	private static final long serialVersionUID = 1L;

	private Class actionClass;
	private final String title;
	private int work;

	public ProgressSupport(String title){
		this.title=title;
	}


	public void add(IProgressAction action, String taskName) {

		put(action, taskName);
		work=100/size();

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


	public boolean run(boolean silent) throws Exception {

		if (silent){

			for(IProgressAction action: keySet()){
				//task name
				String taskName=get(action);
				Debug.out("TASK", taskName);
				action.run();
			}

		}else try{

			ProgressMonitorDialog dialog=new ProgressMonitorDialog(null);

			dialog.run(true, true, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InterruptedException {

					monitor.beginTask(title, 100);

					// execute the tasks
					for(IProgressAction action: keySet()){

						actionClass=action.getClass();

						//task name
						String taskName=get(action);
						Debug.out("TASK", taskName);
						monitor.subTask(taskName);

						try{
							action.run();
						}catch(Exception e){
							throw new RuntimeException(e);
						}
						if (monitor.isCanceled()){
							throw new InterruptedException();
						}
						monitor.worked(work);

					}

					monitor.done();

				}
			});

		}catch (InterruptedException e){
			Debug.out("InterruptedException");
			return false;
		}

		return true;

	}


	public String getActionClass() {
		return actionClass.getCanonicalName();
	}


	public void debug() {
		for(String value: values()){
			System.out.println(value);
		}
	}


}