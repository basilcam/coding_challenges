package net.basilcam.leetcode.three;

public class SolutionThree {
    public int lengthOfLongestSubstring(String s) {
        int[] visited = new int[128];
        char[] array = s.toCharArray();
        int longestSubstringLength = 0;

        int leftIndex = 0;
        int rightIndex = 0;
        while (rightIndex < array.length) {
            char rightChar = array[rightIndex];

            while (visited[rightChar] == 1) {
                char leftChar = array[leftIndex];
                visited[leftChar] = 0;
                leftIndex++;
            }
            visited[rightChar] = 1;

            longestSubstringLength = Math.max(longestSubstringLength, rightIndex - leftIndex + 1);
            rightIndex++;
        }
        return longestSubstringLength;
    }
}
