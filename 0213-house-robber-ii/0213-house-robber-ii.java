class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[n-1];

        int case1 = solve(nums, 0, n-2);
        int case2 = solve(nums, 1, n-1);

        return Math.max(case1, case2);
    }

    public int solve(int nums[], int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int rob = nums[i] + prev2;
            int skip = prev1;
            int curr = Math.max(rob, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}