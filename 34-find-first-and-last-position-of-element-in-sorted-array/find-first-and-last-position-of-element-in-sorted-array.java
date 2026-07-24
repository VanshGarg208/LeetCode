class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccur(nums, target);
        int last = lastOccur(nums, target);
        return new int[]{first, last};
    }
    public int firstOccur(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (nums[mid] == target) {
                ans = mid;
                e = mid-1;
            }
            else if (target > nums[mid]) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;
    }
    public int lastOccur(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;
            
            if (nums[mid] == target) {
                ans = mid;
                s = mid+1;
            }
            else if (target > nums[mid]) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return ans;
    }
}