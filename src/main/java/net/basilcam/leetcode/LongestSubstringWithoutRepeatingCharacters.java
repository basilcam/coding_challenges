package net.basilcam.leetcode;


public class LongestSubstringWithoutRepeatingCharacters {
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

    public int lengthOfLongestSubstring2(String s) {
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

    public int lengthOfLongestSubstring3(String s) {
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
