package net.basilcam.educative.window;

import java.util.Arrays;

public class MinSizeSubArraySum {
    public static int findMinSubArray(int s, int[] array) {
        assert s > 0;
        assert Arrays.stream(array).allMatch(i -> i > 0);

        int minSize = Integer.MAX_VALUE;
        int sum = 0;

        int windowStart = 0;
        int windowEnd = 0;

        while (windowEnd < array.length) {
            sum += array[windowEnd];

            while (sum >= s && windowStart < windowEnd) {
                sum -= array[windowStart];
                minSize = Math.min(windowEnd - windowStart + 1, minSize);
                windowStart++;
            }

            windowEnd++;
        }

        return minSize;
    }
}
