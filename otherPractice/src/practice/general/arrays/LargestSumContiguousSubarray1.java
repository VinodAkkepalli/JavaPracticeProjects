package practice.general.arrays;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Problem statement:
 *	Given an array find the maximum sum of a sub array
 */

class LargestSumContiguousSubarray1 {

	public static void main(String[] args) {

		//int[] A = { 1, 2, -3, 4, 5, -6 };
		int[] A = { 4, 5, -3, 1, 2, -6 , 5, 6};
		System.out.println(solution(A));

	}

	public static int solution(int[] S) {

		int max_sum = 0;
		int current_sum = 0;
		boolean positive = false;
		int n = S.length;
		
		for (int i = 0; i < n; ++i) {
			int item = S[i];

			if (item < 0) {
				if (max_sum < current_sum) {
					max_sum = current_sum;
				}
				current_sum = 0;			
			} else {
				positive = true;
				current_sum += item;
			}
		}
		
		if (current_sum > max_sum) {
			max_sum = current_sum;
		}
		
		if (positive) {
			return max_sum;
		}
		return -1;
	}
}