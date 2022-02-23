package net.basilcam.educative.window;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSumSubArray_naive(int k, int[] array) {
        // O(N * k);
        assert k <= array.length;

        int maxSum = 0;
        for (int i = 0; i <= array.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static int findMaxSumSubArray(int k, int[] array) {
        // O(N)
        assert k <= array.length;

        int maxSum = 0;
        int sum = 0;

        int windowEnd = 0;
        while (windowEnd < k) {
            sum += array[windowEnd];
            windowEnd++;
        }

        maxSum = Math.max(sum, maxSum);

        int windowStart = 0;
        while (windowEnd < array.length) {
            sum += array[windowEnd];
            sum -= array[windowStart];
            maxSum = Math.max(sum, maxSum);
            windowEnd++;
            windowStart++;
        }

        return maxSum;
    }
}
