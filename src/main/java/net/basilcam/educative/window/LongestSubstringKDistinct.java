package net.basilcam.educative.window;

public class LongestSubstringKDistinct {
    // find the longest substring with no more than k distinct characters

    public static int findLength(String str, int k) {
        int maxLength = 0;
        int[] seenCounts = new int[256];
        int distinctCount = 0;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char c = str.charAt(windowEnd);
            if (seenCounts[c] == 0) {
                distinctCount++;
            }
            seenCounts[c]++;

            while (distinctCount > k) {
                char c1 = str.charAt(windowStart);
                seenCounts[c1]--;
                if (seenCounts[c1] == 0) {
                    distinctCount--;
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
