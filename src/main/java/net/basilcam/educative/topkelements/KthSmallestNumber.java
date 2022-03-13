package net.basilcam.educative.topkelements;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestNumber {

    public static int findKthSmallestNumber(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(nums[i]);
            }
        }

        return maxHeap.peek();
    }
}
