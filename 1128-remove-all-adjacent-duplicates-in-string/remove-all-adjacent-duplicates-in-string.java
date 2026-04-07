class Solution {
    public String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (sb.length() == 0) {
                sb.append(ch);
            }
            else if (ch == sb.charAt(sb.length()-1)) {
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}