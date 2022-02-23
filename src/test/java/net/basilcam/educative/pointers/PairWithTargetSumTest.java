package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PairWithTargetSumTest {

    @Test
    public void exampleOne() {
        int[] array = {1, 2, 3, 4, 6};
        int targetSum = 6;

        assertThat(PairWithTargetSum.search(array, targetSum)).containsExactlyInAnyOrder(1, 3);
        assertThat(PairWithTargetSum.search2(array, targetSum)).containsExactlyInAnyOrder(1, 3);
    }

    @Test
    public void exampleTwo() {
        int[] array = {2, 5, 9, 11};
        int targetSum = 11;

        assertThat(PairWithTargetSum.search(array, targetSum)).containsExactlyInAnyOrder(0, 2);
        assertThat(PairWithTargetSum.search2(array, targetSum)).containsExactlyInAnyOrder(0, 2);
    }

}