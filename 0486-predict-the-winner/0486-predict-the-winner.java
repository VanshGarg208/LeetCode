class Solution {
    Integer dp[][];
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n];
        return solve(nums, 0, n-1) >= 0;
    }
    public int solve(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        if (dp[left][right] != null) return dp[left][right];

        int leftPick = nums[left] - solve(nums, left+1, right);
        int rightPick = nums[right] - solve(nums, left, right-1);
        return dp[left][right] = Math.max(leftPick, rightPick); // to save calculation time (storing in dp)
    }
}