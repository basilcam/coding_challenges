package net.basilcam.educative.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubsetsTest {
    @Test
    public void exampleOne() {
        int[] set = new int[]{1, 3};

        assertThat(Subsets.findSubsets(set)).containsExactlyInAnyOrder(List.of(),
                List.of(1),
                List.of(3),
                List.of(1, 3));
    }

    @Test
    public void exampleTwo() {
        int[] set = new int[]{1, 5, 3};

        assertThat(Subsets.findSubsets(set)).containsExactlyInAnyOrder(List.of(),
                List.of(1),
                List.of(5),
                List.of(3),
                List.of(1, 5),
                List.of(1, 3),
                List.of(5, 3),
                List.of(1, 5, 3));
    }

}