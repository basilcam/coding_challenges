package net.basilcam.educative.window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxSumSubArrayOfSizeKTest {

    @Test
    public void exampleOne() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;

        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray_naive(k, array)).isEqualTo(9);
        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, array)).isEqualTo(9);
    }

    @Test
    public void exampleTwo() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 1;

        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray_naive(k, array)).isEqualTo(5);
        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, array)).isEqualTo(5);
    }

    @Test
    public void exampleThree() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 0;

        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray_naive(k, array)).isEqualTo(0);
        assertThat(MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, array)).isEqualTo(0);
    }
}