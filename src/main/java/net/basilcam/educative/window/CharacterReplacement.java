package net.basilcam.educative.window;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    // string has lowercase letters only
    // you are allowed to replace at least k letters with any letter

    public static int findLength(String str, int k) {
        Map<Character, Integer> characterCount = new HashMap<>();
        int maxRepeatsInWindow = 0;

        int maxLength = 0;

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            int rightFreq = characterCount.getOrDefault(rightChar, 0);
            rightFreq++;
            characterCount.put(rightChar, rightFreq);
            maxRepeatsInWindow = Math.max(maxRepeatsInWindow, rightFreq);

            while (windowEnd - windowStart + 1 - maxRepeatsInWindow > k) {
                char leftChar = str.charAt(windowStart);
                int leftFreq = characterCount.get(leftChar);
                characterCount.put(leftChar, leftFreq - 1);
                maxRepeatsInWindow = characterCount.values().stream().mapToInt(a -> a).max().getAsInt(); // this isn't necessary apparently...
                windowStart++;
            }

            maxLength = Math.max(windowEnd - windowStart + 1, maxLength);
        }

        return maxLength;
    }

    public static int findLength_solution(String str, int k) {
        int maxLength = 0;
        int maxRepeatLetterCount = 0;

        Map<Character, Integer> letterFreq = new HashMap<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            int rightFreq = letterFreq.getOrDefault(rightChar, 0) + 1;
            letterFreq.put(rightChar, rightFreq);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, rightFreq);

            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = str.charAt(windowStart);
                int leftFreq = letterFreq.get(leftChar);
                letterFreq.put(leftChar, leftFreq - 1);
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}









