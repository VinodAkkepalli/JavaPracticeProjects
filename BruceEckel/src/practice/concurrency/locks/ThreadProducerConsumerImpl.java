package practice.concurrency.locks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * <b>Description</b> : producer consumer problem implementation code. We use
 * lock/ReentrantLock mechanism to achieve thread synchronization
 * 
 * @author Vinod Akkepalli
 *
 */

public class ThreadProducerConsumerImpl {

	private int maxSize;
	private int currentSize = 0;
	Random random = new Random();

	private Queue<Integer> pool = new LinkedList<>();
	private Lock lock = new ReentrantLock();

	// condition1 for checking if the pool is empty
	private final Condition isEmpty = lock.newCondition();
	// condition1 for checking if the pool is full
	private final Condition isFull = lock.newCondition();
	int i;
	Boolean isAdded = false;
	Integer poolElement;

	public ThreadProducerConsumerImpl(int size) {
		this.maxSize = size;
	}

	public void put() throws InterruptedException {

		lock.lock();

		try {
			if (this.currentSize == this.maxSize) {
				System.out.println(
						"Queue is full, PRODUCER is waiting for CONSUMER action!!");
				isFull.await();
			}

			i = random.nextInt();
			isAdded = pool.add(i);

			if (isAdded) {
				currentSize++;
				System.out.println("PRODUCER has produced an item: " + i);
				isEmpty.signalAll();
			}
		} finally {
			lock.unlock();
		}

	}

	public void get() throws InterruptedException {

		lock.lock();
		try {
			if (0 == this.currentSize) {
				System.out.println(
						"Queue is empty, CONSUMER is waiting for PRODUCER action!!");
				isEmpty.await();
			}

			poolElement = pool.poll();

			if (poolElement != null) {
				currentSize--;
				System.out.println("CONSUMER consumed item: " + poolElement);
				isFull.signalAll();
			}
		} finally {
			lock.unlock();
		}
	}

}
