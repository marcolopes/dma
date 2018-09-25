/*******************************************************************************
 * 2008-2011 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

public class MutexRule implements ISchedulingRule {

	public boolean isConflicting(ISchedulingRule rule) {
		return rule==this;
	}

	public boolean contains(ISchedulingRule rule) {
		return rule==this;
	}

}
