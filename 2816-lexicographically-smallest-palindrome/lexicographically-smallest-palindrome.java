class Solution {
    public String makeSmallestPalindrome(String str) {
        char[] arr = str.toCharArray();

        int s = 0;
        int e = arr.length-1;

        while (s < e) {
            if (arr[s] != arr[e]) {
                char small = (char) Math.min(arr[s], arr[e]);
                arr[s] = small;
                arr[e] = small;
            }
            s++;
            e--;
        }

        return new String(arr);
    }
}