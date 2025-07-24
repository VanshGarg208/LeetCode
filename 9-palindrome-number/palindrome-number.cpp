class Solution {
public:
    long long rev_num(long long num, long long rev = 0) {
        if (num == 0) {
            return rev;
        }
        return rev_num(num / 10, rev * 10 + num % 10);
    }

    bool isPalindrome(int x) {
        if (x < 0) return false;
        return x == rev_num(x);
    }
};
