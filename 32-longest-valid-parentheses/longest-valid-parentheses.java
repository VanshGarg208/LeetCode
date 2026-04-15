class Solution {
    public int longestValidParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(i);
            }

            else { // ch == ')'
                st.pop();
                if (st.isEmpty()) st.push(i);
                else {
                    int len = i - st.peek();
                    maxLen = Math.max(maxLen, len);
                }
            }
        }
        return maxLen;
    }
}