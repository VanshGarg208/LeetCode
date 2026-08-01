class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length-1) >= 0;
    }
    public static int solve(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        int leftPick = nums[left] - solve(nums, left+1, right);
        int rightPick = nums[right] - solve(nums, left, right-1);
        return Math.max(leftPick, rightPick);
    }
}