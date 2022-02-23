package net.basilcam.educative.pointers;

public class RemoveDuplicates {

    // array is sorted
    // remove all duplicates
    // you may not use any extra space


    // basically just shifting everything over

    public static int remove(int[] array) {
        int copyIndex = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                array[copyIndex] = array[i];
                copyIndex++;
            }
        }

        return copyIndex;
    }
}
