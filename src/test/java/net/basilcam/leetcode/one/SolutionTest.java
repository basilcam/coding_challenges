package net.basilcam.leetcode.one;

import net.basilcam.leetcode.one.SolutionOne;
import net.basilcam.leetcode.one.SolutionTwo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    public void exampleOne() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] results = new SolutionOne().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(0, 1);

        results = new SolutionTwo().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    public void exampleTwo() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] results = new SolutionOne().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(1, 2);

        results = new SolutionTwo().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    public void exampleThree() {
        int[] nums = {3, 3};
        int target = 6;

        int[] results = new SolutionOne().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(0, 1);

        results = new SolutionTwo().twoSums(nums, target);
        assertThat(results).containsExactlyInAnyOrder(0, 1);
    }
}