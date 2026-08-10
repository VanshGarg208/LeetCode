class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long first = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] == first || nums[i] == sec || nums[i] == third) continue;
            if (nums[i] > first) {
                third = sec;
                sec = first;
                first = nums[i];
            }
            else if (nums[i] > sec) {
                third = sec;
                sec = nums[i];
            }
            else if (nums[i] > third) {
                third = nums[i];
            }
        }

        if (third == Long.MIN_VALUE) return (int)first;
        else return (int)third;
    }
}