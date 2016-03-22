package practice.concurrency.synchronousqueue;

import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

/**
 * 
 * <b>Description</b> : This class is a producer in this producer consumer code.
 * This has a SynchronousQueue to help both producer and consumer communicate.
 * 
 * @author Vinod Akkepalli
 *
 */

public class SynchronousQueueConsumer implements Runnable {

	private SynchronousQueue<String> queue = new SynchronousQueue<String>();

	public SynchronousQueueConsumer(Queue<String> queue) {
		this.queue = (SynchronousQueue<String>) queue;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()
					+ " waiting for the string!!!");
			String str = queue.take();
			System.out.println("The string is: " + str);
			System.out.println(Thread.currentThread().getName()
					+ " finished consuming the string !!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}

}
