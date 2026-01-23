class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            sb.append(ch);

            if (sb.length() >= part.length()) {
                int start = sb.length() - part.length();

                if (sb.substring(start).equals(part)) {
                    sb.delete(start, sb.length());
                }
            }
        }
        return sb.toString();
    }
}