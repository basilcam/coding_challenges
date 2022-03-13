package net.basilcam.educative.topkelements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KLargestNumbersTest {

    @Test
    public void exampleOne() {
        int[] nums = new int[] {3, 1, 5, 12, 2, 11};

        assertThat(KLargestNumbers.findKLargestNumbers(nums, 3)).containsExactlyInAnyOrder(5, 12, 11);
    }

    @Test
    public void exampelTwo() {
        int[] nums = new int[] {5, 12, 11, -1, 12};

        assertThat(KLargestNumbers.findKLargestNumbers(nums, 3)).containsExactlyInAnyOrder(12, 11, 12);
    }
}