/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

public interface IJobSupport {

	/**
	 * Executed when first job is about to start
	 */
	public void jobStarting();

	/**
	 * Executed when last job is done
	 */
	public void jobDone();

}
