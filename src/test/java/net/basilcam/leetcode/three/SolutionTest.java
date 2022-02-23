package net.basilcam.leetcode.three;

import net.basilcam.leetcode.three.SolutionOne;
import net.basilcam.leetcode.three.SolutionThree;
import net.basilcam.leetcode.three.SolutionTwo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    public void exampleOne() {
        String s = "abcabcbb";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void exampleTwo() {
        String s = "bbbbb";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void exampleThree() {
        String s = "pwwkew";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(3);
    }

    // mine

    @Test
    public void exampleFour() {
        String s = "";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(0);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(0);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void exampleFive() {
        String s = "a";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void exampleSix() {
        String s = "ab";

        int result = new SolutionOne().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(2);

        result = new SolutionTwo().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(2);

        result = new SolutionThree().lengthOfLongestSubstring(s);
        assertThat(result).isEqualTo(2);
    }
}