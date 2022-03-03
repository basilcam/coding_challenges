package net.basilcam.educative.pointers;

import java.util.Arrays;

public class TripletSumCloseToTarget {

    public static int searchTriplet(int[] array, int targetSum) {
        int closestSum = -1;
        int closestDistanceToTargetSum = Integer.MAX_VALUE;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            int leftIndex = i + 1;
            int rightIndex = array.length - 1;

            while (leftIndex < rightIndex) {
                int sum = array[i] + array[leftIndex] + array[rightIndex];
                int distanceToTargetSum = Math.abs(targetSum - sum);

                if (distanceToTargetSum == 0) {
                    return targetSum;
                }

                if (distanceToTargetSum < closestDistanceToTargetSum) {
                    closestDistanceToTargetSum = distanceToTargetSum;
                    closestSum = sum;
                }

                if (sum > targetSum) { // need to go smaller
                    rightIndex--;
                } else {
                    leftIndex++;
                }
            }
        }
        return closestSum;
    }
}
