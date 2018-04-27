package practice.dynamicprogramming;

import java.util.Arrays;

/**
 * 
 * @author Vinod Akkepalli Problem Description: Knapsack Problem Given weights
 *         and values of n items, put these items in a knapsack of capacity W to
 *         get the maximum total value in the knapsack
 *         https://www.geeksforgeeks.org/knapsack-problem/
 *
 */
public class KnapsackProblem {

	public static void main(String[] args) {

		int values[] = new int[] { 60, 100, 120 };
		int weights[] = new int[] { 10, 20, 30 };
		int requiredWeight = 50;
		int valuesLength = values.length;
		System.out.println("Highest value is: " + knapSackRec(requiredWeight, weights, values, valuesLength));
		System.out.println("Highest value is: " + knapSackDPBU(requiredWeight, weights, values, valuesLength));
	}

	private static int knapSackRec(int requiredWeight, int[] weights, int[] values, int length) {

		if (length == 0 || requiredWeight == 0) {
			return 0;
		}

		if (weights[length - 1] <= requiredWeight) {
			return Math.max(
					values[length - 1] + knapSackRec(requiredWeight - weights[length - 1], weights, values, length - 1),
					knapSackRec(requiredWeight, weights, values, length - 1));
		} else {
			return knapSackRec(requiredWeight, weights, values, length - 1);
		}
	}

	// Dynamic programming Bottom-Up solution with TC O(requiredWeight * length)
	// Returns the maximum value that can be put in a knapsack of capacity
	// requiredWeight
	private static int knapSackDPBU(int requiredWeight, int[] weights, int[] values, int length) {
		int i, j;
		int matrix[][] = new int[length + 1][requiredWeight + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= length; i++) {
			for (j = 0; j <= requiredWeight; j++) {
				if (i == 0 || j == 0)
					matrix[i][j] = 0;
				else if (weights[i - 1] <= j)
					matrix[i][j] = Math.max(values[i - 1] + matrix[i - 1][j - weights[i - 1]], matrix[i - 1][j]);
				else
					matrix[i][j] = matrix[i - 1][j];
			}
		}
		/*
		 * for (i = 0; i < length; i++) {
		 * System.out.println(Arrays.toString(matrix[i])); }
		 */
		return matrix[length][requiredWeight];
	}

}
