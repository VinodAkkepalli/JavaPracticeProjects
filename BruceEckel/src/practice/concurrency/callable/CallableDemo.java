package practice.concurrency.callable;

/**
 * 
 * <b>Description</b> : code to demonstrate Callable interface to and its use
 * case to return a value after execution of the task
 * 
 * @author Vinod Akkepalli
 *
 */

public class CallableDemo {

	private CallableDemo() {
	}

	public static void main(String[] args) throws Exception {

		CallableFactorialCalcTask task = new CallableFactorialCalcTask(6);

		// task.call() will start execution of a task; similar to task.start()
		System.out.println(task.call());

	}

}
