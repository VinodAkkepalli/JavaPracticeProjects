package practice.concurrency.semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * 
 * <b>Description</b> : solution to producer consumer problem using binary
 * Semaphore. SynchronizationProducer class is using binary semaphore to
 * mutually exclude its instances.
 * 
 * @author Vinod Akkepalli
 *
 */

public class SemaphoreDemo {

	public static final Semaphore binary = new Semaphore(1);
	protected static final Queue<Integer> pool = new LinkedList<>();

	private SemaphoreDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int maxSize = 4;

		SynchronizationProducer producer1 = new SynchronizationProducer(pool,
				maxSize, "PRODUCER1", binary);
		SynchronizationProducer producer2 = new SynchronizationProducer(pool,
				maxSize, "PRODUCER2", binary);
		SynchronizationConsumer consumer = new SynchronizationConsumer(pool,
				"CONSUMER");

		new Thread(producer1).start();
		new Thread(producer2).start();
		new Thread(consumer).start();
	}

}
