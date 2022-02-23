package net.basilcam.educative.window;

import java.util.HashMap;
import java.util.HashSet;

public class NoRepeatSubstring {
    public static int findLength_naive(String str) {
        HashSet<Character> seen = new HashSet<>();
        int maxLength = 0;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char c = str.charAt(windowEnd);

            while (seen.contains(c)) {
                char c1 = str.charAt(windowStart);
                seen.remove(c1);
                windowStart++;
            }
            seen.add(c);

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static int findLength(String str) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int maxLength = 0;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char c = str.charAt(windowEnd);

            if (seen.containsKey(c)) {
                // we don't need to remove the characters no longer in the window, given the max function
                windowStart = Math.max(windowStart, seen.get(c) + 1);
            }
            seen.put(c, windowEnd);

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
