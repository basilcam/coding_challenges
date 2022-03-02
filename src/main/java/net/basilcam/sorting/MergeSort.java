package net.basilcam.sorting;

public class MergeSort {

    // big-o:
    // visualize the sorting as a binary tree with log(n) levels
    // at each level, we perform n comparisons merging
    // for example...
    // at level 1: 1 division, n-1 comparisons in merge => n-1
    // at level 2: 2 divisions, (n/2-1) comparisons in each merge => 2 * (n-1)/2 = n-2
    // at level 3: 4 divisions, (n/4-1) comparisons in each merge => 4 * (n-1)/4 = n-4
    // ... thus O(log n) divisions and O(n) per division => O(n log n)

    // base case: T(1) = 0
    // recursive relationship: T(n) = T(n/2) + T(n/2) + (n-1)


    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;

        sort(array, 1, middleIndex);
        sort(array, middleIndex + 1, endIndex);

        merge(array, startIndex, middleIndex, endIndex);
    }

    public static void merge(int[] array, int startIndex, int middleIndex, int endIndex) {
        int leftSize = middleIndex - startIndex + 1;
        int rightSize = endIndex - middleIndex;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // create temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[startIndex + i];
        }
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[middleIndex + 1 + i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int destIndex = startIndex;
        // copy elements from left and right array in increasing order
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[destIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[destIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            destIndex++;
        }

        // copy any remaining left elements
        while (leftIndex < leftSize) {
            array[destIndex] = leftArray[leftIndex];
            leftIndex++;
            destIndex++;
        }

        // copy any remaining right elements
        while (rightIndex < rightSize) {
            array[destIndex] = rightArray[rightIndex];
            rightIndex++;
            destIndex++;
        }
    }
}
