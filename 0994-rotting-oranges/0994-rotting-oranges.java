class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 2) {

                        //up
                        if (i > 0 && grid[i-1][j] == 1) {
                            grid[i-1][j] = 3;
                            changed = true;
                        }

                        //down
                        if (i < n-1 && grid[i+1][j] == 1) {
                            grid[i+1][j] = 3;
                            changed = true;
                        }

                        //left
                        if (j > 0 && grid[i][j-1] == 1) {
                            grid[i][j-1] = 3;
                            changed = true;
                        }

                        //right
                        if (j < m-1 && grid[i][j+1] == 1) {
                            grid[i][j+1] = 3;
                            changed = true;
                        }
                    }
                }
            }

            if (changed) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (grid[i][j] == 3) {
                            grid[i][j] = 2;
                        }
                    }
                }
                count++;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }
        return count;
    }
}