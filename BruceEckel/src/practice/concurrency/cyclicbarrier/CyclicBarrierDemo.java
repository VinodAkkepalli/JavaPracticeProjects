package practice.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 
 * <b>Description</b> : Multi-Threading CyclicBarrier demo code to achieve
 * thread execution flow control
 * 
 * @author Vinod Akkepalli
 *
 */

public class CyclicBarrierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final CyclicBarrier cb = new CyclicBarrier(4, new Runnable() {
			@Override
			public void run() {
				// This task will be executed once all thread reaches barrier
				System.out.println(
						"All parties are arrived at barrier, lets start execution!!!");
			}
		});

		ServiceCreator sc1 = new ServiceCreator("EarthService", cb);
		ServiceCreator sc2 = new ServiceCreator("WaterService", cb);
		ServiceCreator sc3 = new ServiceCreator("FireService", cb);
		ServiceCreator sc4 = new ServiceCreator("AirService", cb);
		ServiceCreator sc5 = new ServiceCreator("PeaceService", cb);

		new Thread(sc1).start();
		new Thread(sc2).start();
		new Thread(sc3).start();
		new Thread(sc4).start();
		new Thread(sc5).start();
	}

}
