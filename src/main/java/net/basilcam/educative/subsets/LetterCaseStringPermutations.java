package net.basilcam.educative.subsets;

import java.util.ArrayList;
import java.util.List;

public class LetterCaseStringPermutations {

    public static List<String> findLetterCaseStringPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add("");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int queueSize = permutations.size();
            for (int j = 0; j < queueSize; j++) {
                String perm = permutations.remove(0);
                if (Character.isLetter(c)) {
                    permutations.add(perm + Character.toUpperCase(c));
                    permutations.add(perm + Character.toLowerCase(c));
                } else {
                    permutations.add(perm + c);
                }
            }
        }

        return permutations;
    }
}
