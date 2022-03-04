package net.basilcam.educative.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationsTest {

    @Test
    public void exampleOne() {
        int[] nums = new int[] {1, 2, 3};

        assertThat(Permutations.findPermutations(nums)).containsExactlyInAnyOrder(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1));
        assertThat(Permutations.findPermutations_recursive(nums)).containsExactlyInAnyOrder(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1));
    }

}