class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }

        boolean[] col = new boolean[n];
        boolean[] d1 = new boolean[2*n-1];
        boolean[] d2 = new boolean[2*n-1];

        backtrack(arr, 0, col, d1, d2, ans);
        return ans;
    }

    public void backtrack(char[][] arr, int row, boolean[] col, boolean[] d1, boolean[] d2, List<List<String>> ans) {

        if (row == arr.length) {
            List<String> current = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                current.add(new String(arr[i]));
            }
            ans.add(current);
            return;
        }

        for (int j = 0; j < arr.length; j++) {

            int x = row-j + arr.length-1;
            int y = row+j;

            if (col[j] || d1[x] || d2[y]) continue;

            arr[row][j] = 'Q';
            col[j] = true;
            d1[x] = true;
            d2[y] = true;

            backtrack(arr, row+1, col, d1, d2, ans);

            arr[row][j] = '.';
            col[j] = false;
            d1[x] = false;
            d2[y] = false;
        }
        
    }
}