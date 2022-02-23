package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedArraySquaresTest {

    @Test
    public void exampleOne() {
        int[] array = new int[] {-2, -1, 0, 2, 3};

        assertThat(SortedArraySquares.makeSquares_naive(array)).containsExactly(0, 1, 4, 4, 9);
        assertThat(SortedArraySquares.makeSquares(array)).containsExactly(0, 1, 4, 4, 9);
    }

    @Test
    public void exampleTwo() {
        int[] array = new int[] {-3, -1, 0, 1, 2};

        assertThat(SortedArraySquares.makeSquares_naive(array)).containsExactly(0, 1, 1, 4, 9);
        assertThat(SortedArraySquares.makeSquares(array)).containsExactly(0, 1, 1, 4, 9);
    }

}