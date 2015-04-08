package myThreads;

public class ThreadSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();

	}

}
