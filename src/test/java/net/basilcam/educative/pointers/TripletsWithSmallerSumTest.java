package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TripletsWithSmallerSumTest {

    @Test
    public void exampleOne() {
        int[] array = new int[] {-1, 0, 2, 3};

        assertThat(TripletsWithSmallerSum.searchTriplets(array, 3)).isEqualTo(2);
    }

    @Test
    public void exampleTwo() {
        int[] array = new int[] {-1, 4, 2, 1, 3};

        assertThat(TripletsWithSmallerSum.searchTriplets(array, 5)).isEqualTo(4);
    }
}