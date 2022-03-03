package net.basilcam.educative.pointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TripletSumCloseToTargetTest {
    @Test
    public void exampleOne() {
        int[] array = new int[] {-2, 0, 1, 2};

        assertThat(TripletSumCloseToTarget.searchTriplet(array, 2)).isEqualTo(1);
    }

    @Test
    public void exampleTwo() {
        int[] array = new int[] {-3, -1, 1, 2};

        assertThat(TripletSumCloseToTarget.searchTriplet(array, 1)).isEqualTo(0);
    }

    @Test
    public void exampleThree() {
        int[] array = new int[] {1, 0, 1, 1};

        assertThat(TripletSumCloseToTarget.searchTriplet(array, 100)).isEqualTo(3);
    }
}
