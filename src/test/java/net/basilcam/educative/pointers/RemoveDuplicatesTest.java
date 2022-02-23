package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTest {

    @Test
    public void exampleOne() {
        int[] array = {2, 3, 3, 3, 6, 9, 9};

        assertThat(RemoveDuplicates.remove(array)).isEqualTo(4);
        assertThat(array[0]).isEqualTo(2);
        assertThat(array[1]).isEqualTo(3);
        assertThat(array[2]).isEqualTo(6);
        assertThat(array[3]).isEqualTo(9);
    }

    @Test
    public void exampleTwo() {
        int[] array = {2, 2, 2, 11};

        assertThat(RemoveDuplicates.remove(array)).isEqualTo(2);
        assertThat(array[0]).isEqualTo(2);
        assertThat(array[1]).isEqualTo(11);
    }
}
