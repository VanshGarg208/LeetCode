class Solution {
    private int countDigits(int n) {
        if (n < 0) {
            n = -n;
        }  
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    private int evenDigitCount(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        int digits = countDigits(arr[index]);
        int add = (digits % 2 == 0) ? 1 : 0;

        return add + evenDigitCount(arr, index + 1);
    }

    public int findNumbers(int[] nums) {
        return evenDigitCount(nums, 0);
    }
}
