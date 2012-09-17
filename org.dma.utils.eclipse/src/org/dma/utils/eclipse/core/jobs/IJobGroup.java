/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

public interface IJobGroup {

	/**
	 * Executed when first job is about to start
	 */
	public void jobStart();

	/**
	 * Executed when last job is done
	 */
	public void jobDone();

}
