package net.basilcam.leetcode.three;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwo {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        char[] array = s.toCharArray();

        if (array.length == 1) {
            return 1;
        }

        int i = 0;
        while (i < array.length) {
            int[] visited = new int[256];

            visited[array[i]] = i+1;

            int nexti = i + 1;
            int j = i + 1;
            while (j < array.length) {
                int vis = visited[array[j]];
                if (vis != 0) {
                    nexti = vis;
                    break;
                }

                visited[array[j]] = j+1;
                j++;
            }
            if (j - i > longestSubstringLength) {
                longestSubstringLength = j - i;
            }
            i = nexti;
            if (longestSubstringLength > array.length - i) {
                break;
            }
        }

        return longestSubstringLength;
    }
}
