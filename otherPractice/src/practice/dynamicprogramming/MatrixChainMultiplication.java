package practice.dynamicprogramming;

/**
 * 
 * @author Vinod Akkepalli
 *
 *         Problem statement: Matrix chain multiplication Dynamic Programming
 *         approach solution Given a sequence of matrices, find the most
 *         efficient way to multiply these matrices together. The problem is not
 *         actually to perform the multiplications, but merely to decide in
 *         which order to perform the multiplications.
 *
 *         https://www.geeksforgeeks.org/?p=15553
 *
 */

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		// Matrix Ai has dimension arr[i-1] x arr[i] for i = 1..n
		//int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] arr = new int[]{10, 30, 5, 60};
		int n = arr.length;

		/* For simplicity of the program, one extra row and one extra column are allocated in m[][].  
		0th row and 0th column of m[][] are not used */
		// Minimum operations matrix
		int[][] mOp = new int[n][n];
		// Minimum operations matrix
		int[][] mOp1 = new int[n][n];
		
		System.out.println("Minimum number of multiplications is " + matrixChainOptimumMultiplications(arr, 1, n - 1));
		
		matrixChainOptimumMultiplicationsDPTD(arr, 1, n - 1, mOp);
		System.out.println("Minimum number of multiplications is " + mOp[1][n - 1]);
		
		matrixChainOptimumMultiplicationsDPBU(arr, mOp1);
		System.out.println("Minimum number of multiplications is " + mOp1[1][n - 1]);
	}

	// Recursive approach
	static int matrixChainOptimumMultiplications(int p[], int i, int j) {
		if (i == j)
			return 0;

		int min = Integer.MAX_VALUE;

		// place parenthesis at different places between first
		// and last matrix, recursively calculate count of
		// multiplications for each parenthesis placement and
		// return the minimum count
		for (int k = i; k < j; k++) {
			int count = matrixChainOptimumMultiplications(p, i, k) + matrixChainOptimumMultiplications(p, k + 1, j)
					+ p[i - 1] * p[k] * p[j];

			if (count < min)
				min = count;
		}

		//System.out.println(i + " " + j + " = " + min);
		// Return minimum count
		return min;
	}

	// Dynamic Programming approach, Top-Down
	static void matrixChainOptimumMultiplicationsDPTD(int p[], int i, int j, int[][] matrix) {
		if (i == j) {
			matrix[i][j] = 0;
			return;
		}

		int min = Integer.MAX_VALUE;
		int temp = 0;

		// place parenthesis at different places between first
		// and last matrix, recursively calculate count of
		// multiplications for each parenthesis placement and
		// return the minimum count
		for (int k = i; k < j; k++) {
			if (matrix[i][k] == 0) {
				matrixChainOptimumMultiplicationsDPTD(p, i, k, matrix);
			}
			if (matrix[k + 1][j] == 0) {
				matrixChainOptimumMultiplicationsDPTD(p, k + 1, j, matrix);
			}

			temp = matrix[i][k] + matrix[k + 1][j] + p[i - 1] * p[k] * p[j];

			if (min > temp) {
				min = temp;
			}
		}
		//System.out.println(i + "," + j + " = " + min);
		
		/* m[i,j] = Minimum number of scalar multiplications needed
        to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where
        dimension of A[i] is p[i-1] x p[i] */
		matrix[i][j] = min;
	}

	// Dynamic Programming approach, Bottom-Up
	static void matrixChainOptimumMultiplicationsDPBU(int p[], int[][] matrix) {
		int j, temp;
		int n = p.length;
		for(int i=0; i<n; i++) {
			matrix[i][i] = 0;
		}
		
		// cl is chain length ranging 2 to n-1
        for (int cl=2; cl<n; cl++){
            for (int i=1; i<n-cl+1; i++){
                j = i+cl-1;

                if(j == n) continue;
                
                matrix[i][j] = Integer.MAX_VALUE;
                
                temp = 0;
                for (int k=i; k<=j-1; k++){
                	temp = matrix[i][k] + matrix[k+1][j] + p[i-1]*p[k]*p[j];
                    if (temp < matrix[i][j])
                    	//System.out.println(i + " " + j + " = " + temp);
                        matrix[i][j] = temp;
                }
            }
        }
	}
}
