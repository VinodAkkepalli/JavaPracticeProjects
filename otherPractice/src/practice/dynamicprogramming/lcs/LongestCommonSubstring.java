package practice.dynamicprogramming.lcs;

/**
 * 
 * @author Vinod Akkepalli
 *
 *         Problem description: Given two strings, find the length of the
 *         longest common substring
 * 
 *         https://www.geeksforgeeks.org/longest-common-substring/
 *         https://www.youtube.com/watch?v=BysNXJHzCEs
 *
 */

public class LongestCommonSubstring {

	public static void main(String[] args) {
		LongestCommonSubstring lcs = new LongestCommonSubstring();
		char[] str1 = "GeeksforGeeks".toCharArray();
		char[] str2 = "GeeksQuiz".toCharArray();
		System.out.println(lcs.longestCommonSubstring(str1, str2));
		System.out.println(lcs.longestCommonSubstringRec(str1, str2, str1.length - 1, str2.length - 1, false));
	}

	
	//Dynamic Programming solution
	public int longestCommonSubstring(char[] str1, char[] str2) {
		int[][] T = new int[str1.length + 1][str2.length + 1];

		int max = 0;
		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {
				if (str1[i - 1] == str2[j - 1]) {
		
					T[i][j] = T[i - 1][j - 1] + 1;
					if (max < T[i][j]) {
						max = T[i][j];
					}
				}
			}
		}
		return max;
	}

	
	//Recursive way of calculating lcs
	public int longestCommonSubstringRec(char[] str1, char[] str2, int pos1, int pos2, boolean checkEqual) {
		if (pos1 == -1 || pos2 == -1) {
			return 0;
		}
		if (checkEqual) {
			if (str1[pos1] == str2[pos2]) {
				return longestCommonSubstringRec(str1, str2, pos1 - 1, pos2 - 1, true) + 1;
			} else {
				return 0;
			}
		}
		int r1 = 0;
		if (str1[pos1] == str2[pos2]) {
			r1 = longestCommonSubstringRec(str1, str2, pos1 - 1, pos2 - 1, true) + 1;
		}
		return Math.max(r1, Math.max(longestCommonSubstringRec(str1, str2, pos1 - 1, pos2, false),
				longestCommonSubstringRec(str1, str2, pos1, pos2 - 1, false)));
	}
}