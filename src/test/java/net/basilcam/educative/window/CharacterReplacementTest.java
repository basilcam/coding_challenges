package net.basilcam.educative.window;

import net.basilcam.educative.window.CharacterReplacement;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharacterReplacementTest {

    @Test
    public void exampleOne() {
        String str = "aabccbb";
        int k = 2;

        assertThat(CharacterReplacement.findLength_solution(str, k)).isEqualTo(5);
        assertThat(CharacterReplacement.findLength(str, k)).isEqualTo(5);
    }

    @Test
    public void exampleTwo() {
        String str = "aacbcbb";
        int k = 2;

        assertThat(CharacterReplacement.findLength_solution(str, k)).isEqualTo(5);
        assertThat(CharacterReplacement.findLength(str, k)).isEqualTo(5);
    }

}