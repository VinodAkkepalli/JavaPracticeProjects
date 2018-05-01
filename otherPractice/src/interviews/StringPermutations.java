package interviews;

/**
 * 
 * @author Vinod Akkepalli
 *
 *         Problem Description: Print all permutations of a given string
 *         Solution is based on backtracking and recursion
 *         https://www.youtube.com/watch?v=MQcwxQK2DPA&list=PL65BCEDD6788C3F27
 *         https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */

public class StringPermutations {

	public static void main(String[] args) {
		String str = "ABCD";
		printPermutations(str, 0, str.length() - 1);
	}

	private static void printPermutations(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
			return;
		}

		for (int i = l; i <= r; i++) {
			str = swap(str, l, i);
			printPermutations(str, l + 1, r);
			str = swap(str, l, i);
		}

	}

	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
