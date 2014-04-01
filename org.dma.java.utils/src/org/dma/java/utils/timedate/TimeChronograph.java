/*******************************************************************************
 * 2008-2014 Public Domain
 * Contributors
 * Marco Lopes (marcolopes@netc.pt)
 *******************************************************************************/
package org.dma.java.utils.timedate;

public class TimeChronograph {

	private long startTime;
	private long endTime;
	private long elapsedTime=0;
	private boolean running=false;

	public void start(){
		if (running) throw new RuntimeException("STOP timer first!");
		running=true;
		startTime=System.nanoTime();
	}


	public long stop(){
		if (!running) throw new RuntimeException("START timer first!");
		elapsedTime=elapsed();
		running=false;
		return elapsedTime/1000000;
	}


	public void reset(){
		elapsedTime=0;
		endTime=0;
		startTime=System.nanoTime();
	}


	public long elapsed(){
		return running ?
			elapsedTime+System.nanoTime()-startTime : elapsedTime;
	}


	public String toString(){
		return elapsed()/1000000+"ms";
	}


	public static void main(String[] argvs){

		try{
			TimeChronograph timer=new TimeChronograph();
			System.out.println("TIMER (0): "+timer.toString());

			timer.start();
			Thread.sleep(100);
			System.out.println("TIMER (~100): "+timer.toString());
			Thread.sleep(100);
			System.out.println("TIMER (~200): "+timer.toString());

			timer.stop();
			Thread.sleep(100);
			System.out.println("TIMER (~200): "+timer.toString());

			timer.start();
			Thread.sleep(100);
			System.out.println("TIMER (~300): "+timer.toString());

			timer.stop();
			System.out.println("TIMER (~300): "+timer.toString());

			timer.start();
			Thread.sleep(100);
			System.out.println("TIMER (~400): "+timer.toString());

			timer.reset();
			Thread.sleep(100);
			System.out.println("TIMER (~100): "+timer.toString());
			Thread.sleep(100);
			System.out.println("TIMER (~200): "+timer.toString());

		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}


}
