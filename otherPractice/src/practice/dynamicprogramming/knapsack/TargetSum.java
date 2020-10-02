package practice.dynamicprogramming.knapsack;

/**
 * <b>Description</b> :
 * https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
 * Given a set of non-negative integers, and a value sum, determine if there is a
 * subset of the given set with sum equal to given sum.
 * https://www.youtube.com/watch?v=Hw6Ygp3JBYw&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=12
 *
 * @author Vinod Akkepalli
 */
public class TargetSum {

    public static void main(String[] args) {
        /*int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;*/

        int[] arr = {3, 34, 4, 12, 5, 2, 27};
        int sum = 21;

        boolean sumExists = targetSumRec(arr, sum, arr.length-1);

        System.out.println("Target sum exists: " + sumExists);

        sumExists = targetSumTDBU(arr, sum);
        System.out.println("Target sum exists(Bottom-up): " + sumExists);

    }

    private static boolean targetSumRec(int[] arr, int sum, int ri) {
        if(sum == 0) {
            return true;
        }

        if(ri < 0) {
            return false;
        }

        if(arr[ri] <= sum) {
            return targetSumRec(arr, sum-arr[ri], ri-1) || targetSumRec(arr, sum, ri-1);
        } else {
            return targetSumRec(arr, sum, ri-1);
        }
    }

    private static boolean targetSumTDBU(int[] arr, int sum) {
        int l = arr.length;
        boolean[][] dp = new boolean[l+1][sum+1];

        for (int i = 0; i < l; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= sum; j++) {
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i][j-arr[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[l][sum];
    }

}
