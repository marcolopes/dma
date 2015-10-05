/*******************************************************************************
 * 2008-2015 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.ui.progress;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class ProgressSupport extends LinkedHashMap<IProgressAction, String> {

	private static final long serialVersionUID = 1L;

	private final String title;

	private int work;

	public ProgressSupport(String title){
		this.title=title;
	}


	@Override
	public String put(IProgressAction action, String taskName) {

		String value=super.put(action, taskName);
		work=100/size();
		return value;

	}


	public void put(Class klass) {

		if (!IProgressAction.class.isAssignableFrom(klass))
			throw new UnsupportedOperationException();

		try{
			IProgressAction action=((Class<IProgressAction>)klass).newInstance();
			put(action, action.getClass().getName());

		}catch(Exception e){
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

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

					monitor.beginTask(title, 100);

					// execute the tasks
					for(IProgressAction action: keySet()) try{

						//task name
						String taskName=get(action);
						Debug.out("TASK", taskName);

						monitor.subTask(taskName);
						action.run();
						monitor.worked(work);

					}catch(Exception e){
						throw new InvocationTargetException(e);
					}finally{
						if (monitor.isCanceled()) throw new InterruptedException();
					}

					monitor.done();

				}
			});

		}catch(InvocationTargetException e){
			Debug.out("InvocationTargetException");
			throw new Exception(e.getCause().getMessage(), e.getCause());
		}catch(InterruptedException e){
			Debug.out("InterruptedException");
			return false;
		}

		return true;

	}


	public void debug() {
		for(String e: values()){
			System.out.println(e);
		}
	}


}