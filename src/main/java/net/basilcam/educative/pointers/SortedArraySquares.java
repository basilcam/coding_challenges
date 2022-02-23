package net.basilcam.educative.pointers;

public class SortedArraySquares {

    // array is sorted
    // return a sorted array containing the squares of each element of array

    public static int[] makeSquares_naive(int[] array) {
        int[] squares = new int[array.length];

        int negIndex = 0;
        int posIndex = 0;
        while (posIndex < array.length) {
            if (array[posIndex] >= 0) {
                break;
            }
            posIndex++;
        }

        negIndex = posIndex - 1; // could be negative

        int i = 0;
        while (negIndex >= 0 && posIndex < array.length) {
            int posValue = array[posIndex];
            int posValSquared = posValue * posValue;
            int negValue = array[negIndex];
            int negValSquared = negValue * negValue;

            if (posValSquared < negValSquared) {
                squares[i] = posValSquared;
                posIndex++;
            } else if (posValSquared > negValSquared) {
                squares[i] = negValSquared;
                negIndex--;
            } else {
                squares[i] = posValSquared;
                squares[i + 1] = negValSquared;
                posIndex++;
                negIndex--;
                i++;
            }
            i++;
        }

        while (negIndex >= 0) {
            squares[i] = array[negIndex] * array[negIndex];
            negIndex++;
            i++;
        }

        while (posIndex < array.length) {
            squares[i] = array[posIndex] * array[posIndex];
            posIndex++;
            i++;
        }

        return squares;
    }

    // start at the extremes instead of the pos/neg divide

    public static int[] makeSquares(int[] array) {
        int[] squares = new int[array.length];

        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int i = array.length - 1;

        while (leftIndex <= rightIndex) {
            int leftVal = array[leftIndex] * array[leftIndex];
            int rightVal = array[rightIndex] * array[rightIndex];

            if (leftVal > rightVal) {
                squares[i--] = leftVal;
                leftIndex++;
            } else {
                squares[i--] = rightVal;
                rightIndex--;
            }
        }

        return squares;
    }
}
