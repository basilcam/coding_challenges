package net.basilcam.educative.twoheap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MedianOfAStreamTest {

    @Test
    public void example() {
        MedianOfAStream median = new MedianOfAStream();

        median.insertNum(3);
        median.insertNum(1);
        assertThat(median.findMedian()).isEqualTo(2.0);

        median.insertNum(5);
        assertThat(median.findMedian()).isEqualTo(3);

        median.insertNum(4);
        assertThat(median.findMedian()).isEqualTo(3.5);
    }
}