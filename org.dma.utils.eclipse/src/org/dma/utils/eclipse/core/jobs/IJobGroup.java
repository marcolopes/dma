/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.utils.eclipse.core.jobs;

public interface IJobGroup {

	/**
	 * Executed before first job is started
	 */
	public void jobGroupStart();

	/**
	 * Executed when last job is done
	 */
	public void jobGroupDone();

}
