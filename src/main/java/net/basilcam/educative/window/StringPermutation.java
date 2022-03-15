package net.basilcam.educative.window;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public static boolean findPermutation(String str, String pattern) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        // characterCounts keeps count of all characters in pattern
        // as we add value to window, we remove counts from characterCounts
        // as we remove value from window, we add counts from characterCounts
        // if count is 0, we remove it from the characterCounts
        // if characterCounts is empty, we have a match

        for (int i = 0; i < pattern.length(); i++) {
            char character = pattern.charAt(i);
            int count = characterCounts.getOrDefault(character, 0);
            count++;
            characterCounts.put(character, count);
        }

        int endWindow = 0;
        while (endWindow < str.length()) {
            // add to end of window
            Character c = str.charAt(endWindow);
            int count = characterCounts.getOrDefault(c, 0);
            count--;
            if (count == 0) {
                characterCounts.remove(c);
            } else {
                characterCounts.put(c, count);
            }

            if (endWindow >= pattern.length()) {
                // remove from beginning of window
                int startWindow = endWindow - pattern.length() + 1;
                c = str.charAt(startWindow - 1);
                count = characterCounts.getOrDefault(c, 0);
                count++;
                if (count == 0) {
                    characterCounts.remove(c);
                } else {
                    characterCounts.put(c, count);
                }
            }

            if (characterCounts.isEmpty()) {
                return true;
            }

            endWindow++;
        }

        return false;
    }
}
