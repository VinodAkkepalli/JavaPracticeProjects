package myThreads;


public class PrioritiesPractice implements Runnable{

	public static void main(String[] args) {
	//	(new PrioritiesPractice()).start();
		System.out.println("Main Thread");
	}

	@Override
	public void run() {
		Thread.currentThread().setPriority(10);
		System.out.println("child Thread priority : " + Thread.currentThread().getPriority());
	}

}
