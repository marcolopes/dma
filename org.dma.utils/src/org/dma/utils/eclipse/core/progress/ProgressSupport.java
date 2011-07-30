/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.progress;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dma.utils.java.Debug;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class ProgressSupport {

	public static final int EXCEPTION=-1;
	public static final int CANCELED=0;
	public static final int COMPLETED=1;

	private final String title;

	private final Map<IProgressAction, String> tasks=new LinkedHashMap();
	private int work;
	private IProgressAction action;

	public ProgressSupport(String title){
		this.title=title;
	}


	public void add(Class cl) {

		try{
			IProgressAction action=((Class<IProgressAction>)cl).newInstance();
			add(action, action.getClass().getName());

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void add(Class cl, String taskName) {

		try{
			add(((Class<IProgressAction>)cl).newInstance(), taskName);

		}catch(Exception e){
			e.printStackTrace();
		}

	}


	public void add(IProgressAction action, String taskName) {

		this.tasks.put(action, taskName);
		this.work=100/tasks.size();

	}


	public int run() {

		try {
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);

			dialog.run(true, true, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InterruptedException {

					monitor.beginTask(title, 100);

					// execute the tasks
					Iterator<IProgressAction> iterator=tasks.keySet().iterator();
					while(iterator.hasNext()){

						action=iterator.next();

						//task name
						monitor.subTask(tasks.get(action));

						if (!action.run()){
							Debug.info("### CANCELED ###");
							monitor.setCanceled(true);
						}

						/*
						 * Caso o processo seja cancelado, e' necessario provocar
						 * uma excepcao para sair com FALSE
						 * Uma saida com return terminaria o metodo com sucesso
						 */
						if (monitor.isCanceled())
							throw new InterruptedException();

						monitor.worked(work);

					}

					monitor.done();

				}
			});

			/*
			 * O indice tem de ser actualizado caso termine com sucesso
			 * uma vez que sai do ciclo com o seu valor incrementado
			 */
			return COMPLETED;

		} catch (InterruptedException e) {
			Debug.info("### InterruptedException ###");
			return CANCELED;
		} catch (InvocationTargetException e) {
			Debug.info("### InvocationTargetException ###");
		} catch (Exception e) {
			Debug.info("### Exception ###");
		}

		return EXCEPTION;

	}


	public String getLastClass() {
		return action.getClass().getCanonicalName();
	}


	public void debug() {
		for(int i=0; i<tasks.size(); i++){
			Debug.info(tasks.get(i));
		}
	}


}
