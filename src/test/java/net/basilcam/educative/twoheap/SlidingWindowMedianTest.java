package net.basilcam.educative.twoheap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SlidingWindowMedianTest {

    @Test
    public void exampleOne() {
        int[] nums = new int[]{1, 2, -1, 3, 5};

        assertThat(new SlidingWindowMedian().findSlidingWindowMedian(nums, 2)).containsExactly(1.5, 0.5, 1.0, 4.0);
    }

    @Test
    public void exampleTwo() {
        int[] nums = new int[]{1, 2, -1, 3, 5};

        assertThat(new SlidingWindowMedian().findSlidingWindowMedian(nums, 3)).containsExactly(1.0, 2.0, 3.0);
    }
}