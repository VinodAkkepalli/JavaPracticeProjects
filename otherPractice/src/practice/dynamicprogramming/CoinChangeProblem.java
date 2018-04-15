package practice.dynamicprogramming;

/**
 * 
 * @author Vinod Akkepalli
 *
 *	Problem Description: Given a set/array of coin "denominationsArray", find the count of 
 *	minimum number of coins required to make the sum "requiredSum"
 *
 *	https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/
 */

public class CoinChangeProblem {

	public static void main(String[] args) {
		
		int minCount = 9999;
		int requiredSum = 10;
		int[] denominationsArray = {1, 2, 3};
		
		minCount = findMinCountChange(requiredSum, minCount, denominationsArray );
		
		System.out.println("Minimum number of coins required is: " + minCount);
	}

	
	private static int findMinCountChange(int sumReq, int minCount, int[] denominationsArray) {
		int arraySize = denominationsArray.length;
		
		if(sumReq == 0) {
			return 0;
		}
		
		for(int i = 0; i < arraySize && denominationsArray[i] <= sumReq; i++) {
			 minCount = Math.min( findMinCountChange(sumReq - denominationsArray[i], 
					 minCount + 1, denominationsArray) + 1 , minCount );
		}
		return minCount;
	}
}
