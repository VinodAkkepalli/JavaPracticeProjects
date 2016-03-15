package practice.concurrency.blockingqueue;

/**
 * 
 * 
 * <b>Description</b> : consumer class which gets integers from the pool which
 * is a BlockingQueue and a shared resource
 * 
 * @author Vinod Akkepalli
 *
 */
public class ThreadConsumer implements Runnable {

	ProducerConsumerImpl pool;

	public ThreadConsumer(ProducerConsumerImpl poolObject) {

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
