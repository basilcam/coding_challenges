package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TripletSumToZeroTest {

    @Test
    public void exampleOne() {
        int[] array = new int[] {-3, 0, 1, 2, -1, 1, -2};

        List<List<Integer>> triplets = TripletSumToZero.searchTriplets(array);

        assertThat(triplets).containsExactlyInAnyOrder(Arrays.asList(-3, 1, 2),
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1),
                Arrays.asList(-1, 0, 1));
    }

}