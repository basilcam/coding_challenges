package net.basilcam.educative.subsets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SubsetsWithDuplicatesTest {

    @Test
    public void exampleOne() {
        int[] nums = new int[] {1, 3, 3};

        assertThat(SubsetsWithDuplicates.findSubsets(nums)).containsExactlyInAnyOrder(List.of(),
                List.of(1),
                List.of(3),
                List.of(1,3),
                List.of(3,3),
                List.of(1,3, 3));
    }

}