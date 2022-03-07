package net.basilcam.educative.modifiedbinarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    public void exampleOne() {
        int[] array = new int[] {4, 6, 10};

        assertThat(BinarySearch.search(array, 4)).isEqualTo(0);
        assertThat(BinarySearch.search(array, 6)).isEqualTo(1);
        assertThat(BinarySearch.search(array, 10)).isEqualTo(2);
    }
}