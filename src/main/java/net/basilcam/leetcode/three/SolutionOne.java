package net.basilcam.leetcode.three;


public class SolutionOne {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            int[] chars = new int[255];

            int j = i;
            while (j < array.length) {
                if (chars[array[j]] == 1) {
                    break;
                }
                chars[array[j]] = 1;
                j++;
            }

            if (j - i > longestSubstringLength) {
                longestSubstringLength = j - i;
            }

            // for efficiency
            if (longestSubstringLength > array.length - i) {
                break;
            }
        }

        return longestSubstringLength;
    }
}
