package net.basilcam.educative.window;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {

    // each basket can hold one type of fruit
    // each basket can hold an unlimited amount of fruit
    // you must choose a tree to start with
    // you must pick one fruit per tree, you can't skip a tree

    // simplification...
    // find the longest substring with 2 distinct characters

    public static int findLength(char[] array) {

        Map<Character, Integer> characterCounts = new HashMap<>();
        int distinctCount = 0;
        int maxLength = 0;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            char c = array[windowEnd];
            int count = characterCounts.getOrDefault(c, 0);
            if (count == 0) {
                distinctCount++;
            }
            characterCounts.put(c, ++count);

            while (distinctCount > 2) {
                char c1 = array[windowStart];
                int count1 = characterCounts.get(c1);
                characterCounts.put(c1, --count1);
                if (count1 == 0) {
                    distinctCount--;
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
