/*******************************************************************************
 * 2008-2021 Public Domain
 * Contributors
 * Marco Lopes (marcolopespt@gmail.com)
 *******************************************************************************/
package org.dma.java.time;

public class Chronograph {

	private long startTime;
	private long elapsedTime=0;
	private boolean running=false;

	public Chronograph start() {
		if (running) throw new RuntimeException("STOP timer first!");
		running=true;
		startTime=System.nanoTime();
		return this;
	}


	/** Returns elapsed time in millis */
	public Chronograph stop() {
		if (!running) throw new RuntimeException("START timer first!");
		elapsedTime=elapsed();
		running=false;
		return this;
	}


	public Chronograph reset() {
		startTime=System.nanoTime();
		elapsedTime=0;
		return this;
	}

	/** Returns elapsed time in nanos */
	public long elapsed() {
		return running ? elapsedTime+System.nanoTime()-startTime : elapsedTime;
	}


	@Override
	public String toString() {
		return String.format("%,d", elapsed()/1000000)+"ms";
	}


	public static void main(String[] argvs) throws Exception {

		Chronograph timer=new Chronograph();
		System.out.println("TIMER (0): "+timer);

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~100): "+timer);
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer);

		System.out.println(timer.stop());
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer);

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~300): "+timer);

		System.out.println(timer.stop());
		System.out.println("TIMER (~300): "+timer);

		timer.start();
		Thread.sleep(100);
		System.out.println("TIMER (~400): "+timer);

		timer.reset();
		Thread.sleep(100);
		System.out.println("TIMER (~100): "+timer);
		Thread.sleep(100);
		System.out.println("TIMER (~200): "+timer);

	}


}
