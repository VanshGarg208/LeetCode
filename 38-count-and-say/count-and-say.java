class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder("");

        String prev = countAndSay(n-1);

        int i = 0;
        while (i < prev.length()) {
            int count = 1;
            while ((i+1 < prev.length()) && (prev.charAt(i) == prev.charAt(i+1))) {
                count++;
                i++;
            }

            sb.append(count);
            sb.append(prev.charAt(i));
            i++;
        }

        return sb.toString();
    }
}