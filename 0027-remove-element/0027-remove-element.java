class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (val == nums[i]) {
                for (int j = i; j < n-1; j++) {
                    nums[j] = nums[j+1];
                }
                i--;
                n--;
            }
        }
        return n;
    }
}