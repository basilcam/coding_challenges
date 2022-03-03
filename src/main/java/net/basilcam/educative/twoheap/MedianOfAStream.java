package net.basilcam.educative.twoheap;

import java.util.PriorityQueue;

public class MedianOfAStream {
    private final PriorityQueue<Integer> leftHeap;
    private final PriorityQueue<Integer> rightHeap;

    MedianOfAStream() {
        leftHeap = new PriorityQueue<>((a, b) -> b - a); // max heap
        rightHeap = new PriorityQueue<>((a, b) -> a - b); // min heap
    }

    public void insertNum(int num) {
        if (this.rightHeap.size() > 0 && num > this.rightHeap.peek()) {
           this.rightHeap.add(num);
        } else {
            this.leftHeap.add(num);
        }

        if (this.leftHeap.size() > this.rightHeap.size() + 1) {
            this.rightHeap.add(this.leftHeap.remove());
        } else if (this.rightHeap.size() > this.leftHeap.size() + 1) {
            this.leftHeap.add(this.rightHeap.remove());
        }
    }

    public double findMedian() {
        if (this.leftHeap.size() == 0 && this.rightHeap.size() == 0) {
            return Double.NaN;
        }

        if (this.leftHeap.size() > this.rightHeap.size()) {
            return this.leftHeap.peek();
        } else if (this.leftHeap.size() < this.rightHeap.size()) {
            return this.rightHeap.peek();
        } else {
            return (this.leftHeap.peek() + this.rightHeap.peek()) / 2.0;
        }
    }
}
