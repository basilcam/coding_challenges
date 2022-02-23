package net.basilcam.educative.window;

import net.basilcam.educative.window.MaxFruitCountOf2Types;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxFruitCountOf2TypesTest {

    @Test
    public void exampleOne() {
        char[] array = {'A', 'B', 'C', 'A', 'C'};

        assertThat(MaxFruitCountOf2Types.findLength(array)).isEqualTo(3);
    }

    @Test
    public void exampleTwo() {
        char[] array = {'A', 'B', 'C', 'B', 'B', 'C'};

        assertThat(MaxFruitCountOf2Types.findLength(array)).isEqualTo(5);
    }

    @Test
    public void exampleThree() {
        char[] array = {'A', 'B', 'C'};

        assertThat(MaxFruitCountOf2Types.findLength(array)).isEqualTo(2);
    }
}