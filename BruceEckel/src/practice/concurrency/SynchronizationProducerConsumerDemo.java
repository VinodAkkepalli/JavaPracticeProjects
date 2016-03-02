package practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Problem Statement: Multi-Threading code demo using producer consumer problem
 * 
 * @author Vinod Akkepalli
 *
 */

public class SynchronizationProducerConsumerDemo {

	private static Queue<Integer> pool;

	private SynchronizationProducerConsumerDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		pool = new LinkedList<>();
		int queueMaxSize = 20;

		SynchronizationProducer producer = new SynchronizationProducer(pool,
				queueMaxSize, "PRODUCER");
		SynchronizationConsumer consumer = new SynchronizationConsumer(pool,
				"CONSUMER");

		(new Thread(producer)).start();
		(new Thread(consumer)).start();

	}

}
