package net.basilcam.educative.topkelements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KthSmallestNumberTest {

    @Test
    public void exampleOne() {
        int[] nums = new int[] {1, 5, 12, 2, 11, 5};

        assertThat(KthSmallestNumber.findKthSmallestNumber(nums, 3)).isEqualTo(5);
    }

    @Test
    public void exampleTwo() {
        int[] nums = new int[] {1, 5, 12, 2, 11, 5};

        assertThat(KthSmallestNumber.findKthSmallestNumber(nums, 4)).isEqualTo(5);
    }

    @Test
    public void exampleThree() {
        int[] nums = new int[] {5, 12, 11, -1, 12};

        assertThat(KthSmallestNumber.findKthSmallestNumber(nums, 3)).isEqualTo(11);
    }
}