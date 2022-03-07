package net.basilcam.educative.modifiedbinarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CeilingOfANumberTest {

    @Test
    public void exampleOne() {
        int[] array = new int[] {4, 6, 10};

        assertThat(CeilingOfANumber.search(array, 6)).isEqualTo(1);
    }

    @Test
    public void exampleTwo() {
        int[] array = new int[] {1, 3, 8, 10, 15};

        assertThat(CeilingOfANumber.search(array,12)).isEqualTo(4);
    }

    @Test
    public void exampleThree() {
        int[] array = new int[] {4, 6, 10};

        assertThat(CeilingOfANumber.search(array, 17)).isEqualTo(-1);
    }

    @Test
    public void exampleFour() {
        int[] array = new int[] {1, 2, 5, 8, 10, 11, 12};

        assertThat(CeilingOfANumber.search(array, 4)).isEqualTo(2);
    }
}
