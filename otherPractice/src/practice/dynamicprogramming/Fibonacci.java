package practice.dynamicprogramming;

import java.util.Arrays;

/**
 * 
 * @author VinodAkkepalli
 *
 *	Using Dynamic Programming technique to efficiently find Nth number in fibonacci sequence
 *	In Dynamic programming we trade space for time.
 *	
 *	Method: fibMem(int) uses extra memory for storage and is fast
 *	Demonstrates Memorization technique
 *
 *	Method: int fibRec(int) uses simple recursion
 *	This method takes long time print answer on console
 */

public class Fibonacci {

	long[] fibArr;
	
	public static void main(String[] args) {
		
		int n = 46;
		Fibonacci ob = new Fibonacci();
		ob.fibArr = new long[n];
		
		ob.fibMem(n);
		System.out.println("Fibonacci sequence using DP is = " + Arrays.toString(ob.fibArr));
		System.out.println("Fibonacci value using DP is = " + ob.fibArr[n-1]);
		
		System.out.println("Fibonacci value using simple recursion is = " + ob.fibRec(n-1));
	}

	// Uses Dynamic programming memorization technique
	private void fibMem(int n) {
	
		fibArr[0] = 0;
		fibArr[1] = 1;
		for (int i = 2; i<n; i++){
			fibArr[i] = fibArr[i-1]+fibArr[i-2];
		}
		 
	}
	
	// Uses recursion technique
	private int fibRec(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return fibRec(n-1) + fibRec(n-2);
		}
	}
	
}
