package practice.concurrency.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * <b>Description</b> : ThreadPool implementation
 * https://www.youtube.com/watch?v=ZDf4EnTR9RE
 *
 *
 * @author Vinod Akkepalli
 */

public class ThreadPool {
    private final BlockingQueue<Runnable> queue;

    public ThreadPool(int nThreads) {
        queue = new LinkedBlockingQueue<>();
        PoolWorker[] threads = new PoolWorker[nThreads];

        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task);
            queue.notify();
        }
    }

    private class PoolWorker extends Thread {
        public void run() {
            Runnable task;

            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = queue.poll();
                }

                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                    task.run();
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(7);

        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            pool.execute(task);
        }
    }

}
