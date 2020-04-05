package practice.concurrency.semaphore;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * 
 * <b>Description</b> : SynchronizationProducer class is using binary semaphore
 * to mutually exclude its instances when writing to queue.
 * 
 * @author Vinod Akkepalli
 *
 */

public class SynchronizationProducer implements Runnable {

	private final Queue<Integer> pool;
	private final String name;
	private final int maxSize;
	private Semaphore binary;

	public SynchronizationProducer(Queue<Integer> poolQueue, int maxSize,
			String name, Semaphore binary) {

		this.pool = poolQueue;
		this.name = name;
		this.maxSize = maxSize;
		this.binary = binary;
	}

	@Override
	public void run() {

		Random random;
		int i;

		while (true) {
			synchronized (pool) {

				while (pool.size() == maxSize) {
					try {
						System.out.println("Queue is full, " + this.name
								+ " is waiting for CONSUMER action!!");
						pool.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}

				try {
					this.binary.acquire();
					System.out.println(this.name
							+ " has entered Mutual-Exclusion block acquiring semaphore");

					random = new Random();
					i = random.nextInt();
					System.out.println(this.name + " produced item: " + i);
					pool.add(i);
					System.out.println("Pool content is: " + pool.toString());
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					Thread.currentThread().interrupt();
				} finally {
					this.binary.release();
					System.out.println(this.name
							+ " has exited Mutual-Exclusion block releasing semaphore");
					pool.notifyAll();
				}
			}
		}

	}

}
