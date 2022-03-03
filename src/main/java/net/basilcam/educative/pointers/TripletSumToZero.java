package net.basilcam.educative.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
    // find all unique triplets that add up to zero

    // time complexity:
    // - sorting array: O(n log n)
    // - findPair: O(n) called n times => O(n^2)
    // - O(n log n + n^2) = O(n^2)

    public static List<List<Integer>> searchTriplets(int[] array) {
        Arrays.sort(array);

        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            triplets.addAll(findPair(array, i + 1, array[i]));
        }

        return triplets;
    }

    private static List<List<Integer>> findPair(int[] array, int startIndex, int firstValue) {
        int targetSum = -firstValue;
        int leftIndex = startIndex;
        int rightIndex = array.length - 1;

        List<List<Integer>> triplets = new ArrayList<>();

        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex
                    && leftIndex > 0
                    && array[leftIndex] == array[leftIndex-1]) {
                leftIndex++;
            }

            while (leftIndex < rightIndex
                && rightIndex < array.length - 1 && array[rightIndex] == array[rightIndex + 1]) {
                rightIndex--;
            }

            int currentSum = array[leftIndex] + array[rightIndex];

            if (currentSum < targetSum) {
                leftIndex++;
            } else if (currentSum > targetSum) {
                rightIndex--;
            } else {
                List<Integer> triplet = Arrays.asList(firstValue, array[leftIndex], array[rightIndex]);
                triplets.add(triplet);
                leftIndex++;
                rightIndex--;
            }
        }

        return triplets;
    }
}
