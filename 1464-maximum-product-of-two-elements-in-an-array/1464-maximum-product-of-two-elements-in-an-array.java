class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n-1];
        int smax = nums[n-2];
        int ans = (max-1)*(smax-1);
        return ans;
    }
}