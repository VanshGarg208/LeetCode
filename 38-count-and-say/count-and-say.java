class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String str = countAndSay(n-1);
        String ans = "";

        int i = 0, j = 0;
        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) j++;
            else {
                int freq = j-i;
                ans += freq;
                ans += str.charAt(i);
                i = j;
            }
        }
        int freq = j-i;
        ans += freq;
        ans += str.charAt(i);
        return ans;
    }
}