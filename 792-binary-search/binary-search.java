class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return help(nums, target, 0, n-1);
    }

    public int help(int[] nums, int target, int s, int e) {
        if (s > e) return -1;
        int mid = s + (e-s)/2;
        if (nums[mid] == target) return mid;
        else if (target < nums[mid]) return help(nums, target, s, mid-1);
        else return help(nums, target, mid+1, e);
    }
}