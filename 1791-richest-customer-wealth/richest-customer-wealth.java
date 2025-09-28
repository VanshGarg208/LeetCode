public class Solution {

    public static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int row_sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                row_sum += arr[i][j];
            }

            if (ans < row_sum) {
                ans = row_sum;
            }
        }

        return ans;
    }

    
}