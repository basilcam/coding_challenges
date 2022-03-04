package net.basilcam.educative.subsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCaseStringPermutationsTest {

    @Test
    public void exampleOne() {
        String str = "ad52";

        assertThat(LetterCaseStringPermutations.findLetterCaseStringPermutations(str)).containsExactlyInAnyOrder(
                "ad52",
                "Ad52",
                "aD52",
                "AD52");
    }

    @Test
    public void exampleTwo() {
        String str = "ab7c";

        assertThat(LetterCaseStringPermutations.findLetterCaseStringPermutations(str)).containsExactlyInAnyOrder(
                "ab7c",
                "Ab7c",
                "aB7c",
                "AB7c",
                "ab7C",
                "Ab7C",
                "aB7C",
                "AB7C");
    }
}