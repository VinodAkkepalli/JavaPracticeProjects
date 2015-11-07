package practice.general.arrays;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Problem Statement:
 *	Find a maximum sum in a largest contiguous subarray
 *	http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 *	
 *	Solution:
 *	Follow dynamic programming approach to store previous max to compare with current
 *
 *	TC: O(n)
 */

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		
		int[] a =  {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println("Maximum sum is: " + maxSubArraySum(a, a.length));
	}

	private static int maxSubArraySum(int[] a, int length) {

		int max_so_far = a[0];
		int cur_max = a[0];
		
		for(int i = 0 ; i<length; i++){
			cur_max = Math.max(a[i], cur_max+a[i]);
			max_so_far = Math.max(max_so_far, cur_max);
		}
		
		return max_so_far;
	}
}
