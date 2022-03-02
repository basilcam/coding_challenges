package net.basilcam.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void exampleOne() {
        String s = "abcabcbb";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(3);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void exampleTwo() {
        String s = "bbbbb";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(1);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void exampleThree() {
        String s = "pwwkew";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(3);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(3);
    }

    // mine

    @Test
    public void exampleFour() {
        String s = "";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(0);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(0);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void exampleFive() {
        String s = "a";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(1);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void exampleSix() {
        String s = "ab";

        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(2);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring2(s);
        assertThat(result).isEqualTo(2);

        result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring3(s);
        assertThat(result).isEqualTo(2);
    }
}