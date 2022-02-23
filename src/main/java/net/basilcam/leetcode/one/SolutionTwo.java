package net.basilcam.leetcode.one;

// 01 - Two Sum

import java.util.HashMap;
import java.util.Map;

public class SolutionTwo {
    public int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int otherNumber = target - nums[i];
            Integer otherNumberIndex = map.get(otherNumber);
            if (otherNumberIndex != null && otherNumberIndex != i) {
                return new int[]{i, otherNumberIndex};
            }
        }
        return new int[0];
    }
}
