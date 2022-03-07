package net.basilcam.educative.modifiedbinarysearch;

public class CeilingOfANumber {

    // array is sorted in ascending order
    // find the smallest element in the array >= the key


    // algorithm walkthrough
    // 1, 2, 5, 8, 10, 11, 15    search 4
    //
    // start = 0
    // end = 6
    // mid = start + (end - start)/2 = 0 + (6 - 0)/2 = 3
    // array[mid=3] = 8 >= 4 (save 8 as best so far, >= 4 and <= last saved)
    //
    // go down since last was >= 4
    // start = start = 0
    // end = mid-1 = 3-1 = 2
    // mid = start + (end - start)/2 = 0 + (2 - 0)/2 = 1
    // array[mid=1] = 2 <= 4
    //
    // go up since last was <= 4
    // start = mid+1 = 1+1 = 2
    // end = end = 2
    // mid = start + (end - start)/2 = 2 + (2 - 2)/2 = 2
    // array[mid=2] = 5 (save 5 as best so far, >= 4 and <= last saved)
    //
    // go down since last was >= 4
    // start = start = 2
    // end = mid - 1 = 2 - 1 = 1
    // start > end

    public static int search(int[] array, int key) {
        int closestCeiling = Integer.MAX_VALUE;
        int closestCeilingIndex = -1;

        int startIndex = 0;
        int endIndex = array.length - 1;
        int midIndex = calcMidIndex(startIndex, endIndex);
        while (startIndex <= endIndex) {
            System.out.println(startIndex + " " + midIndex + " " + endIndex);
            if (key < array[midIndex]) {
                if (array[midIndex] <= closestCeiling) {
                    System.out.println("saving new best " + array[midIndex]);
                    closestCeiling = array[midIndex];
                    closestCeilingIndex = midIndex;
                }
                endIndex = midIndex - 1;
                midIndex = calcMidIndex(startIndex, endIndex);
            } else if (key > array[midIndex]) {
                startIndex = midIndex + 1;
                midIndex = calcMidIndex(startIndex, endIndex);
            } else {
                return midIndex;
            }
        }
        return closestCeilingIndex;
    }

    private static int calcMidIndex(int startIndex, int endIndex) {
        return startIndex + (endIndex - startIndex) / 2;
    }
}
