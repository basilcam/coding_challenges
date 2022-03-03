package net.basilcam.educative.twoheap;

import java.util.PriorityQueue;

public class SlidingWindowMedian {
    private final PriorityQueue<Integer> leftValues;
    private final PriorityQueue<Integer> rightValues;

    public SlidingWindowMedian() {
        this.leftValues = new PriorityQueue<>((a, b) -> b - a);
        this.rightValues = new PriorityQueue<>((a, b) -> a - b);
    }

    public double[] findSlidingWindowMedian(int[] nums, int k) {
        double[] medians = new double[nums.length - k + 1];

        int leftIndex = 0;
        int rightIndex = 0;
        int windowIndex = 0;

        while (rightIndex < k - 1) {
            insertNum(nums[rightIndex]);
            rightIndex++;
        }

        while (rightIndex < nums.length) {
            if (leftIndex >= 1) {
                removeNum(nums[leftIndex-1]);
            }
            insertNum(nums[rightIndex]);

            medians[windowIndex] = getMedian();

            leftIndex++;
            rightIndex++;
            windowIndex++;
        }

        return medians;
    }

    private double getMedian() {
        if (this.leftValues.size() == 0 && this.rightValues.size() == 0) {
            return Double.NaN;
        }

        if (this.leftValues.size() > this.rightValues.size()) {
            return this.leftValues.peek();
        } else if (this.leftValues.size() < this.rightValues.size()) {
            return this.rightValues.peek();
        } else {
            return (this.leftValues.peek() + this.rightValues.peek()) / 2.0;
        }
    }

    private void insertNum(int num) {
        if (this.rightValues.size() > 0 && num > this.rightValues.peek()) {
            this.rightValues.add(num);
        } else {
            this.leftValues.add(num);
        }

        rebalance();
    }

    private void removeNum(int num) {
        if (this.rightValues.size() > 0 && num >= this.rightValues.peek()) {
            this.rightValues.remove(num);
        } else {
            this.leftValues.remove(num);
        }

        rebalance();
    }

    private void rebalance() {
        if (this.leftValues.size() > this.rightValues.size() + 1) {
            this.rightValues.add(this.leftValues.remove());
        } else if (this.rightValues.size() > this.leftValues.size() + 1) {
            this.leftValues.add(this.rightValues.remove());
        }
    }
}
