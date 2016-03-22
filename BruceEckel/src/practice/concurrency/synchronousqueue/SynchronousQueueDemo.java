package practice.concurrency.synchronousqueue;

import java.util.concurrent.SynchronousQueue;

/**
 * 
 * <b>Description</b> : SynchronousQueue usability in thread communication
 * scenario. SynchronousQueue is a blocking queue in which each insert operation
 * must wait for a corresponding remove operation by another thread, and vice
 * versa.
 * 
 * This class is also a producer in this producer consumer code.
 * 
 * @author Vinod Akkepalli
 *
 */
public class SynchronousQueueDemo implements Runnable {

	private static SynchronousQueue<String> queue = new SynchronousQueue<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t1 = new Thread(new SynchronousQueueDemo(), "PRODUCER");
		Thread t2 = new Thread(new SynchronousQueueConsumer(queue), "CONSUMER");

		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()
					+ " about to produce a string!!!");
			queue.put("SynchronousQueue is very useful!!");
			System.out.println(Thread.currentThread().getName()
					+ " finished producing the string!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}

}
