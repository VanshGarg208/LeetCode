class Solution {

    int count = 0;

    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int startRow = 0;
        int startCol = 0;
        int empty = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }

                if (grid[i][j] == 0 || grid[i][j] == 1) {
                    empty++;
                }
            }
        }
        backtrack(grid, startRow, startCol, empty);
        return count;
    }

    public void backtrack(int[][] grid, int i, int j, int empty) {
        if (grid[i][j] == 2) {
            if (empty == 0) count++;
            return;
        }

        grid[i][j] = -1;
        empty--;

        //down
        if (i+1 < grid.length && grid[i+1][j] != -1) {
            backtrack(grid, i+1, j, empty);
        }

        //up
        if (i-1 >= 0 && grid[i-1][j] != -1) {
            backtrack(grid, i-1, j, empty);
        }

        //right
        if (j+1 < grid[0].length && grid[i][j+1] != -1) {
            backtrack(grid, i, j+1, empty);
        }

        //left
        if (j-1 >= 0 && grid[i][j-1] != -1) {
            backtrack(grid, i, j-1, empty);
        }

        grid[i][j] = 0;
    }
}