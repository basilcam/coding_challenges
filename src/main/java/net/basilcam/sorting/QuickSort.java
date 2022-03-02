package net.basilcam.sorting;

public class QuickSort {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex];

        // leftIndex is next smallest position
        int leftIndex  = startIndex - 1;
        for (int rightIndex = startIndex; rightIndex < endIndex; rightIndex++) {
            if (array[rightIndex] < pivot) {
                leftIndex++;
                swap(array, leftIndex, rightIndex);
            }
        }

        swap(array, leftIndex+1, endIndex);
        return leftIndex + 1;
    }

    private static void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(array, startIndex, endIndex);
        sort(array, startIndex, pivotIndex - 1);
        sort(array, pivotIndex + 1, endIndex);
    }
}
