package net.basilcam.educative.modifiedbinarysearch;

public class NextLetter {

    // letters is sorted ascending
    // find the smallest letter greater than key
    // assume letters is circular
    // - if the first element is the key, return the last element

    public static char search(char[] letters, char key) {
        char smallestLarger = Character.MAX_VALUE;

        int startIndex = 0;
        int endIndex = letters.length - 1;
        int midIndex = calculateMidIndex(startIndex, endIndex);
        while (startIndex <= endIndex) {
            if (letters[midIndex] < key) {
                startIndex = midIndex + 1;
                midIndex = calculateMidIndex(startIndex, endIndex);
            } else if (letters[midIndex] > key) {
                if (letters[midIndex] < smallestLarger) {
                    smallestLarger = letters[midIndex];
                }
                endIndex = midIndex - 1;
                midIndex = calculateMidIndex(startIndex, endIndex);
            } else {
                if (midIndex == letters.length-1) {
                    return letters[0];
                }
                return letters[midIndex+1];
            }
        }

        if (smallestLarger == Character.MAX_VALUE) {
            return letters[0];
        }

        return smallestLarger;
    }

    private static int calculateMidIndex(int startIndex, int endIndex) {
        return startIndex + (endIndex - startIndex) / 2;
    }
}
