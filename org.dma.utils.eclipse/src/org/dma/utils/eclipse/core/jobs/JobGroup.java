/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

import java.util.ArrayList;

import org.eclipse.core.runtime.jobs.Job;

public class JobGroup extends ArrayList<CustomJob> {

	private static final long serialVersionUID = 1L;

	public boolean running=false;

	public int getPendingJobs() {

		int count=0;

		for(int i=0; i<size(); i++){
			if (get(i).getState()==Job.WAITING)
				count++;
		}

		return count;

	}


	public int getRunningJobs() {

		int count=0;

		for(int i=0; i<size(); i++){
			if (get(i).getState()==Job.RUNNING)
				count++;
		}

		return count;

	}


}
