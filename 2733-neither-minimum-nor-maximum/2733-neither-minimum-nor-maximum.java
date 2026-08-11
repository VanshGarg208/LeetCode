class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;

        if (n <= 2) return -1;

        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != min && nums[i] != max) return nums[i];
        }

        return -1;
    }
}