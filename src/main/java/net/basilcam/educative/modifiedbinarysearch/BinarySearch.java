package net.basilcam.educative.modifiedbinarysearch;

public class BinarySearch {
    // array is sorted, but whether it's ascending or descending is unknown
    // return the index of key, -1 if not found

    public static int search(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        } else if (array.length == 1) {
            return array[0] == key ? 0 : -1;
        }

        int startIndex = 0;
        int endIndex = array.length - 1;
        boolean isAscending = array[startIndex] < array[endIndex];

        int midIndex = startIndex + (endIndex - startIndex) / 2;
        while (startIndex <= endIndex) {
            if (key == array[midIndex]) {
                return midIndex;
            } else if (key < array[midIndex]) {
                startIndex = isAscending ? 0 : midIndex + 1;
                endIndex = isAscending ? midIndex - 1 : endIndex;
            } else {
                startIndex = isAscending ? midIndex + 1 : 0;
                endIndex = isAscending ? endIndex : midIndex + 1;
            }
            midIndex = startIndex + (endIndex - startIndex) / 2;
        }

        return -1;
    }
}
