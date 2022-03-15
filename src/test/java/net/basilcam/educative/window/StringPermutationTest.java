package net.basilcam.educative.window;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringPermutationTest {

    @Test
    public void exampleOne() {
        String str = "oidbcaf";
        String pattern = "abc";

        assertThat(StringPermutation.findPermutation(str, pattern)).isTrue();
    }

    @Test
    public void exampleTwo() {
        String str = "odicf";
        String pattern = "dc";

        assertThat(StringPermutation.findPermutation(str, pattern)).isFalse();
    }

    @Test
    public void exampleThree() {
        String str = "bcdxabcdy";
        String pattern = "bcdyabcdx";

        assertThat(StringPermutation.findPermutation(str, pattern)).isTrue();
    }

    @Test
    public void exampleFour() {
        String str = "aaacb";
        String pattern = "abc";

        assertThat(StringPermutation.findPermutation(str, pattern)).isTrue();
    }
}