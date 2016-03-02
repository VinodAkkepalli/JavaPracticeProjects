package practice.concurrency;

import java.util.Queue;
import java.util.Random;

public class SynchronizationProducer implements Runnable {

	private Queue<Integer> pool;
	private String name;
	private final int maxSize;

	public SynchronizationProducer(Queue<Integer> poolQueue, int maxSize,
			String name) {

		this.pool = poolQueue;
		this.name = name;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {

		Random random;
		int i;

		while (true) {
			synchronized (pool) {

				while (pool.size() == maxSize) {
					try {
						System.out.println(
								"Queue is full, PRODUCER is waiting for CONSUMER action!!");
						pool.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}
				}

				random = new Random();
				i = random.nextInt();
				System.out.println(name + " produced item: " + i);
				pool.add(i);

				try {
					wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					Thread.currentThread().interrupt();
				}

				pool.notifyAll();

			}
		}

	}

}
