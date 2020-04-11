package practice.concurrency;

/**
 * <b>Description</b> : Code to demonstrate ThreadLocal object
 *
 * @author Vinod Akkepalli
 */
public class ThreadLocalDemo implements Runnable {

    private Integer shareInteger;
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        ThreadLocalDemo sharedObject = new ThreadLocalDemo();
        Thread t1 = new Thread(sharedObject);
        Thread t2 = new Thread(sharedObject);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("**values accessed from main thread**");
        System.out.println("Shared Integer is: " + sharedObject.shareInteger);
        System.out.println("ThreadLocal Object reference is: " + sharedObject.threadLocal);
        System.out.println("ThreadLocal Object valueis: " + sharedObject.threadLocal.get());

    }

    @Override
    public void run() {

        synchronized (ThreadLocalDemo.class) {
            threadLocal.set((int) (Math.random() * 100));
            shareInteger = (int) (Math.random() * 100);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //This Object is expected to be same for both threads
        System.out.println(Thread.currentThread().getName() + "::ThreadLocal Object : " + threadLocal);
        //This value is local to each thread
        System.out.println(Thread.currentThread().getName() + "::ThreadLocal Integer value : " + threadLocal.get());
        //This value is different for each thread, but final value is retained
        System.out.println(Thread.currentThread().getName() + "::shared Integer value: " + shareInteger);
    }
}
