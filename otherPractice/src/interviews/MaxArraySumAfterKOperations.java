package interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <b>Description</b> : Given an array of size n and a number k.
 *  We must modify array K number of times.
 *  Here modify array means in each operation we can replace any array element arr[i] by arr[i]/2.
 *  We need to perform this operation in such a way that after K operations, sum of array must be maximum?
 *
 *  Array contains only +ve numbers
 *  When division by 2 does not result in integer take ceiling of the result
 *  Problem is similar to https://www.geeksforgeeks.org/maximize-array-sum-k-negations-set-2/
 *
 *
 * @author Vinod Akkepalli
 */
public class MaxArraySumAfterKOperations {

    public static void main(String[] args) {
        int[] arr = {11, 20, 5};
        int numOpsAllowed = 2;

        findMaxSum(arr, numOpsAllowed);
    }

    private static void findMaxSum(int[] arr, int numOpsAllowed) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(arr).forEach(pQueue::add);

        System.out.println(pQueue.toString());

        while (numOpsAllowed-- > 0) {
            pQueue.add((int) Math.ceil(pQueue.poll()/2d));
        }

        AtomicInteger sum = new AtomicInteger();
        pQueue.forEach(sum::addAndGet);
        System.out.println(sum);
    }
}
