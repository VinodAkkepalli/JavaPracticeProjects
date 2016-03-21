package practice.concurrency.locks;

/**
 * 
 * <b>Description</b> : producer class which uses lock mechanism to achieve
 * synchronization
 * 
 * @author Vinod Akkepalli
 *
 */
public class ThreadProducer implements Runnable {

	ThreadProducerConsumerImpl pool;

	public ThreadProducer(ThreadProducerConsumerImpl poolObject) {

		this.pool = poolObject;
	}

	@Override
	public void run() {

		try {

			while (true) {
				pool.put();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
