package practice.general;

/**
 * 
 * @author Vinod Akkepalli
 *
 * Pascal Triangle
 *	input : 6
 *
 *	output:
  	  1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 
 1 5 10 10 5 1 

 */

public class PascalTriangle {

	public static void main(String[] args) {
		
		printPascal(6);
	}

	//Method print a Pascal triangle
	private static void printPascal(int n){

		for(int i=0; i<n; i++){
			for(int j=1; j <= n - i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++){
				System.out.print(mathCombination(i,j) +" ");
			}
			System.out.println();
		}
	}

	//method to find combination C(n,r) = n!/(n-r)! r!
	private static int mathCombination(int n, int r) {
		
		int numerator = 1, denominator = 1;
		for(int i=n; i>n-r; i--){
			numerator = numerator * i;
		}
		for(int i=1; i<=r; i++){
			denominator = denominator * i;
		}
		return numerator/denominator;
	}
}