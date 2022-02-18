package net.basilcam.one;

// 01 - Two Sum

public class Solution {

    public int[] twoSums(int[] nums, int target) {
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
}
