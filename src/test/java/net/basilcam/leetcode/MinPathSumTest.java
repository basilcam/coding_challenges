package net.basilcam.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinPathSumTest {

    @Test
    public void exampleOne() {
        int[][] grid = new int[3][3];
        grid[0] = new int[] {1, 3, 1};
        grid[1] = new int[] {1, 5, 1};
        grid[2] = new int[] {4, 2, 1};

        assertThat(MinPathSum.minPathSum(grid)).isEqualTo(7);
        assertThat(MinPathSum.minPathSum_better(grid)).isEqualTo(7);
    }
}