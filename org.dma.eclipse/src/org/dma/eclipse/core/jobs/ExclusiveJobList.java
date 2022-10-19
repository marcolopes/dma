/*******************************************************************************
 * Copyright 2008-2022 Marco Lopes (marcolopespt@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.eclipse.core.jobs;

import java.util.ArrayList;

import org.dma.java.util.Debug;

import org.eclipse.core.runtime.jobs.ISchedulingRule;

public abstract class ExclusiveJobList extends ArrayList<CustomJob> {

	private static final long serialVersionUID = 1L;

	public abstract void done();

	/** Rule to avoid simultaneous executions */
	private final ISchedulingRule jobRule=new MutexRule();

	/** This is the last job to be executed */
	private final CustomJob doneJob=new CustomJob(null){
		@Override
		public boolean belongsTo(Object family) {
			return false; //avoid IJobManager cancel!
		}
	}.addTask(new UIAction() {
		@Override
		public void run() {
			Debug.out("DONE");
			clear();
			done();
		}
	});

	/** Schedules all jobs */
	public synchronized void schedule() {
		if (isEmpty()) return;
		for (CustomJob job: this) job.schedule(jobRule);
		doneJob.schedule(jobRule);
	}

	/** Cancels all jobs */
	public synchronized void cancel() {
		for (CustomJob job: this) job.cancel();
	}

}