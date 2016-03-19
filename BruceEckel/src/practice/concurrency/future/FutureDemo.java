package practice.concurrency.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * <b>Description</b> :Code to demonstrate Future object usage during
 * asynchronous query processing
 * 
 * @author Vinod Akkepalli
 *
 */

public class FutureDemo {

	public static final ExecutorService threadPool = Executors
			.newFixedThreadPool(3);

	/**
	 * @param args
	 */
	public static void main(String[] args)
			throws InterruptedException, ExecutionException {

		DelayedResponseTask task = new DelayedResponseTask(10);
		System.out.println("Submitting Task ...");

		Future<Integer> future = threadPool.submit(task);
		System.out.println("Task is submitted");

		while (!future.isDone()) {
			System.out.println("Task is not completed yet....");
			Thread.sleep(1); // sleep for 1 millisecond before checking again
		}

		System.out.println("Task is completed, let's check result");
		int factorial = future.get();

		System.out.println("Factorial of 10 is : " + factorial);
		threadPool.shutdown();

	}
}
