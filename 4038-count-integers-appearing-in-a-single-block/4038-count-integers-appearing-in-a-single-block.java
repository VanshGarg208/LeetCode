class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                arr[nums[i]]++;
            }
        }

        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (arr[i] == 1) count++;
        }

        return count;
    }
}