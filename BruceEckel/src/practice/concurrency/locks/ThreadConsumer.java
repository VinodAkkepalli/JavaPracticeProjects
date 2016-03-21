package practice.concurrency.locks;

/**
 * 
 * <b>Description</b> : consumer class which uses lock mechanism to achieve
 * synchronization
 * 
 * @author Vinod Akkepalli
 *
 */
public class ThreadConsumer implements Runnable {

	ThreadProducerConsumerImpl pool;

	public ThreadConsumer(ThreadProducerConsumerImpl poolObject) {

		this.pool = poolObject;
	}

	@Override
	public void run() {
		try {

			while (true) {
				pool.get();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
