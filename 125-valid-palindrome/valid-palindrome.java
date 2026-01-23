class Solution {
    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String orig = sb.toString();

        int l = 0;
        int r = orig.length()-1;
        while (l < r) {
            if (orig.charAt(l) != orig.charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }
        return true;
        
    }
}