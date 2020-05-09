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

	ProducerConsumerImpl producerConsumer;

	public ThreadConsumer(ProducerConsumerImpl producerConsumer) {

		this.producerConsumer = producerConsumer;
	}

	@Override
	public void run() {
		try {

			while (true) {
				producerConsumer.getObjFromPool();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
