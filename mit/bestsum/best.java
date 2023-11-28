package mit.bestsum;

public class best {
    public static int maxBestSum(int[] array, int n, int k) {
        int left = 0, right = 0;

        // Find the range of possible best sums
        for (int num : array) {
            left = Math.max(left, num);
            right += num;
        }

        // Perform binary search to find the maximum value within the range
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(array, n, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean isValid(int[] array, int n, int k, int maxSum) {
        int segments = 0, currentSum = 0;

        for (int num : array) {
            currentSum += num;

            if (currentSum > maxSum) {
                segments++;
                currentSum = num;
            }
        }

        // Count the last segment
        segments++;

        // Check if the number of segments is less than or equal to k
        return segments <= k;
    }
    public static void main(String args[]){
        int[] input1 = {1, 2, 3, 4};
        int input2 = 4;
        int input3 = 2;
        int output = maxBestSum(input1, input2, input3);
        System.out.println(output);
    }
    
}
