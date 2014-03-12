/*******************************************************************************
 * 2008-2012 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.timedate;

public class TimeChronograph {

	private static final TimeChronograph INSTANCE = new TimeChronograph();

	private long startTime;
	private long endTime;
	private boolean running=false;

	public static TimeChronograph getInstance(){
		return !INSTANCE.running ? INSTANCE : new TimeChronograph();
	}


	public void start(){
		if (running){
			throw new RuntimeException("STOP timer first!");
		}

		running=true;
		startTime=System.nanoTime();
	}


	public void stop(){
		if (!running){
			throw new RuntimeException("START timer first!");
		}

		endTime=System.nanoTime();
		running=false;
	}


	public String toString(){
		final long duration=running ?
			System.nanoTime()-startTime : endTime-startTime;

		return duration/1000000+"ms";
	}


}
