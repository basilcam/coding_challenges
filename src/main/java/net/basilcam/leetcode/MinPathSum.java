package net.basilcam.leetcode;

// problem 64
// m x n matrix
// can only move right and down
// smallest sum path from top left to bottom right

public class MinPathSum {

    public static int minPathSum(int[][] grid) {
        return minPathSum(grid, 0, 0);
    }

    private static int minPathSum(int[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length) { // outside of grid
            return Integer.MAX_VALUE;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) { // at end
            return grid[i][j];
        }

        return grid[i][j] + Math.min(minPathSum(grid, i+1, j), minPathSum(grid, i, j+1));
    }

    public static int minPathSum_better(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] sums = new int[n][m];

        sums[0][0] = grid[0][0];

        for (int j = 1; j < m; j++) {
            sums[0][j] = sums[0][j-1] + grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            sums[i][0] = sums[i-1][0] + grid[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                sums[i][j] = grid[i][j] + Math.min(sums[i-1][j], sums[i][j-1]);
            }
        }

        return sums[n-1][m-1];
    }
}
