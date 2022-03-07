package net.basilcam.educative.modifiedbinarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NextLetterTest {

    @Test
    public void exampleOne() {
        char[] letters = new char[] {'a', 'c', 'f', 'h'};

        assertThat(NextLetter.search(letters, 'f')).isEqualTo('h');
    }

    @Test
    public void exampleTwo() {
        char[] letters = new char[] {'a', 'c', 'f', 'h'};

        assertThat(NextLetter.search(letters, 'b')).isEqualTo('c');
    }

    @Test
    public void exampleThree() {
        char[] letters = new char[] {'a', 'c', 'f', 'h'};

        assertThat(NextLetter.search(letters, 'm')).isEqualTo('a');
    }

    @Test
    public void exampleFour() {
        char[] letters = new char[] {'a', 'c', 'f', 'h'};

        assertThat(NextLetter.search(letters, 'h')).isEqualTo('a');
    }

}