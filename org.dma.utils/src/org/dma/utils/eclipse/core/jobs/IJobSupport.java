/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

public interface IJobSupport {

	/**
	 * Executed when first job starts running
	 */
	public void jobBusy();

	/**
	 * Executed when last job is done
	 */
	public void jobDone();

}
