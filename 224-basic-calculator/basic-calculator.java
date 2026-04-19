class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();

        int res = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }

            else if (ch == '+') {
                res += sign * number;
                sign = 1;
                number = 0;
            }

            else if (ch == '-') {
                res += sign * number;
                sign = -1;
                number = 0;
            }

            else if (ch == '(') {
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            }

            else if (ch == ')') {
                res += sign * number;
                res *= st.pop();
                res += st.pop();
                number = 0;
            }
        }

        return res + sign * number;
    }
}