package practice.concurrency;

import java.util.Queue;

public class SynchronizationConsumer implements Runnable {

	private Queue<Integer> pool;
	private String name;

	public SynchronizationConsumer(Queue<Integer> poolQueue, String name) {
		this.pool = poolQueue;
		this.name = name;
	}

	@Override
	public void run() {
		int i;
		while (true) {
			synchronized (pool) {

				while (pool.isEmpty()) {

					System.out.println(
							"Queue is empty, CONSUMER is waiting for PRODUCER action!!");
					try {
						pool.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
						Thread.currentThread().interrupt();
					}

				}

				i = pool.poll();
				System.out.println(name + " is consuming: " + i);

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
