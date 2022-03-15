package net.basilcam.educative.window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctPractice {

    public static int findLength(String str, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int distinctCharacters = 0;
        int longestSubstringLength = -1;


        int startWindow = 0;
        for (int endWindow = 0; endWindow < str.length(); endWindow++) {
            char c = str.charAt(endWindow);

            int count = counts.getOrDefault(c, 0);
            if (count == 0) {
                distinctCharacters++;
            }
            count++;
            counts.put(c, count);

            while (distinctCharacters > k) {
                c = str.charAt(startWindow);
                count = counts.get(c);
                count--;
                if (count == 0) {
                    distinctCharacters--;
                }
                counts.put(c, count);

                startWindow++;
            }

            longestSubstringLength = Math.max(longestSubstringLength, endWindow - startWindow + 1);
        }

        return longestSubstringLength;
    }
}
