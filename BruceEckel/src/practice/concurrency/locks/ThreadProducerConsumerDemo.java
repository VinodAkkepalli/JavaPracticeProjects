package practice.concurrency.locks;

/**
 * 
 * <b>Description</b> : Producer consumer problem code using lock/ReentrantLock
 * mechanism
 * 
 * @author Vinod Akkepalli
 *
 */

public class ThreadProducerConsumerDemo {

	private ThreadProducerConsumerDemo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int poolSize = 10;
		ThreadProducerConsumerImpl poolObject = new ThreadProducerConsumerImpl(
				poolSize);

		ThreadProducer producer = new ThreadProducer(poolObject);
		ThreadConsumer consumer = new ThreadConsumer(poolObject);

		(new Thread(producer)).start();
		(new Thread(consumer)).start();
	}

}
