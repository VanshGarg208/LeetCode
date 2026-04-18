class Solution {
    public int strStr(String str1, String str2) {
        for (int i = 0; i <= str1.length()-str2.length(); i++) {
            int j = 0;

            while (j < str2.length() && str1.charAt(i+j) == str2.charAt(j)) {
                j++;
            }

            if (j == str2.length()) return i;
        }
        return -1;
    }
}