package net.basilcam.educative.fastslowpointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyNumberTest {

    @Test
    public void exampleOne() {
        assertThat(HappyNumber.isHappy(23)).isTrue();
    }

    @Test
    public void exampleTwo() {
        assertThat(HappyNumber.isHappy(12)).isFalse();
    }
}