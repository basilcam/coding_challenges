package net.basilcam.datastructures;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    // invariants:
    // - all levels of the tree are completely occupied, except the last level
    // - the root value is minimum. this is recursively true for all sub trees

    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int getSize() {
        return this.size;
    }

    public int getMin() {
        if (this.size == 0) {
            return Integer.MAX_VALUE;
        }

        return this.heap[0];
    }

    public int popMin() {
        if (this.size == 0) {
            return Integer.MAX_VALUE;
        }
        if (this.size == 1) {
            this.size--;
            return heap[0];
        }

        int minElement = this.heap[0];

        // move smallest element to top of heap and heapify
        this.heap[0] = this.heap[this.size - 1];
        this.size--;
        downHeapify(0);

        return minElement;
    }

    public void insert(int element) {
        // insert new element at bottom of heap
        this.heap[this.size] = element;

        upHeapify(this.size);
        this.size++;
    }

    public List<List<Integer>> getLevels() {
        List<List<Integer>> levels = new ArrayList<>();

        if (this.size == 0) {
            return levels;
        }

        List<Integer> queue = new ArrayList<>();
        queue.add(0, 0);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                int index = queue.remove(0);
                level.add(0, this.heap[index]);

                int leftChildIndex = getLeftChildIndex(index);
                if (leftChildIndex < this.size) {
                    queue.add(0, leftChildIndex);
                }

                int rightChildIndex = getRightChildIndex(index);
                if (rightChildIndex < this.size) {
                    queue.add(0, rightChildIndex);
                }
            }
            levels.add(level);
        }

        return levels;
    }

    public List<List<Integer>> getPaths() {
        return getPaths(0);
    }

    private List<List<Integer>> getPaths(int index) {
        List<List<Integer>> paths = new ArrayList<>();

        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        // leaf base case
        if (leftChildIndex >= this.size && rightChildIndex >= this.size) {
            List<Integer> path = new ArrayList<>();
            path.add(this.heap[index]);
            paths.add(path);
            return paths;
        }

        if (leftChildIndex < this.size) {
            paths.addAll(getPaths(leftChildIndex));
        }
        if (rightChildIndex < this.size) {
            paths.addAll(getPaths(rightChildIndex));
        }

        for (List<Integer> path : paths) {
            path.add(0, this.heap[index]);
        }

        return paths;
    }

    private void upHeapify(int index) {
        // iteratively swap element with parent element until parent element is smaller

        while (heap[index] < heap[getParentIndex(index)]) {
            int parentIndex = getParentIndex(index);
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void downHeapify(int index) {
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        // swap with smallest of children, if any
        int smallestIndex = index;
        if (leftChildIndex < this.size && heap[leftChildIndex] < heap[rightChildIndex]) {
            smallestIndex = leftChildIndex;
        }
        if (rightChildIndex < this.size && heap[rightChildIndex] < heap[smallestIndex]) {
            smallestIndex = rightChildIndex;
        }

        if (smallestIndex != index) {
            swap(index, smallestIndex);
            downHeapify(smallestIndex);
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = this.heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }

    private static int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private static int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private static int getRightChildIndex(int index) {
        return 2 * index + 2;
    }
}
