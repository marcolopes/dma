/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dma.utils.eclipse.Debug;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class ProgressSupport {

	public static final int EXCEPTION=-1;
	public static final int CANCELED=0;
	public static final int COMPLETED=1;

	private final String title;

	private final List<Method> methods=new ArrayList();
	private final Map<Method, String> tasks=new HashMap();
	private int work;
	private int index;

	public ProgressSupport(String title){
		this.title=title;
	}


	public void add(Class cl, String methodName) {

		add(cl, methodName, cl.getName());

	}


	public void add(Class cl, String methodName, String taskName) {

		try {
			Method method=cl.getDeclaredMethod(methodName);
			this.methods.add(method);
			this.tasks.put(method, taskName);
			this.work=100/methods.size();

		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
			//caso o metodo nao exista, nao sera' adicionado
			Debug.info("NoSuchMethodException", methodName);
		}

	}


	public int run() {

		try {
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);

			dialog.run(true, true, new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor) throws InterruptedException {

					monitor.beginTask(title, 100);

					// execute the tasks
					index=0;
					while(index<methods.size()){

						//task name
						String task=tasks.get(methods.get(index));
						if (task!=null)
							monitor.subTask(task);
						else
							monitor.subTask("");

						boolean result=false;
						try {
							result=(Boolean)methods.get(index).invoke(new Class[]{});
							Debug.info("### result ###", result);

						} catch (IllegalArgumentException e) {
						} catch (IllegalAccessException e) {
						} catch (InvocationTargetException e) {
						}

						/*
						 * Nao inicializar CANCELED directamente com RESULT
						 * pois interfere com o valor actualizado do monitor
						 */
						if (!result)
							monitor.setCanceled(true);

						/*
						 * Caso o processo seja cancelado, e' necessario provocar
						 * uma excepcao para sair com FALSE
						 * Uma saida com return terminaria o metodo com sucesso
						 */
						if (monitor.isCanceled())
							throw new InterruptedException();

						monitor.worked(work);

						index++;

					}

					monitor.done();

				}
			});

			/*
			 * O indice tem de ser actualizado caso termine com sucesso
			 * uma vez que sai do ciclo com o seu valor incrementado
			 */
			index=methods.size()-1;

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
		return methods.get(index).getDeclaringClass().getCanonicalName();
	}


	public void debug() {
		for(int i=0; i<methods.size(); i++){
			Debug.info(methods.get(i));
		}
	}


}
