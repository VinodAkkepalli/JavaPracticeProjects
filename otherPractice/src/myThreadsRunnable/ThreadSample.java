package myThreadsRunnable;

public class ThreadSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadA	tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		Thread tAThread = new Thread(tA);
		Thread tBThread = new Thread(tB);
		
		tAThread.start();
		tBThread.start();
		
	}

}
