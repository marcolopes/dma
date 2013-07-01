/*******************************************************************************
 * 2008-2013 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.dma.java.utils.Debug;
import org.dma.java.utils.numeric.NumericUtils;
import org.eclipse.core.runtime.jobs.Job;

public abstract class JobGroup extends LinkedHashSet<CustomJob> {

	private static final long serialVersionUID = 1L;

	private final int radomHash=NumericUtils.random();

	protected boolean running=false;

	/**
	 * Executed before first job is started
	 */
	public abstract void jobGroupStart();

	/**
	 * Executed when last job is done
	 */
	public abstract void jobGroupDone();

	public boolean isRunning() {
		return running;
	}


	public boolean cancelJobs() {

		boolean result=true;

		//elements can be removed elsewhere!
		List<CustomJob> list=new ArrayList(this);
		for(CustomJob job: list){
			if (!job.cancel())
				result=false;
		}

		return result;

	}


	public int getQueuedJobs() {

		return size();

	}


	public int getPendingJobs() {

		int count=0;

		for(CustomJob job: this){
			if (job.getState()==Job.WAITING)
				count++;
		}

		return count;

	}


	public int getRunningJobs() {

		int count=0;

		for(CustomJob job: this){
			if (job.getState()==Job.RUNNING)
				count++;
		}

		return count;

	}


	public void debug() {

		if (Debug.STATUS){

			System.out.println("Group: " + this);

			int i=0;
			for(CustomJob job: this){
				System.out.println("Job #"+i+": " + job.getStateName());
				i++;
			}

		}

	}


	@Override
	public int hashCode() {
		return radomHash;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode()==obj.hashCode();
	}


}