package mit.bestsum;

public class best {
    public static int maxBestSum(int[] arr, int n, int k) {
        // Initialize variables
        int maxValue = Integer.MIN_VALUE;
        int[][] dp = new int[n][k + 1];

        // Calculate prefix sums
        int[] prefixSums = new int[n];
        prefixSums[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSums[i] = prefixSums[i - 1] + arr[i];
        }

        // Fill the first row of the DP table with prefix sums
        for (int i = 0; i < k + 1; i++) {
            dp[0][i] = prefixSums[0];
        }

        // Fill the remaining rows of the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                int minSum = Integer.MAX_VALUE;
                for (int m = 0; m < i; m++) {
                    int currentSum = prefixSums[i] - prefixSums[m] + dp[m][j - 1];
                    minSum = Math.min(minSum, currentSum);
                }
                dp[i][j] = minSum;
            }
        }

        // Find the maximum value of bestsum
        for (int i = 1; i <= k; i++) {
            maxValue = Math.max(maxValue, dp[n - 1][i]);
        }

        return maxValue;
    }
    public static void main(String args[]){
        int[] input1 = {1, 2, 3, 4};
        int input2 = 4;
        int input3 = 2;
        int output = maxBestSum(input1, input2, input3);
        System.out.println(output);
    }
    
}
