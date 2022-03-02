package net.basilcam.leetcode;

// 01 - Two Sum

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSums_naive(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1;  j < nums.length;  j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

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
