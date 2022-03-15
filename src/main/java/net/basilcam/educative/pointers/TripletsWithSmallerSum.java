package net.basilcam.educative.pointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {

    public static int searchTriplets(int[] array, int target) {
        Arrays.sort(array);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int pairTarget = target - array[i];
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;

            while (leftIndex < rightIndex) {
                if (array[leftIndex] + array[rightIndex] < pairTarget) {
                    // (leftIndex, rightIndex) is a pair
                    // also (leftIndex, x in [leftIndex+1, rightIndex-1]) is also a pair
                    count += (rightIndex - leftIndex);
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }

        return count;
    }
}
