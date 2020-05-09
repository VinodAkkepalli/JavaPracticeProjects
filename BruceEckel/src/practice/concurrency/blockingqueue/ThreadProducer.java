package practice.concurrency.blockingqueue;

/**
 * 
 * <b>Description</b> : Producer class which pushes random integers into the
 * pool which is a BlockingQueue and a shared resource
 * 
 * @author Vinod Akkepalli
 *
 */

public class ThreadProducer implements Runnable {

	ProducerConsumerImpl producerConsumer;

	public ThreadProducer(ProducerConsumerImpl producerConsumer) {

		this.producerConsumer = producerConsumer;
	}

	@Override
	public void run() {

		try {

			while (true) {
				producerConsumer.putObjectInPool();
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

}
