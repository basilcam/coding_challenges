package net.basilcam.educative.topkelements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConnectRopesTest {

    @Test
    public void exampleOne() {
        int[] ropes = new int[] {1, 3, 11, 5};

        assertThat(ConnectRopes.minimumCostToConnectRopes(ropes)).isEqualTo(33);
    }

    @Test
    public void exampleTwo() {
        int[] ropes = new int[] {3, 4, 5, 6};

        assertThat(ConnectRopes.minimumCostToConnectRopes(ropes)).isEqualTo(36);
    }

    @Test
    public void exampleThree() {
        int[] ropes = new int[] {1, 3, 11, 5, 2};

        assertThat(ConnectRopes.minimumCostToConnectRopes(ropes)).isEqualTo(42);
    }
}