class Solution {
    public boolean isPalindrome(String str) {
        str = str.trim();
        //String[] arr = str.split("//s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) sb.append(Character.toLowerCase(ch));

        }

        String in = sb.toString();
        String out = new StringBuilder(in).reverse().toString();

        if (in.length() != out.length()) return false;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != out.charAt(i)) return false;
        }
        return true;
    }
}