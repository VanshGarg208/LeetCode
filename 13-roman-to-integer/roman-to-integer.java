class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));

            if (i < s.length()-1) {
                int next = getValue(s.charAt(i+1));

                if (curr < next) {
                    total -= curr;
                }
                else {
                    total += curr;
                }
            }
            else {
                total += curr;
            }
        }
        return total;
    }

    public int getValue(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;
    }
}