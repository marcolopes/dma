/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.util;

public class Chronograph {

	private long startTime;
	private long elapsedTime=0;
	private boolean running=false;

	public void start() {
		if (running) throw new RuntimeException("STOP timer first!");
		running=true;
		startTime=System.nanoTime();
	}


	/** Returns elapsed time */
	public long stop() {
		if (!running) throw new RuntimeException("START timer first!");
		elapsedTime=elapsed();
		running=false;
		return elapsed()/1000000;
	}


	public void reset() {
		startTime=System.nanoTime();
		elapsedTime=0;
	}


	public long elapsed() {
		return running ?
			elapsedTime+System.nanoTime()-startTime : elapsedTime;
	}


	public String toString() {
		return elapsed()/1000000+"ms";
	}


	public static void main(String[] argvs) throws Exception {

		Chronograph timer=new Chronograph();
		System.out.println("TIMER (0): "+timer.toString());

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~100): "+timer.toString());
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer.toString());

		System.out.println(timer.stop());
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer.toString());

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~300): "+timer.toString());

		System.out.println(timer.stop());
		System.out.println("TIMER (~300): "+timer.toString());

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~400): "+timer.toString());

		timer.reset();
		Thread.sleep(100);
		System.out.println("TIMER (~100): "+timer.toString());
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer.toString());

	}


}
