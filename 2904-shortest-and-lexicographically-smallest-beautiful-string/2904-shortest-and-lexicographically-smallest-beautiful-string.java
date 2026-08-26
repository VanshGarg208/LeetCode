class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int[] pos = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                pos[count++] = i;
            }
        }

        if (count < k) return "";

        String ans = "";

        for (int i = 0; i <= count-k; i++) {
            int left = pos[i];
            int right = pos[i+k-1];
            String curr = s.substring(left, right+1);

            if (ans.equals("") || curr.length() < ans.length() || (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {
                ans = curr;
            }
        }
        return ans;
    }
}