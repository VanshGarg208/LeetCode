class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
                sb.append(ch);
            }
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    sb.append(ch);
                }
            }
            else {
                sb.append(ch);
            }
        }
        for (int i = sb.length()-1; i >= 0 && open > 0; i--) {
            if (sb.charAt(i) == '(') {
                sb.deleteCharAt(i);
                open--;
            }
        }
        return sb.toString();
    }
}