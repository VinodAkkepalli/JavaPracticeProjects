package practice.dynamicprogramming;

/**
 * 
 * @author Vinod Akkepalli 
 * 		Problem Description: Given two sequences, find the
 *         length of longest subsequence present in both of them. A subsequence
 *         is a sequence that appears in the same relative order, but not
 *         necessarily contiguous.
 *         https://www.geeksforgeeks.org/longest-common-subsequence/
 */

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char[] s1Chr = s1.toCharArray();
		char[] s2Chr = s2.toCharArray();

		System.out.println("Length of Longest Common Subsequence using DP approach is" + " " + longestCommonSubsequenceDPBU(s1Chr, s2Chr));
		System.out.println("Length of Longest Common Subsequence using Recursive approach is" + " "
				+ longestCommonSubsequenceRec(s1Chr, s2Chr, s1Chr.length, s2Chr.length));
	}

	// Recursive approach with TC(2^n)
	// Returns length of LCS for X[0..m-1], Y[0..n-1]
	static int longestCommonSubsequenceRec(char[] X, char[] Y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (X[m - 1] == Y[n - 1])
			return 1 + longestCommonSubsequenceRec(X, Y, m - 1, n - 1);
		else
			return Math.max(longestCommonSubsequenceRec(X, Y, m, n - 1), longestCommonSubsequenceRec(X, Y, m - 1, n));
	}

	// Dynamic Programming approach with TC O(m*n)
	private static int longestCommonSubsequenceDPBU(char[] str1, char[] str2) {

		int m = str1.length;
		int n = str2.length;

		// lcs[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
		int[][] lcs = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else if (str1[i - 1] == str2[j - 1]) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
				}
			}
		}

		/*
		 * for (int i = 0; i <= m; i++) { System.out.println(Arrays.toString(lcs[i])); }
		 */
		return lcs[m][n];
	}
}
