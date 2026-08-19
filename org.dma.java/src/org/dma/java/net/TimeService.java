/*******************************************************************************
 * Copyright 2008-2026 Marco Lopes (marcolopespt@gmail.com)
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
package org.dma.java.net;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.dma.java.net.NTPServerHandler.NTPTimeInfo;
import org.dma.java.net.NTPServerHandler.NTP_SERVERS;
import org.dma.java.util.Debug;

public class TimeService implements ITimeService, Runnable {

	/** Default timeout in MILLISECONDS */
	public static final int TIMEOUT = 500;

	private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

	private NTPTimeInfo info;

	private final int timeout;

	/** @see TimeService#TIMEOUT */
	public TimeService() {
		this(TIMEOUT);
	}

	/** Query every 24 hours */
	public TimeService(int timeout) {
		this(timeout, 60*24);
	}

	/**
	 * @param timeout Timeout in MILLISECONDS
	 * @param period The period between successive executions in MINUTES
	 */
	public TimeService(int timeout, int period) {
		this.timeout=timeout;
		//repeat at every period
		executor.scheduleAtFixedRate(this, period, period, TimeUnit.MINUTES);
		Debug.err("Executor scheduled");
		run(); //initialize
	}

	@Override
	public long getOffset() {
		return info==null ? 0 : info.getOffset();
	}

	@Override
	public void run() {
		info=NTP_SERVERS.queryAll(timeout);
	}

	public ITimeService shutdown() {
		executor.shutdown();
		System.err.println(this+" executor stopped");
		return this;
	}

}