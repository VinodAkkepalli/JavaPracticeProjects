package practice.concurrency.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 
 * <b>Description</b> : This implementation class has a private BlockingQueue
 * which exhibits queue management capability inbuilt.
 * 
 * 
 * @author Vinod Akkepalli
 *
 */

public class ProducerConsumerImpl {

	private int maxSize;
	public int currentSize = 0;
	Random random = new Random();

	private BlockingQueue<Integer> pool;

	int i;
	Boolean isAdded = false;
	Integer poolElement;

	public ProducerConsumerImpl(int poolSize) {

		this.maxSize = poolSize;
		pool = new ArrayBlockingQueue<>(maxSize);
	}

	public void put() throws InterruptedException {

		if (this.currentSize == this.maxSize) {
			System.out.println(
					"Queue is full, PRODUCER is waiting for CONSUMER action!!");
		}

		i = random.nextInt();
		pool.put(i);
		currentSize++;
		System.out.println("PRODUCER has produced an item: " + i);
	}

	public void get() throws InterruptedException {

		if (0 == this.currentSize) {
			System.out.println(
					"Queue is empty, CONSUMER is waiting for PRODUCER action!!");
		}

		poolElement = pool.take();

		if (poolElement != null) {
			currentSize--;
			System.out.println("CONSUMER consumed item: " + poolElement);
		}
	}
}