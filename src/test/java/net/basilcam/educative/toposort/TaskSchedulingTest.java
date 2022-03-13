package net.basilcam.educative.toposort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaskSchedulingTest {

    @Test
    public void exampleOne() {
        int[][] prereqs = new int[][] {{0, 1}, {1, 2}};

        assertThat(TaskScheduling.isSchedulingPossible(3, prereqs)).isTrue();
    }

    @Test
    public void exampleTwo() {
        int[][] prereqs = new int[][] {{0, 1}, {1, 2}, {2, 0}};

        assertThat(TaskScheduling.isSchedulingPossible(3, prereqs)).isFalse();
    }

    @Test
    public void exampleThree() {
        int[][] prereqs = new int[][] {{2, 5}, {0, 5}, {0, 4}, {1, 4}, {3, 2}, {1, 3}};

        assertThat(TaskScheduling.isSchedulingPossible(6, prereqs)).isTrue();
    }
}