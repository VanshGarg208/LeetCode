class Solution {
    public int minCut(String s) {
        int n = s.length();

        boolean[][] palin = new boolean[n][n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j-i <= 2 || palin[i+1][j-1])) {
                    palin[i][j] = true;
                }
            }
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = i;
        }

        for (int i = 1; i < n; i++) {
            if (palin[0][i]) {
                dp[i] = 0;
                continue;
            }

            for (int j = 1; j <= i; j++) {
                if (palin[j][i]) {
                    dp[i] = Math.min(dp[i], dp[j-1] + 1);
                }
            }
        }

        return dp[n-1];
    }
}