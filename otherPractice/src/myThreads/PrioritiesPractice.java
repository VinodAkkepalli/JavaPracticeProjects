package myThreads;

import java.util.concurrent.*;

public class PrioritiesPractice implements Runnable{

	private int countDown = 0;
	private volatile double d;	// No Optimization
	
	public static void main(String[] args) {
	//	(new PrioritiesPractice()).start();
		System.out.println("Main Thread");
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		System.out.println("child Thread priority : " + Thread.currentThread().getPriority());
	}

}
