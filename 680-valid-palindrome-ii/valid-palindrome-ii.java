class Solution {
    public boolean validPalindrome(String str) {
        int l = 0;
        int r = str.length()-1;

        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            }
            else {
                return isPalindrome(str, l+1, r) || isPalindrome(str, l, r-1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str, int l, int r) {
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}