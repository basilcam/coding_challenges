package net.basilcam.educative.window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NoRepeatSubstringTest {

    @Test
    public void exampleOne() {
        String str = "aabccbb";

        assertThat(NoRepeatSubstring.findLength(str)).isEqualTo(3);
    }

    @Test
    public void exampleTwo() {
        String str = "abbbb";

        assertThat(NoRepeatSubstring.findLength(str)).isEqualTo(2);
    }

    @Test
    public void exampleThree() {
        String str = "abccde";

        assertThat(NoRepeatSubstring.findLength(str)).isEqualTo(3);
    }
}