package practice.concurrency.blockingqueue;

/**
 * 
 * <b>Description</b> : Multi-Threading demo using producer-consumer problem We
 * used BlockingQueue instead of using a simple Queue a BlockingQueue manages
 * blocking and waking up producers and consumers as per the size of the Queue
 * by itself
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
		ProducerConsumerImpl poolObject = new ProducerConsumerImpl(poolSize);

		ThreadProducer producer = new ThreadProducer(poolObject);
		ThreadConsumer consumer = new ThreadConsumer(poolObject);
		ThreadConsumer consumer2 = new ThreadConsumer(poolObject);

		(new Thread(producer)).start();
		(new Thread(consumer)).start();
		(new Thread(consumer2)).start();
	}

}
