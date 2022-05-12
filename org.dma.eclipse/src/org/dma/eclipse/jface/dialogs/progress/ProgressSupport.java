/*******************************************************************************
 * 2008-2022 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.jface.dialogs.progress;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

import org.dma.java.util.Debug;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;

public class ProgressSupport extends LinkedHashMap<IProgressAction, String> {

	private static final long serialVersionUID = 1L;

	public static final int TOTAL_WORK = Integer.MAX_VALUE;

	private final Shell parent;
	private final String title;

	public ProgressSupport(String title) {
		this(null, title);
	}

	public ProgressSupport(Shell parent, String title) {
		this.parent=parent;
		this.title=title;
	}

	@Override
	public String put(IProgressAction action, String taskName) {
		return super.put(action, taskName);
	}

	public String put(IProgressAction action) {
		return put(action, null);
	}

	public void put(Class klass) {
		if (IProgressAction.class.isAssignableFrom(klass)) try{
			IProgressAction action=(IProgressAction)klass.newInstance();
			put(action, action.getClass().getName());
		}catch(Exception e){
			e.printStackTrace();
		}else throw new UnsupportedOperationException();
	}


	public boolean run() throws Exception {
		return run(false);
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

			new ProgressMonitorDialog(parent).run(true, true, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					monitor.beginTask(title, size()==1 ? IProgressMonitor.UNKNOWN : TOTAL_WORK);
					//execute the tasks
					for(IProgressAction action: keySet()) try{
						//task name
						String taskName=get(action);
						Debug.out("TASK", taskName);
						monitor.subTask(taskName);
						action.run();
						monitor.worked(TOTAL_WORK/size());

					}catch(Exception e){
						throw new InvocationTargetException(e);
					}finally{
						if (monitor.isCanceled()) throw new InterruptedException();
					}monitor.done();
				}
			});

		}catch(InvocationTargetException e){
			Debug.err("InvocationTargetException");
			throw new Exception(e.getCause().getMessage(), e.getCause());
		}catch(InterruptedException e){
			Debug.err("InterruptedException");
			return false;
		}return true;

	}



	/** Debug */
	public void print() {
		if (!Debug.STATUS) return;
		System.out.println("---PROGRESS SUPPORT---");
		for(IProgressAction element: keySet()){
			System.out.println(element.getClass());
		}
	}


}