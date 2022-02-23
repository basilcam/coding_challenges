package net.basilcam.educative.window;

import net.basilcam.educative.window.LongestSubstringKDistinct;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringKDistinctTest {

    @Test
    public void exampleOne() {
        String str = "araaci";
        int k = 2;

        assertThat(LongestSubstringKDistinct.findLength(str, k)).isEqualTo(4);
    }

    @Test
    public void exampleTwo() {
        String str = "araaci";
        int k = 1;

        assertThat(LongestSubstringKDistinct.findLength(str, k)).isEqualTo(2);
    }

    @Test
    public void exampleThree() {
        String str = "cbbebi";
        int k = 3;

        assertThat(LongestSubstringKDistinct.findLength(str, k)).isEqualTo(5);
    }

    @Test
    public void exampleFour() {
        String str = "cbbebi";
        int k = 10;

        assertThat(LongestSubstringKDistinct.findLength(str, k)).isEqualTo(6);
    }
}