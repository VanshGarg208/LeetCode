class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (val == nums[i]) {
                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j+1];
                }
                size--;
                i--;
            }
        }
        return size;
    }
}