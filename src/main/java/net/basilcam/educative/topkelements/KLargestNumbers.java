package net.basilcam.educative.topkelements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestNumbers {

    // time complexity:
    // - initial k insertions: k log(k)
    // - subsequent n-k insertions: (n-k) log(k)
    // - total: O(n log k)

    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minQueue.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            int current = nums[i];
            int smallest = minQueue.peek();

            if (current > smallest) {
                minQueue.add(current);
                minQueue.remove();
            }
        }

        List<Integer> largest = new ArrayList<>();
        while (!minQueue.isEmpty()) {
            largest.add(minQueue.remove());
        }
        return largest;
    }
}
