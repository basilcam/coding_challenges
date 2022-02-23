package net.basilcam.educative.window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinSizeSubArraySumTest {

    @Test
    public void exampleOne() {
        int[] array = {2, 1, 5, 2, 3, 2};
        int s = 7;

        assertThat(MinSizeSubArraySum.findMinSubArray(s, array)).isEqualTo(2);
    }
}