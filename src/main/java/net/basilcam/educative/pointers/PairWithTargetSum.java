package net.basilcam.educative.pointers;

import java.util.HashMap;
import java.util.Map;

public class PairWithTargetSum {

    // array is sorted
    // find indices of pair who's sum is equal to given target

    public static int[] search(int[] array, int targetSum) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (rightIndex > leftIndex) {
            int sum = array[leftIndex] + array[rightIndex];

            if (sum < targetSum) {
                leftIndex++;
            } else if (sum > targetSum) {
                rightIndex++;
            } else {
                return new int[]{leftIndex, rightIndex};
            }
        }

        return new int[] {-1, -1};
    }

    public static int[] search2(int[] array, int targetSum) {
        Map<Integer, Integer> numberToIndex = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            numberToIndex.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int complement = targetSum - num;

            int complementIndex = numberToIndex.getOrDefault(complement, -1);
            if (complementIndex != -1) {
                return new int[] {i, complementIndex};
            }
        }

        return new int[] {-1, -1};
    }
}
